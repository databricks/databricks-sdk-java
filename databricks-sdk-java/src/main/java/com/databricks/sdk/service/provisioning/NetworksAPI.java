// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
 * when creating a new workspace if you use customer-managed VPCs.
 */
@Generated
public class NetworksAPI {
  private static final Logger LOG = LoggerFactory.getLogger(NetworksAPI.class);

  private final NetworksService impl;

  /** Regular-use constructor */
  public NetworksAPI(ApiClient apiClient) {
    impl = new NetworksImpl(apiClient);
  }

  /** Constructor for mocks */
  public NetworksAPI(NetworksService mock) {
    impl = mock;
  }

  /**
   * Creates a Databricks network configuration that represents an VPC and its resources. The VPC
   * will be used for new Databricks clusters. This requires a pre-existing VPC and subnets.
   */
  public Network create(CreateNetworkRequest request) {
    return impl.create(request);
  }

  public void delete(String networkId) {
    delete(new DeleteNetworkRequest().setNetworkId(networkId));
  }

  /**
   * Deletes a Databricks network configuration, which represents a cloud VPC and its resources. You
   * cannot delete a network that is associated with a workspace.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  public void delete(DeleteNetworkRequest request) {
    impl.delete(request);
  }

  public Network get(String networkId) {
    return get(new GetNetworkRequest().setNetworkId(networkId));
  }

  /** Gets a Databricks network configuration, which represents a cloud VPC and its resources. */
  public Network get(GetNetworkRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of all Databricks network configurations for an account, specified by ID.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  public Iterable<Network> list() {
    return impl.list();
  }

  public NetworksService impl() {
    return impl;
  }
}
