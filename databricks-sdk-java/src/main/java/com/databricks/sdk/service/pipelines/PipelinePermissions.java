// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = PipelinePermissions.PipelinePermissionsSerializer.class)
@JsonDeserialize(using = PipelinePermissions.PipelinePermissionsDeserializer.class)
public class PipelinePermissions {
  /** */
  private Collection<PipelineAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public PipelinePermissions setAccessControlList(
      Collection<PipelineAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PipelineAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public PipelinePermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public PipelinePermissions setObjectType(String objectType) {
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
    PipelinePermissions that = (PipelinePermissions) o;
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
    return new ToStringer(PipelinePermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  PipelinePermissionsPb toPb() {
    PipelinePermissionsPb pb = new PipelinePermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static PipelinePermissions fromPb(PipelinePermissionsPb pb) {
    PipelinePermissions model = new PipelinePermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class PipelinePermissionsSerializer extends JsonSerializer<PipelinePermissions> {
    @Override
    public void serialize(PipelinePermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelinePermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelinePermissionsDeserializer
      extends JsonDeserializer<PipelinePermissions> {
    @Override
    public PipelinePermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelinePermissionsPb pb = mapper.readValue(p, PipelinePermissionsPb.class);
      return PipelinePermissions.fromPb(pb);
    }
  }
}
