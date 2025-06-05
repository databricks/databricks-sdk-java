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

/** Delete a network policy */
@Generated
@JsonSerialize(using = DeleteNetworkPolicyRequest.DeleteNetworkPolicyRequestSerializer.class)
@JsonDeserialize(using = DeleteNetworkPolicyRequest.DeleteNetworkPolicyRequestDeserializer.class)
public class DeleteNetworkPolicyRequest {
  /** The unique identifier of the network policy to delete. */
  private String networkPolicyId;

  public DeleteNetworkPolicyRequest setNetworkPolicyId(String networkPolicyId) {
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
    DeleteNetworkPolicyRequest that = (DeleteNetworkPolicyRequest) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkPolicyRequest.class)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }

  DeleteNetworkPolicyRequestPb toPb() {
    DeleteNetworkPolicyRequestPb pb = new DeleteNetworkPolicyRequestPb();
    pb.setNetworkPolicyId(networkPolicyId);

    return pb;
  }

  static DeleteNetworkPolicyRequest fromPb(DeleteNetworkPolicyRequestPb pb) {
    DeleteNetworkPolicyRequest model = new DeleteNetworkPolicyRequest();
    model.setNetworkPolicyId(pb.getNetworkPolicyId());

    return model;
  }

  public static class DeleteNetworkPolicyRequestSerializer
      extends JsonSerializer<DeleteNetworkPolicyRequest> {
    @Override
    public void serialize(
        DeleteNetworkPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteNetworkPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNetworkPolicyRequestDeserializer
      extends JsonDeserializer<DeleteNetworkPolicyRequest> {
    @Override
    public DeleteNetworkPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNetworkPolicyRequestPb pb = mapper.readValue(p, DeleteNetworkPolicyRequestPb.class);
      return DeleteNetworkPolicyRequest.fromPb(pb);
    }
  }
}
