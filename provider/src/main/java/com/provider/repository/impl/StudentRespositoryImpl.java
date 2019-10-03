package com.provider.repository.impl;

import com.provider.entity.Student;
import com.provider.repository.StudentRespository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRespositoryImpl implements StudentRespository {

    private Map<Long,Student> studentMap;

    public StudentRespositoryImpl() {
        this.studentMap = new HashMap<>();
         this.studentMap.put(1L, new Student(1L, "张三", 20));
         this.studentMap.put(2L, new Student(2L, "李四", 21));
         this.studentMap.put(3L, new Student(3L, "王五", 24));
    }

    @Override
    public Collection<Student> findAll() {
        return this.studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return this.studentMap.get(id);
    }

    @Override
    public void saveOrupdate(Student student) {
           this.studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
          this.studentMap.remove(id);
    }
}
