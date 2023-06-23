package com.webapp.reto1.Controller;

import com.webapp.reto1.Model.User;
import com.webapp.reto1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods ={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save (@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{email}")
    public boolean validateEmail (@PathVariable String email){
        return userService.ValidarEmail(email);
    }
    @GetMapping("/{email}/{password}")
    public User validateEmailandPassword (@PathVariable("email") String email, @PathVariable("password") String password){
        return userService.ValidarUsuario(email, password);
    }





}
