// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.util.List;
import java.util.Map;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts,
 * apps, and CI/CD platforms. Databricks recommends creating service principals
 * to run production jobs or modify production data. If all processes that act
 * on production data run with service principals, interactive users do not need
 * any write, delete, or modify privileges in production. This eliminates the
 * risk of a user overwriting production data by accident.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface ServicePrincipalsService {
	/**
     * Create a service principal.
     * 
     * Creates a new service principal in the Databricks Workspace.
     */
    ServicePrincipal create(ServicePrincipal servicePrincipal);
    
	/**
     * Delete a service principal.
     * 
     * Delete a single service principal in the Databricks Workspace.
     */
    void delete(DeleteServicePrincipalRequest deleteServicePrincipalRequest);
    
	/**
     * Get service principal details.
     * 
     * Gets the details for a single service principal define in the Databricks
     * Workspace.
     */
    ServicePrincipal get(GetServicePrincipalRequest getServicePrincipalRequest);
    
	/**
     * List service principals.
     * 
     * Gets the set of service principals associated with a Databricks
     * Workspace.
     */
    ListServicePrincipalResponse list(ListServicePrincipalsRequest listServicePrincipalsRequest);
    
	/**
     * Update service principal details.
     * 
     * Partially updates the details of a single service principal in the
     * Databricks Workspace.
     */
    void patch(PartialUpdate partialUpdate);
    
	/**
     * Replace service principal.
     * 
     * Updates the details of a single service principal.
     * 
     * This action replaces the existing service principal with the same name.
     */
    void update(ServicePrincipal servicePrincipal);
    
}