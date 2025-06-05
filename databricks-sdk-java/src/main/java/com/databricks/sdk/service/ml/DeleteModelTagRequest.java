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

/** Delete a model tag */
@Generated
@JsonSerialize(using = DeleteModelTagRequest.DeleteModelTagRequestSerializer.class)
@JsonDeserialize(using = DeleteModelTagRequest.DeleteModelTagRequestDeserializer.class)
public class DeleteModelTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  private String key;

  /** Name of the registered model that the tag was logged under. */
  private String name;

  public DeleteModelTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteModelTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelTagRequest that = (DeleteModelTagRequest) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelTagRequest.class).add("key", key).add("name", name).toString();
  }

  DeleteModelTagRequestPb toPb() {
    DeleteModelTagRequestPb pb = new DeleteModelTagRequestPb();
    pb.setKey(key);
    pb.setName(name);

    return pb;
  }

  static DeleteModelTagRequest fromPb(DeleteModelTagRequestPb pb) {
    DeleteModelTagRequest model = new DeleteModelTagRequest();
    model.setKey(pb.getKey());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteModelTagRequestSerializer
      extends JsonSerializer<DeleteModelTagRequest> {
    @Override
    public void serialize(
        DeleteModelTagRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelTagRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelTagRequestDeserializer
      extends JsonDeserializer<DeleteModelTagRequest> {
    @Override
    public DeleteModelTagRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelTagRequestPb pb = mapper.readValue(p, DeleteModelTagRequestPb.class);
      return DeleteModelTagRequest.fromPb(pb);
    }
  }
}
