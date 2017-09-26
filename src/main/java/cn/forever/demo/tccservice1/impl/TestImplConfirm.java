package cn.forever.demo.tccservice1.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.tccservice1.ITestInterface;

@Service("testImplConfirm")
public class TestImplConfirm implements ITestInterface {

	@Override
	@Transactional
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("..........TestImplConfirm............");
	}

}
