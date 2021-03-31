package com.group12.FastLeaning;
 
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
    @Column(name = "classpage_id")
    private int id;
    private String teacherFirstName;
    private String teacherLastName;
    private String className;




}