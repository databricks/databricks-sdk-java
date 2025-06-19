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
@JsonSerialize(using = ExperimentPermissions.ExperimentPermissionsSerializer.class)
@JsonDeserialize(using = ExperimentPermissions.ExperimentPermissionsDeserializer.class)
public class ExperimentPermissions {
  /** */
  private Collection<ExperimentAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public ExperimentPermissions setAccessControlList(
      Collection<ExperimentAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ExperimentAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ExperimentPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ExperimentPermissions setObjectType(String objectType) {
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
    ExperimentPermissions that = (ExperimentPermissions) o;
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
    return new ToStringer(ExperimentPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  ExperimentPermissionsPb toPb() {
    ExperimentPermissionsPb pb = new ExperimentPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static ExperimentPermissions fromPb(ExperimentPermissionsPb pb) {
    ExperimentPermissions model = new ExperimentPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class ExperimentPermissionsSerializer
      extends JsonSerializer<ExperimentPermissions> {
    @Override
    public void serialize(
        ExperimentPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentPermissionsDeserializer
      extends JsonDeserializer<ExperimentPermissions> {
    @Override
    public ExperimentPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentPermissionsPb pb = mapper.readValue(p, ExperimentPermissionsPb.class);
      return ExperimentPermissions.fromPb(pb);
    }
  }
}
