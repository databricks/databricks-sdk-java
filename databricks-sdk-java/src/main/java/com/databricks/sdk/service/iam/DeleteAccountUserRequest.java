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
@JsonSerialize(using = DeleteAccountUserRequest.DeleteAccountUserRequestSerializer.class)
@JsonDeserialize(using = DeleteAccountUserRequest.DeleteAccountUserRequestDeserializer.class)
public class DeleteAccountUserRequest {
  /** Unique ID for a user in the Databricks account. */
  private String id;

  public DeleteAccountUserRequest setId(String id) {
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
    DeleteAccountUserRequest that = (DeleteAccountUserRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountUserRequest.class).add("id", id).toString();
  }

  DeleteAccountUserRequestPb toPb() {
    DeleteAccountUserRequestPb pb = new DeleteAccountUserRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteAccountUserRequest fromPb(DeleteAccountUserRequestPb pb) {
    DeleteAccountUserRequest model = new DeleteAccountUserRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteAccountUserRequestSerializer
      extends JsonSerializer<DeleteAccountUserRequest> {
    @Override
    public void serialize(
        DeleteAccountUserRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountUserRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountUserRequestDeserializer
      extends JsonDeserializer<DeleteAccountUserRequest> {
    @Override
    public DeleteAccountUserRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountUserRequestPb pb = mapper.readValue(p, DeleteAccountUserRequestPb.class);
      return DeleteAccountUserRequest.fromPb(pb);
    }
  }
}
