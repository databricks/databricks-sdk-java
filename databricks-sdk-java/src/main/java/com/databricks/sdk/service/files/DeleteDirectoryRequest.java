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

/** Delete a directory */
@Generated
@JsonSerialize(using = DeleteDirectoryRequest.DeleteDirectoryRequestSerializer.class)
@JsonDeserialize(using = DeleteDirectoryRequest.DeleteDirectoryRequestDeserializer.class)
public class DeleteDirectoryRequest {
  /** The absolute path of a directory. */
  private String directoryPath;

  public DeleteDirectoryRequest setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
    return this;
  }

  public String getDirectoryPath() {
    return directoryPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDirectoryRequest that = (DeleteDirectoryRequest) o;
    return Objects.equals(directoryPath, that.directoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDirectoryRequest.class)
        .add("directoryPath", directoryPath)
        .toString();
  }

  DeleteDirectoryRequestPb toPb() {
    DeleteDirectoryRequestPb pb = new DeleteDirectoryRequestPb();
    pb.setDirectoryPath(directoryPath);

    return pb;
  }

  static DeleteDirectoryRequest fromPb(DeleteDirectoryRequestPb pb) {
    DeleteDirectoryRequest model = new DeleteDirectoryRequest();
    model.setDirectoryPath(pb.getDirectoryPath());

    return model;
  }

  public static class DeleteDirectoryRequestSerializer
      extends JsonSerializer<DeleteDirectoryRequest> {
    @Override
    public void serialize(
        DeleteDirectoryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDirectoryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDirectoryRequestDeserializer
      extends JsonDeserializer<DeleteDirectoryRequest> {
    @Override
    public DeleteDirectoryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDirectoryRequestPb pb = mapper.readValue(p, DeleteDirectoryRequestPb.class);
      return DeleteDirectoryRequest.fromPb(pb);
    }
  }
}
