package com.caveofprogramming.designpatterns.demo1.model;

/**
 * Created by jd on 5/11/15.
 */
public abstract class DAOFactory {

  public static final int MYSQL = 0;
  public static final int ORACLE = 1;

  public abstract PersonDAO getPersonDAO();

  public static DAOFactory getDBMS(int type) {
    switch (type) {
      case MYSQL:
        return new MySQLDAOFactory();
      case ORACLE:
        return new OracleDAOFactory();
      default:
        throw new RuntimeException("not mysql or Oracle");
    }
  }
}
