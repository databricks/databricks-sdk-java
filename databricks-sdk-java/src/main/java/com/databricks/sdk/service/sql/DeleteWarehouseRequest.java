// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Delete a warehouse */
@Generated
@JsonSerialize(using = DeleteWarehouseRequest.DeleteWarehouseRequestSerializer.class)
@JsonDeserialize(using = DeleteWarehouseRequest.DeleteWarehouseRequestDeserializer.class)
public class DeleteWarehouseRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public DeleteWarehouseRequest setId(String id) {
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
    DeleteWarehouseRequest that = (DeleteWarehouseRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWarehouseRequest.class).add("id", id).toString();
  }

  DeleteWarehouseRequestPb toPb() {
    DeleteWarehouseRequestPb pb = new DeleteWarehouseRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteWarehouseRequest fromPb(DeleteWarehouseRequestPb pb) {
    DeleteWarehouseRequest model = new DeleteWarehouseRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteWarehouseRequestSerializer
      extends JsonSerializer<DeleteWarehouseRequest> {
    @Override
    public void serialize(
        DeleteWarehouseRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWarehouseRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWarehouseRequestDeserializer
      extends JsonDeserializer<DeleteWarehouseRequest> {
    @Override
    public DeleteWarehouseRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWarehouseRequestPb pb = mapper.readValue(p, DeleteWarehouseRequestPb.class);
      return DeleteWarehouseRequest.fromPb(pb);
    }
  }
}
