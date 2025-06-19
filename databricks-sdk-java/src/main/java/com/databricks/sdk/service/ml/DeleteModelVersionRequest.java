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

/** Delete a model version. */
@Generated
@JsonSerialize(using = DeleteModelVersionRequest.DeleteModelVersionRequestSerializer.class)
@JsonDeserialize(using = DeleteModelVersionRequest.DeleteModelVersionRequestDeserializer.class)
public class DeleteModelVersionRequest {
  /** Name of the registered model */
  private String name;

  /** Model version number */
  private String version;

  public DeleteModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteModelVersionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelVersionRequest that = (DeleteModelVersionRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  DeleteModelVersionRequestPb toPb() {
    DeleteModelVersionRequestPb pb = new DeleteModelVersionRequestPb();
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static DeleteModelVersionRequest fromPb(DeleteModelVersionRequestPb pb) {
    DeleteModelVersionRequest model = new DeleteModelVersionRequest();
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class DeleteModelVersionRequestSerializer
      extends JsonSerializer<DeleteModelVersionRequest> {
    @Override
    public void serialize(
        DeleteModelVersionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelVersionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelVersionRequestDeserializer
      extends JsonDeserializer<DeleteModelVersionRequest> {
    @Override
    public DeleteModelVersionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelVersionRequestPb pb = mapper.readValue(p, DeleteModelVersionRequestPb.class);
      return DeleteModelVersionRequest.fromPb(pb);
    }
  }
}
