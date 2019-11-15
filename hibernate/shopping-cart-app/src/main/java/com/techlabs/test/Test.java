package com.techlabs.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Order;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory.getClass());

		Session session = null;
		Transaction txc = null;

		try {
			session = factory.openSession();
			txc = session.beginTransaction();
			
			Customer c1 = new Customer();
			c1.setName("Nilam");
			
			Order o1 = new Order();
			
			java.util.Date date = new java.util.Date();
			
			o1.setDate(date);
			o1.setCustomer(c1);
			
			Order o2 = new Order();
			java.util.Date date2 = new java.util.Date();
			o2.setDate(date2);
			o2.setCustomer(c1);
			
			Set<Order> orders= c1.getOrders();
			orders.add(o1);
			orders.add(o2);
			
			c1.setOrders(orders);
			
			LineItem item1 = new LineItem();
			item1.setProductName("Iphone11");
			item1.setQuantity(2);
			
			item1.setOrder(o1);
			
			LineItem item2 = new LineItem();
			item2.setProductName("Samsung");
			item2.setQuantity(5);
			
			item2.setOrder(o2);
			
			Set<LineItem> items = o1.getLineItems();
			items.add(item1);
			
			Set<LineItem> items2 = o2.getLineItems();
			items2.add(item2);
			
			session.save(c1);
			session.save(o1);
			session.save(o2);
			
			txc.commit();
			System.out.println("Student data inserted....");

		} catch (Exception ex) {
			if (txc != null) {
				txc.rollback();
			}
			System.out.println(ex);

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

}
