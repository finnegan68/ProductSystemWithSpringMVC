package ua.com.train.myapp.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.train.myapp.dao.ProductDao;
import ua.com.train.myapp.model.Product;


@Repository(value = "productDaoImpl")
public class ProductDaoImpl extends GeneralDaoImpl<Integer,Product> implements ProductDao {

    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}