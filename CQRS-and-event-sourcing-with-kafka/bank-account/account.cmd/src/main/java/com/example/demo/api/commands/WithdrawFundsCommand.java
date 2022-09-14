package com.example.demo.api.commands;

import com.example.demo.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}
