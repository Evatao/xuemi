package com.dxsit.base.service.impl;
// default package

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.BlogReplyDAOImpl;
import com.dxsit.base.entity.BlogReply;
import com.dxsit.base.service.BlogReplyService;

@Repository("blogReplyService")
public class BlogReplyServiceImpl   extends BaseServiceImpl<BlogReplyDAOImpl,BlogReply> implements BlogReplyService  {
	  
}