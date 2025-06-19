// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = ServingEndpointPermissions.ServingEndpointPermissionsSerializer.class)
@JsonDeserialize(using = ServingEndpointPermissions.ServingEndpointPermissionsDeserializer.class)
public class ServingEndpointPermissions {
  /** */
  private Collection<ServingEndpointAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public ServingEndpointPermissions setAccessControlList(
      Collection<ServingEndpointAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ServingEndpointAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ServingEndpointPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ServingEndpointPermissions setObjectType(String objectType) {
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
    ServingEndpointPermissions that = (ServingEndpointPermissions) o;
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
    return new ToStringer(ServingEndpointPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  ServingEndpointPermissionsPb toPb() {
    ServingEndpointPermissionsPb pb = new ServingEndpointPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static ServingEndpointPermissions fromPb(ServingEndpointPermissionsPb pb) {
    ServingEndpointPermissions model = new ServingEndpointPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class ServingEndpointPermissionsSerializer
      extends JsonSerializer<ServingEndpointPermissions> {
    @Override
    public void serialize(
        ServingEndpointPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointPermissionsDeserializer
      extends JsonDeserializer<ServingEndpointPermissions> {
    @Override
    public ServingEndpointPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointPermissionsPb pb = mapper.readValue(p, ServingEndpointPermissionsPb.class);
      return ServingEndpointPermissions.fromPb(pb);
    }
  }
}
