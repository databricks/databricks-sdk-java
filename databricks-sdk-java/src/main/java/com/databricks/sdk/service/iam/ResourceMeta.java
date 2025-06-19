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
@JsonSerialize(using = ResourceMeta.ResourceMetaSerializer.class)
@JsonDeserialize(using = ResourceMeta.ResourceMetaDeserializer.class)
public class ResourceMeta {
  /**
   * Identifier for group type. Can be local workspace group (`WorkspaceGroup`) or account group
   * (`Group`).
   */
  private String resourceType;

  public ResourceMeta setResourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  public String getResourceType() {
    return resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceMeta that = (ResourceMeta) o;
    return Objects.equals(resourceType, that.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceMeta.class).add("resourceType", resourceType).toString();
  }

  ResourceMetaPb toPb() {
    ResourceMetaPb pb = new ResourceMetaPb();
    pb.setResourceType(resourceType);

    return pb;
  }

  static ResourceMeta fromPb(ResourceMetaPb pb) {
    ResourceMeta model = new ResourceMeta();
    model.setResourceType(pb.getResourceType());

    return model;
  }

  public static class ResourceMetaSerializer extends JsonSerializer<ResourceMeta> {
    @Override
    public void serialize(ResourceMeta value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResourceMetaPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResourceMetaDeserializer extends JsonDeserializer<ResourceMeta> {
    @Override
    public ResourceMeta deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResourceMetaPb pb = mapper.readValue(p, ResourceMetaPb.class);
      return ResourceMeta.fromPb(pb);
    }
  }
}
