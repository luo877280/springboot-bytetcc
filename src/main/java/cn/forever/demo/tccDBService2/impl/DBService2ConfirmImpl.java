package cn.forever.demo.tccDBService2.impl;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.forever.demo.dao.test2.TestDB2Dao;
import cn.forever.demo.tccDBService2.DBService2;
@Service("dbService2ConfirmImpl")
public class DBService2ConfirmImpl  implements DBService2{
	@Autowired
	TestDB2Dao testDB2Dao;
	@Transactional
	public int save2() {
		System.out.println("................DBService2ConfirmImpl...........................");
		int i = RandomUtils.nextInt(100, 200);
		testDB2Dao.saveTcc("name2", i, 5);
		System.out.println("................DBService2ConfirmImpl  confirm..........................."+i);
		return i;
	}
}
