package com.group12.FastLeaning.service;

import com.group12.FastLeaning.model.ClassPage;
import com.group12.FastLeaning.repository.ClassPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassPageService {
    private ClassPageRepository classPageRepository;

    @Autowired
    public ClassPageService(ClassPageRepository classPageRepository){
        this.classPageRepository = classPageRepository;
    }

    public List<ClassPage> findBySearchQuery(String query){
        return classPageRepository.findByClassNameOrTeacherFirstNameOrTeacherLastNameContaining(query, query, query);

    }

}
