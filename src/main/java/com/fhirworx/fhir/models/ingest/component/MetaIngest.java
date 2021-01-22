package com.fhirworx.fhir.models.ingest.component;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaIngest {
    private String versionId;
    private String lastUpdated;
    private List<String> profile;
}