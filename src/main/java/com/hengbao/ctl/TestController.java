package com.hengbao.ctl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public Map<String,String>sayHello(HttpServletRequest req,
			HttpServletResponse response,HttpSession session){
		Map<String,String> res = new HashMap<String,String>();
		res.put("message", "hello world － eurekaClient-Service-sayHello("+req.getLocalAddr()+":"+req.getLocalPort()+")");
		Cookie cookie = new Cookie("testtoken","aaaaaaaaaaaaaaaaaaaaa");
		cookie.setPath("/");
		cookie.setMaxAge(-1);
		response.addCookie(cookie);
		return res;
	}
}
