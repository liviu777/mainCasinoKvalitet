package casino.controllers;


import casino.entities.User;
import casino.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // #RestController, @Controller - delcaram clasa ca fiind bean in Spring
@RequestMapping("/user") // mapare a controller-ului pe path-ul /user
//HTTP methods: GET, POST, PUT, DELETE
//GET - get = aducem resurse (luam resurse/date de pe server)
//POST - create/save = cream sau salvam
//PUT - update = actualizam
//DELETE - delete = stergem
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findById/{id}") // http://localhost:8080/user/findById/2
//    @RequestMapping(
//            method = {RequestMethod.GET}
//    )
    //mapare a metodei din controller pe path-ul /findById => path-ul final: /user/findById
    //specificarea methodei din HTTP folosita pe acest path
    public User findById(@PathVariable Long userId) {
        return userService.findById(userId);
    }

    @GetMapping("/findAll") // http://localhost:8080/user/findAll
    public List<User> findAll() {
        return userService.findAll();

    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long userId) {
        userService.delete(userId);
    }

    @GetMapping("/findByUsername/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }


}
