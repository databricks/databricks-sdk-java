// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Check configuration status */
@Generated
@JsonSerialize(using = GetStatusRequest.GetStatusRequestSerializer.class)
@JsonDeserialize(using = GetStatusRequest.GetStatusRequestDeserializer.class)
public class GetStatusRequest {
  /** */
  private String keys;

  public GetStatusRequest setKeys(String keys) {
    this.keys = keys;
    return this;
  }

  public String getKeys() {
    return keys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatusRequest that = (GetStatusRequest) o;
    return Objects.equals(keys, that.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatusRequest.class).add("keys", keys).toString();
  }

  GetStatusRequestPb toPb() {
    GetStatusRequestPb pb = new GetStatusRequestPb();
    pb.setKeys(keys);

    return pb;
  }

  static GetStatusRequest fromPb(GetStatusRequestPb pb) {
    GetStatusRequest model = new GetStatusRequest();
    model.setKeys(pb.getKeys());

    return model;
  }

  public static class GetStatusRequestSerializer extends JsonSerializer<GetStatusRequest> {
    @Override
    public void serialize(GetStatusRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStatusRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStatusRequestDeserializer extends JsonDeserializer<GetStatusRequest> {
    @Override
    public GetStatusRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStatusRequestPb pb = mapper.readValue(p, GetStatusRequestPb.class);
      return GetStatusRequest.fromPb(pb);
    }
  }
}
