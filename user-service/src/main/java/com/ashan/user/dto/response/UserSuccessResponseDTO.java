package com.ashan.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserSuccessResponseDTO implements IUserResponse {
    private String message;
}
