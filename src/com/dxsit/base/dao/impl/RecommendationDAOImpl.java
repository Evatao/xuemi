package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.RecommendationDAO;
import com.dxsit.base.entity.Recommendation;

@Repository("recommendationDAO")
public class RecommendationDAOImpl extends BaseDaoImpl<Recommendation> implements RecommendationDAO{
	  
}