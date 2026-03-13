package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    private String password;

    private String about;

    private boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    
    
    @Transient
    private List<Rating> rating = new ArrayList<Rating>();
}