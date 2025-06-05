// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Delete a notification destination */
@Generated
@JsonSerialize(
    using =
        DeleteNotificationDestinationRequest.DeleteNotificationDestinationRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteNotificationDestinationRequest.DeleteNotificationDestinationRequestDeserializer.class)
public class DeleteNotificationDestinationRequest {
  /** */
  private String id;

  public DeleteNotificationDestinationRequest setId(String id) {
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
    DeleteNotificationDestinationRequest that = (DeleteNotificationDestinationRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNotificationDestinationRequest.class).add("id", id).toString();
  }

  DeleteNotificationDestinationRequestPb toPb() {
    DeleteNotificationDestinationRequestPb pb = new DeleteNotificationDestinationRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteNotificationDestinationRequest fromPb(DeleteNotificationDestinationRequestPb pb) {
    DeleteNotificationDestinationRequest model = new DeleteNotificationDestinationRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteNotificationDestinationRequestSerializer
      extends JsonSerializer<DeleteNotificationDestinationRequest> {
    @Override
    public void serialize(
        DeleteNotificationDestinationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteNotificationDestinationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNotificationDestinationRequestDeserializer
      extends JsonDeserializer<DeleteNotificationDestinationRequest> {
    @Override
    public DeleteNotificationDestinationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNotificationDestinationRequestPb pb =
          mapper.readValue(p, DeleteNotificationDestinationRequestPb.class);
      return DeleteNotificationDestinationRequest.fromPb(pb);
    }
  }
}
