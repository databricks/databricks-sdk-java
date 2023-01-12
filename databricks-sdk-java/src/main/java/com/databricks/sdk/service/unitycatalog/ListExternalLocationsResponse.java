// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListExternalLocationsResponse {
    /**
     * An array of external locations.
     */
    @JsonProperty("external_locations")
    private java.util.List<ExternalLocationInfo> externalLocations;
    
    public ListExternalLocationsResponse setExternalLocations(java.util.List<ExternalLocationInfo> externalLocations) {
        this.externalLocations = externalLocations;
        return this;
    }

    public java.util.List<ExternalLocationInfo> getExternalLocations() {
        return externalLocations;
    }
    
}
