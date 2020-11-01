package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldTest {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("SpringTest.xml");

		SpringBean bean = (SpringBean) context.getBean("helloWorld");
		bean.show();
	}
}
