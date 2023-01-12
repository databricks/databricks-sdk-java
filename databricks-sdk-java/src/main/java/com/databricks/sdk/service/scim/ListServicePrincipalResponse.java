// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListServicePrincipalResponse {
    /**
     * Total results returned in the response.
     */
    @JsonProperty("itemsPerPage")
    private Long itemsPerPage;
    
    /**
     * User objects returned in the response.
     */
    @JsonProperty("Resources")
    private java.util.List<ServicePrincipal> resources;
    
    /**
     * Starting index of all the results that matched the request filters. First
     * item is number 1.
     */
    @JsonProperty("startIndex")
    private Long startIndex;
    
    /**
     * Total results that match the request filters.
     */
    @JsonProperty("totalResults")
    private Long totalResults;
    
    public ListServicePrincipalResponse setItemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public Long getItemsPerPage() {
        return itemsPerPage;
    }
    
    public ListServicePrincipalResponse setResources(java.util.List<ServicePrincipal> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<ServicePrincipal> getResources() {
        return resources;
    }
    
    public ListServicePrincipalResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public Long getStartIndex() {
        return startIndex;
    }
    
    public ListServicePrincipalResponse setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    public Long getTotalResults() {
        return totalResults;
    }
    
}
