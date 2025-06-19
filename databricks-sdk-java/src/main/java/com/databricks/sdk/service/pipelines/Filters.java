// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = Filters.FiltersSerializer.class)
@JsonDeserialize(using = Filters.FiltersDeserializer.class)
public class Filters {
  /** Paths to exclude. */
  private Collection<String> exclude;

  /** Paths to include. */
  private Collection<String> include;

  public Filters setExclude(Collection<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public Collection<String> getExclude() {
    return exclude;
  }

  public Filters setInclude(Collection<String> include) {
    this.include = include;
    return this;
  }

  public Collection<String> getInclude() {
    return include;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filters that = (Filters) o;
    return Objects.equals(exclude, that.exclude) && Objects.equals(include, that.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include);
  }

  @Override
  public String toString() {
    return new ToStringer(Filters.class).add("exclude", exclude).add("include", include).toString();
  }

  FiltersPb toPb() {
    FiltersPb pb = new FiltersPb();
    pb.setExclude(exclude);
    pb.setInclude(include);

    return pb;
  }

  static Filters fromPb(FiltersPb pb) {
    Filters model = new Filters();
    model.setExclude(pb.getExclude());
    model.setInclude(pb.getInclude());

    return model;
  }

  public static class FiltersSerializer extends JsonSerializer<Filters> {
    @Override
    public void serialize(Filters value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FiltersPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FiltersDeserializer extends JsonDeserializer<Filters> {
    @Override
    public Filters deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FiltersPb pb = mapper.readValue(p, FiltersPb.class);
      return Filters.fromPb(pb);
    }
  }
}
