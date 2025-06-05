// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = InstancePoolPermissions.InstancePoolPermissionsSerializer.class)
@JsonDeserialize(using = InstancePoolPermissions.InstancePoolPermissionsDeserializer.class)
public class InstancePoolPermissions {
  /** */
  private Collection<InstancePoolAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public InstancePoolPermissions setAccessControlList(
      Collection<InstancePoolAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<InstancePoolAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public InstancePoolPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public InstancePoolPermissions setObjectType(String objectType) {
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
    InstancePoolPermissions that = (InstancePoolPermissions) o;
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
    return new ToStringer(InstancePoolPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  InstancePoolPermissionsPb toPb() {
    InstancePoolPermissionsPb pb = new InstancePoolPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static InstancePoolPermissions fromPb(InstancePoolPermissionsPb pb) {
    InstancePoolPermissions model = new InstancePoolPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class InstancePoolPermissionsSerializer
      extends JsonSerializer<InstancePoolPermissions> {
    @Override
    public void serialize(
        InstancePoolPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolPermissionsDeserializer
      extends JsonDeserializer<InstancePoolPermissions> {
    @Override
    public InstancePoolPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolPermissionsPb pb = mapper.readValue(p, InstancePoolPermissionsPb.class);
      return InstancePoolPermissions.fromPb(pb);
    }
  }
}
