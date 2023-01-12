// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListResponse {
    /**
     * The total number of dashboards.
     */
    @JsonProperty("count")
    private Long count;
    
    /**
     * The current page being displayed.
     */
    @JsonProperty("page")
    private Long page;
    
    /**
     * The number of dashboards per page.
     */
    @JsonProperty("page_size")
    private Long pageSize;
    
    /**
     * List of dashboards returned.
     */
    @JsonProperty("results")
    private java.util.List<Dashboard> results;
    
    public ListResponse setCount(Long count) {
        this.count = count;
        return this;
    }

    public Long getCount() {
        return count;
    }
    
    public ListResponse setPage(Long page) {
        this.page = page;
        return this;
    }

    public Long getPage() {
        return page;
    }
    
    public ListResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Long getPageSize() {
        return pageSize;
    }
    
    public ListResponse setResults(java.util.List<Dashboard> results) {
        this.results = results;
        return this;
    }

    public java.util.List<Dashboard> getResults() {
        return results;
    }
    
}
