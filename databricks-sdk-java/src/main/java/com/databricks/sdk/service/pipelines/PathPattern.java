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
import java.util.Objects;

@Generated
@JsonSerialize(using = PathPattern.PathPatternSerializer.class)
@JsonDeserialize(using = PathPattern.PathPatternDeserializer.class)
public class PathPattern {
  /** The source code to include for pipelines */
  private String include;

  public PathPattern setInclude(String include) {
    this.include = include;
    return this;
  }

  public String getInclude() {
    return include;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PathPattern that = (PathPattern) o;
    return Objects.equals(include, that.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include);
  }

  @Override
  public String toString() {
    return new ToStringer(PathPattern.class).add("include", include).toString();
  }

  PathPatternPb toPb() {
    PathPatternPb pb = new PathPatternPb();
    pb.setInclude(include);

    return pb;
  }

  static PathPattern fromPb(PathPatternPb pb) {
    PathPattern model = new PathPattern();
    model.setInclude(pb.getInclude());

    return model;
  }

  public static class PathPatternSerializer extends JsonSerializer<PathPattern> {
    @Override
    public void serialize(PathPattern value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PathPatternPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PathPatternDeserializer extends JsonDeserializer<PathPattern> {
    @Override
    public PathPattern deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PathPatternPb pb = mapper.readValue(p, PathPatternPb.class);
      return PathPattern.fromPb(pb);
    }
  }
}
