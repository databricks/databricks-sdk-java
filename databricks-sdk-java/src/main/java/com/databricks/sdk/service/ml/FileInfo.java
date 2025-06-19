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

/** Metadata of a single artifact file or directory. */
@Generated
@JsonSerialize(using = FileInfo.FileInfoSerializer.class)
@JsonDeserialize(using = FileInfo.FileInfoDeserializer.class)
public class FileInfo {
  /** The size in bytes of the file. Unset for directories. */
  private Long fileSize;

  /** Whether the path is a directory. */
  private Boolean isDir;

  /** The path relative to the root artifact directory run. */
  private String path;

  public FileInfo setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public FileInfo setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public FileInfo setPath(String path) {
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
    FileInfo that = (FileInfo) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDir, that.isDir)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfo.class)
        .add("fileSize", fileSize)
        .add("isDir", isDir)
        .add("path", path)
        .toString();
  }

  FileInfoPb toPb() {
    FileInfoPb pb = new FileInfoPb();
    pb.setFileSize(fileSize);
    pb.setIsDir(isDir);
    pb.setPath(path);

    return pb;
  }

  static FileInfo fromPb(FileInfoPb pb) {
    FileInfo model = new FileInfo();
    model.setFileSize(pb.getFileSize());
    model.setIsDir(pb.getIsDir());
    model.setPath(pb.getPath());

    return model;
  }

  public static class FileInfoSerializer extends JsonSerializer<FileInfo> {
    @Override
    public void serialize(FileInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileInfoDeserializer extends JsonDeserializer<FileInfo> {
    @Override
    public FileInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileInfoPb pb = mapper.readValue(p, FileInfoPb.class);
      return FileInfo.fromPb(pb);
    }
  }
}
