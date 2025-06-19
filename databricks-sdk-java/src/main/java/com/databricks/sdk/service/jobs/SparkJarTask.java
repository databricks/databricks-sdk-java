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
@JsonSerialize(using = SparkJarTask.SparkJarTaskSerializer.class)
@JsonDeserialize(using = SparkJarTask.SparkJarTaskDeserializer.class)
public class SparkJarTask {
  /**
   * Deprecated since 04/2016. Provide a `jar` through the `libraries` field instead. For an
   * example, see :method:jobs/create.
   */
  private String jarUri;

  /**
   * The full name of the class containing the main method to be executed. This class must be
   * contained in a JAR provided as a library.
   *
   * <p>The code must use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of
   * the job fail.
   */
  private String mainClassName;

  /**
   * Parameters passed to the main method.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  private Collection<String> parameters;

  /** Deprecated. A value of `false` is no longer supported. */
  private Boolean runAsRepl;

  public SparkJarTask setJarUri(String jarUri) {
    this.jarUri = jarUri;
    return this;
  }

  public String getJarUri() {
    return jarUri;
  }

  public SparkJarTask setMainClassName(String mainClassName) {
    this.mainClassName = mainClassName;
    return this;
  }

  public String getMainClassName() {
    return mainClassName;
  }

  public SparkJarTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  public SparkJarTask setRunAsRepl(Boolean runAsRepl) {
    this.runAsRepl = runAsRepl;
    return this;
  }

  public Boolean getRunAsRepl() {
    return runAsRepl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkJarTask that = (SparkJarTask) o;
    return Objects.equals(jarUri, that.jarUri)
        && Objects.equals(mainClassName, that.mainClassName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(runAsRepl, that.runAsRepl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jarUri, mainClassName, parameters, runAsRepl);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkJarTask.class)
        .add("jarUri", jarUri)
        .add("mainClassName", mainClassName)
        .add("parameters", parameters)
        .add("runAsRepl", runAsRepl)
        .toString();
  }

  SparkJarTaskPb toPb() {
    SparkJarTaskPb pb = new SparkJarTaskPb();
    pb.setJarUri(jarUri);
    pb.setMainClassName(mainClassName);
    pb.setParameters(parameters);
    pb.setRunAsRepl(runAsRepl);

    return pb;
  }

  static SparkJarTask fromPb(SparkJarTaskPb pb) {
    SparkJarTask model = new SparkJarTask();
    model.setJarUri(pb.getJarUri());
    model.setMainClassName(pb.getMainClassName());
    model.setParameters(pb.getParameters());
    model.setRunAsRepl(pb.getRunAsRepl());

    return model;
  }

  public static class SparkJarTaskSerializer extends JsonSerializer<SparkJarTask> {
    @Override
    public void serialize(SparkJarTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkJarTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkJarTaskDeserializer extends JsonDeserializer<SparkJarTask> {
    @Override
    public SparkJarTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkJarTaskPb pb = mapper.readValue(p, SparkJarTaskPb.class);
      return SparkJarTask.fromPb(pb);
    }
  }
}
