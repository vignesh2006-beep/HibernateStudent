

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration con=new  Configuration();
		con.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		
		con.setProperty("hibernate.connection.url","jdbc:mysql://db01.dbhost.dev:5051/db_455buzhfk");
		
		con.setProperty("hibernate.connection.username","user_455buzhfk");
		
		con.setProperty("hibernate.connection.password","p455buzhfk");
		
		con.setProperty("hibernate.hbm2ddl.auto","update");
		con.setProperty("hibernate.show_sql","true");
		con.setProperty("hibernate.format_sql","true");
		
		con.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory =con.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Student student =new Student(104, "vigneshwaren", "vignesh2007ks@gmail.com", "Advance Java Program");
		session.beginTransaction();
		
		session.persist(student); 
		session.getTransaction().commit();
		
		System.out.println("Student inserted successfully");
	}

}
