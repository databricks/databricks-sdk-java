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

/** Delete provider */
@Generated
@JsonSerialize(using = DeleteProviderRequest.DeleteProviderRequestSerializer.class)
@JsonDeserialize(using = DeleteProviderRequest.DeleteProviderRequestDeserializer.class)
public class DeleteProviderRequest {
  /** */
  private String id;

  public DeleteProviderRequest setId(String id) {
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
    DeleteProviderRequest that = (DeleteProviderRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteProviderRequest.class).add("id", id).toString();
  }

  DeleteProviderRequestPb toPb() {
    DeleteProviderRequestPb pb = new DeleteProviderRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteProviderRequest fromPb(DeleteProviderRequestPb pb) {
    DeleteProviderRequest model = new DeleteProviderRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteProviderRequestSerializer
      extends JsonSerializer<DeleteProviderRequest> {
    @Override
    public void serialize(
        DeleteProviderRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteProviderRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteProviderRequestDeserializer
      extends JsonDeserializer<DeleteProviderRequest> {
    @Override
    public DeleteProviderRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteProviderRequestPb pb = mapper.readValue(p, DeleteProviderRequestPb.class);
      return DeleteProviderRequest.fromPb(pb);
    }
  }
}
