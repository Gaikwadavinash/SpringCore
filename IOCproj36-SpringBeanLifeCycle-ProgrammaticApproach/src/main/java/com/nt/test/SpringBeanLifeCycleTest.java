package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligiblityChecking;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//getSpring Bean
VoteEligiblityChecking vote=ctx.getBean("voting",VoteEligiblityChecking.class);
//invokingMethod
System.out.println(vote.checkEligiblity());
//closeContainer
((AbstractApplicationContext) ctx).close();
		
	}

}
