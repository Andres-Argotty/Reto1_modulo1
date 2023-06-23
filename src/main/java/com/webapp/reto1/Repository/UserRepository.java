package com.webapp.reto1.Repository;

import com.webapp.reto1.Model.User;
import com.webapp.reto1.Repository.CrudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> findAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    public Optional <User> findUser( int id){
        return userCrudRepository.findById(id);
    }
    public User save(User user){
        return userCrudRepository.save(user);
    }
    public Optional<User> findByEmail(String email){
        return  userCrudRepository.findByEmail(email);
    }
    public Optional<User> findByEmailandPassword (String email, String password){
        return  userCrudRepository.findByEmailAndPassword(email, password);
    }





}
