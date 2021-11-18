package com.ph.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Cat {
    private String name;
    private int age;
    private List<Cat> children;

}
