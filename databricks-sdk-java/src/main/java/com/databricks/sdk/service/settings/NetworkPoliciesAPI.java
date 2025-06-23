// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage network policies for this account. Network policies control which network
 * destinations can be accessed from the Databricks environment. Each Databricks account includes a
 * default policy named 'default-policy'. 'default-policy' is associated with any workspace lacking
 * an explicit network policy assignment, and is automatically associated with each newly created
 * workspace. 'default-policy' is reserved and cannot be deleted, but it can be updated to customize
 * the default network access rules for your account.
 */
@Generated
public class NetworkPoliciesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(NetworkPoliciesAPI.class);

  private final NetworkPoliciesService impl;

  /** Regular-use constructor */
  public NetworkPoliciesAPI(ApiClient apiClient) {
    impl = new NetworkPoliciesImpl(apiClient);
  }

  /** Constructor for mocks */
  public NetworkPoliciesAPI(NetworkPoliciesService mock) {
    impl = mock;
  }

  public AccountNetworkPolicy createNetworkPolicyRpc(AccountNetworkPolicy networkPolicy) {
    return createNetworkPolicyRpc(new CreateNetworkPolicyRequest().setNetworkPolicy(networkPolicy));
  }

  /**
   * Creates a new network policy to manage which network destinations can be accessed from the
   * Databricks environment.
   */
  public AccountNetworkPolicy createNetworkPolicyRpc(CreateNetworkPolicyRequest request) {
    return impl.createNetworkPolicyRpc(request);
  }

  public void deleteNetworkPolicyRpc(String networkPolicyId) {
    deleteNetworkPolicyRpc(new DeleteNetworkPolicyRequest().setNetworkPolicyId(networkPolicyId));
  }

  /** Deletes a network policy. Cannot be called on 'default-policy'. */
  public void deleteNetworkPolicyRpc(DeleteNetworkPolicyRequest request) {
    impl.deleteNetworkPolicyRpc(request);
  }

  public AccountNetworkPolicy getNetworkPolicyRpc(String networkPolicyId) {
    return getNetworkPolicyRpc(new GetNetworkPolicyRequest().setNetworkPolicyId(networkPolicyId));
  }

  /** Gets a network policy. */
  public AccountNetworkPolicy getNetworkPolicyRpc(GetNetworkPolicyRequest request) {
    return impl.getNetworkPolicyRpc(request);
  }

  /** Gets an array of network policies. */
  public Iterable<AccountNetworkPolicy> listNetworkPoliciesRpc(ListNetworkPoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::listNetworkPoliciesRpc,
        ListNetworkPoliciesResponse::getItems,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public AccountNetworkPolicy updateNetworkPolicyRpc(
      String networkPolicyId, AccountNetworkPolicy networkPolicy) {
    return updateNetworkPolicyRpc(
        new UpdateNetworkPolicyRequest()
            .setNetworkPolicyId(networkPolicyId)
            .setNetworkPolicy(networkPolicy));
  }

  /** Updates a network policy. This allows you to modify the configuration of a network policy. */
  public AccountNetworkPolicy updateNetworkPolicyRpc(UpdateNetworkPolicyRequest request) {
    return impl.updateNetworkPolicyRpc(request);
  }

  public NetworkPoliciesService impl() {
    return impl;
  }
}
