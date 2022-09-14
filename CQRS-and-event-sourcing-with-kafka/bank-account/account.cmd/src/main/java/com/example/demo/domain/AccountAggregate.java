package com.example.demo.domain;

import com.example.demo.api.commands.OpenAccountCommand;

import com.example.demo.events.AccountClosedEvent;
import com.example.demo.events.AccountOpenedEvent;
import com.example.demo.events.FundsDepositedEvent;
import com.example.demo.events.FundsWithdrawnEvent;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class AccountAggregate extends AggregateRoot {
    private Boolean active;
    private double balance;
    private String email;
    private String documentNumber;

    private String phone;
    public double getBalance() {
        return this.balance;
    }

    public Boolean getActive() {
        return this.active;
    }

    public AccountAggregate(OpenAccountCommand command) {
        raiseEvent(AccountOpenedEvent.builder()
                    .id(command.getId())
                    .accountHolder(command.getAccountHolder())
                    .documentNumber(command.getDocumentNumber())
                    .documentType(command.getDocumentType())
                    .email(command.getEmail())
                    .phone(command.getPhone())
                    .createdDate(new Date())
                    .accountType(command.getAccountType())
                    .openingBalance(command.getOpeningBalance())
                    .build());
    }

    public void apply(AccountOpenedEvent event) {
        this.id = event.getId();
        this.active = true;
        this.balance = event.getOpeningBalance();
    }

    public void depositFunds(double amount) {
        if (!this.active) {
            throw new IllegalStateException("Funds cannot be deposited into a closed account!");
        }
        if(amount <= 0) {
            throw new IllegalStateException("The deposit amount must be greater than 0!");
        }
        raiseEvent(FundsDepositedEvent.builder()
                    .id(this.id)
                    .amount(amount)
                    .build());
    }

    public void apply(FundsDepositedEvent event) {
        this.id = event.getId();
        this.balance += event.getAmount();
    }

    public void withdrawFunds(double amount) {
        if (!this.active) {
            throw new IllegalStateException("Funds cannot be withdrawn from a closed account!");
        }
        raiseEvent(FundsWithdrawnEvent.builder()
                    .id(this.id)
                    .amount(amount)
                    .build());
    }

    public void apply(FundsWithdrawnEvent event) {
        this.id = event.getId();
        this.balance -= event.getAmount();
    }

    public void closeAccount() {
        if (!this.active) {
            throw new IllegalStateException("The bank account has already been closed!");
        }
        raiseEvent(AccountClosedEvent.builder()
                    .id(this.id)
                    .build());
    }

    public void apply(AccountClosedEvent event) {
        this.id = event.getId();
        this.active = false;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}
