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

/** Get an external location */
@Generated
@JsonSerialize(using = GetExternalLocationRequest.GetExternalLocationRequestSerializer.class)
@JsonDeserialize(using = GetExternalLocationRequest.GetExternalLocationRequestDeserializer.class)
public class GetExternalLocationRequest {
  /**
   * Whether to include external locations in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  /** Name of the external location. */
  private String name;

  public GetExternalLocationRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetExternalLocationRequest setName(String name) {
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
    GetExternalLocationRequest that = (GetExternalLocationRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExternalLocationRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }

  GetExternalLocationRequestPb toPb() {
    GetExternalLocationRequestPb pb = new GetExternalLocationRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setName(name);

    return pb;
  }

  static GetExternalLocationRequest fromPb(GetExternalLocationRequestPb pb) {
    GetExternalLocationRequest model = new GetExternalLocationRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setName(pb.getName());

    return model;
  }

  public static class GetExternalLocationRequestSerializer
      extends JsonSerializer<GetExternalLocationRequest> {
    @Override
    public void serialize(
        GetExternalLocationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExternalLocationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExternalLocationRequestDeserializer
      extends JsonDeserializer<GetExternalLocationRequest> {
    @Override
    public GetExternalLocationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExternalLocationRequestPb pb = mapper.readValue(p, GetExternalLocationRequestPb.class);
      return GetExternalLocationRequest.fromPb(pb);
    }
  }
}
