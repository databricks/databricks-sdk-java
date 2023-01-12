// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a list of queries
 */
@Generated("databricks-sdk-generator")
public class ListQueriesRequest {
    /**
     * Name of query attribute to order by. Default sort order is ascending.
     * Append a dash (`-`) to order descending instead.
     * 
     * - `name`: The name of the query.
     * 
     * - `created_at`: The timestamp the query was created.
     * 
     * - `schedule`: The refresh interval for each query. For example: "Every 5
     * Hours" or "Every 5 Minutes". "Never" is treated as the highest value for
     * sorting.
     * 
     * - `runtime`: The time it took to run this query. This is blank for
     * parameterized queries. A blank value is treated as the highest value for
     * sorting.
     * 
     * - `executed_at`: The timestamp when the query was last run.
     * 
     * - `created_by`: The user name of the user that created the query.
     */
    @QueryParam("order")
    private String order;
    
    /**
     * Page number to retrieve.
     */
    @QueryParam("page")
    private Long page;
    
    /**
     * Number of queries to return per page.
     */
    @QueryParam("page_size")
    private Long pageSize;
    
    /**
     * Full text search term
     */
    @QueryParam("q")
    private String q;
    
    public ListQueriesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return order;
    }
    
    public ListQueriesRequest setPage(Long page) {
        this.page = page;
        return this;
    }

    public Long getPage() {
        return page;
    }
    
    public ListQueriesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Long getPageSize() {
        return pageSize;
    }
    
    public ListQueriesRequest setQ(String q) {
        this.q = q;
        return this;
    }

    public String getQ() {
        return q;
    }
    
}
