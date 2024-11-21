package com.bits.oems.commons.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class PaymentDTO {

    @NotBlank
    private String paymentId;

    @Min(1)
    private double amount;

    @NotBlank
    private String currency;

    @NotBlank
    private String referenceId;

    private String username;

}
