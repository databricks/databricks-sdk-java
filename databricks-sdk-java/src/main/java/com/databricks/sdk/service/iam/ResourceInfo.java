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
import java.util.Objects;

@Generated
@JsonSerialize(using = ResourceInfo.ResourceInfoSerializer.class)
@JsonDeserialize(using = ResourceInfo.ResourceInfoDeserializer.class)
public class ResourceInfo {
  /** Id of the current resource. */
  private String id;

  /** The legacy acl path of the current resource. */
  private String legacyAclPath;

  /** Parent resource info for the current resource. The parent may have another parent. */
  private ResourceInfo parentResourceInfo;

  public ResourceInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ResourceInfo setLegacyAclPath(String legacyAclPath) {
    this.legacyAclPath = legacyAclPath;
    return this;
  }

  public String getLegacyAclPath() {
    return legacyAclPath;
  }

  public ResourceInfo setParentResourceInfo(ResourceInfo parentResourceInfo) {
    this.parentResourceInfo = parentResourceInfo;
    return this;
  }

  public ResourceInfo getParentResourceInfo() {
    return parentResourceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceInfo that = (ResourceInfo) o;
    return Objects.equals(id, that.id)
        && Objects.equals(legacyAclPath, that.legacyAclPath)
        && Objects.equals(parentResourceInfo, that.parentResourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, legacyAclPath, parentResourceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceInfo.class)
        .add("id", id)
        .add("legacyAclPath", legacyAclPath)
        .add("parentResourceInfo", parentResourceInfo)
        .toString();
  }

  ResourceInfoPb toPb() {
    ResourceInfoPb pb = new ResourceInfoPb();
    pb.setId(id);
    pb.setLegacyAclPath(legacyAclPath);
    pb.setParentResourceInfo(parentResourceInfo);

    return pb;
  }

  static ResourceInfo fromPb(ResourceInfoPb pb) {
    ResourceInfo model = new ResourceInfo();
    model.setId(pb.getId());
    model.setLegacyAclPath(pb.getLegacyAclPath());
    model.setParentResourceInfo(pb.getParentResourceInfo());

    return model;
  }

  public static class ResourceInfoSerializer extends JsonSerializer<ResourceInfo> {
    @Override
    public void serialize(ResourceInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResourceInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResourceInfoDeserializer extends JsonDeserializer<ResourceInfo> {
    @Override
    public ResourceInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResourceInfoPb pb = mapper.readValue(p, ResourceInfoPb.class);
      return ResourceInfo.fromPb(pb);
    }
  }
}
