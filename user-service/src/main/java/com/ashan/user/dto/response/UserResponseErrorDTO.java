package com.ashan.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserResponseErrorDTO implements IUserResponse {
    private String message;

}
