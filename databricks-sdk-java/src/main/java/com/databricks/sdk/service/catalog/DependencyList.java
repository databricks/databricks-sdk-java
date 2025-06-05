// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** A list of dependencies. */
@Generated
@JsonSerialize(using = DependencyList.DependencyListSerializer.class)
@JsonDeserialize(using = DependencyList.DependencyListDeserializer.class)
public class DependencyList {
  /** Array of dependencies. */
  private Collection<Dependency> dependencies;

  public DependencyList setDependencies(Collection<Dependency> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<Dependency> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DependencyList that = (DependencyList) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(DependencyList.class).add("dependencies", dependencies).toString();
  }

  DependencyListPb toPb() {
    DependencyListPb pb = new DependencyListPb();
    pb.setDependencies(dependencies);

    return pb;
  }

  static DependencyList fromPb(DependencyListPb pb) {
    DependencyList model = new DependencyList();
    model.setDependencies(pb.getDependencies());

    return model;
  }

  public static class DependencyListSerializer extends JsonSerializer<DependencyList> {
    @Override
    public void serialize(DependencyList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DependencyListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DependencyListDeserializer extends JsonDeserializer<DependencyList> {
    @Override
    public DependencyList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DependencyListPb pb = mapper.readValue(p, DependencyListPb.class);
      return DependencyList.fromPb(pb);
    }
  }
}
