// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListCatalogsResponse {
    /**
     * An array of catalog information objects.
     */
    @JsonProperty("catalogs")
    private java.util.List<CatalogInfo> catalogs;
    
    public ListCatalogsResponse setCatalogs(java.util.List<CatalogInfo> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public java.util.List<CatalogInfo> getCatalogs() {
        return catalogs;
    }
    
}
