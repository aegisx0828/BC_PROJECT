package com.yly.bcproject.demo.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.yly.bcproject.demo.domain.entity.DemoVo;

@Mapper
@Repository
public interface DemoDao {
	List<DemoVo> getUserList();
	
	int setUserName(DemoVo demoVo);
}
