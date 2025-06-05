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

/** Get registered model permissions */
@Generated
@JsonSerialize(
    using =
        GetRegisteredModelPermissionsRequest.GetRegisteredModelPermissionsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetRegisteredModelPermissionsRequest.GetRegisteredModelPermissionsRequestDeserializer.class)
public class GetRegisteredModelPermissionsRequest {
  /** The registered model for which to get or manage permissions. */
  private String registeredModelId;

  public GetRegisteredModelPermissionsRequest setRegisteredModelId(String registeredModelId) {
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
    GetRegisteredModelPermissionsRequest that = (GetRegisteredModelPermissionsRequest) o;
    return Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelPermissionsRequest.class)
        .add("registeredModelId", registeredModelId)
        .toString();
  }

  GetRegisteredModelPermissionsRequestPb toPb() {
    GetRegisteredModelPermissionsRequestPb pb = new GetRegisteredModelPermissionsRequestPb();
    pb.setRegisteredModelId(registeredModelId);

    return pb;
  }

  static GetRegisteredModelPermissionsRequest fromPb(GetRegisteredModelPermissionsRequestPb pb) {
    GetRegisteredModelPermissionsRequest model = new GetRegisteredModelPermissionsRequest();
    model.setRegisteredModelId(pb.getRegisteredModelId());

    return model;
  }

  public static class GetRegisteredModelPermissionsRequestSerializer
      extends JsonSerializer<GetRegisteredModelPermissionsRequest> {
    @Override
    public void serialize(
        GetRegisteredModelPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRegisteredModelPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRegisteredModelPermissionsRequestDeserializer
      extends JsonDeserializer<GetRegisteredModelPermissionsRequest> {
    @Override
    public GetRegisteredModelPermissionsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRegisteredModelPermissionsRequestPb pb =
          mapper.readValue(p, GetRegisteredModelPermissionsRequestPb.class);
      return GetRegisteredModelPermissionsRequest.fromPb(pb);
    }
  }
}
