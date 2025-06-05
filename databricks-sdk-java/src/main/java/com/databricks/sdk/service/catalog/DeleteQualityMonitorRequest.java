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

/** Delete a table monitor */
@Generated
@JsonSerialize(using = DeleteQualityMonitorRequest.DeleteQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = DeleteQualityMonitorRequest.DeleteQualityMonitorRequestDeserializer.class)
public class DeleteQualityMonitorRequest {
  /** Full name of the table. */
  private String tableName;

  public DeleteQualityMonitorRequest setTableName(String tableName) {
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
    DeleteQualityMonitorRequest that = (DeleteQualityMonitorRequest) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQualityMonitorRequest.class).add("tableName", tableName).toString();
  }

  DeleteQualityMonitorRequestPb toPb() {
    DeleteQualityMonitorRequestPb pb = new DeleteQualityMonitorRequestPb();
    pb.setTableName(tableName);

    return pb;
  }

  static DeleteQualityMonitorRequest fromPb(DeleteQualityMonitorRequestPb pb) {
    DeleteQualityMonitorRequest model = new DeleteQualityMonitorRequest();
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class DeleteQualityMonitorRequestSerializer
      extends JsonSerializer<DeleteQualityMonitorRequest> {
    @Override
    public void serialize(
        DeleteQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteQualityMonitorRequestDeserializer
      extends JsonDeserializer<DeleteQualityMonitorRequest> {
    @Override
    public DeleteQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteQualityMonitorRequestPb pb = mapper.readValue(p, DeleteQualityMonitorRequestPb.class);
      return DeleteQualityMonitorRequest.fromPb(pb);
    }
  }
}
