/**
 * SchedualServiceHiHystric.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年7月12日
 */
package com.liyiming.springcloud.feign.hystric;

import org.springframework.stereotype.Component;

import com.liyiming.springcloud.feign.service.HelloService;

/**  
 * <p>Title: SchedualServiceHiHystric</p>  
 * <p>Description: </p>  
 * @author liyiming  
 * @date 2018年7月12日  
 */
@Component
public class HelloServiceHystric implements HelloService {

	/* (non-Javadoc)
	 * @see com.liyiming.springcloud.feign.service.HelloService#sayHiFromClientOne(java.lang.String)
	 */
	/**
	 * 熔断器 当发生熔断是 调用次方法
	 */
	@Override
	public String sayHiFromClientOne(String name) {
		 return "sorry "+name;
	}

}
