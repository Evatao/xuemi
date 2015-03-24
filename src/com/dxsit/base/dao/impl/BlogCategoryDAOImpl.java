package com.dxsit.base.dao.impl;
// default package

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.BlogCategoryDAO;
import com.dxsit.base.entity.BlogCategory;

@Repository("blogCategoryDAO")
public class BlogCategoryDAOImpl   extends BaseDaoImpl<BlogCategory>  implements BlogCategoryDAO {
	   
}