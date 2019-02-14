package com.example.hellobootgradle.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

public class Student {

    private Integer id;

    private String name;

    private String subject;
    @Min(value = 2)
    private Integer personCount;

    public Student() {
    }

    public Student(Integer id,String name,String subject,Integer personCount){
        this.id=id;
        this.name=name;
        this.subject=subject;
        this.personCount=personCount;
    }



    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public Integer getId() {
        return id;
    }
    @Null
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @NotNull()
    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Id:"+id+"name:"+name+"personCount:"+personCount;
    }
}
