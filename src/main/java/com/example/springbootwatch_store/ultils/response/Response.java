package com.example.springbootwatch_store.ultils.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Response {

    private String code;

    private Integer status;

    private String message;

    private final Long responseTime = System.currentTimeMillis();

    private Object data;
}