package com.java158.hrclient.service.impl;

import com.java158.hr.entity.Users;
import com.java158.hrclient.mapper.UsersMapper;
import com.java158.hrclient.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;


	@Override
	public String test() {
		return "调用成功";
	}

	@Override
	public Users findByName(String name) {

		return usersMapper.findByName(name);
	}
}
