package com.example.demo.domain;

import com.example.demo.dto.AccountType;
import com.example.demo.dto.DocumentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper=false)
public class BankAccount extends BaseEntity {
    @Id
    private String id;
    private String accountHolder;
    private Date creationDate;
    private AccountType accountType;
    private double balance;
    private String email;
    private String documentNumber;
    private DocumentType documentType;
    private String phone;
}
