package com.webapp.reto1.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
@Id
@NonNull
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@NonNull
@Column(name = "user_email",nullable = false,length = 50)
    private String email;
    @NonNull
    @Column(name = "user_password", nullable = false, length = 50)
    private String password;
@NonNull
    @Column(name = "user_name", nullable = false,length = 80)
    private String name;




}
