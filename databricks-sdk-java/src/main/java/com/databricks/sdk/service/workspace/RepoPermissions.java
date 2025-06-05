// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = RepoPermissions.RepoPermissionsSerializer.class)
@JsonDeserialize(using = RepoPermissions.RepoPermissionsDeserializer.class)
public class RepoPermissions {
  /** */
  private Collection<RepoAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public RepoPermissions setAccessControlList(
      Collection<RepoAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RepoAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public RepoPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public RepoPermissions setObjectType(String objectType) {
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
    RepoPermissions that = (RepoPermissions) o;
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
    return new ToStringer(RepoPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  RepoPermissionsPb toPb() {
    RepoPermissionsPb pb = new RepoPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static RepoPermissions fromPb(RepoPermissionsPb pb) {
    RepoPermissions model = new RepoPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class RepoPermissionsSerializer extends JsonSerializer<RepoPermissions> {
    @Override
    public void serialize(RepoPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepoPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepoPermissionsDeserializer extends JsonDeserializer<RepoPermissions> {
    @Override
    public RepoPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoPermissionsPb pb = mapper.readValue(p, RepoPermissionsPb.class);
      return RepoPermissions.fromPb(pb);
    }
  }
}
