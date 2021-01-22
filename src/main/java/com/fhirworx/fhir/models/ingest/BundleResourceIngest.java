package com.fhirworx.fhir.models.ingest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fhirworx.fhir.models.ingest.component.IdentifierIngest;
import com.fhirworx.fhir.models.ingest.component.MetaIngest;

import lombok.Data;

@JsonTypeInfo(
	    use =JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "resourceType"
	)
	@JsonSubTypes({
	   
	})
	@Data
	public abstract class BundleResourceIngest {
	    private String resourceType;
	    private String resourceSubType;
	    private String id;
	    private MetaIngest resourceMeta;
	    private String language;
	    private List<IdentifierIngest> identifier;
	}
