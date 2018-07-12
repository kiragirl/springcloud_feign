/**
 * HelloService.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年4月12日
 */
package com.liyiming.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liyiming.springcloud.feign.hystric.HelloServiceHystric;

/**
 * <p>
 * Title: HelloService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author liyiming
 * @date 2018年4月12日
 */
@Service
/**
 * 
 * <p>Title: HelloService</p>  
 * <p>Description: 当发生熔断时 触发 HelloServiceHystric.sayHiFromClientOne</p>  
 * @author liyiming  
 * @date 2018年7月12日
 */
@FeignClient(value = "service-hi",fallback = HelloServiceHystric.class)
public interface HelloService {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
