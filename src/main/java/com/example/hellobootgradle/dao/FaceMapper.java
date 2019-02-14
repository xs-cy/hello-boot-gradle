package com.example.hellobootgradle.dao;

import com.example.hellobootgradle.pojo.Face;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaceMapper {

    @Select("select * from test_face")
    List<Face> getAll();

}
