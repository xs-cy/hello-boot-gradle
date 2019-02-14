package com.example.hellobootgradle;


import com.example.hellobootgradle.pojo.Face;
import com.example.hellobootgradle.server.FaceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {

    @Autowired
    FaceService faceService;
    @Test
    public void contextLoads() {
        List<Face> faceList = faceService.getAllFae();
        System.out.println("测试："+faceList);

        //增加新的一行注释然后提交
    }

}
