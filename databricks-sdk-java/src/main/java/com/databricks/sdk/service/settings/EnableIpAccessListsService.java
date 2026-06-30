// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls the enforcement of IP access lists for accessing the account console. Allowing you to
 * enable or disable restricted access based on IP addresses.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EnableIpAccessListsService {
  /** Reverts the value of the account IP access toggle setting to default (ON) */
  DeleteAccountIpAccessEnableResponse delete(
      DeleteAccountIpAccessEnableRequest deleteAccountIpAccessEnableRequest);

  /** Gets the value of the account IP access toggle setting. */
  AccountIpAccessEnable get(GetAccountIpAccessEnableRequest getAccountIpAccessEnableRequest);

  /** Updates the value of the account IP access toggle setting. */
  AccountIpAccessEnable update(
      UpdateAccountIpAccessEnableRequest updateAccountIpAccessEnableRequest);
}
