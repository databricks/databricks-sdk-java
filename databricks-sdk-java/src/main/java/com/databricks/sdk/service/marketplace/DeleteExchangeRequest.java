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

/** Delete an exchange */
@Generated
@JsonSerialize(using = DeleteExchangeRequest.DeleteExchangeRequestSerializer.class)
@JsonDeserialize(using = DeleteExchangeRequest.DeleteExchangeRequestDeserializer.class)
public class DeleteExchangeRequest {
  /** */
  private String id;

  public DeleteExchangeRequest setId(String id) {
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
    DeleteExchangeRequest that = (DeleteExchangeRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExchangeRequest.class).add("id", id).toString();
  }

  DeleteExchangeRequestPb toPb() {
    DeleteExchangeRequestPb pb = new DeleteExchangeRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteExchangeRequest fromPb(DeleteExchangeRequestPb pb) {
    DeleteExchangeRequest model = new DeleteExchangeRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteExchangeRequestSerializer
      extends JsonSerializer<DeleteExchangeRequest> {
    @Override
    public void serialize(
        DeleteExchangeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExchangeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExchangeRequestDeserializer
      extends JsonDeserializer<DeleteExchangeRequest> {
    @Override
    public DeleteExchangeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExchangeRequestPb pb = mapper.readValue(p, DeleteExchangeRequestPb.class);
      return DeleteExchangeRequest.fromPb(pb);
    }
  }
}
