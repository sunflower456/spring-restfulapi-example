package com.example.restful.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //setter getter 생성
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
