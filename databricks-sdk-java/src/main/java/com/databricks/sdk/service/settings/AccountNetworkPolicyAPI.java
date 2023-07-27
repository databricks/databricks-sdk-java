// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Network policy is a set of rules that defines what can be accessed from your Databricks network.
 * E.g.: You can choose to block your SQL UDF to access internet from your Databricks serverless
 * clusters.
 *
 * <p>There is only one instance of this setting per account. Since this setting has a default
 * value, this setting is present on all accounts even though it's never set on a given account.
 * Deletion reverts the value of the setting back to the default value.
 */
@Generated
public class AccountNetworkPolicyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountNetworkPolicyAPI.class);

  private final AccountNetworkPolicyService impl;

  /** Regular-use constructor */
  public AccountNetworkPolicyAPI(ApiClient apiClient) {
    impl = new AccountNetworkPolicyImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountNetworkPolicyAPI(AccountNetworkPolicyService mock) {
    impl = mock;
  }

  public DeleteAccountNetworkPolicyResponse deleteAccountNetworkPolicy(String etag) {
    return deleteAccountNetworkPolicy(new DeleteAccountNetworkPolicyRequest().setEtag(etag));
  }

  /**
   * Delete Account Network Policy.
   *
   * <p>Reverts back all the account network policies back to default.
   */
  public DeleteAccountNetworkPolicyResponse deleteAccountNetworkPolicy(
      DeleteAccountNetworkPolicyRequest request) {
    return impl.deleteAccountNetworkPolicy(request);
  }

  public AccountNetworkPolicyMessage readAccountNetworkPolicy(String etag) {
    return readAccountNetworkPolicy(new ReadAccountNetworkPolicyRequest().setEtag(etag));
  }

  /**
   * Get Account Network Policy.
   *
   * <p>Gets the value of Account level Network Policy.
   */
  public AccountNetworkPolicyMessage readAccountNetworkPolicy(
      ReadAccountNetworkPolicyRequest request) {
    return impl.readAccountNetworkPolicy(request);
  }

  /**
   * Update Account Network Policy.
   *
   * <p>Updates the policy content of Account level Network Policy.
   */
  public AccountNetworkPolicyMessage updateAccountNetworkPolicy(
      UpdateAccountNetworkPolicyRequest request) {
    return impl.updateAccountNetworkPolicy(request);
  }

  public AccountNetworkPolicyService impl() {
    return impl;
  }
}
