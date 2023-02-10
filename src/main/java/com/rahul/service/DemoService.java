package com.rahul.service;

import com.rahul.model.Welcome;
import com.rahul.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemoService {

    @Autowired
    private DemoRepo demoRepo;

    public List<String> get(){
         List<Welcome> wel = demoRepo.findAll();
         return wel.stream().map(a->a.getWelcome()).collect(Collectors.toList());
    }

    public String save(String message){
        Welcome data = new Welcome();
        data.setWelcome(message);
        try {
            Welcome saved = demoRepo.save(data);
            if(saved!=null)
                return "saved successfully";
            else throw new Exception("Error Occured");
        }catch (Exception e){
            return "Error | " + e.getMessage();
        }

    }
}
