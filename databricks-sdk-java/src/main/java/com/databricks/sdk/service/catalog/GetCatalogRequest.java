// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get a catalog */
@Generated
@JsonSerialize(using = GetCatalogRequest.GetCatalogRequestSerializer.class)
@JsonDeserialize(using = GetCatalogRequest.GetCatalogRequestDeserializer.class)
public class GetCatalogRequest {
  /**
   * Whether to include catalogs in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /** The name of the catalog. */
  private String name;

  public GetCatalogRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetCatalogRequest setName(String name) {
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
    GetCatalogRequest that = (GetCatalogRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCatalogRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }

  GetCatalogRequestPb toPb() {
    GetCatalogRequestPb pb = new GetCatalogRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setName(name);

    return pb;
  }

  static GetCatalogRequest fromPb(GetCatalogRequestPb pb) {
    GetCatalogRequest model = new GetCatalogRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setName(pb.getName());

    return model;
  }

  public static class GetCatalogRequestSerializer extends JsonSerializer<GetCatalogRequest> {
    @Override
    public void serialize(GetCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCatalogRequestDeserializer extends JsonDeserializer<GetCatalogRequest> {
    @Override
    public GetCatalogRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCatalogRequestPb pb = mapper.readValue(p, GetCatalogRequestPb.class);
      return GetCatalogRequest.fromPb(pb);
    }
  }
}
