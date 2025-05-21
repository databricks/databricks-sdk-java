// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountNetworkPolicy {
  /** The associated account ID for this Network Policy object. */
  @JsonProperty("account_id")
  private String accountId;

  /** The network policies applying for egress traffic. */
  @JsonProperty("egress")
  private NetworkPolicyEgress egress;

  /** The unique identifier for the network policy. */
  @JsonProperty("network_policy_id")
  private String networkPolicyId;

  public AccountNetworkPolicy setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public AccountNetworkPolicy setEgress(NetworkPolicyEgress egress) {
    this.egress = egress;
    return this;
  }

  public NetworkPolicyEgress getEgress() {
    return egress;
  }

  public AccountNetworkPolicy setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountNetworkPolicy that = (AccountNetworkPolicy) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(egress, that.egress)
        && Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, egress, networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountNetworkPolicy.class)
        .add("accountId", accountId)
        .add("egress", egress)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }
}
