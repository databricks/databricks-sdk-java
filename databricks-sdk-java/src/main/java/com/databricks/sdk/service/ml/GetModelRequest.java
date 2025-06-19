// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Get model */
@Generated
@JsonSerialize(using = GetModelRequest.GetModelRequestSerializer.class)
@JsonDeserialize(using = GetModelRequest.GetModelRequestDeserializer.class)
public class GetModelRequest {
  /** Registered model unique name identifier. */
  private String name;

  public GetModelRequest setName(String name) {
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
    GetModelRequest that = (GetModelRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelRequest.class).add("name", name).toString();
  }

  GetModelRequestPb toPb() {
    GetModelRequestPb pb = new GetModelRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetModelRequest fromPb(GetModelRequestPb pb) {
    GetModelRequest model = new GetModelRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetModelRequestSerializer extends JsonSerializer<GetModelRequest> {
    @Override
    public void serialize(GetModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelRequestDeserializer extends JsonDeserializer<GetModelRequest> {
    @Override
    public GetModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelRequestPb pb = mapper.readValue(p, GetModelRequestPb.class);
      return GetModelRequest.fromPb(pb);
    }
  }
}
