package cn.forever.demo.tccservice.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.tccservice.ITransferService;

@Service("transferServiceConfirm")
public class TransferServiceConfirm implements ITransferService {
	@Transactional
	public void test(){
		System.out.println(".......TransferServiceConfirm.........");
	}
}
