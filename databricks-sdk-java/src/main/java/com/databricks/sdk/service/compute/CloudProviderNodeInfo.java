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
@JsonSerialize(using = CloudProviderNodeInfo.CloudProviderNodeInfoSerializer.class)
@JsonDeserialize(using = CloudProviderNodeInfo.CloudProviderNodeInfoDeserializer.class)
public class CloudProviderNodeInfo {
  /** Status as reported by the cloud provider */
  private Collection<CloudProviderNodeStatus> status;

  public CloudProviderNodeInfo setStatus(Collection<CloudProviderNodeStatus> status) {
    this.status = status;
    return this;
  }

  public Collection<CloudProviderNodeStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudProviderNodeInfo that = (CloudProviderNodeInfo) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudProviderNodeInfo.class).add("status", status).toString();
  }

  CloudProviderNodeInfoPb toPb() {
    CloudProviderNodeInfoPb pb = new CloudProviderNodeInfoPb();
    pb.setStatus(status);

    return pb;
  }

  static CloudProviderNodeInfo fromPb(CloudProviderNodeInfoPb pb) {
    CloudProviderNodeInfo model = new CloudProviderNodeInfo();
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class CloudProviderNodeInfoSerializer
      extends JsonSerializer<CloudProviderNodeInfo> {
    @Override
    public void serialize(
        CloudProviderNodeInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CloudProviderNodeInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CloudProviderNodeInfoDeserializer
      extends JsonDeserializer<CloudProviderNodeInfo> {
    @Override
    public CloudProviderNodeInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CloudProviderNodeInfoPb pb = mapper.readValue(p, CloudProviderNodeInfoPb.class);
      return CloudProviderNodeInfo.fromPb(pb);
    }
  }
}
