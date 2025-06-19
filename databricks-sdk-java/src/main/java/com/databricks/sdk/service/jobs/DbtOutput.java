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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = DbtOutput.DbtOutputSerializer.class)
@JsonDeserialize(using = DbtOutput.DbtOutputDeserializer.class)
public class DbtOutput {
  /** An optional map of headers to send when retrieving the artifact from the `artifacts_link`. */
  private Map<String, String> artifactsHeaders;

  /**
   * A pre-signed URL to download the (compressed) dbt artifacts. This link is valid for a limited
   * time (30 minutes). This information is only available after the run has finished.
   */
  private String artifactsLink;

  public DbtOutput setArtifactsHeaders(Map<String, String> artifactsHeaders) {
    this.artifactsHeaders = artifactsHeaders;
    return this;
  }

  public Map<String, String> getArtifactsHeaders() {
    return artifactsHeaders;
  }

  public DbtOutput setArtifactsLink(String artifactsLink) {
    this.artifactsLink = artifactsLink;
    return this;
  }

  public String getArtifactsLink() {
    return artifactsLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtOutput that = (DbtOutput) o;
    return Objects.equals(artifactsHeaders, that.artifactsHeaders)
        && Objects.equals(artifactsLink, that.artifactsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactsHeaders, artifactsLink);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtOutput.class)
        .add("artifactsHeaders", artifactsHeaders)
        .add("artifactsLink", artifactsLink)
        .toString();
  }

  DbtOutputPb toPb() {
    DbtOutputPb pb = new DbtOutputPb();
    pb.setArtifactsHeaders(artifactsHeaders);
    pb.setArtifactsLink(artifactsLink);

    return pb;
  }

  static DbtOutput fromPb(DbtOutputPb pb) {
    DbtOutput model = new DbtOutput();
    model.setArtifactsHeaders(pb.getArtifactsHeaders());
    model.setArtifactsLink(pb.getArtifactsLink());

    return model;
  }

  public static class DbtOutputSerializer extends JsonSerializer<DbtOutput> {
    @Override
    public void serialize(DbtOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DbtOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DbtOutputDeserializer extends JsonDeserializer<DbtOutput> {
    @Override
    public DbtOutput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DbtOutputPb pb = mapper.readValue(p, DbtOutputPb.class);
      return DbtOutput.fromPb(pb);
    }
  }
}
