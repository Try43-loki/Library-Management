package com.example.library_managment_system.controller;

import com.example.library_managment_system.model.entities.AppUser;
import com.example.library_managment_system.model.response.ApiResponse;
import com.example.library_managment_system.model.response.AppUserResponse;
import com.example.library_managment_system.service.AppUserService;
import com.example.library_managment_system.utils.ResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<AppUserResponse>>> getAppUser() {
       return null;
    }


}
