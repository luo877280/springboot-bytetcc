package cn.forever.demo.tccDBService1.impl;

import org.apache.commons.lang3.RandomUtils;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.dao.test1.TestDBDao;
import cn.forever.demo.tccDBService1.DBService1;


@Compensable(interfaceClass = DBService1.class, confirmableKey = "dbService1ConfirmImpl", cancellableKey = "dbService1CancelImpl")
@Service("dbService1Impl")
public class DBService1TryImpl  implements DBService1{
	@Autowired
	TestDBDao testDBDao;
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int save() {
		System.out.println("................DBService1TryImpl...........................");
		int i = RandomUtils.nextInt(100, 200);
		int id = testDBDao.saveTcc("name", i, 5);
		System.out.println("................DBService1TryImpl done..........................."+i);
//		if (i > 150) {
//			throw new NullPointerException();
//		}
		return i;
	}
}
