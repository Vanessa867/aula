 package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
 public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private short age;

    
}