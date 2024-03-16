package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="DB name")

public class Salary {

    @Id
    @Column(name = "kimlikno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "calisanadi")
    private String calisan;

    @Column(name = "maastarihi")
    private String odemetarihi;

    @Column(name = "maastutar")
    private String odemeozeti;


}
