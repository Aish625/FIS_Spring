package com.fis.springlearn;

import java.text.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		////SpringApplication.run(SpringLearnApplication.class, args);
		//displayDate();
		//displayCountry();
		displayCountries();
	}
	static void displayCountries()
	{
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries = context.getBean("countryList", ArrayList.class);
		LOGGER.debug("Countries : {}", countries);
		LOGGER.info("END");
	}
	static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		Country anothercountry = (Country) context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country);
		LOGGER.debug("Country : {}", anothercountry);

	}
	
	/*static void displayDate()  {
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 try {
			Date parseDate = format.parse("31/08/2018");
			System.out.println(parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}*/
	static void displayDate() {
		
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parseDate = format.parse("31/12/2018");
//			System.out.println(parseDate);
			LOGGER.debug(parseDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat format1 = context.getBean("dateFormatUS", SimpleDateFormat.class);
		try {
			Date parseDate1 = format1.parse("08/09/2021");
//			System.out.println(parseDate1);
			LOGGER.debug(parseDate1.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		LOGGER.info("END");
	}
}
