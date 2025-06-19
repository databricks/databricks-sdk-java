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
@JsonSerialize(using = DeleteServicePrincipalRequest.DeleteServicePrincipalRequestSerializer.class)
@JsonDeserialize(
    using = DeleteServicePrincipalRequest.DeleteServicePrincipalRequestDeserializer.class)
public class DeleteServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks workspace. */
  private String id;

  public DeleteServicePrincipalRequest setId(String id) {
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
    DeleteServicePrincipalRequest that = (DeleteServicePrincipalRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalRequest.class).add("id", id).toString();
  }

  DeleteServicePrincipalRequestPb toPb() {
    DeleteServicePrincipalRequestPb pb = new DeleteServicePrincipalRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteServicePrincipalRequest fromPb(DeleteServicePrincipalRequestPb pb) {
    DeleteServicePrincipalRequest model = new DeleteServicePrincipalRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteServicePrincipalRequestSerializer
      extends JsonSerializer<DeleteServicePrincipalRequest> {
    @Override
    public void serialize(
        DeleteServicePrincipalRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteServicePrincipalRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteServicePrincipalRequestDeserializer
      extends JsonDeserializer<DeleteServicePrincipalRequest> {
    @Override
    public DeleteServicePrincipalRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteServicePrincipalRequestPb pb =
          mapper.readValue(p, DeleteServicePrincipalRequestPb.class);
      return DeleteServicePrincipalRequest.fromPb(pb);
    }
  }
}
