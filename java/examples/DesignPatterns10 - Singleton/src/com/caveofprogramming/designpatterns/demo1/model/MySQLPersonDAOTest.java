package com.caveofprogramming.designpatterns.demo1.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.*;

public class MySQLPersonDAOTest {
//
//  MySQLPersonDAO dao;
//  Connection conn;
//
//  @Before
//  public void setUp() throws Exception {
//    System.out.println("Setup() start");
//    Database.getInstance().connect();
//
//    dao = MySQLDAOFactory.getPersonDAO();
//
//    dao.deleteAll();
//    System.out.println("Setup() done");
//
//  }
//
//  @After
//  public void tearDown() throws Exception {
//    System.out.println("tearDown()");
//    Database.getInstance().disconnect();
//  }
//
//  @Test
//  public void testDemo() {
//    System.out.println("test");
//
//    int value = 7;
//    value +=2;
//    Assert.assertTrue("Not equal", value == 9);
//    assertEquals("Not equal still", value, 9);
//    System.out.println("test");
//  }
//
//  @Test
//  public void testCreatePerson() throws Exception {
//    Person person1 = new Person("Bob", "Password");
//    Person person2 = new Person("Dan", "paSsWoRd");
//
//    dao.addPerson(person1);
//    dao.addPerson(person2);
//
//    List<Person> peeps =  dao.getPeople();
//
//    assertEquals("should be only 2 people", 2, peeps.size());
//
//    peeps.forEach((p) -> System.out.println(p.getName() + " " + p.getPassword()));
//
//    assertEquals("person 1 not equal", person1, peeps.get(0));
//    assertEquals("person 2 not equal", person2, peeps.get(1));
//  }
}
