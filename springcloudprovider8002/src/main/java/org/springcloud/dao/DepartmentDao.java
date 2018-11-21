package org.springcloud.dao;

import org.springcloud.entity.Department;

import java.util.List;

public interface DepartmentDao {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    /**
     * 更新部门
     * @param record
     * @return
     */
    int updateByPrimaryKey(Department record);

    /**
     *  查询部门集合
     * @return
     */
    List<Department> listAll();
}