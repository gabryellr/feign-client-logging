package com.gabryellr.feignclientlogging.api.feign;

import com.gabryelllr.feignclientlogging.api.feign.model.request.UserUpdateRequest;
import com.gabryelllr.feignclientlogging.api.feign.model.response.UserResponse;
import com.gabryellr.feignclientlogging.api.feign.config.FeignUserConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "userClient", url = "localhost:8080/api/v1")
public interface UserClient {

    @PutMapping("/user/{userId}")
    ResponseEntity<UserResponse> updateUser(@RequestBody UserUpdateRequest userRequest, @PathVariable("userId") Long userId);

}
