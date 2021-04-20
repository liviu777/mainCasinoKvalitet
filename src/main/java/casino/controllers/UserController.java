package casino.controllers;


import casino.entities.User;
import casino.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
//HTTP methods: GET, POST, PUT, DELETE
//GET - get = aducem resurse (luam resurse/date de pe server)
//POST - create/save = cream sau salvam
//PUT - update = actualizam
//DELETE - delete = stergem
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findById") // localhost:8080/user/findById
    public User findById(Long userId) {
        return userService.findById(userId);
    }

    public List<User> findAll() {
        return userService.findAll();

    }

    public User save(User user) {
        return userService.save(user);
    }

    public void delete(Long userId) {
        userService.delete(userId);
    }

    public User findByUsername(String username) {
        return userService.findByUsername(username);
    }


}
