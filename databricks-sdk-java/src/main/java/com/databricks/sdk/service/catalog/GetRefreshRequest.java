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

/** Get refresh */
@Generated
@JsonSerialize(using = GetRefreshRequest.GetRefreshRequestSerializer.class)
@JsonDeserialize(using = GetRefreshRequest.GetRefreshRequestDeserializer.class)
public class GetRefreshRequest {
  /** ID of the refresh. */
  private String refreshId;

  /** Full name of the table. */
  private String tableName;

  public GetRefreshRequest setRefreshId(String refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public String getRefreshId() {
    return refreshId;
  }

  public GetRefreshRequest setTableName(String tableName) {
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
    GetRefreshRequest that = (GetRefreshRequest) o;
    return Objects.equals(refreshId, that.refreshId) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshId, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRefreshRequest.class)
        .add("refreshId", refreshId)
        .add("tableName", tableName)
        .toString();
  }

  GetRefreshRequestPb toPb() {
    GetRefreshRequestPb pb = new GetRefreshRequestPb();
    pb.setRefreshId(refreshId);
    pb.setTableName(tableName);

    return pb;
  }

  static GetRefreshRequest fromPb(GetRefreshRequestPb pb) {
    GetRefreshRequest model = new GetRefreshRequest();
    model.setRefreshId(pb.getRefreshId());
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class GetRefreshRequestSerializer extends JsonSerializer<GetRefreshRequest> {
    @Override
    public void serialize(GetRefreshRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRefreshRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRefreshRequestDeserializer extends JsonDeserializer<GetRefreshRequest> {
    @Override
    public GetRefreshRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRefreshRequestPb pb = mapper.readValue(p, GetRefreshRequestPb.class);
      return GetRefreshRequest.fromPb(pb);
    }
  }
}
