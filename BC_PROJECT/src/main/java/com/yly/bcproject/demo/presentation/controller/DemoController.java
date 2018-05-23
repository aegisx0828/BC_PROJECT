package com.yly.bcproject.demo.presentation.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yly.bcproject.demo.domain.entity.DemoVo;
import com.yly.bcproject.demo.repository.dao.DemoDao;

@Controller
public class DemoController {
	
	private static Logger logger = Logger.getLogger(DemoController.class);
	
	@Autowired
	private DemoDao demoDao;
	
	@RequestMapping(value="/demo")
	public String demo(Model model) {
		
		model.addAttribute("result",demoDao.getUserList());
		
		logger.info("function : demo execute");
		
		return "demo";
	}
	
	@RequestMapping(value="/setDemo", method=RequestMethod.POST)
	public String setDemo(Model model, DemoVo demoVo) {
		
		demoDao.setUserName(demoVo);
		
		logger.info("function : setDemo execute");
		
		return "redirect:demo";
	}
	

}
