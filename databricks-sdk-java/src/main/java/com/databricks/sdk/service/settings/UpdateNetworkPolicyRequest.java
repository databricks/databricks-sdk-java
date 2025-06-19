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

/** Update a network policy */
@Generated
@JsonSerialize(using = UpdateNetworkPolicyRequest.UpdateNetworkPolicyRequestSerializer.class)
@JsonDeserialize(using = UpdateNetworkPolicyRequest.UpdateNetworkPolicyRequestDeserializer.class)
public class UpdateNetworkPolicyRequest {
  /** */
  private AccountNetworkPolicy networkPolicy;

  /** The unique identifier for the network policy. */
  private String networkPolicyId;

  public UpdateNetworkPolicyRequest setNetworkPolicy(AccountNetworkPolicy networkPolicy) {
    this.networkPolicy = networkPolicy;
    return this;
  }

  public AccountNetworkPolicy getNetworkPolicy() {
    return networkPolicy;
  }

  public UpdateNetworkPolicyRequest setNetworkPolicyId(String networkPolicyId) {
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
    UpdateNetworkPolicyRequest that = (UpdateNetworkPolicyRequest) o;
    return Objects.equals(networkPolicy, that.networkPolicy)
        && Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicy, networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNetworkPolicyRequest.class)
        .add("networkPolicy", networkPolicy)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }

  UpdateNetworkPolicyRequestPb toPb() {
    UpdateNetworkPolicyRequestPb pb = new UpdateNetworkPolicyRequestPb();
    pb.setNetworkPolicy(networkPolicy);
    pb.setNetworkPolicyId(networkPolicyId);

    return pb;
  }

  static UpdateNetworkPolicyRequest fromPb(UpdateNetworkPolicyRequestPb pb) {
    UpdateNetworkPolicyRequest model = new UpdateNetworkPolicyRequest();
    model.setNetworkPolicy(pb.getNetworkPolicy());
    model.setNetworkPolicyId(pb.getNetworkPolicyId());

    return model;
  }

  public static class UpdateNetworkPolicyRequestSerializer
      extends JsonSerializer<UpdateNetworkPolicyRequest> {
    @Override
    public void serialize(
        UpdateNetworkPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateNetworkPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateNetworkPolicyRequestDeserializer
      extends JsonDeserializer<UpdateNetworkPolicyRequest> {
    @Override
    public UpdateNetworkPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateNetworkPolicyRequestPb pb = mapper.readValue(p, UpdateNetworkPolicyRequestPb.class);
      return UpdateNetworkPolicyRequest.fromPb(pb);
    }
  }
}
