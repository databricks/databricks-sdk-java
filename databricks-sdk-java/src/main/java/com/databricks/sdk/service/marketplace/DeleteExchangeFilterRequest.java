// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Delete an exchange filter */
@Generated
@JsonSerialize(using = DeleteExchangeFilterRequest.DeleteExchangeFilterRequestSerializer.class)
@JsonDeserialize(using = DeleteExchangeFilterRequest.DeleteExchangeFilterRequestDeserializer.class)
public class DeleteExchangeFilterRequest {
  /** */
  private String id;

  public DeleteExchangeFilterRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteExchangeFilterRequest that = (DeleteExchangeFilterRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExchangeFilterRequest.class).add("id", id).toString();
  }

  DeleteExchangeFilterRequestPb toPb() {
    DeleteExchangeFilterRequestPb pb = new DeleteExchangeFilterRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteExchangeFilterRequest fromPb(DeleteExchangeFilterRequestPb pb) {
    DeleteExchangeFilterRequest model = new DeleteExchangeFilterRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteExchangeFilterRequestSerializer
      extends JsonSerializer<DeleteExchangeFilterRequest> {
    @Override
    public void serialize(
        DeleteExchangeFilterRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExchangeFilterRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExchangeFilterRequestDeserializer
      extends JsonDeserializer<DeleteExchangeFilterRequest> {
    @Override
    public DeleteExchangeFilterRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExchangeFilterRequestPb pb = mapper.readValue(p, DeleteExchangeFilterRequestPb.class);
      return DeleteExchangeFilterRequest.fromPb(pb);
    }
  }
}
