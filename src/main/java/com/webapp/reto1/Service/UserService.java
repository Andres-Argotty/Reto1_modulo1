package com.webapp.reto1.Service;

import com.webapp.reto1.Model.User;
import com.webapp.reto1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }
    public Optional<User> getUser(int id){
        return  userRepository.findUser(id);
    }
    public User save (User user){
        if (user.getId()==null){
            return userRepository.save(user);
        }else {
            Optional<User> userFinded= getUser(user.getId());
            if (userFinded.isEmpty()){
                return userRepository.save(user);
            }else {
                return user;
            }
        }
    }
    public boolean ValidarEmail (String email){
        Optional<User> userFinded= userRepository.findByEmail(email);
        if (userFinded.isPresent()){
            return true;
        }else {
            return false;
        }



    }
    public User ValidarUsuario (String email, String password){
        Optional<User> UserFinded= userRepository.findByEmailandPassword(email, password);
        if (UserFinded.isEmpty()){
            return new User(email,password,"NO DEFINIDO");

        }else {
            return UserFinded.get();
        }
    }


}
