package cn.forever.demo.tccDBService2.impl;

import org.apache.commons.lang3.RandomUtils;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.dao.test2.TestDB2Dao;
import cn.forever.demo.tccDBService1.DBService1;
import cn.forever.demo.tccDBService2.DBService2;


@Compensable(interfaceClass = DBService2.class, confirmableKey = "dbService2ConfirmImpl", cancellableKey = "dbService2CancelImpl")
@Service("dbService2Impl")
public class DBService2TryImpl  implements DBService2{
	@Autowired
	TestDB2Dao testDB2Dao;
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int save2() {
		System.out.println("................DBService2TryImpl...........................");
		int i = RandomUtils.nextInt(100, 200);
		int id = testDB2Dao.saveTcc("name", i, 5);
		System.out.println("................DBService2TryImpl try..........................."+i);
//		if (i > 150) {
//			throw new NullPointerException();
//		}
		return i;
	}
}
