package com.example.demo.api.dto;

import com.example.demo.domain.BankAccount;
import com.example.demo.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class AccountLookupResponse extends BaseResponse {
    private List<BankAccount> accounts;

    public AccountLookupResponse(String message) {
        super(message);
    }
}
