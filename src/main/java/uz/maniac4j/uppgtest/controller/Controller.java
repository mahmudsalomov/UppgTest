package uz.maniac4j.uppgtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.maniac4j.uppgtest.FakeService;
import uz.maniac4j.uppgtest.FakeUppg;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    FakeService fakeService;
    @GetMapping("/data")
    public List<FakeUppg> test(){
        return fakeService.all();
    }

    @GetMapping("/test")
    public String test2(){
        return "salom";
    }
}
