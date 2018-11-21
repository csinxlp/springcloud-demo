package org.springcloud.dao;

import org.springcloud.entity.Department;

import java.util.List;

public interface DepartmentDao {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> listAll();
}