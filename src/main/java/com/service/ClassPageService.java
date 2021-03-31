package com.service;

import com.group12.FastLeaning.ClassPage;
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
        return (List<ClassPage>)classPageRepository.findByClassNameOrTeacherFirstNameOrTeacherLastNameContaining(query, query, query);

    }

}
