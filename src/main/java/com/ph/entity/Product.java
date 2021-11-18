package com.ph.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    private Long id;
    private String title;
    private int cost;
}
