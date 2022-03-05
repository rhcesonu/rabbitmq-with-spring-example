package com.samual.v1.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UsersController {

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String userName() {
        return "Hello Samual";

    }

}
