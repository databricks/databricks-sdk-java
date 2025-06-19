// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = PasswordPermissions.PasswordPermissionsSerializer.class)
@JsonDeserialize(using = PasswordPermissions.PasswordPermissionsDeserializer.class)
public class PasswordPermissions {
  /** */
  private Collection<PasswordAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public PasswordPermissions setAccessControlList(
      Collection<PasswordAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PasswordAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public PasswordPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public PasswordPermissions setObjectType(String objectType) {
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
    PasswordPermissions that = (PasswordPermissions) o;
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
    return new ToStringer(PasswordPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  PasswordPermissionsPb toPb() {
    PasswordPermissionsPb pb = new PasswordPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static PasswordPermissions fromPb(PasswordPermissionsPb pb) {
    PasswordPermissions model = new PasswordPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class PasswordPermissionsSerializer extends JsonSerializer<PasswordPermissions> {
    @Override
    public void serialize(PasswordPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PasswordPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PasswordPermissionsDeserializer
      extends JsonDeserializer<PasswordPermissions> {
    @Override
    public PasswordPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PasswordPermissionsPb pb = mapper.readValue(p, PasswordPermissionsPb.class);
      return PasswordPermissions.fromPb(pb);
    }
  }
}
