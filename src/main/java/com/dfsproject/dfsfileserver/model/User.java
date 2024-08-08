package com.dfsproject.dfsfileserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @UuidGenerator
    @Column(name = "id", updatable = false, unique = true)
    private String id;
    private String username;
    private String email;
    private String password;
    private Role role;
}
