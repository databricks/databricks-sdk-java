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

@Generated
@JsonSerialize(using = InstallLibraries.InstallLibrariesSerializer.class)
@JsonDeserialize(using = InstallLibraries.InstallLibrariesDeserializer.class)
public class InstallLibraries {
  /** Unique identifier for the cluster on which to install these libraries. */
  private String clusterId;

  /** The libraries to install. */
  private Collection<Library> libraries;

  public InstallLibraries setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public InstallLibraries setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<Library> getLibraries() {
    return libraries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstallLibraries that = (InstallLibraries) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(libraries, that.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraries);
  }

  @Override
  public String toString() {
    return new ToStringer(InstallLibraries.class)
        .add("clusterId", clusterId)
        .add("libraries", libraries)
        .toString();
  }

  InstallLibrariesPb toPb() {
    InstallLibrariesPb pb = new InstallLibrariesPb();
    pb.setClusterId(clusterId);
    pb.setLibraries(libraries);

    return pb;
  }

  static InstallLibraries fromPb(InstallLibrariesPb pb) {
    InstallLibraries model = new InstallLibraries();
    model.setClusterId(pb.getClusterId());
    model.setLibraries(pb.getLibraries());

    return model;
  }

  public static class InstallLibrariesSerializer extends JsonSerializer<InstallLibraries> {
    @Override
    public void serialize(InstallLibraries value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstallLibrariesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstallLibrariesDeserializer extends JsonDeserializer<InstallLibraries> {
    @Override
    public InstallLibraries deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstallLibrariesPb pb = mapper.readValue(p, InstallLibrariesPb.class);
      return InstallLibraries.fromPb(pb);
    }
  }
}
