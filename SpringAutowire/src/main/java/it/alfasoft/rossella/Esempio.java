package it.alfasoft.rossella;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		 
		    Triangolo t=(Triangolo) context.getBean("triangolo");
		   
		   t.stampaVertici();
	}

}
