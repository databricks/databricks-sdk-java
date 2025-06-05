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
@JsonSerialize(
    using = DeleteNetworkPolicyRpcResponse.DeleteNetworkPolicyRpcResponseSerializer.class)
@JsonDeserialize(
    using = DeleteNetworkPolicyRpcResponse.DeleteNetworkPolicyRpcResponseDeserializer.class)
public class DeleteNetworkPolicyRpcResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkPolicyRpcResponse.class).toString();
  }

  DeleteNetworkPolicyRpcResponsePb toPb() {
    DeleteNetworkPolicyRpcResponsePb pb = new DeleteNetworkPolicyRpcResponsePb();

    return pb;
  }

  static DeleteNetworkPolicyRpcResponse fromPb(DeleteNetworkPolicyRpcResponsePb pb) {
    DeleteNetworkPolicyRpcResponse model = new DeleteNetworkPolicyRpcResponse();

    return model;
  }

  public static class DeleteNetworkPolicyRpcResponseSerializer
      extends JsonSerializer<DeleteNetworkPolicyRpcResponse> {
    @Override
    public void serialize(
        DeleteNetworkPolicyRpcResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteNetworkPolicyRpcResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNetworkPolicyRpcResponseDeserializer
      extends JsonDeserializer<DeleteNetworkPolicyRpcResponse> {
    @Override
    public DeleteNetworkPolicyRpcResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNetworkPolicyRpcResponsePb pb =
          mapper.readValue(p, DeleteNetworkPolicyRpcResponsePb.class);
      return DeleteNetworkPolicyRpcResponse.fromPb(pb);
    }
  }
}
