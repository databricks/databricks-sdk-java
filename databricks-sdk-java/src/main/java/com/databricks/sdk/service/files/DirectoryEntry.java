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
@JsonSerialize(using = DirectoryEntry.DirectoryEntrySerializer.class)
@JsonDeserialize(using = DirectoryEntry.DirectoryEntryDeserializer.class)
public class DirectoryEntry {
  /** The length of the file in bytes. This field is omitted for directories. */
  private Long fileSize;

  /** True if the path is a directory. */
  private Boolean isDirectory;

  /** Last modification time of given file in milliseconds since unix epoch. */
  private Long lastModified;

  /** The name of the file or directory. This is the last component of the path. */
  private String name;

  /** The absolute path of the file or directory. */
  private String path;

  public DirectoryEntry setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public DirectoryEntry setIsDirectory(Boolean isDirectory) {
    this.isDirectory = isDirectory;
    return this;
  }

  public Boolean getIsDirectory() {
    return isDirectory;
  }

  public DirectoryEntry setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public DirectoryEntry setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DirectoryEntry setPath(String path) {
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
    DirectoryEntry that = (DirectoryEntry) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDirectory, that.isDirectory)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(name, that.name)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDirectory, lastModified, name, path);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectoryEntry.class)
        .add("fileSize", fileSize)
        .add("isDirectory", isDirectory)
        .add("lastModified", lastModified)
        .add("name", name)
        .add("path", path)
        .toString();
  }

  DirectoryEntryPb toPb() {
    DirectoryEntryPb pb = new DirectoryEntryPb();
    pb.setFileSize(fileSize);
    pb.setIsDirectory(isDirectory);
    pb.setLastModified(lastModified);
    pb.setName(name);
    pb.setPath(path);

    return pb;
  }

  static DirectoryEntry fromPb(DirectoryEntryPb pb) {
    DirectoryEntry model = new DirectoryEntry();
    model.setFileSize(pb.getFileSize());
    model.setIsDirectory(pb.getIsDirectory());
    model.setLastModified(pb.getLastModified());
    model.setName(pb.getName());
    model.setPath(pb.getPath());

    return model;
  }

  public static class DirectoryEntrySerializer extends JsonSerializer<DirectoryEntry> {
    @Override
    public void serialize(DirectoryEntry value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DirectoryEntryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DirectoryEntryDeserializer extends JsonDeserializer<DirectoryEntry> {
    @Override
    public DirectoryEntry deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DirectoryEntryPb pb = mapper.readValue(p, DirectoryEntryPb.class);
      return DirectoryEntry.fromPb(pb);
    }
  }
}
