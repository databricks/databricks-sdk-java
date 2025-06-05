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

/** Get a Database Catalog */
@Generated
@JsonSerialize(using = GetDatabaseCatalogRequest.GetDatabaseCatalogRequestSerializer.class)
@JsonDeserialize(using = GetDatabaseCatalogRequest.GetDatabaseCatalogRequestDeserializer.class)
public class GetDatabaseCatalogRequest {
  /** */
  private String name;

  public GetDatabaseCatalogRequest setName(String name) {
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
    GetDatabaseCatalogRequest that = (GetDatabaseCatalogRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseCatalogRequest.class).add("name", name).toString();
  }

  GetDatabaseCatalogRequestPb toPb() {
    GetDatabaseCatalogRequestPb pb = new GetDatabaseCatalogRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetDatabaseCatalogRequest fromPb(GetDatabaseCatalogRequestPb pb) {
    GetDatabaseCatalogRequest model = new GetDatabaseCatalogRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetDatabaseCatalogRequestSerializer
      extends JsonSerializer<GetDatabaseCatalogRequest> {
    @Override
    public void serialize(
        GetDatabaseCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDatabaseCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDatabaseCatalogRequestDeserializer
      extends JsonDeserializer<GetDatabaseCatalogRequest> {
    @Override
    public GetDatabaseCatalogRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDatabaseCatalogRequestPb pb = mapper.readValue(p, GetDatabaseCatalogRequestPb.class);
      return GetDatabaseCatalogRequest.fromPb(pb);
    }
  }
}
