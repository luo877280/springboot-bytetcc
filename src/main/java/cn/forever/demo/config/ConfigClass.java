package cn.forever.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:bytetcc-supports-springcloud.xml"})
//@ImportResource({ "classpath:bytetcc-supports-springcloud.xml", "classpath:spring-mybatis.xml" })
//@ImportResource(locations={"classpath:bytetcc-supports-tcc.xml"})
public class ConfigClass {
    
}
