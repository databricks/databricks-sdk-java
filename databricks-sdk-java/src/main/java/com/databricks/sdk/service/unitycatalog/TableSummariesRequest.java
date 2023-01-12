// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List table summaries
 */
@Generated("databricks-sdk-generator")
public class TableSummariesRequest {
    /**
     * Required. Name of parent catalog for tables of interest.
     */
    @QueryParam("catalog_name")
    private String catalogName;
    
    /**
     * Optional. Maximum number of tables to return (page length). Defaults to
     * 10000.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * Optional. Opaque token to send for the next page of results (pagination).
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     * Optional. A sql LIKE pattern (% and _) for schema names. All schemas will
     * be returned if not set or empty.
     */
    @QueryParam("schema_name_pattern")
    private String schemaNamePattern;
    
    /**
     * Optional. A sql LIKE pattern (% and _) for table names. All tables will
     * be returned if not set or empty.
     */
    @QueryParam("table_name_pattern")
    private String tableNamePattern;
    
    public TableSummariesRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }
    
    public TableSummariesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public TableSummariesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public TableSummariesRequest setSchemaNamePattern(String schemaNamePattern) {
        this.schemaNamePattern = schemaNamePattern;
        return this;
    }

    public String getSchemaNamePattern() {
        return schemaNamePattern;
    }
    
    public TableSummariesRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }

    public String getTableNamePattern() {
        return tableNamePattern;
    }
    
}
