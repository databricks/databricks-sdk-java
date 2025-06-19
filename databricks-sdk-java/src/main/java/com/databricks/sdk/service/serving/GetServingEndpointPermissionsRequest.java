// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Get serving endpoint permissions */
@Generated
@JsonSerialize(
    using =
        GetServingEndpointPermissionsRequest.GetServingEndpointPermissionsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetServingEndpointPermissionsRequest.GetServingEndpointPermissionsRequestDeserializer.class)
public class GetServingEndpointPermissionsRequest {
  /** The serving endpoint for which to get or manage permissions. */
  private String servingEndpointId;

  public GetServingEndpointPermissionsRequest setServingEndpointId(String servingEndpointId) {
    this.servingEndpointId = servingEndpointId;
    return this;
  }

  public String getServingEndpointId() {
    return servingEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetServingEndpointPermissionsRequest that = (GetServingEndpointPermissionsRequest) o;
    return Objects.equals(servingEndpointId, that.servingEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServingEndpointPermissionsRequest.class)
        .add("servingEndpointId", servingEndpointId)
        .toString();
  }

  GetServingEndpointPermissionsRequestPb toPb() {
    GetServingEndpointPermissionsRequestPb pb = new GetServingEndpointPermissionsRequestPb();
    pb.setServingEndpointId(servingEndpointId);

    return pb;
  }

  static GetServingEndpointPermissionsRequest fromPb(GetServingEndpointPermissionsRequestPb pb) {
    GetServingEndpointPermissionsRequest model = new GetServingEndpointPermissionsRequest();
    model.setServingEndpointId(pb.getServingEndpointId());

    return model;
  }

  public static class GetServingEndpointPermissionsRequestSerializer
      extends JsonSerializer<GetServingEndpointPermissionsRequest> {
    @Override
    public void serialize(
        GetServingEndpointPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetServingEndpointPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServingEndpointPermissionsRequestDeserializer
      extends JsonDeserializer<GetServingEndpointPermissionsRequest> {
    @Override
    public GetServingEndpointPermissionsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServingEndpointPermissionsRequestPb pb =
          mapper.readValue(p, GetServingEndpointPermissionsRequestPb.class);
      return GetServingEndpointPermissionsRequest.fromPb(pb);
    }
  }
}
