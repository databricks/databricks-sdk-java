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
import java.io.InputStream;
import java.util.Objects;

@Generated
@JsonSerialize(using = ExportMetricsResponse.ExportMetricsResponseSerializer.class)
@JsonDeserialize(using = ExportMetricsResponse.ExportMetricsResponseDeserializer.class)
public class ExportMetricsResponse {
  /** */
  private InputStream contents;

  public ExportMetricsResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportMetricsResponse that = (ExportMetricsResponse) o;
    return Objects.equals(contents, that.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportMetricsResponse.class).add("contents", contents).toString();
  }

  ExportMetricsResponsePb toPb() {
    ExportMetricsResponsePb pb = new ExportMetricsResponsePb();
    pb.setContents(contents);

    return pb;
  }

  static ExportMetricsResponse fromPb(ExportMetricsResponsePb pb) {
    ExportMetricsResponse model = new ExportMetricsResponse();
    model.setContents(pb.getContents());

    return model;
  }

  public static class ExportMetricsResponseSerializer
      extends JsonSerializer<ExportMetricsResponse> {
    @Override
    public void serialize(
        ExportMetricsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportMetricsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportMetricsResponseDeserializer
      extends JsonDeserializer<ExportMetricsResponse> {
    @Override
    public ExportMetricsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportMetricsResponsePb pb = mapper.readValue(p, ExportMetricsResponsePb.class);
      return ExportMetricsResponse.fromPb(pb);
    }
  }
}
