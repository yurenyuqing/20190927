package com.feign.feign;

import com.feign.entity.Student;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignErr  implements  ProviderFeign{

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维修，，，，，，";
    }
}
