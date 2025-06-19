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
 * the format expected by the dataplane, see networkconfig.textproto).
 */
@Generated
@JsonSerialize(using = EgressNetworkPolicy.EgressNetworkPolicySerializer.class)
@JsonDeserialize(using = EgressNetworkPolicy.EgressNetworkPolicyDeserializer.class)
public class EgressNetworkPolicy {
  /** The access policy enforced for egress traffic to the internet. */
  private EgressNetworkPolicyInternetAccessPolicy internetAccess;

  public EgressNetworkPolicy setInternetAccess(
      EgressNetworkPolicyInternetAccessPolicy internetAccess) {
    this.internetAccess = internetAccess;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicy getInternetAccess() {
    return internetAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicy that = (EgressNetworkPolicy) o;
    return Objects.equals(internetAccess, that.internetAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internetAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicy.class)
        .add("internetAccess", internetAccess)
        .toString();
  }

  EgressNetworkPolicyPb toPb() {
    EgressNetworkPolicyPb pb = new EgressNetworkPolicyPb();
    pb.setInternetAccess(internetAccess);

    return pb;
  }

  static EgressNetworkPolicy fromPb(EgressNetworkPolicyPb pb) {
    EgressNetworkPolicy model = new EgressNetworkPolicy();
    model.setInternetAccess(pb.getInternetAccess());

    return model;
  }

  public static class EgressNetworkPolicySerializer extends JsonSerializer<EgressNetworkPolicy> {
    @Override
    public void serialize(EgressNetworkPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyDeserializer
      extends JsonDeserializer<EgressNetworkPolicy> {
    @Override
    public EgressNetworkPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyPb pb = mapper.readValue(p, EgressNetworkPolicyPb.class);
      return EgressNetworkPolicy.fromPb(pb);
    }
  }
}
