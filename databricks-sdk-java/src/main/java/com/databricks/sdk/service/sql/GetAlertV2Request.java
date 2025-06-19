// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Get an alert */
@Generated
@JsonSerialize(using = GetAlertV2Request.GetAlertV2RequestSerializer.class)
@JsonDeserialize(using = GetAlertV2Request.GetAlertV2RequestDeserializer.class)
public class GetAlertV2Request {
  /** */
  private String id;

  public GetAlertV2Request setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAlertV2Request that = (GetAlertV2Request) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAlertV2Request.class).add("id", id).toString();
  }

  GetAlertV2RequestPb toPb() {
    GetAlertV2RequestPb pb = new GetAlertV2RequestPb();
    pb.setId(id);

    return pb;
  }

  static GetAlertV2Request fromPb(GetAlertV2RequestPb pb) {
    GetAlertV2Request model = new GetAlertV2Request();
    model.setId(pb.getId());

    return model;
  }

  public static class GetAlertV2RequestSerializer extends JsonSerializer<GetAlertV2Request> {
    @Override
    public void serialize(GetAlertV2Request value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAlertV2RequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAlertV2RequestDeserializer extends JsonDeserializer<GetAlertV2Request> {
    @Override
    public GetAlertV2Request deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAlertV2RequestPb pb = mapper.readValue(p, GetAlertV2RequestPb.class);
      return GetAlertV2Request.fromPb(pb);
    }
  }
}
