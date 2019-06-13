package com.chang.crush.entity;

//@JacksonXmlRootElement(localName = "User")
public class UserXml {

    //@JacksonXmlProperty(localName = "name")
    private String name;

    //@JacksonXmlProperty(localName = "age")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
