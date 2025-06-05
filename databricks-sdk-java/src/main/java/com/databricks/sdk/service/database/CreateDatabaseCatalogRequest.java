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

/** Create a Database Catalog */
@Generated
@JsonSerialize(using = CreateDatabaseCatalogRequest.CreateDatabaseCatalogRequestSerializer.class)
@JsonDeserialize(
    using = CreateDatabaseCatalogRequest.CreateDatabaseCatalogRequestDeserializer.class)
public class CreateDatabaseCatalogRequest {
  /** */
  private DatabaseCatalog catalog;

  public CreateDatabaseCatalogRequest setCatalog(DatabaseCatalog catalog) {
    this.catalog = catalog;
    return this;
  }

  public DatabaseCatalog getCatalog() {
    return catalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseCatalogRequest that = (CreateDatabaseCatalogRequest) o;
    return Objects.equals(catalog, that.catalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseCatalogRequest.class).add("catalog", catalog).toString();
  }

  CreateDatabaseCatalogRequestPb toPb() {
    CreateDatabaseCatalogRequestPb pb = new CreateDatabaseCatalogRequestPb();
    pb.setCatalog(catalog);

    return pb;
  }

  static CreateDatabaseCatalogRequest fromPb(CreateDatabaseCatalogRequestPb pb) {
    CreateDatabaseCatalogRequest model = new CreateDatabaseCatalogRequest();
    model.setCatalog(pb.getCatalog());

    return model;
  }

  public static class CreateDatabaseCatalogRequestSerializer
      extends JsonSerializer<CreateDatabaseCatalogRequest> {
    @Override
    public void serialize(
        CreateDatabaseCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDatabaseCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDatabaseCatalogRequestDeserializer
      extends JsonDeserializer<CreateDatabaseCatalogRequest> {
    @Override
    public CreateDatabaseCatalogRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDatabaseCatalogRequestPb pb = mapper.readValue(p, CreateDatabaseCatalogRequestPb.class);
      return CreateDatabaseCatalogRequest.fromPb(pb);
    }
  }
}
