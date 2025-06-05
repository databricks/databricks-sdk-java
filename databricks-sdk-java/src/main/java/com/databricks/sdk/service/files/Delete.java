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
@JsonSerialize(using = Delete.DeleteSerializer.class)
@JsonDeserialize(using = Delete.DeleteDeserializer.class)
public class Delete {
  /** The path of the file or directory to delete. The path should be the absolute DBFS path. */
  private String path;

  /**
   * Whether or not to recursively delete the directory's contents. Deleting empty directories can
   * be done without providing the recursive flag.
   */
  private Boolean recursive;

  public Delete setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Delete setRecursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

  public Boolean getRecursive() {
    return recursive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Delete that = (Delete) o;
    return Objects.equals(path, that.path) && Objects.equals(recursive, that.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, recursive);
  }

  @Override
  public String toString() {
    return new ToStringer(Delete.class).add("path", path).add("recursive", recursive).toString();
  }

  DeletePb toPb() {
    DeletePb pb = new DeletePb();
    pb.setPath(path);
    pb.setRecursive(recursive);

    return pb;
  }

  static Delete fromPb(DeletePb pb) {
    Delete model = new Delete();
    model.setPath(pb.getPath());
    model.setRecursive(pb.getRecursive());

    return model;
  }

  public static class DeleteSerializer extends JsonSerializer<Delete> {
    @Override
    public void serialize(Delete value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDeserializer extends JsonDeserializer<Delete> {
    @Override
    public Delete deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePb pb = mapper.readValue(p, DeletePb.class);
      return Delete.fromPb(pb);
    }
  }
}
