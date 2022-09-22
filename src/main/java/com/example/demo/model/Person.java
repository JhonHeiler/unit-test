package com.example.demo.model;

import lombok.*;

@Builder(toBuilder = true)
@Setter @Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
}
