package com.orm.DemoHib;


import java.util.Scanner;

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
        Record obj = new Record();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        obj.setSno(Integer.parseInt(c));
        obj.setName(b);
        obj.setScore(Integer.parseInt(c));
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Record.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        //Starting a transaction
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
    }
}
