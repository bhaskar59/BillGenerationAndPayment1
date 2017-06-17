package com.transaction.dao.ImplTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ShoppingCartApplication.entity.Product;
import com.transaction.dao.TransactionDao;

public class TransactionDaoImpl {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TransactionDao transactiondao = (TransactionDao) applicationcontext.getBean("transactionDao");
		List<Product> productList = transactiondao.getProducts();
		System.out.println(productList.size());
	}

}
