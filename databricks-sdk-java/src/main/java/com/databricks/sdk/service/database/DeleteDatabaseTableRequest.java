// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Delete a Database Table */
@Generated
@JsonSerialize(using = DeleteDatabaseTableRequest.DeleteDatabaseTableRequestSerializer.class)
@JsonDeserialize(using = DeleteDatabaseTableRequest.DeleteDatabaseTableRequestDeserializer.class)
public class DeleteDatabaseTableRequest {
  /** */
  private String name;

  public DeleteDatabaseTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDatabaseTableRequest that = (DeleteDatabaseTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDatabaseTableRequest.class).add("name", name).toString();
  }

  DeleteDatabaseTableRequestPb toPb() {
    DeleteDatabaseTableRequestPb pb = new DeleteDatabaseTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteDatabaseTableRequest fromPb(DeleteDatabaseTableRequestPb pb) {
    DeleteDatabaseTableRequest model = new DeleteDatabaseTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteDatabaseTableRequestSerializer
      extends JsonSerializer<DeleteDatabaseTableRequest> {
    @Override
    public void serialize(
        DeleteDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDatabaseTableRequestDeserializer
      extends JsonDeserializer<DeleteDatabaseTableRequest> {
    @Override
    public DeleteDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDatabaseTableRequestPb pb = mapper.readValue(p, DeleteDatabaseTableRequestPb.class);
      return DeleteDatabaseTableRequest.fromPb(pb);
    }
  }
}
