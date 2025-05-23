package com.bitespeed.contact_consolidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ContactResponseDTO {

    private long primaryContactId;

    private List<String> emails;

    private List<String> phoneNumbers;

    private List<Long> secondaryContactIds;
}
