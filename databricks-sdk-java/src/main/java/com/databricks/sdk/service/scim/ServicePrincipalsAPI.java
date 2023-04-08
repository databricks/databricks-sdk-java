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
public class ServicePrincipalsAPI {
    private final ServicePrincipalsService impl;

    /** Regular-use constructor */
    public ServicePrincipalsAPI(ApiClient apiClient) {
        impl = new ServicePrincipalsImpl(apiClient);
    }

    /** Constructor for mocks */
    public ServicePrincipalsAPI(ServicePrincipalsService mock) {
        impl = mock;
    }
	
	/**
     * Create a service principal.
     * 
     * Creates a new service principal in the Databricks Workspace.
     */
    public ServicePrincipal create(ServicePrincipal request) {
        return impl.create(request);
    }
    
	/**
     * Delete a service principal.
     * 
     * Delete a single service principal in the Databricks Workspace.
     */
    public void delete(DeleteServicePrincipalRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get service principal details.
     * 
     * Gets the details for a single service principal define in the Databricks
     * Workspace.
     */
    public ServicePrincipal get(GetServicePrincipalRequest request) {
        return impl.get(request);
    }
    
	/**
     * List service principals.
     * 
     * Gets the set of service principals associated with a Databricks
     * Workspace.
     */
    public ListServicePrincipalResponse list(ListServicePrincipalsRequest request) {
        return impl.list(request);
    }
    
	/**
     * Update service principal details.
     * 
     * Partially updates the details of a single service principal in the
     * Databricks Workspace.
     */
    public void patch(PartialUpdate request) {
        impl.patch(request);
    }
    
	/**
     * Replace service principal.
     * 
     * Updates the details of a single service principal.
     * 
     * This action replaces the existing service principal with the same name.
     */
    public void update(ServicePrincipal request) {
        impl.update(request);
    }
    
    public ServicePrincipalsService impl() {
        return impl;
    }
}