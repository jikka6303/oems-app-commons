package com.bits.oems.commons.model;

import lombok.Data;

@Data
public class UserDTO {

    private String username;

    public static UserDTO fromUsername(String username) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(username);
        return userDTO;
    }
}
