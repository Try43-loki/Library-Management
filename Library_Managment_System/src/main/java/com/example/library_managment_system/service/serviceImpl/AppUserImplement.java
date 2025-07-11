package com.example.library_managment_system.service.serviceImpl;

import com.example.library_managment_system.model.entities.AppUser;
import com.example.library_managment_system.model.response.AppUserResponse;
import com.example.library_managment_system.repository.AppUserRepository;
import com.example.library_managment_system.service.AppUserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AppUserImplement implements AppUserService {

    private  final  AppUserRepository appUserRepository;
    private  final ModelMapper modelMapper;
    @Override
    public List<AppUserResponse> getAllUser() {
        var appUsers = appUserRepository.findAll();
        List<AppUserResponse> appUserResponseList = new ArrayList<>();
        for(AppUser appUser : appUsers) {
            appUserResponseList.add(modelMapper.map(appUser, AppUserResponse.class)) ;
        }
        return appUserResponseList;
    }
}
