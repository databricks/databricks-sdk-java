// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListMetastoresResponse {
    /**
     * An array of metastore information objects.
     */
    @JsonProperty("metastores")
    private java.util.List<MetastoreInfo> metastores;
    
    public ListMetastoresResponse setMetastores(java.util.List<MetastoreInfo> metastores) {
        this.metastores = metastores;
        return this;
    }

    public java.util.List<MetastoreInfo> getMetastores() {
        return metastores;
    }
    
}
