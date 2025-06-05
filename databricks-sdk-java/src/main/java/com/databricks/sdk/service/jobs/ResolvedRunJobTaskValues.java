// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedRunJobTaskValues.ResolvedRunJobTaskValuesSerializer.class)
@JsonDeserialize(using = ResolvedRunJobTaskValues.ResolvedRunJobTaskValuesDeserializer.class)
public class ResolvedRunJobTaskValues {
  /** */
  private Map<String, String> jobParameters;

  /** */
  private Map<String, String> parameters;

  public ResolvedRunJobTaskValues setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public ResolvedRunJobTaskValues setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedRunJobTaskValues that = (ResolvedRunJobTaskValues) o;
    return Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobParameters, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedRunJobTaskValues.class)
        .add("jobParameters", jobParameters)
        .add("parameters", parameters)
        .toString();
  }

  ResolvedRunJobTaskValuesPb toPb() {
    ResolvedRunJobTaskValuesPb pb = new ResolvedRunJobTaskValuesPb();
    pb.setJobParameters(jobParameters);
    pb.setParameters(parameters);

    return pb;
  }

  static ResolvedRunJobTaskValues fromPb(ResolvedRunJobTaskValuesPb pb) {
    ResolvedRunJobTaskValues model = new ResolvedRunJobTaskValues();
    model.setJobParameters(pb.getJobParameters());
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class ResolvedRunJobTaskValuesSerializer
      extends JsonSerializer<ResolvedRunJobTaskValues> {
    @Override
    public void serialize(
        ResolvedRunJobTaskValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedRunJobTaskValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedRunJobTaskValuesDeserializer
      extends JsonDeserializer<ResolvedRunJobTaskValues> {
    @Override
    public ResolvedRunJobTaskValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedRunJobTaskValuesPb pb = mapper.readValue(p, ResolvedRunJobTaskValuesPb.class);
      return ResolvedRunJobTaskValues.fromPb(pb);
    }
  }
}
