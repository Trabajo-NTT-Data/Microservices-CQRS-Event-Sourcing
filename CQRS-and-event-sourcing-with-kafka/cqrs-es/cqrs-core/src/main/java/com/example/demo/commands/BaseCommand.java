package com.example.demo.commands;

import com.example.demo.messages.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public abstract class BaseCommand extends Message {
    public BaseCommand(String id){
        super(id);
    }
}
