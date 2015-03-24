package com.dxsit.base.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dxsit.base.entity.Major;
import com.dxsit.base.entity.University;
import com.dxsit.base.entity.Userinfo;
import com.dxsit.base.service.MajorService;
import com.dxsit.base.service.UniversityService;
import com.dxsit.base.service.UserinfoService;

@Component
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/core/spring-core.xml" })
public class SchoolTest {

	@Autowired
	private UniversityService universityService;

	@Autowired
	private MajorService majorService;
	
	@Autowired
	private UserinfoService userinfoService;

	@Test
	public void testMajorsMap() {
		
		University univer = universityService.getById(1001);
		Set<Major> majors = univer.getMajors();
		System.out.println(majors);
		
		Major byId = majorService.getById(1571);
		System.out.println(byId);
//		Userinfo userinfo=userinfoService.getById(Integer.parseInt("56"));
//		System.out.println(userinfo);
		
//		List<Major> majors = majorService.getMajorsBySName("清华大学");
//
//		for (Major major : majors) {
//			System.out.println(major);
//		}
//		University school = universityService.getById(2);
//		System.out.println(school);
//		System.out.println(school.getMajors());

	}

}
