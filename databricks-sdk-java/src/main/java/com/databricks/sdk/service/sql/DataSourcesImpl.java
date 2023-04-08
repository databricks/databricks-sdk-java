// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of DataSources */
class DataSourcesImpl implements DataSourcesService {
    private final ApiClient apiClient;

    public DataSourcesImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public List<DataSource> list() {
        String path = "/api/2.0/preview/sql/data_sources";
        return apiClient.GET(path, List.class);
    }
    
}