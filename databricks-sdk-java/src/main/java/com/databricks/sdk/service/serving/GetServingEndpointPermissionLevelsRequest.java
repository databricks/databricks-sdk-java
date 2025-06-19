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

/** Get serving endpoint permission levels */
@Generated
@JsonSerialize(
    using =
        GetServingEndpointPermissionLevelsRequest
            .GetServingEndpointPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetServingEndpointPermissionLevelsRequest
            .GetServingEndpointPermissionLevelsRequestDeserializer.class)
public class GetServingEndpointPermissionLevelsRequest {
  /** The serving endpoint for which to get or manage permissions. */
  private String servingEndpointId;

  public GetServingEndpointPermissionLevelsRequest setServingEndpointId(String servingEndpointId) {
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
    GetServingEndpointPermissionLevelsRequest that = (GetServingEndpointPermissionLevelsRequest) o;
    return Objects.equals(servingEndpointId, that.servingEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServingEndpointPermissionLevelsRequest.class)
        .add("servingEndpointId", servingEndpointId)
        .toString();
  }

  GetServingEndpointPermissionLevelsRequestPb toPb() {
    GetServingEndpointPermissionLevelsRequestPb pb =
        new GetServingEndpointPermissionLevelsRequestPb();
    pb.setServingEndpointId(servingEndpointId);

    return pb;
  }

  static GetServingEndpointPermissionLevelsRequest fromPb(
      GetServingEndpointPermissionLevelsRequestPb pb) {
    GetServingEndpointPermissionLevelsRequest model =
        new GetServingEndpointPermissionLevelsRequest();
    model.setServingEndpointId(pb.getServingEndpointId());

    return model;
  }

  public static class GetServingEndpointPermissionLevelsRequestSerializer
      extends JsonSerializer<GetServingEndpointPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetServingEndpointPermissionLevelsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetServingEndpointPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServingEndpointPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetServingEndpointPermissionLevelsRequest> {
    @Override
    public GetServingEndpointPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServingEndpointPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetServingEndpointPermissionLevelsRequestPb.class);
      return GetServingEndpointPermissionLevelsRequest.fromPb(pb);
    }
  }
}
