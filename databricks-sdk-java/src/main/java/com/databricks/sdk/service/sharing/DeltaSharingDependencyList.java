// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Represents a list of dependencies. */
@Generated
@JsonSerialize(using = DeltaSharingDependencyList.DeltaSharingDependencyListSerializer.class)
@JsonDeserialize(using = DeltaSharingDependencyList.DeltaSharingDependencyListDeserializer.class)
public class DeltaSharingDependencyList {
  /** An array of Dependency. */
  private Collection<DeltaSharingDependency> dependencies;

  public DeltaSharingDependencyList setDependencies(
      Collection<DeltaSharingDependency> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<DeltaSharingDependency> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingDependencyList that = (DeltaSharingDependencyList) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependencyList.class)
        .add("dependencies", dependencies)
        .toString();
  }

  DeltaSharingDependencyListPb toPb() {
    DeltaSharingDependencyListPb pb = new DeltaSharingDependencyListPb();
    pb.setDependencies(dependencies);

    return pb;
  }

  static DeltaSharingDependencyList fromPb(DeltaSharingDependencyListPb pb) {
    DeltaSharingDependencyList model = new DeltaSharingDependencyList();
    model.setDependencies(pb.getDependencies());

    return model;
  }

  public static class DeltaSharingDependencyListSerializer
      extends JsonSerializer<DeltaSharingDependencyList> {
    @Override
    public void serialize(
        DeltaSharingDependencyList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSharingDependencyListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSharingDependencyListDeserializer
      extends JsonDeserializer<DeltaSharingDependencyList> {
    @Override
    public DeltaSharingDependencyList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSharingDependencyListPb pb = mapper.readValue(p, DeltaSharingDependencyListPb.class);
      return DeltaSharingDependencyList.fromPb(pb);
    }
  }
}
