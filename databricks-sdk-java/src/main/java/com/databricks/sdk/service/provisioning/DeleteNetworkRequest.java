// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Delete a network configuration */
@Generated
@JsonSerialize(using = DeleteNetworkRequest.DeleteNetworkRequestSerializer.class)
@JsonDeserialize(using = DeleteNetworkRequest.DeleteNetworkRequestDeserializer.class)
public class DeleteNetworkRequest {
  /** Databricks Account API network configuration ID. */
  private String networkId;

  public DeleteNetworkRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteNetworkRequest that = (DeleteNetworkRequest) o;
    return Objects.equals(networkId, that.networkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkRequest.class).add("networkId", networkId).toString();
  }

  DeleteNetworkRequestPb toPb() {
    DeleteNetworkRequestPb pb = new DeleteNetworkRequestPb();
    pb.setNetworkId(networkId);

    return pb;
  }

  static DeleteNetworkRequest fromPb(DeleteNetworkRequestPb pb) {
    DeleteNetworkRequest model = new DeleteNetworkRequest();
    model.setNetworkId(pb.getNetworkId());

    return model;
  }

  public static class DeleteNetworkRequestSerializer extends JsonSerializer<DeleteNetworkRequest> {
    @Override
    public void serialize(
        DeleteNetworkRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteNetworkRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNetworkRequestDeserializer
      extends JsonDeserializer<DeleteNetworkRequest> {
    @Override
    public DeleteNetworkRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNetworkRequestPb pb = mapper.readValue(p, DeleteNetworkRequestPb.class);
      return DeleteNetworkRequest.fromPb(pb);
    }
  }
}
