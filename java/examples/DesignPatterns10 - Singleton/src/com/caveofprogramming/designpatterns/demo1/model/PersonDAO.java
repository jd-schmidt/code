package com.caveofprogramming.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jd on 5/11/15.
 */
public interface PersonDAO {

  void addPerson(Person p) throws Exception;

  Person getPerson(int id) throws SQLException;

  List<Person> getPeople() throws SQLException;

  int deleteAll() throws Exception;

  void updatePerson(Person person);

  void deletePerson(int id);
}
