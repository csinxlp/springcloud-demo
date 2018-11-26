package org.springcloud.service.component;

import feign.hystrix.FallbackFactory;
import org.springcloud.entity.Department;
import org.springcloud.service.DepartmentFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentClientFallbackFactory  implements FallbackFactory<DepartmentFeignClient> {
    @Override
    public DepartmentFeignClient create(Throwable throwable) {

        return new DepartmentFeignClient(){
            @Override
            public Department getById(long id) {
                Department department =new Department();
                department.setId(Long.MIN_VALUE);
                department.setName("hytrix error");
                department.setDbSource("客户端调用服务端发送熔断");
                return department;
            }

            @Override
            public List<Department> listAll() {
                return null;
            }
        };
    }
}
