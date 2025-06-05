// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Get registered model permission levels */
@Generated
@JsonSerialize(
    using =
        GetRegisteredModelPermissionLevelsRequest
            .GetRegisteredModelPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetRegisteredModelPermissionLevelsRequest
            .GetRegisteredModelPermissionLevelsRequestDeserializer.class)
public class GetRegisteredModelPermissionLevelsRequest {
  /** The registered model for which to get or manage permissions. */
  private String registeredModelId;

  public GetRegisteredModelPermissionLevelsRequest setRegisteredModelId(String registeredModelId) {
    this.registeredModelId = registeredModelId;
    return this;
  }

  public String getRegisteredModelId() {
    return registeredModelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRegisteredModelPermissionLevelsRequest that = (GetRegisteredModelPermissionLevelsRequest) o;
    return Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelPermissionLevelsRequest.class)
        .add("registeredModelId", registeredModelId)
        .toString();
  }

  GetRegisteredModelPermissionLevelsRequestPb toPb() {
    GetRegisteredModelPermissionLevelsRequestPb pb =
        new GetRegisteredModelPermissionLevelsRequestPb();
    pb.setRegisteredModelId(registeredModelId);

    return pb;
  }

  static GetRegisteredModelPermissionLevelsRequest fromPb(
      GetRegisteredModelPermissionLevelsRequestPb pb) {
    GetRegisteredModelPermissionLevelsRequest model =
        new GetRegisteredModelPermissionLevelsRequest();
    model.setRegisteredModelId(pb.getRegisteredModelId());

    return model;
  }

  public static class GetRegisteredModelPermissionLevelsRequestSerializer
      extends JsonSerializer<GetRegisteredModelPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetRegisteredModelPermissionLevelsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetRegisteredModelPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRegisteredModelPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetRegisteredModelPermissionLevelsRequest> {
    @Override
    public GetRegisteredModelPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRegisteredModelPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetRegisteredModelPermissionLevelsRequestPb.class);
      return GetRegisteredModelPermissionLevelsRequest.fromPb(pb);
    }
  }
}
