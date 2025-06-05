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

/** Create a directory */
@Generated
@JsonSerialize(using = CreateDirectoryRequest.CreateDirectoryRequestSerializer.class)
@JsonDeserialize(using = CreateDirectoryRequest.CreateDirectoryRequestDeserializer.class)
public class CreateDirectoryRequest {
  /** The absolute path of a directory. */
  private String directoryPath;

  public CreateDirectoryRequest setDirectoryPath(String directoryPath) {
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
    CreateDirectoryRequest that = (CreateDirectoryRequest) o;
    return Objects.equals(directoryPath, that.directoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDirectoryRequest.class)
        .add("directoryPath", directoryPath)
        .toString();
  }

  CreateDirectoryRequestPb toPb() {
    CreateDirectoryRequestPb pb = new CreateDirectoryRequestPb();
    pb.setDirectoryPath(directoryPath);

    return pb;
  }

  static CreateDirectoryRequest fromPb(CreateDirectoryRequestPb pb) {
    CreateDirectoryRequest model = new CreateDirectoryRequest();
    model.setDirectoryPath(pb.getDirectoryPath());

    return model;
  }

  public static class CreateDirectoryRequestSerializer
      extends JsonSerializer<CreateDirectoryRequest> {
    @Override
    public void serialize(
        CreateDirectoryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDirectoryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDirectoryRequestDeserializer
      extends JsonDeserializer<CreateDirectoryRequest> {
    @Override
    public CreateDirectoryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDirectoryRequestPb pb = mapper.readValue(p, CreateDirectoryRequestPb.class);
      return CreateDirectoryRequest.fromPb(pb);
    }
  }
}
