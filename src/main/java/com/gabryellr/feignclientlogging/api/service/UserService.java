package com.gabryellr.feignclientlogging.api.service;

import com.gabryelllr.feignclientlogging.api.feign.model.request.UserUpdateRequest;
import com.gabryelllr.feignclientlogging.api.feign.model.response.UserResponse;
import com.gabryellr.feignclientlogging.api.feign.UserClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserClient userClient;

    public UserResponse updateUser(Long userId, UserUpdateRequest request) {
        ResponseEntity<UserResponse> response = userClient.updateUser(request, userId);

        return response.getBody();
    }

}