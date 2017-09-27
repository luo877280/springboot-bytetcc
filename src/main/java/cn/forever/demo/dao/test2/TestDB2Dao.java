package cn.forever.demo.dao.test2;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDB2Dao {
	void saveTest(@Param("name")String name);
	int saveTcc(@Param("name")String name,@Param("amount")int amount,@Param("frozen")int frozen);
}
