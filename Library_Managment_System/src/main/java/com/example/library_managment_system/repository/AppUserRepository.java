package com.example.library_managment_system.repository;

import com.example.library_managment_system.model.entities.AppUser;
import com.example.library_managment_system.model.response.AppUserResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, UUID> {}