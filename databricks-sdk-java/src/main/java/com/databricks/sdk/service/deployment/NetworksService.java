// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.util.List;
import java.util.Map;

/**
 * These APIs manage network configurations for customer-managed VPCs
 * (optional). Its ID is used when creating a new workspace if you use
 * customer-managed VPCs.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface NetworksService {
	/**
     * Create network configuration.
     * 
     * Creates a Databricks network configuration that represents an VPC and its
     * resources. The VPC will be used for new Databricks clusters. This
     * requires a pre-existing VPC and subnets.
     */
    Network create(CreateNetworkRequest createNetworkRequest);
    
	/**
     * Delete a network configuration.
     * 
     * Deletes a Databricks network configuration, which represents a cloud VPC
     * and its resources. You cannot delete a network that is associated with a
     * workspace.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     */
    void delete(DeleteNetworkRequest deleteNetworkRequest);
    
	/**
     * Get a network configuration.
     * 
     * Gets a Databricks network configuration, which represents a cloud VPC and
     * its resources.
     */
    Network get(GetNetworkRequest getNetworkRequest);
    
	/**
     * Get all network configurations.
     * 
     * Gets a list of all Databricks network configurations for an account,
     * specified by ID.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     */
    List<Network> list();
    
}