package com.example.library_managment_system.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "app_users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID userId;

    private String name;
    private String email;
    private String password;
    private String phone;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String address;

    @Column(name = "is_verified")
    private boolean isVerified;

    @Column(name = "is_staff")
    private boolean isStaff;
}
