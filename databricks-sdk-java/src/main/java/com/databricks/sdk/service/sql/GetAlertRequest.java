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
@JsonSerialize(using = GetAlertRequest.GetAlertRequestSerializer.class)
@JsonDeserialize(using = GetAlertRequest.GetAlertRequestDeserializer.class)
public class GetAlertRequest {
  /** */
  private String id;

  public GetAlertRequest setId(String id) {
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
    GetAlertRequest that = (GetAlertRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAlertRequest.class).add("id", id).toString();
  }

  GetAlertRequestPb toPb() {
    GetAlertRequestPb pb = new GetAlertRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetAlertRequest fromPb(GetAlertRequestPb pb) {
    GetAlertRequest model = new GetAlertRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetAlertRequestSerializer extends JsonSerializer<GetAlertRequest> {
    @Override
    public void serialize(GetAlertRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAlertRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAlertRequestDeserializer extends JsonDeserializer<GetAlertRequest> {
    @Override
    public GetAlertRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAlertRequestPb pb = mapper.readValue(p, GetAlertRequestPb.class);
      return GetAlertRequest.fromPb(pb);
    }
  }
}
