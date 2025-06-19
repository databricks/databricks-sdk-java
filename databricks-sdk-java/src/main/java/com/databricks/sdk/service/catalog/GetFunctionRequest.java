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

/** Get a function */
@Generated
@JsonSerialize(using = GetFunctionRequest.GetFunctionRequestSerializer.class)
@JsonDeserialize(using = GetFunctionRequest.GetFunctionRequestDeserializer.class)
public class GetFunctionRequest {
  /**
   * Whether to include functions in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  private String name;

  public GetFunctionRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetFunctionRequest setName(String name) {
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
    GetFunctionRequest that = (GetFunctionRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFunctionRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }

  GetFunctionRequestPb toPb() {
    GetFunctionRequestPb pb = new GetFunctionRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setName(name);

    return pb;
  }

  static GetFunctionRequest fromPb(GetFunctionRequestPb pb) {
    GetFunctionRequest model = new GetFunctionRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setName(pb.getName());

    return model;
  }

  public static class GetFunctionRequestSerializer extends JsonSerializer<GetFunctionRequest> {
    @Override
    public void serialize(GetFunctionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetFunctionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetFunctionRequestDeserializer extends JsonDeserializer<GetFunctionRequest> {
    @Override
    public GetFunctionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetFunctionRequestPb pb = mapper.readValue(p, GetFunctionRequestPb.class);
      return GetFunctionRequest.fromPb(pb);
    }
  }
}
