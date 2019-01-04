package com.openwebinars.HelloWorldSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.openwebinars.beans.Mundo;
import com.openwebinars.beans.Vehiculo;
import com.openwebinars.beans.list.Provincia;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		beansBasico();
		beansReferencial();
		beansList();

	}

	private static void beansBasico() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");
		Mundo mundo = (Mundo) applicationContext.getBean("mundo");
		System.out.println("Datos de clase:" + mundo.getSaludo());
		((ConfigurableApplicationContext) applicationContext).close();

	}

	private static void beansReferencial() {
		System.out.println("Ingreso beansReferencial");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/openwebinars/xml/beans_referencia.xml");
		Vehiculo vehiculo = (Vehiculo) applicationContext.getBean("vehiculo");
		vehiculo.setMarca("Porche");
		vehiculo.setModelo("911");
		System.out.println("valor de vehiculo:" + vehiculo);

		((ConfigurableApplicationContext) applicationContext).close();

	}
	private static void beansList() {
		System.out.println("Ingreso beansList");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/openwebinars/xml/beans_list.xml");
		Provincia provincia = (Provincia) applicationContext.getBean("Sevilla");
		
		System.out.println("valor de vehiculo:" + provincia.toString());

		((ConfigurableApplicationContext) applicationContext).close();

	}
	
	
}
