package com.example.spring.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    private Integer id;
    private String name;
    private Integer rollNumber;
}
