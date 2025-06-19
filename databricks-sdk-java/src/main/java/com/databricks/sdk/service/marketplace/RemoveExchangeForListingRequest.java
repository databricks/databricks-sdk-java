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

/** Remove an exchange for listing */
@Generated
@JsonSerialize(
    using = RemoveExchangeForListingRequest.RemoveExchangeForListingRequestSerializer.class)
@JsonDeserialize(
    using = RemoveExchangeForListingRequest.RemoveExchangeForListingRequestDeserializer.class)
public class RemoveExchangeForListingRequest {
  /** */
  private String id;

  public RemoveExchangeForListingRequest setId(String id) {
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
    RemoveExchangeForListingRequest that = (RemoveExchangeForListingRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveExchangeForListingRequest.class).add("id", id).toString();
  }

  RemoveExchangeForListingRequestPb toPb() {
    RemoveExchangeForListingRequestPb pb = new RemoveExchangeForListingRequestPb();
    pb.setId(id);

    return pb;
  }

  static RemoveExchangeForListingRequest fromPb(RemoveExchangeForListingRequestPb pb) {
    RemoveExchangeForListingRequest model = new RemoveExchangeForListingRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class RemoveExchangeForListingRequestSerializer
      extends JsonSerializer<RemoveExchangeForListingRequest> {
    @Override
    public void serialize(
        RemoveExchangeForListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RemoveExchangeForListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RemoveExchangeForListingRequestDeserializer
      extends JsonDeserializer<RemoveExchangeForListingRequest> {
    @Override
    public RemoveExchangeForListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RemoveExchangeForListingRequestPb pb =
          mapper.readValue(p, RemoveExchangeForListingRequestPb.class);
      return RemoveExchangeForListingRequest.fromPb(pb);
    }
  }
}
