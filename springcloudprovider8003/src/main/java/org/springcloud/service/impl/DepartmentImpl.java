package org.springcloud.service.impl;

import org.springcloud.dao.DepartmentDao;
import org.springcloud.service.DepartmentService;
import org.springcloud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("departmentService")
public class DepartmentImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public int deleteByPrimaryKey(Long id) {
		return departmentDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Department record) {
		return departmentDao.insert(record);
	}

	@Override
	public int insertSelective(Department record) {
		return departmentDao.insertSelective(record);
	}

	@Override
	public Department selectByPrimaryKey(Long id) {
		return departmentDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		return departmentDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return departmentDao.updateByPrimaryKey(record);
	}

}
