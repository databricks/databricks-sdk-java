// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
    using =
        GenieGenerateDownloadFullQueryResultResponse
            .GenieGenerateDownloadFullQueryResultResponseSerializer.class)
@JsonDeserialize(
    using =
        GenieGenerateDownloadFullQueryResultResponse
            .GenieGenerateDownloadFullQueryResultResponseDeserializer.class)
public class GenieGenerateDownloadFullQueryResultResponse {
  /** Download ID. Use this ID to track the download request in subsequent polling calls */
  private String downloadId;

  public GenieGenerateDownloadFullQueryResultResponse setDownloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }

  public String getDownloadId() {
    return downloadId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGenerateDownloadFullQueryResultResponse that =
        (GenieGenerateDownloadFullQueryResultResponse) o;
    return Objects.equals(downloadId, that.downloadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGenerateDownloadFullQueryResultResponse.class)
        .add("downloadId", downloadId)
        .toString();
  }

  GenieGenerateDownloadFullQueryResultResponsePb toPb() {
    GenieGenerateDownloadFullQueryResultResponsePb pb =
        new GenieGenerateDownloadFullQueryResultResponsePb();
    pb.setDownloadId(downloadId);

    return pb;
  }

  static GenieGenerateDownloadFullQueryResultResponse fromPb(
      GenieGenerateDownloadFullQueryResultResponsePb pb) {
    GenieGenerateDownloadFullQueryResultResponse model =
        new GenieGenerateDownloadFullQueryResultResponse();
    model.setDownloadId(pb.getDownloadId());

    return model;
  }

  public static class GenieGenerateDownloadFullQueryResultResponseSerializer
      extends JsonSerializer<GenieGenerateDownloadFullQueryResultResponse> {
    @Override
    public void serialize(
        GenieGenerateDownloadFullQueryResultResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenieGenerateDownloadFullQueryResultResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGenerateDownloadFullQueryResultResponseDeserializer
      extends JsonDeserializer<GenieGenerateDownloadFullQueryResultResponse> {
    @Override
    public GenieGenerateDownloadFullQueryResultResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGenerateDownloadFullQueryResultResponsePb pb =
          mapper.readValue(p, GenieGenerateDownloadFullQueryResultResponsePb.class);
      return GenieGenerateDownloadFullQueryResultResponse.fromPb(pb);
    }
  }
}
