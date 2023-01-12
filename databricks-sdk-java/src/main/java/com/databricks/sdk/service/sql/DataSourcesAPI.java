// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * This API is provided to assist you in making new query objects. When creating
 * a query object, you may optionally specify a `data_source_id` for the SQL
 * warehouse against which it will run. If you don't already know the
 * `data_source_id` for your desired SQL warehouse, this API will help you find
 * it.
 * 
 * This API does not support searches. It returns the full list of SQL
 * warehouses in your workspace. We advise you to use any text editor, REST
 * client, or `grep` to search the response from this API for the name of your
 * SQL warehouse as it appears in Databricks SQL.
 */
@Generated("databricks-sdk-generator")
public class DataSourcesAPI implements DataSourcesService {
    private final ApiClient apiClient;

    public DataSourcesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get a list of SQL warehouses.
     * 
     * Retrieves a full list of SQL warehouses available in this workspace. All
     * fields that appear in this API response are enumerated for clarity.
     * However, you need only a SQL warehouse's `id` to create new queries
     * against it.
     */
    @Override
    public List<DataSource> list() {
        String path = "/api/2.0/preview/sql/data_sources";
        return apiClient.GET(path, List.class);
    }
    
}