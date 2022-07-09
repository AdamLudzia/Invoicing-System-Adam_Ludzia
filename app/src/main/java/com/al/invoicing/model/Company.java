package com.al.invoicing.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Company {

    private UUID id;
    private String name;
    private String address;
    private String taxIdentifier;
    }