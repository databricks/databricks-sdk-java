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

/**
 * The network policies applying for egress traffic. This message is used by the UI/REST API. We
 * translate this message to the format expected by the dataplane in Lakehouse Network Manager (for
 * the format expected by the dataplane, see networkconfig.textproto). This policy should be
 * consistent with [[com.databricks.api.proto.settingspolicy.EgressNetworkPolicy]]. Details see
 * API-design: https://docs.google.com/document/d/1DKWO_FpZMCY4cF2O62LpwII1lx8gsnDGG-qgE3t3TOA/
 */
@Generated
@JsonSerialize(using = NetworkPolicyEgress.NetworkPolicyEgressSerializer.class)
@JsonDeserialize(using = NetworkPolicyEgress.NetworkPolicyEgressDeserializer.class)
public class NetworkPolicyEgress {
  /** The access policy enforced for egress traffic to the internet. */
  private EgressNetworkPolicyNetworkAccessPolicy networkAccess;

  public NetworkPolicyEgress setNetworkAccess(
      EgressNetworkPolicyNetworkAccessPolicy networkAccess) {
    this.networkAccess = networkAccess;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicy getNetworkAccess() {
    return networkAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkPolicyEgress that = (NetworkPolicyEgress) o;
    return Objects.equals(networkAccess, that.networkAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkPolicyEgress.class).add("networkAccess", networkAccess).toString();
  }

  NetworkPolicyEgressPb toPb() {
    NetworkPolicyEgressPb pb = new NetworkPolicyEgressPb();
    pb.setNetworkAccess(networkAccess);

    return pb;
  }

  static NetworkPolicyEgress fromPb(NetworkPolicyEgressPb pb) {
    NetworkPolicyEgress model = new NetworkPolicyEgress();
    model.setNetworkAccess(pb.getNetworkAccess());

    return model;
  }

  public static class NetworkPolicyEgressSerializer extends JsonSerializer<NetworkPolicyEgress> {
    @Override
    public void serialize(NetworkPolicyEgress value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NetworkPolicyEgressPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NetworkPolicyEgressDeserializer
      extends JsonDeserializer<NetworkPolicyEgress> {
    @Override
    public NetworkPolicyEgress deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NetworkPolicyEgressPb pb = mapper.readValue(p, NetworkPolicyEgressPb.class);
      return NetworkPolicyEgress.fromPb(pb);
    }
  }
}
