// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls the enforcement of IP access lists for accessing the account console. Allowing you to
 * enable or disable restricted access based on IP addresses.
 */
@Generated
public class EnableIpAccessListsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnableIpAccessListsAPI.class);

  private final EnableIpAccessListsService impl;

  /** Regular-use constructor */
  public EnableIpAccessListsAPI(ApiClient apiClient) {
    impl = new EnableIpAccessListsImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnableIpAccessListsAPI(EnableIpAccessListsService mock) {
    impl = mock;
  }

  /** Reverts the value of the account IP access toggle setting to default (ON) */
  public DeleteAccountIpAccessEnableResponse delete(DeleteAccountIpAccessEnableRequest request) {
    return impl.delete(request);
  }

  /** Gets the value of the account IP access toggle setting. */
  public AccountIpAccessEnable get(GetAccountIpAccessEnableRequest request) {
    return impl.get(request);
  }

  /** Updates the value of the account IP access toggle setting. */
  public AccountIpAccessEnable update(UpdateAccountIpAccessEnableRequest request) {
    return impl.update(request);
  }

  public EnableIpAccessListsService impl() {
    return impl;
  }
}
