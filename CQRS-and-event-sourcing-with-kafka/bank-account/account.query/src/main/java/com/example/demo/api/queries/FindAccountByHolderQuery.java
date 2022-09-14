package com.example.demo.api.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class FindAccountByHolderQuery extends BaseQuery {
    private String accountHolder;
}
