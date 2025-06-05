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
@JsonSerialize(using = UninstallLibraries.UninstallLibrariesSerializer.class)
@JsonDeserialize(using = UninstallLibraries.UninstallLibrariesDeserializer.class)
public class UninstallLibraries {
  /** Unique identifier for the cluster on which to uninstall these libraries. */
  private String clusterId;

  /** The libraries to uninstall. */
  private Collection<Library> libraries;

  public UninstallLibraries setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public UninstallLibraries setLibraries(Collection<Library> libraries) {
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
    UninstallLibraries that = (UninstallLibraries) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(libraries, that.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraries);
  }

  @Override
  public String toString() {
    return new ToStringer(UninstallLibraries.class)
        .add("clusterId", clusterId)
        .add("libraries", libraries)
        .toString();
  }

  UninstallLibrariesPb toPb() {
    UninstallLibrariesPb pb = new UninstallLibrariesPb();
    pb.setClusterId(clusterId);
    pb.setLibraries(libraries);

    return pb;
  }

  static UninstallLibraries fromPb(UninstallLibrariesPb pb) {
    UninstallLibraries model = new UninstallLibraries();
    model.setClusterId(pb.getClusterId());
    model.setLibraries(pb.getLibraries());

    return model;
  }

  public static class UninstallLibrariesSerializer extends JsonSerializer<UninstallLibraries> {
    @Override
    public void serialize(UninstallLibraries value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UninstallLibrariesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UninstallLibrariesDeserializer extends JsonDeserializer<UninstallLibraries> {
    @Override
    public UninstallLibraries deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UninstallLibrariesPb pb = mapper.readValue(p, UninstallLibrariesPb.class);
      return UninstallLibraries.fromPb(pb);
    }
  }
}
