package com.dxsit.base.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxsit.base.entity.Major;
import com.dxsit.base.service.MajorService;

@Controller
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	private MajorService majorService;
	
	
	@ResponseBody
	@RequestMapping("/getMajorList")
	public String getMajors(String schoolName) throws UnsupportedEncodingException{
		List<Major> majors = majorService.getMajorsBySName(schoolName);

		String str = JSONArray.fromObject(majors).toString();
		//设置编码
		str = URLEncoder.encode(str, "UTF-8");  
		System.out.println(str);
		return str;	
	}
}
