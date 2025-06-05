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
@JsonSerialize(using = DeleteAccountGroupRequest.DeleteAccountGroupRequestSerializer.class)
@JsonDeserialize(using = DeleteAccountGroupRequest.DeleteAccountGroupRequestDeserializer.class)
public class DeleteAccountGroupRequest {
  /** Unique ID for a group in the Databricks account. */
  private String id;

  public DeleteAccountGroupRequest setId(String id) {
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
    DeleteAccountGroupRequest that = (DeleteAccountGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountGroupRequest.class).add("id", id).toString();
  }

  DeleteAccountGroupRequestPb toPb() {
    DeleteAccountGroupRequestPb pb = new DeleteAccountGroupRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteAccountGroupRequest fromPb(DeleteAccountGroupRequestPb pb) {
    DeleteAccountGroupRequest model = new DeleteAccountGroupRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteAccountGroupRequestSerializer
      extends JsonSerializer<DeleteAccountGroupRequest> {
    @Override
    public void serialize(
        DeleteAccountGroupRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountGroupRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountGroupRequestDeserializer
      extends JsonDeserializer<DeleteAccountGroupRequest> {
    @Override
    public DeleteAccountGroupRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountGroupRequestPb pb = mapper.readValue(p, DeleteAccountGroupRequestPb.class);
      return DeleteAccountGroupRequest.fromPb(pb);
    }
  }
}
