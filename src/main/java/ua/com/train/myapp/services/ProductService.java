package ua.com.train.myapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.train.myapp.dao.ProductDao;
import ua.com.train.myapp.model.Product;

import java.util.List;

@Service
public class ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional(readOnly = true)
    public Product getById(Integer id) {
        return productDao.getById(Product.class, id);
    }

    @Transactional(readOnly = true)
    public List<Product> getAll() {
        return productDao.getAll(Product.class);
    }

    @Transactional
    public void save(Product entity) {
        productDao.save(entity);
    }

    @Transactional
    public void update(Product entity) {
        productDao.update(entity);
    }

    @Transactional
    public void remove(Product entity) {
        productDao.remove(entity);
    }
}
