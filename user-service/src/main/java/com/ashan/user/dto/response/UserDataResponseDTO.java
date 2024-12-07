package com.ashan.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserDataResponseDTO implements IUserResponse {
    private Object data;
}
