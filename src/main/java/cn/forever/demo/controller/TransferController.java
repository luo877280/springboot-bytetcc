package cn.forever.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.forever.demo.service.impl.TccAllservice;
import cn.forever.demo.tccservice.ITransferService;

@RestController
public class TransferController implements ITransferService {
	@Autowired
	TccAllservice tccAllservice;
//	@ResponseBody
//	@RequestMapping(value = "/test")
//	@Transactional
//	public void test(){
//		System.out.println(".............................");
//	}
	@ResponseBody
	@RequestMapping(value = "/test")
	public void test(){
		System.out.println(".............TransferController................");
		tccAllservice.testAll();
		System.out.println("..............TransferController end ...............");
	}

}
