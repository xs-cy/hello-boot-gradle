package com.example.hellobootgradle.controller;

import com.example.hellobootgradle.pojo.Face;
import com.example.hellobootgradle.pojo.Student;
import com.example.hellobootgradle.server.FaceService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/face")
public class FaceController {

    @Autowired
    FaceService faceService;

    @GetMapping("/getFace")
    public Student getStudent(){
        Student student = new Student(1,"小明","语文",30);
        return student;
    }

    @PostMapping("/addFaceName")
    public String addFaceName(@RequestParam(value="faceName",required = false) String faceName){
        if(faceName==null){
            return "error";
        }
        System.out.println("输出名称："+faceName);
        return "success";
    }

    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public byte[] upload(@RequestParam MultipartFile multipartFile) throws IOException {
        byte[] bytes = multipartFile.getBytes();
        OutputStream outStream = new FileOutputStream(new File("D:/face.jpg"));
        IOUtils.copy(multipartFile.getInputStream(),outStream);
        return bytes;

    }

    @GetMapping(value = "/download",produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public byte[] download() throws IOException {
        InputStream inputStream = new FileInputStream(new File("D://face.jpg"));
        int available = inputStream.available();
        byte[] bytes = new byte[available];
        int read = inputStream.read(bytes);
        return bytes;
    }

    @PostMapping(value = "/addFace")
    public String addFace( Student face){
        System.out.println("face:"+face);
        return face.toString();
    }

    @GetMapping(value = "/getAllFace")
    public String getAllFace(){
        List<Face> faceList = faceService.getAllFae();
        System.out.println("FaceList:"+faceList.toString());
        return "success";
    }

}
