package com.sample.domain.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class RefreshTokenReq {

    @Schema( type = "string", example = "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE2NTI3OTgxOTh9.6CoxHB_siOuz6PxsxHYQCgUT1_QbdyKTUwStQDutEd1-cIIARbQ0cyrnAmpIgi3IBoLRaqK7N1vXO42nYy4g5g", description="refresh token 입니다." )
    @NotBlank
    @NotNull
    private String refreshToken;

    public RefreshTokenReq(){}

    @Builder
    public RefreshTokenReq(String refreshToken){
        this.refreshToken = refreshToken;
    }
}
