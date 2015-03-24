package com.dxsit.base.service.impl;

// default package

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.BlogCommmentDAOImpl;
import com.dxsit.base.entity.BlogComment;
import com.dxsit.base.service.BlogCommmentService;

@Repository("blogCommmentService")
public class BlogCommmentServiceImpl   extends BaseServiceImpl<BlogCommmentDAOImpl,BlogComment> implements BlogCommmentService{

}