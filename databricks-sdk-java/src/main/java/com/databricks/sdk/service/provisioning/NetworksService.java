// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import java.util.Collection;

/**
 * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
 * when creating a new workspace if you use customer-managed VPCs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface NetworksService {
  /**
   * Create network configuration.
   *
   * <p>Creates a Databricks network configuration that represents an VPC and its resources. The VPC
   * will be used for new Databricks clusters. This requires a pre-existing VPC and subnets.
   *
   * @param createNetworkRequest a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  Network create(CreateNetworkRequest createNetworkRequest);

  /**
   * Delete a network configuration.
   *
   * <p>Deletes a Databricks network configuration, which represents a cloud VPC and its resources.
   * You cannot delete a network that is associated with a workspace.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   *
   * @param deleteNetworkRequest a {@link com.databricks.sdk.service.provisioning.DeleteNetworkRequest} object
   */
  void delete(DeleteNetworkRequest deleteNetworkRequest);

  /**
   * Get a network configuration.
   *
   * <p>Gets a Databricks network configuration, which represents a cloud VPC and its resources.
   *
   * @param getNetworkRequest a {@link com.databricks.sdk.service.provisioning.GetNetworkRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  Network get(GetNetworkRequest getNetworkRequest);

  /**
   * Get all network configurations.
   *
   * <p>Gets a list of all Databricks network configurations for an account, specified by ID.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<Network> list();
}
