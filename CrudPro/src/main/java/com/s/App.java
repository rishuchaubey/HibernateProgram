package com.s;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
    	Employee so1=new Employee();
    	so1.setEmp_id(1);
        so1.setEmp_name("Rishu");
    	so1.setCity("Delhi");
    	Configuration cfg=new Configuration();
    	cfg.configure("/com/r/hibernate.cfg.xml");
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr= s.beginTransaction();
    	
    	 try {
         s.save(so1);
         tr.commit();
         	
         }
         catch(Exception e){
         	tr.rollback();
         	e.printStackTrace();
         	
         }
    }
}
