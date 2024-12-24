package com.example.test01.bean;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor  // 스프링에서는 bean객체를 생성할 때 기본생성자로 만든 후 setter로 주입
public class Point {
    private int x;
    private int y;
}
