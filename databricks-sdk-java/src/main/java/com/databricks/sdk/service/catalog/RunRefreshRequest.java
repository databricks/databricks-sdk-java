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

/** Queue a metric refresh for a monitor */
@Generated
@JsonSerialize(using = RunRefreshRequest.RunRefreshRequestSerializer.class)
@JsonDeserialize(using = RunRefreshRequest.RunRefreshRequestDeserializer.class)
public class RunRefreshRequest {
  /** Full name of the table. */
  private String tableName;

  public RunRefreshRequest setTableName(String tableName) {
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
    RunRefreshRequest that = (RunRefreshRequest) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(RunRefreshRequest.class).add("tableName", tableName).toString();
  }

  RunRefreshRequestPb toPb() {
    RunRefreshRequestPb pb = new RunRefreshRequestPb();
    pb.setTableName(tableName);

    return pb;
  }

  static RunRefreshRequest fromPb(RunRefreshRequestPb pb) {
    RunRefreshRequest model = new RunRefreshRequest();
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class RunRefreshRequestSerializer extends JsonSerializer<RunRefreshRequest> {
    @Override
    public void serialize(RunRefreshRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunRefreshRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunRefreshRequestDeserializer extends JsonDeserializer<RunRefreshRequest> {
    @Override
    public RunRefreshRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunRefreshRequestPb pb = mapper.readValue(p, RunRefreshRequestPb.class);
      return RunRefreshRequest.fromPb(pb);
    }
  }
}
