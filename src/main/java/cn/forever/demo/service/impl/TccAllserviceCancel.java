package cn.forever.demo.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.service.ITccAllservice;

@Service("tccAllserviceCancel")
public class TccAllserviceCancel implements ITccAllservice{
	
	@Transactional
	public void testAll(){
		System.out.println(".............TccAllserviceCancel.............");

	}
	
}
