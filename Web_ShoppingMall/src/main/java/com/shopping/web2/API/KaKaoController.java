package com.shopping.web2.API;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.model.KakaoPayService;
import com.shopping.web2.vo.OrderVO;
import com.shopping.web2.vo.ReadyResponse;



@Controller
public class KaKaoController {
	/*
	 * private static final Logger log =
	 * LoggerFactory.getLogger(BoardrController.class);
	 */
	@Autowired
	KakaoPayService kakaopayService;

	@RequestMapping(value = "/kakao", method = RequestMethod.GET)
	public ModelAndView kakao(@RequestParam(defaultValue = "1") String num, Locale locale, Model model) {
		ModelAndView mav = new ModelAndView("kakaoAPI/kakao");
		return mav;

	}
	
	// 카카오페이결제 요청
	@RequestMapping(value = "/order/pay", method = RequestMethod.GET)
	public @ResponseBody ReadyResponse payReady(@RequestParam(name = "total_amount") int totalAmount, Model model) {

		// 카카오 결제 준비하기 - 결제요청 service 실행.
		ReadyResponse readyResponse = kakaopayService.payReady(totalAmount);

		return readyResponse; // 클라이언트에 보냄.(tid,next_redirect_pc_url이 담겨있음.)
	}

	@RequestMapping(value = "order/pay/completed")
	public ModelAndView completed(@RequestParam(defaultValue = "1") String num, Locale locale, Model model,@ModelAttribute OrderVO vo) {
		System.out.println("결제 승인");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/order/pay/completed");
		return mav;
	}

	@RequestMapping(value = "order/pay/cancel")
	public ModelAndView cancel(@RequestParam(defaultValue = "1") String num, Locale locale, Model model) {
		System.out.println("결제 취소");
		return null;
	}

	@RequestMapping(value = "order/pay/fail")
	public ModelAndView fail(@RequestParam(defaultValue = "1") String num, Locale locale, Model model) {
		System.out.println("결제 실패");
		return null;
	}

}
