// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts,
 * apps, and CI/CD platforms. Databricks recommends creating service principals
 * to run production jobs or modify production data. If all processes that act
 * on production data run with service principals, interactive users do not need
 * any write, delete, or modify privileges in production. This eliminates the
 * risk of a user overwriting production data by accident.
 */
public class ServicePrincipalsAPI implements ServicePrincipalsService {
    private final ApiClient apiClient;

    public ServicePrincipalsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a service principal.
     * 
     * Creates a new service principal in the Databricks Workspace.
     */
    @Override
    public ServicePrincipal create(ServicePrincipal request) {
        String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
        return apiClient.POST(path, request, ServicePrincipal.class);
    }
    
	/**
     * Delete a service principal.
     * 
     * Delete a single service principal in the Databricks Workspace.
     */
    @Override
    public void delete(DeleteServicePrincipalRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get service principal details.
     * 
     * Gets the details for a single service principal define in the Databricks
     * Workspace.
     */
    @Override
    public ServicePrincipal get(GetServicePrincipalRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
        return apiClient.GET(path, request, ServicePrincipal.class);
    }
    
	/**
     * List service principals.
     * 
     * Gets the set of service principals associated with a Databricks
     * Workspace.
     */
    @Override
    public ListServicePrincipalResponse list(ListServicePrincipalsRequest request) {
        String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
        return apiClient.GET(path, request, ListServicePrincipalResponse.class);
    }
    
	/**
     * Update service principal details.
     * 
     * Partially updates the details of a single service principal in the
     * Databricks Workspace.
     */
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
	/**
     * Replace service principal.
     * 
     * Updates the details of a single service principal.
     * 
     * This action replaces the existing service principal with the same name.
     */
    @Override
    public void update(ServicePrincipal request) {
        String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}