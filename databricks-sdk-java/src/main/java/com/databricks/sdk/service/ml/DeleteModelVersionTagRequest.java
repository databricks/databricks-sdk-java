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

/** Delete a model version tag */
@Generated
@JsonSerialize(using = DeleteModelVersionTagRequest.DeleteModelVersionTagRequestSerializer.class)
@JsonDeserialize(
    using = DeleteModelVersionTagRequest.DeleteModelVersionTagRequestDeserializer.class)
public class DeleteModelVersionTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  private String key;

  /** Name of the registered model that the tag was logged under. */
  private String name;

  /** Model version number that the tag was logged under. */
  private String version;

  public DeleteModelVersionTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteModelVersionTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteModelVersionTagRequest setVersion(String version) {
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
    DeleteModelVersionTagRequest that = (DeleteModelVersionTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  DeleteModelVersionTagRequestPb toPb() {
    DeleteModelVersionTagRequestPb pb = new DeleteModelVersionTagRequestPb();
    pb.setKey(key);
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static DeleteModelVersionTagRequest fromPb(DeleteModelVersionTagRequestPb pb) {
    DeleteModelVersionTagRequest model = new DeleteModelVersionTagRequest();
    model.setKey(pb.getKey());
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class DeleteModelVersionTagRequestSerializer
      extends JsonSerializer<DeleteModelVersionTagRequest> {
    @Override
    public void serialize(
        DeleteModelVersionTagRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelVersionTagRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelVersionTagRequestDeserializer
      extends JsonDeserializer<DeleteModelVersionTagRequest> {
    @Override
    public DeleteModelVersionTagRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelVersionTagRequestPb pb = mapper.readValue(p, DeleteModelVersionTagRequestPb.class);
      return DeleteModelVersionTagRequest.fromPb(pb);
    }
  }
}
