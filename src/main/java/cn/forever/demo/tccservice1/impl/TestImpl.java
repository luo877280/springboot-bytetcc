package cn.forever.demo.tccservice1.impl;

import org.apache.commons.lang3.RandomUtils;
import org.bytesoft.compensable.Compensable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.tccservice1.ITestInterface;
@Compensable(interfaceClass = ITestInterface.class, confirmableKey = "testImplConfirm", cancellableKey = "testImplCancel")
@Service
public class TestImpl implements ITestInterface {

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void cancel() {
		// TODO Auto-generated method stub
		
		int i = RandomUtils.nextInt(100, 200);
		System.out.println("..........TestImpl............"+i);
		if (i > 150) {
			throw new NullPointerException();
		}

	}

}
