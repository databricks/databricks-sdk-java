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
import java.io.InputStream;
import java.util.Objects;

@Generated
@JsonSerialize(using = DownloadResponse.DownloadResponseSerializer.class)
@JsonDeserialize(using = DownloadResponse.DownloadResponseDeserializer.class)
public class DownloadResponse {
  /** The length of the HTTP response body in bytes. */
  private Long contentLength;

  /** */
  private String contentType;

  /** */
  private InputStream contents;

  /** The last modified time of the file in HTTP-date (RFC 7231) format. */
  private String lastModified;

  public DownloadResponse setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public DownloadResponse setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public DownloadResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public DownloadResponse setLastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public String getLastModified() {
    return lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadResponse that = (DownloadResponse) o;
    return Objects.equals(contentLength, that.contentLength)
        && Objects.equals(contentType, that.contentType)
        && Objects.equals(contents, that.contents)
        && Objects.equals(lastModified, that.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, contents, lastModified);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadResponse.class)
        .add("contentLength", contentLength)
        .add("contentType", contentType)
        .add("contents", contents)
        .add("lastModified", lastModified)
        .toString();
  }

  DownloadResponsePb toPb() {
    DownloadResponsePb pb = new DownloadResponsePb();
    pb.setContentLength(contentLength);
    pb.setContentType(contentType);
    pb.setContents(contents);
    pb.setLastModified(lastModified);

    return pb;
  }

  static DownloadResponse fromPb(DownloadResponsePb pb) {
    DownloadResponse model = new DownloadResponse();
    model.setContentLength(pb.getContentLength());
    model.setContentType(pb.getContentType());
    model.setContents(pb.getContents());
    model.setLastModified(pb.getLastModified());

    return model;
  }

  public static class DownloadResponseSerializer extends JsonSerializer<DownloadResponse> {
    @Override
    public void serialize(DownloadResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DownloadResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DownloadResponseDeserializer extends JsonDeserializer<DownloadResponse> {
    @Override
    public DownloadResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DownloadResponsePb pb = mapper.readValue(p, DownloadResponsePb.class);
      return DownloadResponse.fromPb(pb);
    }
  }
}
