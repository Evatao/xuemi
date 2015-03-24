package com.dxsit.base.base;

import java.util.List;

import org.hibernate.criterion.Criterion;

public interface BaseService<K,T> {

	public void  insert(T t);

	public void update(T t);

	public void delete(T t);
	
	public void deleteById(Integer id);

	public T getById(Integer id);

	public List<T> findAll();
	
	public List<T> getListForPage(final String hql, final int offset,   
		    final int length) ;
	

	int getCount();
	
	
	List<T> findByProperty(String propertyName, Object value);

	Object findObjectBySql(String sql, Object... params);

	List<T> getListByHQL(String hql, Object... params);

	void executeHqlForUpdate(String hql, Object... params);

}
