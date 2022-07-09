package com.al.invoicing.db.impl;

import com.al.invoicing.db.Database;
import com.al.invoicing.model.Invoice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InMemoryDatabase implements Database {

    private final Map<UUID, Invoice> invoices = new HashMap<>();

    @Override
    public UUID save(Invoice invoice) {

        invoice.setId(UUID.randomUUID());

        return UUID.randomUUID();
    }

    @Override
    public Invoice getById(UUID id) {
        return invoices.get(id);
    }

    @Override
    public List<Invoice> getAll() {
        return new ArrayList<>(invoices.values());
    }

    @Override
    public Invoice update(Invoice updatedInvoice, UUID id) {
       if(!invoices.containsKey(id)) {
           throw new IllegalArgumentException("Id" + id + "does not exist");
       }
        updatedInvoice.setId(id);
        invoices.put(id, updatedInvoice);
        return updatedInvoice;
    }

    @Override
    public void delete(UUID id) {
        invoices.remove(id);
    }
}
