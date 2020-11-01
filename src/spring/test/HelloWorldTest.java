package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext(
			"C:\\IDE\\pleiades-2020-03-java-win-64bit-jre_20200322\\pleiades\\workspace_spring5\\springmybatistrans\\SpringTest.xml");

		SpringBean bean = (SpringBean) context.getBean("helloWorld");
		bean.update();
		bean.show();
	}
}
