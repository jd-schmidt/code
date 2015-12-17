package com.caveofprogramming.designpatterns.demo1.model;

public class MySQLDAOFactory extends DAOFactory {
	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.demo1.model.DAOFactory#getPersonDAO()
	 */
	@Override
	public PersonDAO getPersonDAO() {
		return new MySQLPersonDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.demo1.model.DAOFactory#getLogDAO()
	 */
	@Override
	public LogDAO getLogDAO() {
		return new MySQLLogDAO();
	}
}
