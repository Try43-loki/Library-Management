package com.example.library_managment_system.service;

import com.example.library_managment_system.model.entities.AppUser;
import com.example.library_managment_system.model.response.AppUserResponse;

import java.util.List;
public interface AppUserService {
    List<AppUserResponse> getAllUser();
}
