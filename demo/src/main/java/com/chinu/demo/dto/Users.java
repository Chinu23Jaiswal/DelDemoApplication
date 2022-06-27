package com.chinu.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="deal")
public class Users {

    @Id
    private  int id;

    @Column(name ="name")
    private String name;

    @Column(name ="price")
    private String price;

    @Column(name ="quantity")
    private int quantity;


}
