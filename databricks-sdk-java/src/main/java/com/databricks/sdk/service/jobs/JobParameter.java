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
import java.util.Objects;

@Generated
@JsonSerialize(using = JobParameter.JobParameterSerializer.class)
@JsonDeserialize(using = JobParameter.JobParameterDeserializer.class)
public class JobParameter {
  /** The optional default value of the parameter */
  private String defaultValue;

  /** The name of the parameter */
  private String name;

  /** The value used in the run */
  private String value;

  public JobParameter setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }

  public JobParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public JobParameter setValue(String value) {
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
    JobParameter that = (JobParameter) o;
    return Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name, value);
  }

  @Override
  public String toString() {
    return new ToStringer(JobParameter.class)
        .add("defaultValue", defaultValue)
        .add("name", name)
        .add("value", value)
        .toString();
  }

  JobParameterPb toPb() {
    JobParameterPb pb = new JobParameterPb();
    pb.setDefault(defaultValue);
    pb.setName(name);
    pb.setValue(value);

    return pb;
  }

  static JobParameter fromPb(JobParameterPb pb) {
    JobParameter model = new JobParameter();
    model.setDefault(pb.getDefault());
    model.setName(pb.getName());
    model.setValue(pb.getValue());

    return model;
  }

  public static class JobParameterSerializer extends JsonSerializer<JobParameter> {
    @Override
    public void serialize(JobParameter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobParameterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobParameterDeserializer extends JsonDeserializer<JobParameter> {
    @Override
    public JobParameter deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobParameterPb pb = mapper.readValue(p, JobParameterPb.class);
      return JobParameter.fromPb(pb);
    }
  }
}
