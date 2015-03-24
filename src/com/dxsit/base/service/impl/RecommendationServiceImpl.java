package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.RecommendationDAOImpl;
import com.dxsit.base.entity.Recommendation;
import com.dxsit.base.service.RecommendationService;

@Repository("recommendationService")
public class RecommendationServiceImpl extends BaseServiceImpl<RecommendationDAOImpl,Recommendation> implements RecommendationService{
	  
}