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

/** Delete a comment */
@Generated
@JsonSerialize(using = DeleteCommentRequest.DeleteCommentRequestSerializer.class)
@JsonDeserialize(using = DeleteCommentRequest.DeleteCommentRequestDeserializer.class)
public class DeleteCommentRequest {
  /** Unique identifier of an activity */
  private String id;

  public DeleteCommentRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCommentRequest that = (DeleteCommentRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCommentRequest.class).add("id", id).toString();
  }

  DeleteCommentRequestPb toPb() {
    DeleteCommentRequestPb pb = new DeleteCommentRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteCommentRequest fromPb(DeleteCommentRequestPb pb) {
    DeleteCommentRequest model = new DeleteCommentRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteCommentRequestSerializer extends JsonSerializer<DeleteCommentRequest> {
    @Override
    public void serialize(
        DeleteCommentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCommentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCommentRequestDeserializer
      extends JsonDeserializer<DeleteCommentRequest> {
    @Override
    public DeleteCommentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCommentRequestPb pb = mapper.readValue(p, DeleteCommentRequestPb.class);
      return DeleteCommentRequest.fromPb(pb);
    }
  }
}
