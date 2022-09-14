package com.example.demo.events;

import com.example.demo.dto.AccountType;
import com.example.demo.dto.DocumentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
public class AccountOpenedEvent extends BaseEvent {
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalance;
    private String email;
    private String documentNumber;
    private DocumentType documentType;
    private String phone;
}
