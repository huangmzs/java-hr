package com.java158.hrclient.service.impl;

import com.java158.hr.entity.Permissions;
import com.java158.hrclient.mapper.PermissionsMapper;
import com.java158.hrclient.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionsServiceImpl implements PermissionsService {

	@Autowired
	private PermissionsMapper permissionsMapper;

	@Override
	public List<Permissions> findAll() {
		return permissionsMapper.selectByExample(null);
	}
}
