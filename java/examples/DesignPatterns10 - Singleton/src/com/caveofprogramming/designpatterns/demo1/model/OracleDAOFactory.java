package com.caveofprogramming.designpatterns.demo1.model;

/**
 * Created by jd on 5/11/15.
 */
public class OracleDAOFactory extends DAOFactory{

  @Override
  public PersonDAO getPersonDAO() {
    return new OraclePersonDAO();
  }
}
