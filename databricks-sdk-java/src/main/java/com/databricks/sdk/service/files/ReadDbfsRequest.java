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

/** Get the contents of a file */
@Generated
@JsonSerialize(using = ReadDbfsRequest.ReadDbfsRequestSerializer.class)
@JsonDeserialize(using = ReadDbfsRequest.ReadDbfsRequestDeserializer.class)
public class ReadDbfsRequest {
  /**
   * The number of bytes to read starting from the offset. This has a limit of 1 MB, and a default
   * value of 0.5 MB.
   */
  private Long length;

  /** The offset to read from in bytes. */
  private Long offset;

  /** The path of the file to read. The path should be the absolute DBFS path. */
  private String path;

  public ReadDbfsRequest setLength(Long length) {
    this.length = length;
    return this;
  }

  public Long getLength() {
    return length;
  }

  public ReadDbfsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ReadDbfsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadDbfsRequest that = (ReadDbfsRequest) o;
    return Objects.equals(length, that.length)
        && Objects.equals(offset, that.offset)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, offset, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadDbfsRequest.class)
        .add("length", length)
        .add("offset", offset)
        .add("path", path)
        .toString();
  }

  ReadDbfsRequestPb toPb() {
    ReadDbfsRequestPb pb = new ReadDbfsRequestPb();
    pb.setLength(length);
    pb.setOffset(offset);
    pb.setPath(path);

    return pb;
  }

  static ReadDbfsRequest fromPb(ReadDbfsRequestPb pb) {
    ReadDbfsRequest model = new ReadDbfsRequest();
    model.setLength(pb.getLength());
    model.setOffset(pb.getOffset());
    model.setPath(pb.getPath());

    return model;
  }

  public static class ReadDbfsRequestSerializer extends JsonSerializer<ReadDbfsRequest> {
    @Override
    public void serialize(ReadDbfsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ReadDbfsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ReadDbfsRequestDeserializer extends JsonDeserializer<ReadDbfsRequest> {
    @Override
    public ReadDbfsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ReadDbfsRequestPb pb = mapper.readValue(p, ReadDbfsRequestPb.class);
      return ReadDbfsRequest.fromPb(pb);
    }
  }
}
