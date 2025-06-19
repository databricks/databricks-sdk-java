// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = AccountNetworkPolicy.AccountNetworkPolicySerializer.class)
@JsonDeserialize(using = AccountNetworkPolicy.AccountNetworkPolicyDeserializer.class)
public class AccountNetworkPolicy {
  /** The associated account ID for this Network Policy object. */
  private String accountId;

  /** The network policies applying for egress traffic. */
  private NetworkPolicyEgress egress;

  /** The unique identifier for the network policy. */
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

  AccountNetworkPolicyPb toPb() {
    AccountNetworkPolicyPb pb = new AccountNetworkPolicyPb();
    pb.setAccountId(accountId);
    pb.setEgress(egress);
    pb.setNetworkPolicyId(networkPolicyId);

    return pb;
  }

  static AccountNetworkPolicy fromPb(AccountNetworkPolicyPb pb) {
    AccountNetworkPolicy model = new AccountNetworkPolicy();
    model.setAccountId(pb.getAccountId());
    model.setEgress(pb.getEgress());
    model.setNetworkPolicyId(pb.getNetworkPolicyId());

    return model;
  }

  public static class AccountNetworkPolicySerializer extends JsonSerializer<AccountNetworkPolicy> {
    @Override
    public void serialize(
        AccountNetworkPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountNetworkPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountNetworkPolicyDeserializer
      extends JsonDeserializer<AccountNetworkPolicy> {
    @Override
    public AccountNetworkPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountNetworkPolicyPb pb = mapper.readValue(p, AccountNetworkPolicyPb.class);
      return AccountNetworkPolicy.fromPb(pb);
    }
  }
}
