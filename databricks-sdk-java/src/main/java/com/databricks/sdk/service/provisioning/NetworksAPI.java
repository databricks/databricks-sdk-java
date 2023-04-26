// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
 * when creating a new workspace if you use customer-managed VPCs.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NetworksAPI {
  private static final Logger LOG = LoggerFactory.getLogger(NetworksAPI.class);

  private final NetworksService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public NetworksAPI(ApiClient apiClient) {
    impl = new NetworksImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.provisioning.NetworksService} object
   */
  public NetworksAPI(NetworksService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param networkName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network create(String networkName) {
    return create(new CreateNetworkRequest().setNetworkName(networkName));
  }

  /**
   * Create network configuration.
   *
   * <p>Creates a Databricks network configuration that represents an VPC and its resources. The VPC
   * will be used for new Databricks clusters. This requires a pre-existing VPC and subnets.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network create(CreateNetworkRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param networkId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.DeleteNetworkRequest} object
   */
  public void delete(DeleteNetworkRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param networkId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network get(String networkId) {
    return get(new GetNetworkRequest().setNetworkId(networkId));
  }

  /**
   * Get a network configuration.
   *
   * <p>Gets a Databricks network configuration, which represents a cloud VPC and its resources.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.GetNetworkRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
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
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Network> list() {
    return impl.list();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.NetworksService} object
   */
  public NetworksService impl() {
    return impl;
  }
}
