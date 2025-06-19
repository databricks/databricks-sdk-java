// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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

/** Download a file */
@Generated
@JsonSerialize(using = DownloadRequest.DownloadRequestSerializer.class)
@JsonDeserialize(using = DownloadRequest.DownloadRequestDeserializer.class)
public class DownloadRequest {
  /** The absolute path of the file. */
  private String filePath;

  public DownloadRequest setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadRequest that = (DownloadRequest) o;
    return Objects.equals(filePath, that.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadRequest.class).add("filePath", filePath).toString();
  }

  DownloadRequestPb toPb() {
    DownloadRequestPb pb = new DownloadRequestPb();
    pb.setFilePath(filePath);

    return pb;
  }

  static DownloadRequest fromPb(DownloadRequestPb pb) {
    DownloadRequest model = new DownloadRequest();
    model.setFilePath(pb.getFilePath());

    return model;
  }

  public static class DownloadRequestSerializer extends JsonSerializer<DownloadRequest> {
    @Override
    public void serialize(DownloadRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DownloadRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DownloadRequestDeserializer extends JsonDeserializer<DownloadRequest> {
    @Override
    public DownloadRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DownloadRequestPb pb = mapper.readValue(p, DownloadRequestPb.class);
      return DownloadRequest.fromPb(pb);
    }
  }
}
