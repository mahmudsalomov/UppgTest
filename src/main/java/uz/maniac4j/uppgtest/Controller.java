package uz.maniac4j.uppgtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    FakeService fakeService;
    @GetMapping("/")
    public List<FakeUppg> test(){
        return fakeService.all();
    }
}
