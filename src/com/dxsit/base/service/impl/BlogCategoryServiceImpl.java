package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.BlogCategoryDAOImpl;
import com.dxsit.base.entity.BlogCategory;
import com.dxsit.base.service.BlogCategoryService;

// default package


@Repository("blogCategoryService")
public class BlogCategoryServiceImpl   extends BaseServiceImpl<BlogCategoryDAOImpl,BlogCategory>  implements BlogCategoryService {
	   
}