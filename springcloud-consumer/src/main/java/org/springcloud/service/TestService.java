package org.springcloud.service;

import org.springcloud.entity.Department;

/**
 * 部门接口
 * @author chenxinming
 */
public interface TestService {
    public Department getById(long id);
}
