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

/** Get a notification destination */
@Generated
@JsonSerialize(
    using = GetNotificationDestinationRequest.GetNotificationDestinationRequestSerializer.class)
@JsonDeserialize(
    using = GetNotificationDestinationRequest.GetNotificationDestinationRequestDeserializer.class)
public class GetNotificationDestinationRequest {
  /** */
  private String id;

  public GetNotificationDestinationRequest setId(String id) {
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
    GetNotificationDestinationRequest that = (GetNotificationDestinationRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNotificationDestinationRequest.class).add("id", id).toString();
  }

  GetNotificationDestinationRequestPb toPb() {
    GetNotificationDestinationRequestPb pb = new GetNotificationDestinationRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetNotificationDestinationRequest fromPb(GetNotificationDestinationRequestPb pb) {
    GetNotificationDestinationRequest model = new GetNotificationDestinationRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetNotificationDestinationRequestSerializer
      extends JsonSerializer<GetNotificationDestinationRequest> {
    @Override
    public void serialize(
        GetNotificationDestinationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetNotificationDestinationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetNotificationDestinationRequestDeserializer
      extends JsonDeserializer<GetNotificationDestinationRequest> {
    @Override
    public GetNotificationDestinationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetNotificationDestinationRequestPb pb =
          mapper.readValue(p, GetNotificationDestinationRequestPb.class);
      return GetNotificationDestinationRequest.fromPb(pb);
    }
  }
}
