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

/** Delete a Database Catalog */
@Generated
@JsonSerialize(using = DeleteDatabaseCatalogRequest.DeleteDatabaseCatalogRequestSerializer.class)
@JsonDeserialize(
    using = DeleteDatabaseCatalogRequest.DeleteDatabaseCatalogRequestDeserializer.class)
public class DeleteDatabaseCatalogRequest {
  /** */
  private String name;

  public DeleteDatabaseCatalogRequest setName(String name) {
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
    DeleteDatabaseCatalogRequest that = (DeleteDatabaseCatalogRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDatabaseCatalogRequest.class).add("name", name).toString();
  }

  DeleteDatabaseCatalogRequestPb toPb() {
    DeleteDatabaseCatalogRequestPb pb = new DeleteDatabaseCatalogRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteDatabaseCatalogRequest fromPb(DeleteDatabaseCatalogRequestPb pb) {
    DeleteDatabaseCatalogRequest model = new DeleteDatabaseCatalogRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteDatabaseCatalogRequestSerializer
      extends JsonSerializer<DeleteDatabaseCatalogRequest> {
    @Override
    public void serialize(
        DeleteDatabaseCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDatabaseCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDatabaseCatalogRequestDeserializer
      extends JsonDeserializer<DeleteDatabaseCatalogRequest> {
    @Override
    public DeleteDatabaseCatalogRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDatabaseCatalogRequestPb pb = mapper.readValue(p, DeleteDatabaseCatalogRequestPb.class);
      return DeleteDatabaseCatalogRequest.fromPb(pb);
    }
  }
}
