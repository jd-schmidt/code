package com.caveofprogramming.designpatterns.demo1.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * One DAO class per table or view
 * CRUD - Create retrieve update Delete
 */

public class MySQLPersonDAO implements PersonDAO {

  @Override
  public void addPerson(Person p) throws Exception{
    Database.getInstance().connect();
    Connection conn = Database.getInstance().getConnection();

    PreparedStatement preparedStatement  = conn.prepareStatement("Insert into people (name, password) values (?,?)");

    preparedStatement.setString(1, p.getName());
    preparedStatement.setString(2, p.getPassword());
    preparedStatement.executeUpdate();
  }

  @Override
  public Person getPerson(int id) throws SQLException {
    Connection conn = Database.getInstance().getConnection();

    String sql = String.format("SELECT id, name, password from people where id=%d", id);
    Statement selectStatement = conn.createStatement();

    ResultSet rs = selectStatement.executeQuery(sql);

    rs.next();
    Person person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3));
    return person;

  }

  @Override
  public List<Person> getPeople() throws SQLException {
    List<Person> ret = new ArrayList<>();

    Connection conn = Database.getInstance().getConnection();

    String sql = "SELECT * from people";

    Statement stmt = conn.createStatement();

    ResultSet rs = stmt.executeQuery(sql);

    while(rs.next()) {
      Person person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3));
      ret.add(person);
    }
    return ret;
  }

  @Override
  public int deleteAll() throws Exception{
      Database.getInstance().connect();
      Connection conn = Database.getInstance().getConnection();

      PreparedStatement p = conn.prepareStatement("DELETE FROM people where 1=1");

      int deleted = p.executeUpdate();

      p.close();
      return deleted;

  }
  @Override
  public void updatePerson(Person person) {

  }

  @Override
  public void deletePerson(int id) {

  }
}
