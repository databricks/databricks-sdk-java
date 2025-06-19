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

/** Cancel refresh */
@Generated
@JsonSerialize(using = CancelRefreshRequest.CancelRefreshRequestSerializer.class)
@JsonDeserialize(using = CancelRefreshRequest.CancelRefreshRequestDeserializer.class)
public class CancelRefreshRequest {
  /** ID of the refresh. */
  private String refreshId;

  /** Full name of the table. */
  private String tableName;

  public CancelRefreshRequest setRefreshId(String refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public String getRefreshId() {
    return refreshId;
  }

  public CancelRefreshRequest setTableName(String tableName) {
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
    CancelRefreshRequest that = (CancelRefreshRequest) o;
    return Objects.equals(refreshId, that.refreshId) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshId, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRefreshRequest.class)
        .add("refreshId", refreshId)
        .add("tableName", tableName)
        .toString();
  }

  CancelRefreshRequestPb toPb() {
    CancelRefreshRequestPb pb = new CancelRefreshRequestPb();
    pb.setRefreshId(refreshId);
    pb.setTableName(tableName);

    return pb;
  }

  static CancelRefreshRequest fromPb(CancelRefreshRequestPb pb) {
    CancelRefreshRequest model = new CancelRefreshRequest();
    model.setRefreshId(pb.getRefreshId());
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class CancelRefreshRequestSerializer extends JsonSerializer<CancelRefreshRequest> {
    @Override
    public void serialize(
        CancelRefreshRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelRefreshRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelRefreshRequestDeserializer
      extends JsonDeserializer<CancelRefreshRequest> {
    @Override
    public CancelRefreshRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelRefreshRequestPb pb = mapper.readValue(p, CancelRefreshRequestPb.class);
      return CancelRefreshRequest.fromPb(pb);
    }
  }
}
