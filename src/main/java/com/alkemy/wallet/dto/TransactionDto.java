package com.alkemy.wallet.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Data;

import java.util.Date;

@Data
public class TransactionDto {

    private Long id;

    private Double amount;

//    private TypeOfTransaction type;

    private Date transactionDate;

    private String description;

    private AccountDto account;

//    private BasicAccountDto account;


}
