package com.learningTech.DemoHibEmbeddable3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName as=new AlienName();
    	as.setFirstname("lakshmi");
    	as.setLastname("perumal");
    	as.setMiddlename("ayyam");
    	
        Alien a = new Alien();
        a.setAliencolor("blue");
        a.setAlienID(101);
        a.setAlienName(as);
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a);
        tx.commit();
    }
}
