package com.al.invoicing.db;

import com.al.invoicing.model.Invoice;
import java.util.List;
import java.util.UUID;

public interface Database {

    UUID save(Invoice invoice);

    Invoice getById(UUID id);

    List<Invoice> getAll();

    Invoice update(Invoice updatedInvoice, UUID id);

    void delete(UUID id);

}
