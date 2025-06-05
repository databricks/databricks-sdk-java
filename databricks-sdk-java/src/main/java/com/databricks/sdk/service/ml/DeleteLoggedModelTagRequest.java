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

/** Delete a tag on a logged model */
@Generated
@JsonSerialize(using = DeleteLoggedModelTagRequest.DeleteLoggedModelTagRequestSerializer.class)
@JsonDeserialize(using = DeleteLoggedModelTagRequest.DeleteLoggedModelTagRequestDeserializer.class)
public class DeleteLoggedModelTagRequest {
  /** The ID of the logged model to delete the tag from. */
  private String modelId;

  /** The tag key. */
  private String tagKey;

  public DeleteLoggedModelTagRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public DeleteLoggedModelTagRequest setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteLoggedModelTagRequest that = (DeleteLoggedModelTagRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteLoggedModelTagRequest.class)
        .add("modelId", modelId)
        .add("tagKey", tagKey)
        .toString();
  }

  DeleteLoggedModelTagRequestPb toPb() {
    DeleteLoggedModelTagRequestPb pb = new DeleteLoggedModelTagRequestPb();
    pb.setModelId(modelId);
    pb.setTagKey(tagKey);

    return pb;
  }

  static DeleteLoggedModelTagRequest fromPb(DeleteLoggedModelTagRequestPb pb) {
    DeleteLoggedModelTagRequest model = new DeleteLoggedModelTagRequest();
    model.setModelId(pb.getModelId());
    model.setTagKey(pb.getTagKey());

    return model;
  }

  public static class DeleteLoggedModelTagRequestSerializer
      extends JsonSerializer<DeleteLoggedModelTagRequest> {
    @Override
    public void serialize(
        DeleteLoggedModelTagRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteLoggedModelTagRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteLoggedModelTagRequestDeserializer
      extends JsonDeserializer<DeleteLoggedModelTagRequest> {
    @Override
    public DeleteLoggedModelTagRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteLoggedModelTagRequestPb pb = mapper.readValue(p, DeleteLoggedModelTagRequestPb.class);
      return DeleteLoggedModelTagRequest.fromPb(pb);
    }
  }
}
