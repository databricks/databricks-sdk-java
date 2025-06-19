// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = LogParam.LogParamSerializer.class)
@JsonDeserialize(using = LogParam.LogParamDeserializer.class)
public class LogParam {
  /** Name of the param. Maximum size is 255 bytes. */
  private String key;

  /** ID of the run under which to log the param. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run under which to log the param. This field will
   * be removed in a future MLflow version.
   */
  private String runUuid;

  /** String value of the param being logged. Maximum size is 500 bytes. */
  private String value;

  public LogParam setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public LogParam setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogParam setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public LogParam setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogParam that = (LogParam) o;
    return Objects.equals(key, that.key)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, value);
  }

  @Override
  public String toString() {
    return new ToStringer(LogParam.class)
        .add("key", key)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("value", value)
        .toString();
  }

  LogParamPb toPb() {
    LogParamPb pb = new LogParamPb();
    pb.setKey(key);
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);
    pb.setValue(value);

    return pb;
  }

  static LogParam fromPb(LogParamPb pb) {
    LogParam model = new LogParam();
    model.setKey(pb.getKey());
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());
    model.setValue(pb.getValue());

    return model;
  }

  public static class LogParamSerializer extends JsonSerializer<LogParam> {
    @Override
    public void serialize(LogParam value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogParamPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogParamDeserializer extends JsonDeserializer<LogParam> {
    @Override
    public LogParam deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogParamPb pb = mapper.readValue(p, LogParamPb.class);
      return LogParam.fromPb(pb);
    }
  }
}
