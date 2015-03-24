package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.BlogDAO;
import com.dxsit.base.entity.Blog;

@Repository("blogDAO")
public class BlogDAOImpl   extends BaseDaoImpl<Blog> implements BlogDAO  {
	 
}