package ua.com.train.myapp.dao;

import java.io.Serializable;
import java.util.List;

public interface GeneralDao<K extends Serializable,V> {

    V getById(Class<? extends V> entityClass, K id);

    List<V> getAll(Class<? extends V> entityClass);

    void save(V entity);

    void update(V entity);

    void remove(V entity);
}