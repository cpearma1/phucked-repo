package com.group12.FastLeaning;
 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassPage {
    @Id
    @GeneratedValue
    private int id;
    private String teacherFirstName;
    private String teacherLastName;
    private String className;




}