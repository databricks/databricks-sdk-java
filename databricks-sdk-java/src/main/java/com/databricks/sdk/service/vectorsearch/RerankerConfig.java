// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = RerankerConfig.RerankerConfigSerializer.class)
@JsonDeserialize(using = RerankerConfig.RerankerConfigDeserializer.class)
public class RerankerConfig {
  /** */
  private String model;

  /** */
  private RerankerConfigRerankerParameters parameters;

  public RerankerConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public RerankerConfig setParameters(RerankerConfigRerankerParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  public RerankerConfigRerankerParameters getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RerankerConfig that = (RerankerConfig) o;
    return Objects.equals(model, that.model) && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfig.class)
        .add("model", model)
        .add("parameters", parameters)
        .toString();
  }

  RerankerConfigPb toPb() {
    RerankerConfigPb pb = new RerankerConfigPb();
    pb.setModel(model);
    pb.setParameters(parameters);

    return pb;
  }

  static RerankerConfig fromPb(RerankerConfigPb pb) {
    RerankerConfig model = new RerankerConfig();
    model.setModel(pb.getModel());
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class RerankerConfigSerializer extends JsonSerializer<RerankerConfig> {
    @Override
    public void serialize(RerankerConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RerankerConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RerankerConfigDeserializer extends JsonDeserializer<RerankerConfig> {
    @Override
    public RerankerConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RerankerConfigPb pb = mapper.readValue(p, RerankerConfigPb.class);
      return RerankerConfig.fromPb(pb);
    }
  }
}
