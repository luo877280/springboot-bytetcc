package cn.forever.demo.tccDBService1.impl;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.dao.test1.TestDBDao;
import cn.forever.demo.tccDBService1.DBService1;

@Service("dbService1CancelImpl")
public class DBService1CancelImpl  implements DBService1{
	@Autowired
	TestDBDao testDBDao;
	@Transactional
	public int save() {
		System.out.println("................DBService1CancelImpl...........................");
		int i = RandomUtils.nextInt(100, 200);
		int id = testDBDao.saveTcc("name", i, 0);
		System.out.println("................DBService1CancelImpl done..........................."+i);
		return i;
	}
}
