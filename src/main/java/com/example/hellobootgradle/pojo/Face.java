package com.example.hellobootgradle.pojo;

/**
 * test_face
 */
public class Face {
    private Integer id;
    private String faceName;
    private String faceSex;
    private Integer definition;//清晰度

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceSex(String faceSex) {
        this.faceSex = faceSex;
    }

    public String getFaceSex() {
        return faceSex;
    }

    public void setDefinition(Integer definition) {
        this.definition = definition;
    }

    public Integer getDefinition() {
        return definition;
    }

    @Override
    public String toString() {
        return "{Id:"+id+",faceName:"+faceName+",faceSex:"+faceSex+",definition"+definition+"}";
    }
}
