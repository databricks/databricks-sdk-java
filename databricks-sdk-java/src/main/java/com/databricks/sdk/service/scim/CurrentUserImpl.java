// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of CurrentUser */
class CurrentUserImpl implements CurrentUserService {
    private final ApiClient apiClient;

    public CurrentUserImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public User me() {
        String path = "/api/2.0/preview/scim/v2/Me";
        return apiClient.GET(path, User.class);
    }
    
}