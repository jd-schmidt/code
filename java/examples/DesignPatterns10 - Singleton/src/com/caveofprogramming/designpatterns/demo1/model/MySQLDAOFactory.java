package com.caveofprogramming.designpatterns.demo1.model;

/**
 *
 */
public class MySQLDAOFactory extends DAOFactory {
  @Override
  public MySQLPersonDAO getPersonDAO() {
    return new MySQLPersonDAO();
  }

}
