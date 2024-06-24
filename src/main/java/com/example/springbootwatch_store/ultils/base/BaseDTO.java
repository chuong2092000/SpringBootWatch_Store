package com.example.springbootwatch_store.ultils.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
public abstract class BaseDTO implements Serializable {

    private UUID id;

    private String status;

    private Boolean isDeleted;

    private Date createdDate;

    private String createdBy;

    private Date lastModifiedDate;

    private String lastModifiedBy;
}