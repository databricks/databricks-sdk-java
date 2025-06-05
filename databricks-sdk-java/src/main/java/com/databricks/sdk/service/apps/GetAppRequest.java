// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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

/** Get an app */
@Generated
@JsonSerialize(using = GetAppRequest.GetAppRequestSerializer.class)
@JsonDeserialize(using = GetAppRequest.GetAppRequestDeserializer.class)
public class GetAppRequest {
  /** The name of the app. */
  private String name;

  public GetAppRequest setName(String name) {
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
    GetAppRequest that = (GetAppRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppRequest.class).add("name", name).toString();
  }

  GetAppRequestPb toPb() {
    GetAppRequestPb pb = new GetAppRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetAppRequest fromPb(GetAppRequestPb pb) {
    GetAppRequest model = new GetAppRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetAppRequestSerializer extends JsonSerializer<GetAppRequest> {
    @Override
    public void serialize(GetAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAppRequestDeserializer extends JsonDeserializer<GetAppRequest> {
    @Override
    public GetAppRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAppRequestPb pb = mapper.readValue(p, GetAppRequestPb.class);
      return GetAppRequest.fromPb(pb);
    }
  }
}
