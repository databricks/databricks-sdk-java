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

@Generated
@JsonSerialize(using = GetMetadataResponse.GetMetadataResponseSerializer.class)
@JsonDeserialize(using = GetMetadataResponse.GetMetadataResponseDeserializer.class)
public class GetMetadataResponse {
  /** The length of the HTTP response body in bytes. */
  private Long contentLength;

  /** */
  private String contentType;

  /** The last modified time of the file in HTTP-date (RFC 7231) format. */
  private String lastModified;

  public GetMetadataResponse setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public GetMetadataResponse setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public GetMetadataResponse setLastModified(String lastModified) {
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
    GetMetadataResponse that = (GetMetadataResponse) o;
    return Objects.equals(contentLength, that.contentLength)
        && Objects.equals(contentType, that.contentType)
        && Objects.equals(lastModified, that.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, lastModified);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetadataResponse.class)
        .add("contentLength", contentLength)
        .add("contentType", contentType)
        .add("lastModified", lastModified)
        .toString();
  }

  GetMetadataResponsePb toPb() {
    GetMetadataResponsePb pb = new GetMetadataResponsePb();
    pb.setContentLength(contentLength);
    pb.setContentType(contentType);
    pb.setLastModified(lastModified);

    return pb;
  }

  static GetMetadataResponse fromPb(GetMetadataResponsePb pb) {
    GetMetadataResponse model = new GetMetadataResponse();
    model.setContentLength(pb.getContentLength());
    model.setContentType(pb.getContentType());
    model.setLastModified(pb.getLastModified());

    return model;
  }

  public static class GetMetadataResponseSerializer extends JsonSerializer<GetMetadataResponse> {
    @Override
    public void serialize(GetMetadataResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetMetadataResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetMetadataResponseDeserializer
      extends JsonDeserializer<GetMetadataResponse> {
    @Override
    public GetMetadataResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetMetadataResponsePb pb = mapper.readValue(p, GetMetadataResponsePb.class);
      return GetMetadataResponse.fromPb(pb);
    }
  }
}
