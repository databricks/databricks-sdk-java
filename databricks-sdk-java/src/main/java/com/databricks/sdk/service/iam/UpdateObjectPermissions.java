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
@JsonSerialize(using = UpdateObjectPermissions.UpdateObjectPermissionsSerializer.class)
@JsonDeserialize(using = UpdateObjectPermissions.UpdateObjectPermissionsDeserializer.class)
public class UpdateObjectPermissions {
  /** */
  private Collection<AccessControlRequest> accessControlList;

  /** The id of the request object. */
  private String requestObjectId;

  /**
   * The type of the request object. Can be one of the following: alerts, authorization, clusters,
   * cluster-policies, dashboards, dbsql-dashboards, directories, experiments, files,
   * instance-pools, jobs, notebooks, pipelines, queries, registered-models, repos,
   * serving-endpoints, or warehouses.
   */
  private String requestObjectType;

  public UpdateObjectPermissions setAccessControlList(
      Collection<AccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public UpdateObjectPermissions setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public UpdateObjectPermissions setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateObjectPermissions that = (UpdateObjectPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }

  UpdateObjectPermissionsPb toPb() {
    UpdateObjectPermissionsPb pb = new UpdateObjectPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setRequestObjectId(requestObjectId);
    pb.setRequestObjectType(requestObjectType);

    return pb;
  }

  static UpdateObjectPermissions fromPb(UpdateObjectPermissionsPb pb) {
    UpdateObjectPermissions model = new UpdateObjectPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setRequestObjectId(pb.getRequestObjectId());
    model.setRequestObjectType(pb.getRequestObjectType());

    return model;
  }

  public static class UpdateObjectPermissionsSerializer
      extends JsonSerializer<UpdateObjectPermissions> {
    @Override
    public void serialize(
        UpdateObjectPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateObjectPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateObjectPermissionsDeserializer
      extends JsonDeserializer<UpdateObjectPermissions> {
    @Override
    public UpdateObjectPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateObjectPermissionsPb pb = mapper.readValue(p, UpdateObjectPermissionsPb.class);
      return UpdateObjectPermissions.fromPb(pb);
    }
  }
}
