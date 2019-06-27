package com.extra.jbootdemo.web;

import javax.inject.Inject;

import com.extra.jbootdemo.entity.User;
import com.extra.jbootdemo.service.IndexService;

import io.jboot.Jboot;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;
import io.swagger.annotations.Api;

@RequestMapping("/")
@Api(value = "Jboot测试Controller",tags = "test")
public class IndexController extends JbootController {
	
	@Inject
	IndexService indexService;
	
	public void toIndex() {
		User u=indexService.getUser();
		renderJson(u);
		//renderText("this is jboot "+u.getName()) ;
	}
	public static void main(String[] args) {
		Jboot.run(args);
	}
}
