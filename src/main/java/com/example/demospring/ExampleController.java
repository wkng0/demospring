package com.example.demospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/first")
    String all() {
        String re = "Hello World";
        return re;
    }

    @GetMapping("/second")
    String all2() {
            String returnV = " 2nd mapping .v.";
            return returnV;
        }

    @PostMapping("/third")
    String all3() {
        String returnValue = "Post World o^o";
        return returnValue;
    }

    @PostMapping("/forth")
    String all4() {
        String returnVal = "This is the second post mapping method ._.";
        return returnVal;
    }

}
