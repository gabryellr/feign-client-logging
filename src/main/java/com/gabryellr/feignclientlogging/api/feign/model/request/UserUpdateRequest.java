package com.gabryelllr.feignclientlogging.api.feign.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserUpdateRequest {

    private Long id;
    private String name;
    private String address;

}