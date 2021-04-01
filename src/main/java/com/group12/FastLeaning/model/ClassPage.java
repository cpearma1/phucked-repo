package com.group12.FastLeaning.model;
 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassPage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name= "teacher_first_name")
    private String teacherFirstName;
    @Column(name="teacher_last_name")
    private String teacherLastName;
    @Column(name="class_name")
    private String className;




}