package com.gabryellr.feignclientlogging.api.controller;

import com.gabryelllr.feignclientlogging.api.feign.model.request.UserUpdateRequest;
import com.gabryelllr.feignclientlogging.api.feign.model.response.UserResponse;
import com.gabryellr.feignclientlogging.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/client")
public class ApiController {

    private UserService userService;

    @PutMapping("/user/{userId}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable("userId") Long userId, @RequestBody UserUpdateRequest request) {
        UserResponse userResponse = userService.updateUser(userId, request);

        return ResponseEntity.ok(userResponse);
    }

}