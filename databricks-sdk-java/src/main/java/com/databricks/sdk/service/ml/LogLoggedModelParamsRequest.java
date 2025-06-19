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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = LogLoggedModelParamsRequest.LogLoggedModelParamsRequestSerializer.class)
@JsonDeserialize(using = LogLoggedModelParamsRequest.LogLoggedModelParamsRequestDeserializer.class)
public class LogLoggedModelParamsRequest {
  /** The ID of the logged model to log params for. */
  private String modelId;

  /** Parameters to attach to the model. */
  private Collection<LoggedModelParameter> params;

  public LogLoggedModelParamsRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public LogLoggedModelParamsRequest setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogLoggedModelParamsRequest that = (LogLoggedModelParamsRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(params, that.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, params);
  }

  @Override
  public String toString() {
    return new ToStringer(LogLoggedModelParamsRequest.class)
        .add("modelId", modelId)
        .add("params", params)
        .toString();
  }

  LogLoggedModelParamsRequestPb toPb() {
    LogLoggedModelParamsRequestPb pb = new LogLoggedModelParamsRequestPb();
    pb.setModelId(modelId);
    pb.setParams(params);

    return pb;
  }

  static LogLoggedModelParamsRequest fromPb(LogLoggedModelParamsRequestPb pb) {
    LogLoggedModelParamsRequest model = new LogLoggedModelParamsRequest();
    model.setModelId(pb.getModelId());
    model.setParams(pb.getParams());

    return model;
  }

  public static class LogLoggedModelParamsRequestSerializer
      extends JsonSerializer<LogLoggedModelParamsRequest> {
    @Override
    public void serialize(
        LogLoggedModelParamsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogLoggedModelParamsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogLoggedModelParamsRequestDeserializer
      extends JsonDeserializer<LogLoggedModelParamsRequest> {
    @Override
    public LogLoggedModelParamsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogLoggedModelParamsRequestPb pb = mapper.readValue(p, LogLoggedModelParamsRequestPb.class);
      return LogLoggedModelParamsRequest.fromPb(pb);
    }
  }
}
