package com.al.invoicing.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Invoice {

    private UUID id;
    private LocalDate date;
    private Company seller;
    private Company buyer;
    private List<InvoiceEntry> invoiceEntryList;
}
