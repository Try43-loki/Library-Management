package com.example.library_managment_system.utils;

import com.example.library_managment_system.model.response.ApiResponse;
import com.example.library_managment_system.model.response.AppUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResponseBuilder {
    public static ResponseEntity<ApiResponse<?>> success(String message, HttpStatus status) {
        ApiResponse<?> response = ApiResponse.builder()
                .code(status.value())
                .message(message)
                .data(null)
                .build();


        return new ResponseEntity<>(response, status);
    }


        public static ResponseEntity<ApiResponse<List<?>>> successList(HttpStatus status, String message , List <?> data) {
            var response = ApiResponse.<List<?>>builder()
                .code(status.value())
                .message(message)
                .data(data)
                .build();
        return new ResponseEntity<>(response, status);
        }
}
