package cn.forever.demo.tccservice.impl;

import org.bytesoft.compensable.Compensable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.tccservice.ITransferService;

@Compensable(interfaceClass = ITransferService.class, confirmableKey = "transferServiceConfirm", cancellableKey = "transferServiceCancel")
@Service
public class TransferService implements ITransferService {
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void test() {
		System.out.println("...........TransferService..................");
	}

}
