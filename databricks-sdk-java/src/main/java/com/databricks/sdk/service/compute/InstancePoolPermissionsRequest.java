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
@JsonSerialize(
    using = InstancePoolPermissionsRequest.InstancePoolPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = InstancePoolPermissionsRequest.InstancePoolPermissionsRequestDeserializer.class)
public class InstancePoolPermissionsRequest {
  /** */
  private Collection<InstancePoolAccessControlRequest> accessControlList;

  /** The instance pool for which to get or manage permissions. */
  private String instancePoolId;

  public InstancePoolPermissionsRequest setAccessControlList(
      Collection<InstancePoolAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<InstancePoolAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public InstancePoolPermissionsRequest setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolPermissionsRequest that = (InstancePoolPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  InstancePoolPermissionsRequestPb toPb() {
    InstancePoolPermissionsRequestPb pb = new InstancePoolPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static InstancePoolPermissionsRequest fromPb(InstancePoolPermissionsRequestPb pb) {
    InstancePoolPermissionsRequest model = new InstancePoolPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class InstancePoolPermissionsRequestSerializer
      extends JsonSerializer<InstancePoolPermissionsRequest> {
    @Override
    public void serialize(
        InstancePoolPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolPermissionsRequestDeserializer
      extends JsonDeserializer<InstancePoolPermissionsRequest> {
    @Override
    public InstancePoolPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolPermissionsRequestPb pb =
          mapper.readValue(p, InstancePoolPermissionsRequestPb.class);
      return InstancePoolPermissionsRequest.fromPb(pb);
    }
  }
}
