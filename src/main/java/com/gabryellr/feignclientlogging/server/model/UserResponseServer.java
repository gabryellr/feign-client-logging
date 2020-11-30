package com.gabryellr.feignclientlogging.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseServer {

    private Long id;
    private String name;
    private String address;
    private Integer randomId;

}