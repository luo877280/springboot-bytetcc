package cn.forever.demo.service.impl;

import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.service.ITccAllservice;
import cn.forever.demo.tccservice.impl.TransferService;
import cn.forever.demo.tccservice1.impl.TestImpl;

@Service
@Compensable(interfaceClass = ITccAllservice.class, confirmableKey = "tccAllserviceConfrim", cancellableKey = "tccAllserviceCancel")
public class TccAllservice implements ITccAllservice{
	@Autowired
	TransferService transferService;
	
	@Autowired
	TestImpl testImpl;
	@Transactional
	public void testAll(){
		System.out.println("..............TccAllservice............");
		transferService.test();
		testImpl.cancel();
//		try{
//			transferService.test();
//			testImpl.cancel();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		System.out.println(".............TccAllservice end.............");

	}
	
}
