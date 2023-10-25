// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountNetworkPolicyMessage {
  /**
   * Whether or not serverless UDF can access the internet. When false, access to the internet will
   * be blocked from serverless clusters. Trusted traffic required by clusters for basic
   * functionality will not be affected.
   */
  @JsonProperty("serverless_internet_access_enabled")
  private Boolean serverlessInternetAccessEnabled;

  public AccountNetworkPolicyMessage setServerlessInternetAccessEnabled(
      Boolean serverlessInternetAccessEnabled) {
    this.serverlessInternetAccessEnabled = serverlessInternetAccessEnabled;
    return this;
  }

  public Boolean getServerlessInternetAccessEnabled() {
    return serverlessInternetAccessEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountNetworkPolicyMessage that = (AccountNetworkPolicyMessage) o;
    return Objects.equals(serverlessInternetAccessEnabled, that.serverlessInternetAccessEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverlessInternetAccessEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountNetworkPolicyMessage.class)
        .add("serverlessInternetAccessEnabled", serverlessInternetAccessEnabled)
        .toString();
  }
}
