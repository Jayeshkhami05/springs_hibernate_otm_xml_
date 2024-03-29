package springs_hibernate_otm_xml_pesm7.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_otm_xml_pesm7.dao.FatherDao;
import springs_hibernate_otm_xml_pesm7.dto.Father;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myfather.xml");
		Father father = applicationContext.getBean("father", Father.class);
		FatherDao dao = applicationContext.getBean("fdao", FatherDao.class);
//		dao.saveFather(father);
		dao.updateFather(1, father);
	}

}
