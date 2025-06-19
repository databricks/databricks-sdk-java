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
import java.util.Collection;
import java.util.Objects;

/**
 * The environment entity used to preserve serverless environment side panel, jobs' environment for
 * non-notebook task, and DLT's environment for classic and serverless pipelines. In this minimal
 * environment spec, only pip dependencies are supported.
 */
@Generated
@JsonSerialize(using = Environment.EnvironmentSerializer.class)
@JsonDeserialize(using = Environment.EnvironmentDeserializer.class)
public class Environment {
  /** Use `environment_version` instead. */
  private String client;

  /**
   * List of pip dependencies, as supported by the version of pip in this environment. Each
   * dependency is a valid pip requirements file line per
   * https://pip.pypa.io/en/stable/reference/requirements-file-format/. Allowed dependencies include
   * a requirement specifier, an archive URL, a local project path (such as WSFS or UC Volumes in
   * Databricks), or a VCS project URL.
   */
  private Collection<String> dependencies;

  /**
   * Required. Environment version used by the environment. Each version comes with a specific
   * Python version and a set of Python packages. The version is a string, consisting of an integer.
   */
  private String environmentVersion;

  /**
   * List of jar dependencies, should be string representing volume paths. For example:
   * `/Volumes/path/to/test.jar`.
   */
  private Collection<String> jarDependencies;

  public Environment setClient(String client) {
    this.client = client;
    return this;
  }

  public String getClient() {
    return client;
  }

  public Environment setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  public Environment setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  public Environment setJarDependencies(Collection<String> jarDependencies) {
    this.jarDependencies = jarDependencies;
    return this;
  }

  public Collection<String> getJarDependencies() {
    return jarDependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Environment that = (Environment) o;
    return Objects.equals(client, that.client)
        && Objects.equals(dependencies, that.dependencies)
        && Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(jarDependencies, that.jarDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, dependencies, environmentVersion, jarDependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(Environment.class)
        .add("client", client)
        .add("dependencies", dependencies)
        .add("environmentVersion", environmentVersion)
        .add("jarDependencies", jarDependencies)
        .toString();
  }

  EnvironmentPb toPb() {
    EnvironmentPb pb = new EnvironmentPb();
    pb.setClient(client);
    pb.setDependencies(dependencies);
    pb.setEnvironmentVersion(environmentVersion);
    pb.setJarDependencies(jarDependencies);

    return pb;
  }

  static Environment fromPb(EnvironmentPb pb) {
    Environment model = new Environment();
    model.setClient(pb.getClient());
    model.setDependencies(pb.getDependencies());
    model.setEnvironmentVersion(pb.getEnvironmentVersion());
    model.setJarDependencies(pb.getJarDependencies());

    return model;
  }

  public static class EnvironmentSerializer extends JsonSerializer<Environment> {
    @Override
    public void serialize(Environment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnvironmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnvironmentDeserializer extends JsonDeserializer<Environment> {
    @Override
    public Environment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnvironmentPb pb = mapper.readValue(p, EnvironmentPb.class);
      return Environment.fromPb(pb);
    }
  }
}
