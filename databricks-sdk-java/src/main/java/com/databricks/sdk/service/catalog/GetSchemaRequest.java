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

/** Get a schema */
@Generated
@JsonSerialize(using = GetSchemaRequest.GetSchemaRequestSerializer.class)
@JsonDeserialize(using = GetSchemaRequest.GetSchemaRequestDeserializer.class)
public class GetSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  /**
   * Whether to include schemas in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  public GetSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetSchemaRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSchemaRequest that = (GetSchemaRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSchemaRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .toString();
  }

  GetSchemaRequestPb toPb() {
    GetSchemaRequestPb pb = new GetSchemaRequestPb();
    pb.setFullName(fullName);
    pb.setIncludeBrowse(includeBrowse);

    return pb;
  }

  static GetSchemaRequest fromPb(GetSchemaRequestPb pb) {
    GetSchemaRequest model = new GetSchemaRequest();
    model.setFullName(pb.getFullName());
    model.setIncludeBrowse(pb.getIncludeBrowse());

    return model;
  }

  public static class GetSchemaRequestSerializer extends JsonSerializer<GetSchemaRequest> {
    @Override
    public void serialize(GetSchemaRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSchemaRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSchemaRequestDeserializer extends JsonDeserializer<GetSchemaRequest> {
    @Override
    public GetSchemaRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSchemaRequestPb pb = mapper.readValue(p, GetSchemaRequestPb.class);
      return GetSchemaRequest.fromPb(pb);
    }
  }
}
