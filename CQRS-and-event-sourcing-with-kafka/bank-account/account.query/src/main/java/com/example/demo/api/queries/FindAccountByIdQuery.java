package com.example.demo.api.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class FindAccountByIdQuery extends BaseQuery {
    private String id;
}
