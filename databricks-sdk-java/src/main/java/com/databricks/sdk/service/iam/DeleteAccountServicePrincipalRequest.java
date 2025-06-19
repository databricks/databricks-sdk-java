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

/** Delete a service principal. */
@Generated
@JsonSerialize(
    using =
        DeleteAccountServicePrincipalRequest.DeleteAccountServicePrincipalRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteAccountServicePrincipalRequest.DeleteAccountServicePrincipalRequestDeserializer.class)
public class DeleteAccountServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks account. */
  private String id;

  public DeleteAccountServicePrincipalRequest setId(String id) {
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
    DeleteAccountServicePrincipalRequest that = (DeleteAccountServicePrincipalRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountServicePrincipalRequest.class).add("id", id).toString();
  }

  DeleteAccountServicePrincipalRequestPb toPb() {
    DeleteAccountServicePrincipalRequestPb pb = new DeleteAccountServicePrincipalRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteAccountServicePrincipalRequest fromPb(DeleteAccountServicePrincipalRequestPb pb) {
    DeleteAccountServicePrincipalRequest model = new DeleteAccountServicePrincipalRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteAccountServicePrincipalRequestSerializer
      extends JsonSerializer<DeleteAccountServicePrincipalRequest> {
    @Override
    public void serialize(
        DeleteAccountServicePrincipalRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountServicePrincipalRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountServicePrincipalRequestDeserializer
      extends JsonDeserializer<DeleteAccountServicePrincipalRequest> {
    @Override
    public DeleteAccountServicePrincipalRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountServicePrincipalRequestPb pb =
          mapper.readValue(p, DeleteAccountServicePrincipalRequestPb.class);
      return DeleteAccountServicePrincipalRequest.fromPb(pb);
    }
  }
}
