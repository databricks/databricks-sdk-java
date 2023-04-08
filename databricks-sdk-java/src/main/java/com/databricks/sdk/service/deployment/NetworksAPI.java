// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
 * when creating a new workspace if you use customer-managed VPCs.
 */
public class NetworksAPI {
  private final NetworksService impl;

  /** Regular-use constructor */
  public NetworksAPI(ApiClient apiClient) {
    impl = new NetworksImpl(apiClient);
  }

  /** Constructor for mocks */
  public NetworksAPI(NetworksService mock) {
    impl = mock;
  }

  public Network create(String networkName) {
    return create(new CreateNetworkRequest().setNetworkName(networkName));
  }

  /**
   * Create network configuration.
   *
   * <p>Creates a Databricks network configuration that represents an VPC and its resources. The VPC
   * will be used for new Databricks clusters. This requires a pre-existing VPC and subnets.
   */
  public Network create(CreateNetworkRequest request) {
    return impl.create(request);
  }

  public void delete(String networkId) {
    delete(new DeleteNetworkRequest().setNetworkId(networkId));
  }

  /**
   * Delete a network configuration.
   *
   * <p>Deletes a Databricks network configuration, which represents a cloud VPC and its resources.
   * You cannot delete a network that is associated with a workspace.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  public void delete(DeleteNetworkRequest request) {
    impl.delete(request);
  }

  public Network get(String networkId) {
    return get(new GetNetworkRequest().setNetworkId(networkId));
  }

  /**
   * Get a network configuration.
   *
   * <p>Gets a Databricks network configuration, which represents a cloud VPC and its resources.
   */
  public Network get(GetNetworkRequest request) {
    return impl.get(request);
  }

  /**
   * Get all network configurations.
   *
   * <p>Gets a list of all Databricks network configurations for an account, specified by ID.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  public List<Network> list() {
    return impl.list();
  }

  public NetworksService impl() {
    return impl;
  }
}
