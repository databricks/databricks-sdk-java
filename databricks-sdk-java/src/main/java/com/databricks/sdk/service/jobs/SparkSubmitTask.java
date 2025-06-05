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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = SparkSubmitTask.SparkSubmitTaskSerializer.class)
@JsonDeserialize(using = SparkSubmitTask.SparkSubmitTaskDeserializer.class)
public class SparkSubmitTask {
  /**
   * Command-line parameters passed to spark submit.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  private Collection<String> parameters;

  public SparkSubmitTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkSubmitTask that = (SparkSubmitTask) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkSubmitTask.class).add("parameters", parameters).toString();
  }

  SparkSubmitTaskPb toPb() {
    SparkSubmitTaskPb pb = new SparkSubmitTaskPb();
    pb.setParameters(parameters);

    return pb;
  }

  static SparkSubmitTask fromPb(SparkSubmitTaskPb pb) {
    SparkSubmitTask model = new SparkSubmitTask();
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class SparkSubmitTaskSerializer extends JsonSerializer<SparkSubmitTask> {
    @Override
    public void serialize(SparkSubmitTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkSubmitTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkSubmitTaskDeserializer extends JsonDeserializer<SparkSubmitTask> {
    @Override
    public SparkSubmitTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkSubmitTaskPb pb = mapper.readValue(p, SparkSubmitTaskPb.class);
      return SparkSubmitTask.fromPb(pb);
    }
  }
}
