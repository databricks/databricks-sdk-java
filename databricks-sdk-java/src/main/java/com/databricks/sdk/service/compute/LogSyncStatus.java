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

/** The log delivery status */
@Generated
@JsonSerialize(using = LogSyncStatus.LogSyncStatusSerializer.class)
@JsonDeserialize(using = LogSyncStatus.LogSyncStatusDeserializer.class)
public class LogSyncStatus {
  /**
   * The timestamp of last attempt. If the last attempt fails, `last_exception` will contain the
   * exception in the last attempt.
   */
  private Long lastAttempted;

  /**
   * The exception thrown in the last attempt, it would be null (omitted in the response) if there
   * is no exception in last attempted.
   */
  private String lastException;

  public LogSyncStatus setLastAttempted(Long lastAttempted) {
    this.lastAttempted = lastAttempted;
    return this;
  }

  public Long getLastAttempted() {
    return lastAttempted;
  }

  public LogSyncStatus setLastException(String lastException) {
    this.lastException = lastException;
    return this;
  }

  public String getLastException() {
    return lastException;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogSyncStatus that = (LogSyncStatus) o;
    return Objects.equals(lastAttempted, that.lastAttempted)
        && Objects.equals(lastException, that.lastException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttempted, lastException);
  }

  @Override
  public String toString() {
    return new ToStringer(LogSyncStatus.class)
        .add("lastAttempted", lastAttempted)
        .add("lastException", lastException)
        .toString();
  }

  LogSyncStatusPb toPb() {
    LogSyncStatusPb pb = new LogSyncStatusPb();
    pb.setLastAttempted(lastAttempted);
    pb.setLastException(lastException);

    return pb;
  }

  static LogSyncStatus fromPb(LogSyncStatusPb pb) {
    LogSyncStatus model = new LogSyncStatus();
    model.setLastAttempted(pb.getLastAttempted());
    model.setLastException(pb.getLastException());

    return model;
  }

  public static class LogSyncStatusSerializer extends JsonSerializer<LogSyncStatus> {
    @Override
    public void serialize(LogSyncStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogSyncStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogSyncStatusDeserializer extends JsonDeserializer<LogSyncStatus> {
    @Override
    public LogSyncStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogSyncStatusPb pb = mapper.readValue(p, LogSyncStatusPb.class);
      return LogSyncStatus.fromPb(pb);
    }
  }
}
