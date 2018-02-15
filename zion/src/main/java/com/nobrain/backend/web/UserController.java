package com.nobrain.backend.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nobrain.backend.model.User;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @RequestMapping(value="/{user}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // ...
        return null;
    }

    @RequestMapping(value="/{user}/customers", method= RequestMethod.GET)
    List<User> getUserCustomers(@PathVariable Long user) {
        // ...
        return null;
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        // ...
        return null;
    }
}
