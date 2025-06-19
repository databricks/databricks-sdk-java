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

/** Delete a private endpoint rule */
@Generated
@JsonSerialize(
    using = DeletePrivateEndpointRuleRequest.DeletePrivateEndpointRuleRequestSerializer.class)
@JsonDeserialize(
    using = DeletePrivateEndpointRuleRequest.DeletePrivateEndpointRuleRequestDeserializer.class)
public class DeletePrivateEndpointRuleRequest {
  /** Your Network Connectvity Configuration ID. */
  private String networkConnectivityConfigId;

  /** Your private endpoint rule ID. */
  private String privateEndpointRuleId;

  public DeletePrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public DeletePrivateEndpointRuleRequest setPrivateEndpointRuleId(String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePrivateEndpointRuleRequest that = (DeletePrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRuleId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .toString();
  }

  DeletePrivateEndpointRuleRequestPb toPb() {
    DeletePrivateEndpointRuleRequestPb pb = new DeletePrivateEndpointRuleRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setPrivateEndpointRuleId(privateEndpointRuleId);

    return pb;
  }

  static DeletePrivateEndpointRuleRequest fromPb(DeletePrivateEndpointRuleRequestPb pb) {
    DeletePrivateEndpointRuleRequest model = new DeletePrivateEndpointRuleRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setPrivateEndpointRuleId(pb.getPrivateEndpointRuleId());

    return model;
  }

  public static class DeletePrivateEndpointRuleRequestSerializer
      extends JsonSerializer<DeletePrivateEndpointRuleRequest> {
    @Override
    public void serialize(
        DeletePrivateEndpointRuleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePrivateEndpointRuleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePrivateEndpointRuleRequestDeserializer
      extends JsonDeserializer<DeletePrivateEndpointRuleRequest> {
    @Override
    public DeletePrivateEndpointRuleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePrivateEndpointRuleRequestPb pb =
          mapper.readValue(p, DeletePrivateEndpointRuleRequestPb.class);
      return DeletePrivateEndpointRuleRequest.fromPb(pb);
    }
  }
}
