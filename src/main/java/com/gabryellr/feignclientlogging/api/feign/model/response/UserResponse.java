package com.gabryelllr.feignclientlogging.api.feign.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserResponse {

    private Long id;
    private String name;
    private String address;
    private Integer randomId;

}