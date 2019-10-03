package com.provider.repository;

import com.provider.entity.Student;

import java.util.Collection;

public interface StudentRespository {
    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrupdate(Student student);
    public void deleteById(Long id);
}
