// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Delete a listing */
@Generated
@JsonSerialize(using = DeleteListingRequest.DeleteListingRequestSerializer.class)
@JsonDeserialize(using = DeleteListingRequest.DeleteListingRequestDeserializer.class)
public class DeleteListingRequest {
  /** */
  private String id;

  public DeleteListingRequest setId(String id) {
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
    DeleteListingRequest that = (DeleteListingRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteListingRequest.class).add("id", id).toString();
  }

  DeleteListingRequestPb toPb() {
    DeleteListingRequestPb pb = new DeleteListingRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteListingRequest fromPb(DeleteListingRequestPb pb) {
    DeleteListingRequest model = new DeleteListingRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteListingRequestSerializer extends JsonSerializer<DeleteListingRequest> {
    @Override
    public void serialize(
        DeleteListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteListingRequestDeserializer
      extends JsonDeserializer<DeleteListingRequest> {
    @Override
    public DeleteListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteListingRequestPb pb = mapper.readValue(p, DeleteListingRequestPb.class);
      return DeleteListingRequest.fromPb(pb);
    }
  }
}
