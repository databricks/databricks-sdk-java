// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(
    using = GetModelVersionDownloadUriResponse.GetModelVersionDownloadUriResponseSerializer.class)
@JsonDeserialize(
    using = GetModelVersionDownloadUriResponse.GetModelVersionDownloadUriResponseDeserializer.class)
public class GetModelVersionDownloadUriResponse {
  /** URI corresponding to where artifacts for this model version are stored. */
  private String artifactUri;

  public GetModelVersionDownloadUriResponse setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriResponse that = (GetModelVersionDownloadUriResponse) o;
    return Objects.equals(artifactUri, that.artifactUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactUri);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriResponse.class)
        .add("artifactUri", artifactUri)
        .toString();
  }

  GetModelVersionDownloadUriResponsePb toPb() {
    GetModelVersionDownloadUriResponsePb pb = new GetModelVersionDownloadUriResponsePb();
    pb.setArtifactUri(artifactUri);

    return pb;
  }

  static GetModelVersionDownloadUriResponse fromPb(GetModelVersionDownloadUriResponsePb pb) {
    GetModelVersionDownloadUriResponse model = new GetModelVersionDownloadUriResponse();
    model.setArtifactUri(pb.getArtifactUri());

    return model;
  }

  public static class GetModelVersionDownloadUriResponseSerializer
      extends JsonSerializer<GetModelVersionDownloadUriResponse> {
    @Override
    public void serialize(
        GetModelVersionDownloadUriResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelVersionDownloadUriResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelVersionDownloadUriResponseDeserializer
      extends JsonDeserializer<GetModelVersionDownloadUriResponse> {
    @Override
    public GetModelVersionDownloadUriResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelVersionDownloadUriResponsePb pb =
          mapper.readValue(p, GetModelVersionDownloadUriResponsePb.class);
      return GetModelVersionDownloadUriResponse.fromPb(pb);
    }
  }
}
