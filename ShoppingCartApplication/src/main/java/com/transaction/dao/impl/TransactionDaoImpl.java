package com.transaction.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ShoppingCartApplication.entity.Product;
import com.transaction.dao.TransactionDao;

@Component("transactionDao")
public class TransactionDaoImpl implements TransactionDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> getProducts() {
		List<Product> productList =null;
		
		try{
			Session session=sessionFactory.openSession(); 
			Query query = (Query) session.getNamedQuery("getAllProducts");
			productList = query.getResultList();
		}
		catch(EmptyResultDataAccessException emptyResultexception){
			
		}
		return productList;
	}

}
