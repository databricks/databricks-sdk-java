// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create a network policy */
@Generated
public class CreateNetworkPolicyRequest {
  /** */
  @JsonProperty("network_policy")
  private AccountNetworkPolicy networkPolicy;

  public CreateNetworkPolicyRequest setNetworkPolicy(AccountNetworkPolicy networkPolicy) {
    this.networkPolicy = networkPolicy;
    return this;
  }

  public AccountNetworkPolicy getNetworkPolicy() {
    return networkPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkPolicyRequest that = (CreateNetworkPolicyRequest) o;
    return Objects.equals(networkPolicy, that.networkPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkPolicyRequest.class)
        .add("networkPolicy", networkPolicy)
        .toString();
  }
}
