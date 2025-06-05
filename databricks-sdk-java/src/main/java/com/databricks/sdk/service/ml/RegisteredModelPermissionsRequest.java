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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = RegisteredModelPermissionsRequest.RegisteredModelPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = RegisteredModelPermissionsRequest.RegisteredModelPermissionsRequestDeserializer.class)
public class RegisteredModelPermissionsRequest {
  /** */
  private Collection<RegisteredModelAccessControlRequest> accessControlList;

  /** The registered model for which to get or manage permissions. */
  private String registeredModelId;

  public RegisteredModelPermissionsRequest setAccessControlList(
      Collection<RegisteredModelAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RegisteredModelAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public RegisteredModelPermissionsRequest setRegisteredModelId(String registeredModelId) {
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
    RegisteredModelPermissionsRequest that = (RegisteredModelPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("registeredModelId", registeredModelId)
        .toString();
  }

  RegisteredModelPermissionsRequestPb toPb() {
    RegisteredModelPermissionsRequestPb pb = new RegisteredModelPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setRegisteredModelId(registeredModelId);

    return pb;
  }

  static RegisteredModelPermissionsRequest fromPb(RegisteredModelPermissionsRequestPb pb) {
    RegisteredModelPermissionsRequest model = new RegisteredModelPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setRegisteredModelId(pb.getRegisteredModelId());

    return model;
  }

  public static class RegisteredModelPermissionsRequestSerializer
      extends JsonSerializer<RegisteredModelPermissionsRequest> {
    @Override
    public void serialize(
        RegisteredModelPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelPermissionsRequestDeserializer
      extends JsonDeserializer<RegisteredModelPermissionsRequest> {
    @Override
    public RegisteredModelPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelPermissionsRequestPb pb =
          mapper.readValue(p, RegisteredModelPermissionsRequestPb.class);
      return RegisteredModelPermissionsRequest.fromPb(pb);
    }
  }
}
