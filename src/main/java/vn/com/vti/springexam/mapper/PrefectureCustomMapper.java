package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.Prefecture;

public interface PrefectureCustomMapper {
	List<Prefecture> selectPrefectureByName(String prefectureName);
}
