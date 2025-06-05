// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

@Generated
@JsonSerialize(using = LogAnalyticsInfo.LogAnalyticsInfoSerializer.class)
@JsonDeserialize(using = LogAnalyticsInfo.LogAnalyticsInfoDeserializer.class)
public class LogAnalyticsInfo {
  /** */
  private String logAnalyticsPrimaryKey;

  /** */
  private String logAnalyticsWorkspaceId;

  public LogAnalyticsInfo setLogAnalyticsPrimaryKey(String logAnalyticsPrimaryKey) {
    this.logAnalyticsPrimaryKey = logAnalyticsPrimaryKey;
    return this;
  }

  public String getLogAnalyticsPrimaryKey() {
    return logAnalyticsPrimaryKey;
  }

  public LogAnalyticsInfo setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
    this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
    return this;
  }

  public String getLogAnalyticsWorkspaceId() {
    return logAnalyticsWorkspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogAnalyticsInfo that = (LogAnalyticsInfo) o;
    return Objects.equals(logAnalyticsPrimaryKey, that.logAnalyticsPrimaryKey)
        && Objects.equals(logAnalyticsWorkspaceId, that.logAnalyticsWorkspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logAnalyticsPrimaryKey, logAnalyticsWorkspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogAnalyticsInfo.class)
        .add("logAnalyticsPrimaryKey", logAnalyticsPrimaryKey)
        .add("logAnalyticsWorkspaceId", logAnalyticsWorkspaceId)
        .toString();
  }

  LogAnalyticsInfoPb toPb() {
    LogAnalyticsInfoPb pb = new LogAnalyticsInfoPb();
    pb.setLogAnalyticsPrimaryKey(logAnalyticsPrimaryKey);
    pb.setLogAnalyticsWorkspaceId(logAnalyticsWorkspaceId);

    return pb;
  }

  static LogAnalyticsInfo fromPb(LogAnalyticsInfoPb pb) {
    LogAnalyticsInfo model = new LogAnalyticsInfo();
    model.setLogAnalyticsPrimaryKey(pb.getLogAnalyticsPrimaryKey());
    model.setLogAnalyticsWorkspaceId(pb.getLogAnalyticsWorkspaceId());

    return model;
  }

  public static class LogAnalyticsInfoSerializer extends JsonSerializer<LogAnalyticsInfo> {
    @Override
    public void serialize(LogAnalyticsInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogAnalyticsInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogAnalyticsInfoDeserializer extends JsonDeserializer<LogAnalyticsInfo> {
    @Override
    public LogAnalyticsInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogAnalyticsInfoPb pb = mapper.readValue(p, LogAnalyticsInfoPb.class);
      return LogAnalyticsInfo.fromPb(pb);
    }
  }
}
