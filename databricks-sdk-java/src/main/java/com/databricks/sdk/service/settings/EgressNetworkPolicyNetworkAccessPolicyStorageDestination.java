// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Users can specify accessible storage destinations. */
@Generated
@JsonSerialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyStorageDestination
            .EgressNetworkPolicyNetworkAccessPolicyStorageDestinationSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyStorageDestination
            .EgressNetworkPolicyNetworkAccessPolicyStorageDestinationDeserializer.class)
public class EgressNetworkPolicyNetworkAccessPolicyStorageDestination {
  /** The Azure storage account name. */
  private String azureStorageAccount;

  /** The Azure storage service type (blob, dfs, etc.). */
  private String azureStorageService;

  /** */
  private String bucketName;

  /** The region of the S3 bucket. */
  private String region;

  /** The type of storage destination. */
  private EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
      storageDestinationType;

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setAzureStorageAccount(
      String azureStorageAccount) {
    this.azureStorageAccount = azureStorageAccount;
    return this;
  }

  public String getAzureStorageAccount() {
    return azureStorageAccount;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setAzureStorageService(
      String azureStorageService) {
    this.azureStorageService = azureStorageService;
    return this;
  }

  public String getAzureStorageService() {
    return azureStorageService;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setStorageDestinationType(
      EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
          storageDestinationType) {
    this.storageDestinationType = storageDestinationType;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
      getStorageDestinationType() {
    return storageDestinationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicyStorageDestination that =
        (EgressNetworkPolicyNetworkAccessPolicyStorageDestination) o;
    return Objects.equals(azureStorageAccount, that.azureStorageAccount)
        && Objects.equals(azureStorageService, that.azureStorageService)
        && Objects.equals(bucketName, that.bucketName)
        && Objects.equals(region, that.region)
        && Objects.equals(storageDestinationType, that.storageDestinationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureStorageAccount, azureStorageService, bucketName, region, storageDestinationType);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyStorageDestination.class)
        .add("azureStorageAccount", azureStorageAccount)
        .add("azureStorageService", azureStorageService)
        .add("bucketName", bucketName)
        .add("region", region)
        .add("storageDestinationType", storageDestinationType)
        .toString();
  }

  EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb toPb() {
    EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb pb =
        new EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb();
    pb.setAzureStorageAccount(azureStorageAccount);
    pb.setAzureStorageService(azureStorageService);
    pb.setBucketName(bucketName);
    pb.setRegion(region);
    pb.setStorageDestinationType(storageDestinationType);

    return pb;
  }

  static EgressNetworkPolicyNetworkAccessPolicyStorageDestination fromPb(
      EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb pb) {
    EgressNetworkPolicyNetworkAccessPolicyStorageDestination model =
        new EgressNetworkPolicyNetworkAccessPolicyStorageDestination();
    model.setAzureStorageAccount(pb.getAzureStorageAccount());
    model.setAzureStorageService(pb.getAzureStorageService());
    model.setBucketName(pb.getBucketName());
    model.setRegion(pb.getRegion());
    model.setStorageDestinationType(pb.getStorageDestinationType());

    return model;
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyStorageDestinationSerializer
      extends JsonSerializer<EgressNetworkPolicyNetworkAccessPolicyStorageDestination> {
    @Override
    public void serialize(
        EgressNetworkPolicyNetworkAccessPolicyStorageDestination value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyStorageDestinationDeserializer
      extends JsonDeserializer<EgressNetworkPolicyNetworkAccessPolicyStorageDestination> {
    @Override
    public EgressNetworkPolicyNetworkAccessPolicyStorageDestination deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb pb =
          mapper.readValue(p, EgressNetworkPolicyNetworkAccessPolicyStorageDestinationPb.class);
      return EgressNetworkPolicyNetworkAccessPolicyStorageDestination.fromPb(pb);
    }
  }
}
