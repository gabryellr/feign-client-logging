package com.gabryellr.feignclientlogging.server.controller;

import com.gabryellr.feignclientlogging.server.model.UserRequestServer;
import com.gabryellr.feignclientlogging.server.model.UserResponseServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("api/v1")
public class Controller {

    @PutMapping("/user/{userId}")
    public ResponseEntity<UserResponseServer> updateUser(@PathVariable("userId") Long userId, @RequestBody UserRequestServer request) {
        return ResponseEntity.ok(
                UserResponseServer.builder()
                .id(userId)
                .address(request.getAddress())
                .name(request.getName())
                .randomId(new Random().nextInt())
                .build()
        );
    }

}