package ru.hakaton.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefreshJwtRequest {

    private String refreshToken;

}
