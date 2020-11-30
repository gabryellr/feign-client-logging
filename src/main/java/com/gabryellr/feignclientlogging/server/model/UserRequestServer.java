package com.gabryellr.feignclientlogging.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserRequestServer {

    private Long id;
    private String name;
    private String address;

}