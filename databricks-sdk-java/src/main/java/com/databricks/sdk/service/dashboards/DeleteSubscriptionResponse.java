// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = DeleteSubscriptionResponse.DeleteSubscriptionResponseSerializer.class)
@JsonDeserialize(using = DeleteSubscriptionResponse.DeleteSubscriptionResponseDeserializer.class)
public class DeleteSubscriptionResponse {

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
    return new ToStringer(DeleteSubscriptionResponse.class).toString();
  }

  DeleteSubscriptionResponsePb toPb() {
    DeleteSubscriptionResponsePb pb = new DeleteSubscriptionResponsePb();

    return pb;
  }

  static DeleteSubscriptionResponse fromPb(DeleteSubscriptionResponsePb pb) {
    DeleteSubscriptionResponse model = new DeleteSubscriptionResponse();

    return model;
  }

  public static class DeleteSubscriptionResponseSerializer
      extends JsonSerializer<DeleteSubscriptionResponse> {
    @Override
    public void serialize(
        DeleteSubscriptionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSubscriptionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSubscriptionResponseDeserializer
      extends JsonDeserializer<DeleteSubscriptionResponse> {
    @Override
    public DeleteSubscriptionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSubscriptionResponsePb pb = mapper.readValue(p, DeleteSubscriptionResponsePb.class);
      return DeleteSubscriptionResponse.fromPb(pb);
    }
  }
}
