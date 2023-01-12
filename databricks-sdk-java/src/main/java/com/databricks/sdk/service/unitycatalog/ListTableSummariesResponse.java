// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListTableSummariesResponse {
    /**
     * Optional. Opaque token for pagination. Empty if there's no more page.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * Only name, catalog_name, schema_name, full_name and table_type will be
     * set.
     */
    @JsonProperty("tables")
    private java.util.List<TableSummary> tables;
    
    public ListTableSummariesResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListTableSummariesResponse setTables(java.util.List<TableSummary> tables) {
        this.tables = tables;
        return this;
    }

    public java.util.List<TableSummary> getTables() {
        return tables;
    }
    
}
