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
@JsonSerialize(using = RegisteredModelPermissions.RegisteredModelPermissionsSerializer.class)
@JsonDeserialize(using = RegisteredModelPermissions.RegisteredModelPermissionsDeserializer.class)
public class RegisteredModelPermissions {
  /** */
  private Collection<RegisteredModelAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public RegisteredModelPermissions setAccessControlList(
      Collection<RegisteredModelAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RegisteredModelAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public RegisteredModelPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public RegisteredModelPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelPermissions that = (RegisteredModelPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  RegisteredModelPermissionsPb toPb() {
    RegisteredModelPermissionsPb pb = new RegisteredModelPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static RegisteredModelPermissions fromPb(RegisteredModelPermissionsPb pb) {
    RegisteredModelPermissions model = new RegisteredModelPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class RegisteredModelPermissionsSerializer
      extends JsonSerializer<RegisteredModelPermissions> {
    @Override
    public void serialize(
        RegisteredModelPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelPermissionsDeserializer
      extends JsonDeserializer<RegisteredModelPermissions> {
    @Override
    public RegisteredModelPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelPermissionsPb pb = mapper.readValue(p, RegisteredModelPermissionsPb.class);
      return RegisteredModelPermissions.fromPb(pb);
    }
  }
}
