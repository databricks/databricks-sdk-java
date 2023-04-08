// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import java.util.List;
import java.util.Map;

/**
 * These APIs enable administrators to manage custom oauth app integrations,
 * which is required for adding/using Custom OAuth App Integration like Tableau
 * Cloud for Databricks in AWS cloud.
 * 
 * **Note:** You can only add/use the OAuth custom application integrations when
 * OAuth enrollment status is enabled. For more details see
 * :method:OAuthEnrollment/create
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface CustomAppIntegrationService {
	/**
     * Create Custom OAuth App Integration.
     * 
     * Create Custom OAuth App Integration.
     * 
     * You can retrieve the custom oauth app integration via :method:get.
     */
    CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration createCustomAppIntegration);
    
	/**
     * Delete Custom OAuth App Integration.
     * 
     * Delete an existing Custom OAuth App Integration. You can retrieve the
     * custom oauth app integration via :method:get.
     */
    void delete(DeleteCustomAppIntegrationRequest deleteCustomAppIntegrationRequest);
    
	/**
     * Get OAuth Custom App Integration.
     * 
     * Gets the Custom OAuth App Integration for the given integration id.
     */
    GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest getCustomAppIntegrationRequest);
    
	/**
     * Get custom oauth app integrations.
     * 
     * Get the list of custom oauth app integrations for the specified
     * Databricks Account
     */
    GetCustomAppIntegrationsOutput list();
    
	/**
     * Updates Custom OAuth App Integration.
     * 
     * Updates an existing custom OAuth App Integration. You can retrieve the
     * custom oauth app integration via :method:get.
     */
    void update(UpdateCustomAppIntegration updateCustomAppIntegration);
    
}