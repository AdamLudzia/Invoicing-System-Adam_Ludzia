package com.al.invoicing.service.impl;

import com.al.invoicing.db.Database;
import com.al.invoicing.model.Invoice;
import com.al.invoicing.service.InvoiceService;
import java.util.List;
import java.util.UUID;

public class InvoiceServiceImpl implements InvoiceService {

    private final Database database;

    public InvoiceServiceImpl(Database database){
        this.database =database;
    }

    public UUID save(Invoice invoice) {

        return database.save(invoice);
    }

    public Invoice getById(UUID id) {

        return database.getById(id);
    }

    public List<Invoice> getAll() {

        return database.getAll();
    }

    public Invoice update(Invoice updatedInvoice, UUID id) {
        database.update(updatedInvoice, id);
        return updatedInvoice;
    }

    public void delete(UUID id) {

       database.delete(id);
    }
}
