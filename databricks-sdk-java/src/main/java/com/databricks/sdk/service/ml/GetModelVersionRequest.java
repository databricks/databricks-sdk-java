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

/** Get a model version */
@Generated
@JsonSerialize(using = GetModelVersionRequest.GetModelVersionRequestSerializer.class)
@JsonDeserialize(using = GetModelVersionRequest.GetModelVersionRequestDeserializer.class)
public class GetModelVersionRequest {
  /** Name of the registered model */
  private String name;

  /** Model version number */
  private String version;

  public GetModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetModelVersionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionRequest that = (GetModelVersionRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  GetModelVersionRequestPb toPb() {
    GetModelVersionRequestPb pb = new GetModelVersionRequestPb();
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static GetModelVersionRequest fromPb(GetModelVersionRequestPb pb) {
    GetModelVersionRequest model = new GetModelVersionRequest();
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class GetModelVersionRequestSerializer
      extends JsonSerializer<GetModelVersionRequest> {
    @Override
    public void serialize(
        GetModelVersionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelVersionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelVersionRequestDeserializer
      extends JsonDeserializer<GetModelVersionRequest> {
    @Override
    public GetModelVersionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelVersionRequestPb pb = mapper.readValue(p, GetModelVersionRequestPb.class);
      return GetModelVersionRequest.fromPb(pb);
    }
  }
}
