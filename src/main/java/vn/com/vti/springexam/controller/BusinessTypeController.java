package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.springexam.entity.BusinessType;
import vn.com.vti.springexam.entity.BusinessTypeExample;
import vn.com.vti.springexam.mapper.BusinessTypeMapper;

@Controller
@RequestMapping("businessType")
public class BusinessTypeController {
	@Autowired
	private BusinessTypeMapper businessTypeMapper;

	@RequestMapping(value = "list", produces = "text/plain")
	@ResponseBody
	public String list() {
		BusinessTypeExample businessTypeExample = new BusinessTypeExample();
		businessTypeExample.setOrderByClause("business_type_id");
		List<BusinessType> businessTypeList = businessTypeMapper.selectByExample(businessTypeExample);
		String result = "";
		for (BusinessType businessType : businessTypeList) {
			result += businessType.getBusinessTypeId();
			result += ":";
			result += businessType.getBusinessTypeName();
			result += "\r\n";
		}
		return result;
	}
}