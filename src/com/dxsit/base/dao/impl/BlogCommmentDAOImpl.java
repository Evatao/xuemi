package com.dxsit.base.dao.impl;

// default package

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.BlogCommmentDAO;
import com.dxsit.base.entity.BlogComment;
@Repository("blogCommmentDAO")
public class BlogCommmentDAOImpl   extends BaseDaoImpl<BlogComment> implements BlogCommmentDAO{

}