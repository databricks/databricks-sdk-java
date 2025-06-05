// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Delete a group. */
@Generated
@JsonSerialize(using = DeleteGroupRequest.DeleteGroupRequestSerializer.class)
@JsonDeserialize(using = DeleteGroupRequest.DeleteGroupRequestDeserializer.class)
public class DeleteGroupRequest {
  /** Unique ID for a group in the Databricks workspace. */
  private String id;

  public DeleteGroupRequest setId(String id) {
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
    DeleteGroupRequest that = (DeleteGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteGroupRequest.class).add("id", id).toString();
  }

  DeleteGroupRequestPb toPb() {
    DeleteGroupRequestPb pb = new DeleteGroupRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteGroupRequest fromPb(DeleteGroupRequestPb pb) {
    DeleteGroupRequest model = new DeleteGroupRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteGroupRequestSerializer extends JsonSerializer<DeleteGroupRequest> {
    @Override
    public void serialize(DeleteGroupRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteGroupRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteGroupRequestDeserializer extends JsonDeserializer<DeleteGroupRequest> {
    @Override
    public DeleteGroupRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteGroupRequestPb pb = mapper.readValue(p, DeleteGroupRequestPb.class);
      return DeleteGroupRequest.fromPb(pb);
    }
  }
}
