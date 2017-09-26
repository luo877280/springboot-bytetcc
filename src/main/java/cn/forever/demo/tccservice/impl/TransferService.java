package cn.forever.demo.tccservice.impl;

import org.bytesoft.compensable.Compensable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.tccservice.ITransferService;

@Compensable(interfaceClass = ITransferService.class, confirmableKey = "transferServiceConfirm", cancellableKey = "transferServiceCancel")
@Service
public class TransferService implements ITransferService {
	@Transactional
	public void test() {
		System.out.println(".............................");
	}

}
