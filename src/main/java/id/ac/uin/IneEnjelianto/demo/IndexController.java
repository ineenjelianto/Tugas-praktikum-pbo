package id.ac.uin.IneEnjelianto.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {

    @GetMapping("/Hello")
    public String hello() {
        return
                "Selamat belajar Spring-boot!";
    }
}