package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.WarningDAOImpl;
import com.dxsit.base.entity.Warning;
import com.dxsit.base.service.WarningService;

@Repository("warningService")
public class WarningServiceImpl extends BaseServiceImpl<WarningDAOImpl,Warning>  implements WarningService{
	
}