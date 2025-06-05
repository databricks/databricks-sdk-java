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
@JsonSerialize(using = ObjectPermissions.ObjectPermissionsSerializer.class)
@JsonDeserialize(using = ObjectPermissions.ObjectPermissionsDeserializer.class)
public class ObjectPermissions {
  /** */
  private Collection<AccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public ObjectPermissions setAccessControlList(
      Collection<AccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ObjectPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ObjectPermissions setObjectType(String objectType) {
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
    ObjectPermissions that = (ObjectPermissions) o;
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
    return new ToStringer(ObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  ObjectPermissionsPb toPb() {
    ObjectPermissionsPb pb = new ObjectPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static ObjectPermissions fromPb(ObjectPermissionsPb pb) {
    ObjectPermissions model = new ObjectPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class ObjectPermissionsSerializer extends JsonSerializer<ObjectPermissions> {
    @Override
    public void serialize(ObjectPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ObjectPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ObjectPermissionsDeserializer extends JsonDeserializer<ObjectPermissions> {
    @Override
    public ObjectPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ObjectPermissionsPb pb = mapper.readValue(p, ObjectPermissionsPb.class);
      return ObjectPermissions.fromPb(pb);
    }
  }
}
