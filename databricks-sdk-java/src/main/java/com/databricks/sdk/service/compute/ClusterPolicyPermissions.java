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
@JsonSerialize(using = ClusterPolicyPermissions.ClusterPolicyPermissionsSerializer.class)
@JsonDeserialize(using = ClusterPolicyPermissions.ClusterPolicyPermissionsDeserializer.class)
public class ClusterPolicyPermissions {
  /** */
  private Collection<ClusterPolicyAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public ClusterPolicyPermissions setAccessControlList(
      Collection<ClusterPolicyAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterPolicyAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPolicyPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ClusterPolicyPermissions setObjectType(String objectType) {
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
    ClusterPolicyPermissions that = (ClusterPolicyPermissions) o;
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
    return new ToStringer(ClusterPolicyPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  ClusterPolicyPermissionsPb toPb() {
    ClusterPolicyPermissionsPb pb = new ClusterPolicyPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static ClusterPolicyPermissions fromPb(ClusterPolicyPermissionsPb pb) {
    ClusterPolicyPermissions model = new ClusterPolicyPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class ClusterPolicyPermissionsSerializer
      extends JsonSerializer<ClusterPolicyPermissions> {
    @Override
    public void serialize(
        ClusterPolicyPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPolicyPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPolicyPermissionsDeserializer
      extends JsonDeserializer<ClusterPolicyPermissions> {
    @Override
    public ClusterPolicyPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPolicyPermissionsPb pb = mapper.readValue(p, ClusterPolicyPermissionsPb.class);
      return ClusterPolicyPermissions.fromPb(pb);
    }
  }
}
