package com.example.hellobootgradle.server;

import com.example.hellobootgradle.dao.FaceMapper;
import com.example.hellobootgradle.pojo.Face;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaceService {
    @Autowired FaceMapper faceMapper;

    public List<Face> getAllFae(){
        return faceMapper.getAll();
    }
}
