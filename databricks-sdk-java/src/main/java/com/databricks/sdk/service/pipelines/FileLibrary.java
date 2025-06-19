// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = FileLibrary.FileLibrarySerializer.class)
@JsonDeserialize(using = FileLibrary.FileLibraryDeserializer.class)
public class FileLibrary {
  /** The absolute path of the source code. */
  private String path;

  public FileLibrary setPath(String path) {
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
    FileLibrary that = (FileLibrary) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileLibrary.class).add("path", path).toString();
  }

  FileLibraryPb toPb() {
    FileLibraryPb pb = new FileLibraryPb();
    pb.setPath(path);

    return pb;
  }

  static FileLibrary fromPb(FileLibraryPb pb) {
    FileLibrary model = new FileLibrary();
    model.setPath(pb.getPath());

    return model;
  }

  public static class FileLibrarySerializer extends JsonSerializer<FileLibrary> {
    @Override
    public void serialize(FileLibrary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileLibraryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileLibraryDeserializer extends JsonDeserializer<FileLibrary> {
    @Override
    public FileLibrary deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileLibraryPb pb = mapper.readValue(p, FileLibraryPb.class);
      return FileLibrary.fromPb(pb);
    }
  }
}
