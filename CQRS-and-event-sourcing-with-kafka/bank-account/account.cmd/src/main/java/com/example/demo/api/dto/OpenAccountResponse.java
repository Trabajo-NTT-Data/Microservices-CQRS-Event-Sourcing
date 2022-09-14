package com.example.demo.api.dto;


import com.example.demo.dto.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class OpenAccountResponse extends BaseResponse {
    private String id;

    public OpenAccountResponse(String message, String id) {
        super(message);
        this.id = id;
    }
}
