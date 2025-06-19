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

/** Tag for a LoggedModel. */
@Generated
@JsonSerialize(using = LoggedModelTag.LoggedModelTagSerializer.class)
@JsonDeserialize(using = LoggedModelTag.LoggedModelTagDeserializer.class)
public class LoggedModelTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public LoggedModelTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public LoggedModelTag setValue(String value) {
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
    LoggedModelTag that = (LoggedModelTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModelTag.class).add("key", key).add("value", value).toString();
  }

  LoggedModelTagPb toPb() {
    LoggedModelTagPb pb = new LoggedModelTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static LoggedModelTag fromPb(LoggedModelTagPb pb) {
    LoggedModelTag model = new LoggedModelTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class LoggedModelTagSerializer extends JsonSerializer<LoggedModelTag> {
    @Override
    public void serialize(LoggedModelTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LoggedModelTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LoggedModelTagDeserializer extends JsonDeserializer<LoggedModelTag> {
    @Override
    public LoggedModelTag deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LoggedModelTagPb pb = mapper.readValue(p, LoggedModelTagPb.class);
      return LoggedModelTag.fromPb(pb);
    }
  }
}
