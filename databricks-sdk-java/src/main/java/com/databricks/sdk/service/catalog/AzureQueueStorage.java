// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = AzureQueueStorage.AzureQueueStorageSerializer.class)
@JsonDeserialize(using = AzureQueueStorage.AzureQueueStorageDeserializer.class)
public class AzureQueueStorage {
  /** Unique identifier included in the name of file events managed cloud resources. */
  private String managedResourceId;

  /**
   * The AQS queue url in the format https://{storage account}.queue.core.windows.net/{queue name}
   * REQUIRED for provided_aqs.
   */
  private String queueUrl;

  /**
   * The resource group for the queue, event grid subscription, and external location storage
   * account. ONLY REQUIRED for locations with a service principal storage credential
   */
  private String resourceGroup;

  /**
   * OPTIONAL: The subscription id for the queue, event grid subscription, and external location
   * storage account. REQUIRED for locations with a service principal storage credential
   */
  private String subscriptionId;

  public AzureQueueStorage setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public AzureQueueStorage setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  public AzureQueueStorage setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  public String getResourceGroup() {
    return resourceGroup;
  }

  public AzureQueueStorage setSubscriptionId(String subscriptionId) {
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
    AzureQueueStorage that = (AzureQueueStorage) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(queueUrl, that.queueUrl)
        && Objects.equals(resourceGroup, that.resourceGroup)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, queueUrl, resourceGroup, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureQueueStorage.class)
        .add("managedResourceId", managedResourceId)
        .add("queueUrl", queueUrl)
        .add("resourceGroup", resourceGroup)
        .add("subscriptionId", subscriptionId)
        .toString();
  }

  AzureQueueStoragePb toPb() {
    AzureQueueStoragePb pb = new AzureQueueStoragePb();
    pb.setManagedResourceId(managedResourceId);
    pb.setQueueUrl(queueUrl);
    pb.setResourceGroup(resourceGroup);
    pb.setSubscriptionId(subscriptionId);

    return pb;
  }

  static AzureQueueStorage fromPb(AzureQueueStoragePb pb) {
    AzureQueueStorage model = new AzureQueueStorage();
    model.setManagedResourceId(pb.getManagedResourceId());
    model.setQueueUrl(pb.getQueueUrl());
    model.setResourceGroup(pb.getResourceGroup());
    model.setSubscriptionId(pb.getSubscriptionId());

    return model;
  }

  public static class AzureQueueStorageSerializer extends JsonSerializer<AzureQueueStorage> {
    @Override
    public void serialize(AzureQueueStorage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureQueueStoragePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureQueueStorageDeserializer extends JsonDeserializer<AzureQueueStorage> {
    @Override
    public AzureQueueStorage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureQueueStoragePb pb = mapper.readValue(p, AzureQueueStoragePb.class);
      return AzureQueueStorage.fromPb(pb);
    }
  }
}
