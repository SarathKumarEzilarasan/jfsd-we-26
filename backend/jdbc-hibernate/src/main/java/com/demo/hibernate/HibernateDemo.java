package com.demo.hibernate;

import com.demo.hibernate.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Set;

public class HibernateDemo {
    public static void main(String[] args) {
//        Customer customer = Customer.builder()
//                .customerName("Anand")
//                .contactName("anand doe")
//                .city("chennai")
//                .postalCode("6000001")
//                .build();

//        CustomerLogin login = CustomerLogin.builder()
//                .username("Anand")
//                .password("user@123")
//                .build();


        Course java = Course.builder()
                .name("Java").build();
        Course js = Course.builder()
                .name("JavaScript").build();

        Student john = Student.builder()
                .name("John").build();
        Student peter = Student.builder()
                .name("Peter").build();

        john.setCourses(Set.of(java,js));
        peter.setCourses(Set.of(java));

        Configuration configuration =
                new Configuration().configure()
                        .addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Categories.class)
                        .addAnnotatedClass(Products.class)
                        .addAnnotatedClass(Student.class)
                        .addAnnotatedClass(Course.class)
                        .addAnnotatedClass(CustomerLogin.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        session.persist(customer);
//        session.persist(login);
//        Customer customer = session.getReference(Customer.class, 1);
//        Categories categories = session.getReference(Categories.class, 1);
        session.persist(john);
        session.persist(peter);

        Student student = session.getReference(Student.class, 1);
        transaction.commit();


        System.out.println(student);
//        System.out.println(categories.getProducts().get(0));
    }
}
