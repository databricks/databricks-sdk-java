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

/** Delete a user. */
@Generated
@JsonSerialize(using = DeleteUserRequest.DeleteUserRequestSerializer.class)
@JsonDeserialize(using = DeleteUserRequest.DeleteUserRequestDeserializer.class)
public class DeleteUserRequest {
  /** Unique ID for a user in the Databricks workspace. */
  private String id;

  public DeleteUserRequest setId(String id) {
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
    DeleteUserRequest that = (DeleteUserRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteUserRequest.class).add("id", id).toString();
  }

  DeleteUserRequestPb toPb() {
    DeleteUserRequestPb pb = new DeleteUserRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteUserRequest fromPb(DeleteUserRequestPb pb) {
    DeleteUserRequest model = new DeleteUserRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteUserRequestSerializer extends JsonSerializer<DeleteUserRequest> {
    @Override
    public void serialize(DeleteUserRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteUserRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteUserRequestDeserializer extends JsonDeserializer<DeleteUserRequest> {
    @Override
    public DeleteUserRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteUserRequestPb pb = mapper.readValue(p, DeleteUserRequestPb.class);
      return DeleteUserRequest.fromPb(pb);
    }
  }
}
