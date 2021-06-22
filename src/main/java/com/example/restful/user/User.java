package com.example.restful.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min=2, message = "2글자 이상 입력해 주세요")
    private String name;
    @Past
    private Date joinDate;
//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
