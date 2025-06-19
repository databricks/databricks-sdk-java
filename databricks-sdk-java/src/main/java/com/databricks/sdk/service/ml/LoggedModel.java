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

/**
 * A logged model message includes logged model attributes, tags, registration info, params, and
 * linked run metrics.
 */
@Generated
@JsonSerialize(using = LoggedModel.LoggedModelSerializer.class)
@JsonDeserialize(using = LoggedModel.LoggedModelDeserializer.class)
public class LoggedModel {
  /** The params and metrics attached to the logged model. */
  private LoggedModelData data;

  /** The logged model attributes such as model ID, status, tags, etc. */
  private LoggedModelInfo info;

  public LoggedModel setData(LoggedModelData data) {
    this.data = data;
    return this;
  }

  public LoggedModelData getData() {
    return data;
  }

  public LoggedModel setInfo(LoggedModelInfo info) {
    this.info = info;
    return this;
  }

  public LoggedModelInfo getInfo() {
    return info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoggedModel that = (LoggedModel) o;
    return Objects.equals(data, that.data) && Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModel.class).add("data", data).add("info", info).toString();
  }

  LoggedModelPb toPb() {
    LoggedModelPb pb = new LoggedModelPb();
    pb.setData(data);
    pb.setInfo(info);

    return pb;
  }

  static LoggedModel fromPb(LoggedModelPb pb) {
    LoggedModel model = new LoggedModel();
    model.setData(pb.getData());
    model.setInfo(pb.getInfo());

    return model;
  }

  public static class LoggedModelSerializer extends JsonSerializer<LoggedModel> {
    @Override
    public void serialize(LoggedModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LoggedModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LoggedModelDeserializer extends JsonDeserializer<LoggedModel> {
    @Override
    public LoggedModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LoggedModelPb pb = mapper.readValue(p, LoggedModelPb.class);
      return LoggedModel.fromPb(pb);
    }
  }
}
