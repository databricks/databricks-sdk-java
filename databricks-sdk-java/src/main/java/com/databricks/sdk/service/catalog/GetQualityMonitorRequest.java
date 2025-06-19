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

/** Get a table monitor */
@Generated
@JsonSerialize(using = GetQualityMonitorRequest.GetQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = GetQualityMonitorRequest.GetQualityMonitorRequestDeserializer.class)
public class GetQualityMonitorRequest {
  /** Full name of the table. */
  private String tableName;

  public GetQualityMonitorRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQualityMonitorRequest that = (GetQualityMonitorRequest) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQualityMonitorRequest.class).add("tableName", tableName).toString();
  }

  GetQualityMonitorRequestPb toPb() {
    GetQualityMonitorRequestPb pb = new GetQualityMonitorRequestPb();
    pb.setTableName(tableName);

    return pb;
  }

  static GetQualityMonitorRequest fromPb(GetQualityMonitorRequestPb pb) {
    GetQualityMonitorRequest model = new GetQualityMonitorRequest();
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class GetQualityMonitorRequestSerializer
      extends JsonSerializer<GetQualityMonitorRequest> {
    @Override
    public void serialize(
        GetQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQualityMonitorRequestDeserializer
      extends JsonDeserializer<GetQualityMonitorRequest> {
    @Override
    public GetQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQualityMonitorRequestPb pb = mapper.readValue(p, GetQualityMonitorRequestPb.class);
      return GetQualityMonitorRequest.fromPb(pb);
    }
  }
}
