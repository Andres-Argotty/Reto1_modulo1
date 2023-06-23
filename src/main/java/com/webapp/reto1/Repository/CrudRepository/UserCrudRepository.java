package com.webapp.reto1.Repository.CrudRepository;

import com.webapp.reto1.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    //Validación Correo

    public Optional<User>findByEmail(String email);

    //Validación Correo y Contraseña
    public Optional<User> findByEmailAndPassword(String email, String Password);


}
