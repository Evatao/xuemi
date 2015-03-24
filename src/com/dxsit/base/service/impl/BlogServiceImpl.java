package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.BlogDAOImpl;
import com.dxsit.base.entity.Blog;
import com.dxsit.base.service.BlogService;

@Repository("blogService")
public class BlogServiceImpl   extends BaseServiceImpl<BlogDAOImpl,Blog> implements BlogService  {
	 
}