package com.example.restful;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //setter getter 생성
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
