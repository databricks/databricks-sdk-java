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
@JsonSerialize(using = ClusterPermissions.ClusterPermissionsSerializer.class)
@JsonDeserialize(using = ClusterPermissions.ClusterPermissionsDeserializer.class)
public class ClusterPermissions {
  /** */
  private Collection<ClusterAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public ClusterPermissions setAccessControlList(
      Collection<ClusterAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ClusterPermissions setObjectType(String objectType) {
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
    ClusterPermissions that = (ClusterPermissions) o;
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
    return new ToStringer(ClusterPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  ClusterPermissionsPb toPb() {
    ClusterPermissionsPb pb = new ClusterPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static ClusterPermissions fromPb(ClusterPermissionsPb pb) {
    ClusterPermissions model = new ClusterPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class ClusterPermissionsSerializer extends JsonSerializer<ClusterPermissions> {
    @Override
    public void serialize(ClusterPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPermissionsDeserializer extends JsonDeserializer<ClusterPermissions> {
    @Override
    public ClusterPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPermissionsPb pb = mapper.readValue(p, ClusterPermissionsPb.class);
      return ClusterPermissions.fromPb(pb);
    }
  }
}
