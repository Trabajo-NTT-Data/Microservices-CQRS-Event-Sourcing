package com.example.demo.api.commands;

import com.example.demo.commands.BaseCommand;
import com.example.demo.dto.AccountType;
import com.example.demo.dto.DocumentType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
    private String email;
    private String documentNumber;
    private DocumentType documentType;
    private String phone;
    
}
