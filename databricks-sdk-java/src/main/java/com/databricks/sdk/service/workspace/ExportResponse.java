// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/**
 * The request field `direct_download` determines whether a JSON response or binary contents are
 * returned by this endpoint.
 */
@Generated
@JsonSerialize(using = ExportResponse.ExportResponseSerializer.class)
@JsonDeserialize(using = ExportResponse.ExportResponseDeserializer.class)
public class ExportResponse {
  /**
   * The base64-encoded content. If the limit (10MB) is exceeded, exception with error code
   * **MAX_NOTEBOOK_SIZE_EXCEEDED** is thrown.
   */
  private String content;

  /** The file type of the exported file. */
  private String fileType;

  public ExportResponse setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ExportResponse setFileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  public String getFileType() {
    return fileType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportResponse that = (ExportResponse) o;
    return Objects.equals(content, that.content) && Objects.equals(fileType, that.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, fileType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportResponse.class)
        .add("content", content)
        .add("fileType", fileType)
        .toString();
  }

  ExportResponsePb toPb() {
    ExportResponsePb pb = new ExportResponsePb();
    pb.setContent(content);
    pb.setFileType(fileType);

    return pb;
  }

  static ExportResponse fromPb(ExportResponsePb pb) {
    ExportResponse model = new ExportResponse();
    model.setContent(pb.getContent());
    model.setFileType(pb.getFileType());

    return model;
  }

  public static class ExportResponseSerializer extends JsonSerializer<ExportResponse> {
    @Override
    public void serialize(ExportResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportResponseDeserializer extends JsonDeserializer<ExportResponse> {
    @Override
    public ExportResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportResponsePb pb = mapper.readValue(p, ExportResponsePb.class);
      return ExportResponse.fromPb(pb);
    }
  }
}
