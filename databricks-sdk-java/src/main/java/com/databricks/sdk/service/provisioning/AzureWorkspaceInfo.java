// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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
@JsonSerialize(using = AzureWorkspaceInfo.AzureWorkspaceInfoSerializer.class)
@JsonDeserialize(using = AzureWorkspaceInfo.AzureWorkspaceInfoDeserializer.class)
public class AzureWorkspaceInfo {
  /** Azure Resource Group name */
  private String resourceGroup;

  /** Azure Subscription ID */
  private String subscriptionId;

  public AzureWorkspaceInfo setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  public String getResourceGroup() {
    return resourceGroup;
  }

  public AzureWorkspaceInfo setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureWorkspaceInfo that = (AzureWorkspaceInfo) o;
    return Objects.equals(resourceGroup, that.resourceGroup)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceGroup, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureWorkspaceInfo.class)
        .add("resourceGroup", resourceGroup)
        .add("subscriptionId", subscriptionId)
        .toString();
  }

  AzureWorkspaceInfoPb toPb() {
    AzureWorkspaceInfoPb pb = new AzureWorkspaceInfoPb();
    pb.setResourceGroup(resourceGroup);
    pb.setSubscriptionId(subscriptionId);

    return pb;
  }

  static AzureWorkspaceInfo fromPb(AzureWorkspaceInfoPb pb) {
    AzureWorkspaceInfo model = new AzureWorkspaceInfo();
    model.setResourceGroup(pb.getResourceGroup());
    model.setSubscriptionId(pb.getSubscriptionId());

    return model;
  }

  public static class AzureWorkspaceInfoSerializer extends JsonSerializer<AzureWorkspaceInfo> {
    @Override
    public void serialize(AzureWorkspaceInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureWorkspaceInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureWorkspaceInfoDeserializer extends JsonDeserializer<AzureWorkspaceInfo> {
    @Override
    public AzureWorkspaceInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureWorkspaceInfoPb pb = mapper.readValue(p, AzureWorkspaceInfoPb.class);
      return AzureWorkspaceInfo.fromPb(pb);
    }
  }
}
