package com.techlabs.automobile.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Properties;

import com.techlabs.automobile.factory.IAutomobile;
import com.techlabs.automobile.factory.IAutomobileFactory;

public class AutomobileFactoryPropertyTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		IAutomobileFactory factory = loadFromPropertyFile();
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();

	}

	private static IAutomobileFactory loadFromPropertyFile() throws IOException, ClassNotFoundException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		FileReader file = new FileReader("Resources/config.properties");

		Properties p = new Properties();
		p.load(file);

		String s = p.getProperty("currentfactory");
		Class<?> cls = Class.forName(s);
		System.out.println(cls);

		Method method = null;
		try {
			method = cls.getDeclaredMethod("getInstance");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(method);
		IAutomobileFactory factory = (IAutomobileFactory) method.invoke(method);

		return factory;
	}

}
