package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JADU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        ApplicationContext con = new ClassPathXmlApplicationContext("Config.xml");
        Student s = (Student) con.getBean("student") ;
        et.begin();
        em.persist(s);
        et.commit();
    }
}
