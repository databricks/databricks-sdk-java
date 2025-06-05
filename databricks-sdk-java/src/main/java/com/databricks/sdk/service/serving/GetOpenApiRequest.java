// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Get the schema for a serving endpoint */
@Generated
@JsonSerialize(using = GetOpenApiRequest.GetOpenApiRequestSerializer.class)
@JsonDeserialize(using = GetOpenApiRequest.GetOpenApiRequestDeserializer.class)
public class GetOpenApiRequest {
  /** The name of the serving endpoint that the served model belongs to. This field is required. */
  private String name;

  public GetOpenApiRequest setName(String name) {
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
    GetOpenApiRequest that = (GetOpenApiRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetOpenApiRequest.class).add("name", name).toString();
  }

  GetOpenApiRequestPb toPb() {
    GetOpenApiRequestPb pb = new GetOpenApiRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetOpenApiRequest fromPb(GetOpenApiRequestPb pb) {
    GetOpenApiRequest model = new GetOpenApiRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetOpenApiRequestSerializer extends JsonSerializer<GetOpenApiRequest> {
    @Override
    public void serialize(GetOpenApiRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetOpenApiRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetOpenApiRequestDeserializer extends JsonDeserializer<GetOpenApiRequest> {
    @Override
    public GetOpenApiRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetOpenApiRequestPb pb = mapper.readValue(p, GetOpenApiRequestPb.class);
      return GetOpenApiRequest.fromPb(pb);
    }
  }
}
