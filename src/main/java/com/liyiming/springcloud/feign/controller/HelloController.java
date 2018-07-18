/**
 * HelloController.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年4月12日
 */
package com.liyiming.springcloud.feign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liyiming.springcloud.feign.service.HelloService;

/**
 * <p>
 * Title: HelloController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author liyiming
 * @date 2018年4月12日
 */
@RestController
public class HelloController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private HelloService helloService;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		log.info("feign is being calling ");
		return helloService.sayHiFromClientOne(name);
	}
}
