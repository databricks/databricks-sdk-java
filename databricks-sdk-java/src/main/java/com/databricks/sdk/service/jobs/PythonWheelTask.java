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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = PythonWheelTask.PythonWheelTaskSerializer.class)
@JsonDeserialize(using = PythonWheelTask.PythonWheelTaskDeserializer.class)
public class PythonWheelTask {
  /**
   * Named entry point to use, if it does not exist in the metadata of the package it executes the
   * function from the package directly using `$packageName.$entryPoint()`
   */
  private String entryPoint;

  /**
   * Command-line parameters passed to Python wheel task in the form of `["--name=task",
   * "--data=dbfs:/path/to/data.json"]`. Leave it empty if `parameters` is not null.
   */
  private Map<String, String> namedParameters;

  /** Name of the package to execute */
  private String packageName;

  /**
   * Command-line parameters passed to Python wheel task. Leave it empty if `named_parameters` is
   * not null.
   */
  private Collection<String> parameters;

  public PythonWheelTask setEntryPoint(String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  public String getEntryPoint() {
    return entryPoint;
  }

  public PythonWheelTask setNamedParameters(Map<String, String> namedParameters) {
    this.namedParameters = namedParameters;
    return this;
  }

  public Map<String, String> getNamedParameters() {
    return namedParameters;
  }

  public PythonWheelTask setPackageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public String getPackageName() {
    return packageName;
  }

  public PythonWheelTask setParameters(Collection<String> parameters) {
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
    PythonWheelTask that = (PythonWheelTask) o;
    return Objects.equals(entryPoint, that.entryPoint)
        && Objects.equals(namedParameters, that.namedParameters)
        && Objects.equals(packageName, that.packageName)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, namedParameters, packageName, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonWheelTask.class)
        .add("entryPoint", entryPoint)
        .add("namedParameters", namedParameters)
        .add("packageName", packageName)
        .add("parameters", parameters)
        .toString();
  }

  PythonWheelTaskPb toPb() {
    PythonWheelTaskPb pb = new PythonWheelTaskPb();
    pb.setEntryPoint(entryPoint);
    pb.setNamedParameters(namedParameters);
    pb.setPackageName(packageName);
    pb.setParameters(parameters);

    return pb;
  }

  static PythonWheelTask fromPb(PythonWheelTaskPb pb) {
    PythonWheelTask model = new PythonWheelTask();
    model.setEntryPoint(pb.getEntryPoint());
    model.setNamedParameters(pb.getNamedParameters());
    model.setPackageName(pb.getPackageName());
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class PythonWheelTaskSerializer extends JsonSerializer<PythonWheelTask> {
    @Override
    public void serialize(PythonWheelTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PythonWheelTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PythonWheelTaskDeserializer extends JsonDeserializer<PythonWheelTask> {
    @Override
    public PythonWheelTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PythonWheelTaskPb pb = mapper.readValue(p, PythonWheelTaskPb.class);
      return PythonWheelTask.fromPb(pb);
    }
  }
}
