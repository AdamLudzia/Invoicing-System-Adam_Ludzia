package com.al.invoicing.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Vat {

    VAT_0(0),
    VAT_23(23),
    VAT_5(5),
    VAT_8(8),
    VAT_ZW(0);

    private final BigDecimal rate;

    Vat(int rate) {
        this.rate = BigDecimal.valueOf(Long.parseLong(String.valueOf(rate)));
    }
}
