package com.example;

import com.upsysmaroc.library.log.bean.DescriptiveLog;
import com.upsysmaroc.library.log.bean.Log;
import com.upsysmaroc.library.log.dao.DescriptiveLogDao;
import com.upsysmaroc.library.log.service.DescriptiveLogService;
import com.upsysmaroc.library.log.service.DescriptiveLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = "com.upsysmaroc.library.log")

public class DemoApplication {

	@Autowired
	DescriptiveLogService descriptiveLogService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Controller
	public class Hello{
		@RequestMapping(value = "/",method = RequestMethod.GET)
		public void hello(){
			DescriptiveLog descriptiveLog = new DescriptiveLog(new Date(),"HDhddnd", Log.AJOUTER,"Hello world");
			descriptiveLogService = new DescriptiveLogServiceImpl();
			descriptiveLog = descriptiveLogService.save(descriptiveLog);
			System.out.println("Hello world");
			System.out.println(descriptiveLog.getId());
		}
	}
}

