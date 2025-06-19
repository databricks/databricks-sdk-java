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

/** Upload a file */
@Generated
@JsonSerialize(using = UploadRequest.UploadRequestSerializer.class)
@JsonDeserialize(using = UploadRequest.UploadRequestDeserializer.class)
public class UploadRequest {
  /** */
  private InputStream contents;

  /** The absolute path of the file. */
  private String filePath;

  /**
   * If true or unspecified, an existing file will be overwritten. If false, an error will be
   * returned if the path points to an existing file.
   */
  private Boolean overwrite;

  public UploadRequest setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public UploadRequest setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public UploadRequest setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UploadRequest that = (UploadRequest) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(filePath, that.filePath)
        && Objects.equals(overwrite, that.overwrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, filePath, overwrite);
  }

  @Override
  public String toString() {
    return new ToStringer(UploadRequest.class)
        .add("contents", contents)
        .add("filePath", filePath)
        .add("overwrite", overwrite)
        .toString();
  }

  UploadRequestPb toPb() {
    UploadRequestPb pb = new UploadRequestPb();
    pb.setContents(contents);
    pb.setFilePath(filePath);
    pb.setOverwrite(overwrite);

    return pb;
  }

  static UploadRequest fromPb(UploadRequestPb pb) {
    UploadRequest model = new UploadRequest();
    model.setContents(pb.getContents());
    model.setFilePath(pb.getFilePath());
    model.setOverwrite(pb.getOverwrite());

    return model;
  }

  public static class UploadRequestSerializer extends JsonSerializer<UploadRequest> {
    @Override
    public void serialize(UploadRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UploadRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UploadRequestDeserializer extends JsonDeserializer<UploadRequest> {
    @Override
    public UploadRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UploadRequestPb pb = mapper.readValue(p, UploadRequestPb.class);
      return UploadRequest.fromPb(pb);
    }
  }
}
