package com.sparta.clonecodingslack.dto;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class UserRequestDto {

    private String username;

    private String password;

    private String nickname;
}
