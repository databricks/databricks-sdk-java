// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Delete a share recipient */
@Generated
@JsonSerialize(using = DeleteRecipientRequest.DeleteRecipientRequestSerializer.class)
@JsonDeserialize(using = DeleteRecipientRequest.DeleteRecipientRequestDeserializer.class)
public class DeleteRecipientRequest {
  /** Name of the recipient. */
  private String name;

  public DeleteRecipientRequest setName(String name) {
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
    DeleteRecipientRequest that = (DeleteRecipientRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRecipientRequest.class).add("name", name).toString();
  }

  DeleteRecipientRequestPb toPb() {
    DeleteRecipientRequestPb pb = new DeleteRecipientRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteRecipientRequest fromPb(DeleteRecipientRequestPb pb) {
    DeleteRecipientRequest model = new DeleteRecipientRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteRecipientRequestSerializer
      extends JsonSerializer<DeleteRecipientRequest> {
    @Override
    public void serialize(
        DeleteRecipientRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRecipientRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRecipientRequestDeserializer
      extends JsonDeserializer<DeleteRecipientRequest> {
    @Override
    public DeleteRecipientRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRecipientRequestPb pb = mapper.readValue(p, DeleteRecipientRequestPb.class);
      return DeleteRecipientRequest.fromPb(pb);
    }
  }
}
