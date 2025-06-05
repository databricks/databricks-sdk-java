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

/** Get a connection */
@Generated
@JsonSerialize(using = GetConnectionRequest.GetConnectionRequestSerializer.class)
@JsonDeserialize(using = GetConnectionRequest.GetConnectionRequestDeserializer.class)
public class GetConnectionRequest {
  /** Name of the connection. */
  private String name;

  public GetConnectionRequest setName(String name) {
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
    GetConnectionRequest that = (GetConnectionRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetConnectionRequest.class).add("name", name).toString();
  }

  GetConnectionRequestPb toPb() {
    GetConnectionRequestPb pb = new GetConnectionRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetConnectionRequest fromPb(GetConnectionRequestPb pb) {
    GetConnectionRequest model = new GetConnectionRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetConnectionRequestSerializer extends JsonSerializer<GetConnectionRequest> {
    @Override
    public void serialize(
        GetConnectionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetConnectionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetConnectionRequestDeserializer
      extends JsonDeserializer<GetConnectionRequest> {
    @Override
    public GetConnectionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetConnectionRequestPb pb = mapper.readValue(p, GetConnectionRequestPb.class);
      return GetConnectionRequest.fromPb(pb);
    }
  }
}
