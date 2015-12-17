package com.caveofprogramming.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jd on 5/11/15.
 */
public class OraclePersonDAO implements PersonDAO {

  @Override
  public void addPerson(Person p) throws Exception {
    System.out.println("Adding person");
  }

  @Override
  public Person getPerson(int id) throws SQLException {
    return null;
  }

  @Override
  public List<Person> getPeople() throws SQLException {
    return null;
  }

  @Override
  public int deleteAll() throws Exception {
    return 0;
  }

  @Override
  public void updatePerson(Person person) {

  }

  @Override
  public void deletePerson(int id) {

  }
}
