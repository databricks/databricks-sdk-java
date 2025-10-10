// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
 * when creating a new workspace if you use customer-managed VPCs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface NetworksService {
  /**
   * Creates a Databricks network configuration that represents an VPC and its resources. The VPC
   * will be used for new Databricks clusters. This requires a pre-existing VPC and subnets.
   */
  Network create(CreateNetworkRequest createNetworkRequest);

  /**
   * Deletes a Databricks network configuration, which represents a cloud VPC and its resources. You
   * cannot delete a network that is associated with a workspace.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  Network delete(DeleteNetworkRequest deleteNetworkRequest);

  /** Gets a Databricks network configuration, which represents a cloud VPC and its resources. */
  Network get(GetNetworkRequest getNetworkRequest);

  /** Lists Databricks network configurations for an account. */
  Collection<Network> list();
}
