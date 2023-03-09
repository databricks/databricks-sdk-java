// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * This API allows you to download billable usage logs for the specified account
 * and date range. This feature works with all account types.
 */
public class BillableUsageAPI implements BillableUsageService {
    private final ApiClient apiClient;

    public BillableUsageAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Return billable usage logs.
     * 
     * Returns billable usage logs in CSV format for the specified account and
     * date range. For the data schema, see [CSV file schema]. Note that this
     * method might take multiple seconds to complete.
     * 
     * [CSV file schema]: https://docs.databricks.com/administration-guide/account-settings/usage-analysis.html#schema
     */
    @Override
    public void download(DownloadRequest request) {
        String path = String.format("/api/2.0/accounts//usage/download");
        apiClient.GET(path, request, Void.class);
    }
    
}