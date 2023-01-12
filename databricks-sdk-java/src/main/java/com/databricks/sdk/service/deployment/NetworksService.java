// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * These APIs manage network configurations for customer-managed VPCs
 * (optional). A network configuration encapsulates the IDs for AWS VPCs,
 * subnets, and security groups. Its ID is used when creating a new workspace if
 * you use customer-managed VPCs.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface NetworksService {
	/**
     * Create network configuration.
     * 
     * Creates a Databricks network configuration that represents an AWS VPC and
     * its resources. The VPC will be used for new Databricks clusters. This
     * requires a pre-existing VPC and subnets. For VPC requirements, see
     * [Customer-managed VPC].
     * 
     * **Important**: You can share one customer-managed VPC with multiple
     * workspaces in a single account. Therefore, you can share one VPC across
     * multiple Account API network configurations. However, you **cannot**
     * reuse subnets or Security Groups between workspaces. Because a Databricks
     * Account API network configuration encapsulates this information, you
     * cannot reuse a Databricks Account API network configuration across
     * workspaces. If you plan to share one VPC with multiple workspaces, make
     * sure you size your VPC and subnets accordingly. For information about how
     * to create a new workspace with this API, see [Create a new workspace
     * using the Account API].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     * 
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     * [Customer-managed VPC]: http://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html
     */
    Network create(CreateNetworkRequest createNetworkRequest);
    
	/**
     * Delete network configuration.
     * 
     * Deletes a Databricks network configuration, which represents an AWS VPC
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
     * Gets a Databricks network configuration, which represents an AWS VPC and
     * its resources. This requires a pre-existing VPC and subnets. For VPC
     * requirements, see [Customer-managed VPC].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     * 
     * [Customer-managed VPC]: http://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html
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