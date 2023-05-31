package com.rudov.todayinfoservice;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class People {

    private Long id;
    private String name;
    private Byte age;

}
