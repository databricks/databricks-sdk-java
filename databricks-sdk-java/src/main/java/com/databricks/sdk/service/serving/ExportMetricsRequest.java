// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Get metrics of a serving endpoint */
@Generated
@JsonSerialize(using = ExportMetricsRequest.ExportMetricsRequestSerializer.class)
@JsonDeserialize(using = ExportMetricsRequest.ExportMetricsRequestDeserializer.class)
public class ExportMetricsRequest {
  /** The name of the serving endpoint to retrieve metrics for. This field is required. */
  private String name;

  public ExportMetricsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportMetricsRequest that = (ExportMetricsRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportMetricsRequest.class).add("name", name).toString();
  }

  ExportMetricsRequestPb toPb() {
    ExportMetricsRequestPb pb = new ExportMetricsRequestPb();
    pb.setName(name);

    return pb;
  }

  static ExportMetricsRequest fromPb(ExportMetricsRequestPb pb) {
    ExportMetricsRequest model = new ExportMetricsRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class ExportMetricsRequestSerializer extends JsonSerializer<ExportMetricsRequest> {
    @Override
    public void serialize(
        ExportMetricsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportMetricsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportMetricsRequestDeserializer
      extends JsonDeserializer<ExportMetricsRequest> {
    @Override
    public ExportMetricsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportMetricsRequestPb pb = mapper.readValue(p, ExportMetricsRequestPb.class);
      return ExportMetricsRequest.fromPb(pb);
    }
  }
}
