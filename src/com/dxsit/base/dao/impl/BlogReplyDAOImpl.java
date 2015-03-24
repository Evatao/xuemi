package com.dxsit.base.dao.impl;
// default package

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.BlogReplyDAO;
import com.dxsit.base.entity.BlogReply;

@Repository("blogReplyDAO")
public class BlogReplyDAOImpl   extends BaseDaoImpl<BlogReply> implements BlogReplyDAO  {
	  
}