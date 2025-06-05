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
import java.util.Collection;
import java.util.Objects;

/** Users can specify accessible storage destinations. */
@Generated
@JsonSerialize(
    using =
        EgressNetworkPolicyInternetAccessPolicyStorageDestination
            .EgressNetworkPolicyInternetAccessPolicyStorageDestinationSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyInternetAccessPolicyStorageDestination
            .EgressNetworkPolicyInternetAccessPolicyStorageDestinationDeserializer.class)
public class EgressNetworkPolicyInternetAccessPolicyStorageDestination {
  /** */
  private Collection<String> allowedPaths;

  /** */
  private String azureContainer;

  /** */
  private String azureDnsZone;

  /** */
  private String azureStorageAccount;

  /** */
  private String azureStorageService;

  /** */
  private String bucketName;

  /** */
  private String region;

  /** */
  private EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType typeValue;

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setAllowedPaths(
      Collection<String> allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

  public Collection<String> getAllowedPaths() {
    return allowedPaths;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setAzureContainer(
      String azureContainer) {
    this.azureContainer = azureContainer;
    return this;
  }

  public String getAzureContainer() {
    return azureContainer;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setAzureDnsZone(
      String azureDnsZone) {
    this.azureDnsZone = azureDnsZone;
    return this;
  }

  public String getAzureDnsZone() {
    return azureDnsZone;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setAzureStorageAccount(
      String azureStorageAccount) {
    this.azureStorageAccount = azureStorageAccount;
    return this;
  }

  public String getAzureStorageAccount() {
    return azureStorageAccount;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setAzureStorageService(
      String azureStorageService) {
    this.azureStorageService = azureStorageService;
    return this;
  }

  public String getAzureStorageService() {
    return azureStorageService;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setBucketName(
      String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestination setType(
      EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicyStorageDestination that =
        (EgressNetworkPolicyInternetAccessPolicyStorageDestination) o;
    return Objects.equals(allowedPaths, that.allowedPaths)
        && Objects.equals(azureContainer, that.azureContainer)
        && Objects.equals(azureDnsZone, that.azureDnsZone)
        && Objects.equals(azureStorageAccount, that.azureStorageAccount)
        && Objects.equals(azureStorageService, that.azureStorageService)
        && Objects.equals(bucketName, that.bucketName)
        && Objects.equals(region, that.region)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedPaths,
        azureContainer,
        azureDnsZone,
        azureStorageAccount,
        azureStorageService,
        bucketName,
        region,
        typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyStorageDestination.class)
        .add("allowedPaths", allowedPaths)
        .add("azureContainer", azureContainer)
        .add("azureDnsZone", azureDnsZone)
        .add("azureStorageAccount", azureStorageAccount)
        .add("azureStorageService", azureStorageService)
        .add("bucketName", bucketName)
        .add("region", region)
        .add("typeValue", typeValue)
        .toString();
  }

  EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb toPb() {
    EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb pb =
        new EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb();
    pb.setAllowedPaths(allowedPaths);
    pb.setAzureContainer(azureContainer);
    pb.setAzureDnsZone(azureDnsZone);
    pb.setAzureStorageAccount(azureStorageAccount);
    pb.setAzureStorageService(azureStorageService);
    pb.setBucketName(bucketName);
    pb.setRegion(region);
    pb.setType(typeValue);

    return pb;
  }

  static EgressNetworkPolicyInternetAccessPolicyStorageDestination fromPb(
      EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb pb) {
    EgressNetworkPolicyInternetAccessPolicyStorageDestination model =
        new EgressNetworkPolicyInternetAccessPolicyStorageDestination();
    model.setAllowedPaths(pb.getAllowedPaths());
    model.setAzureContainer(pb.getAzureContainer());
    model.setAzureDnsZone(pb.getAzureDnsZone());
    model.setAzureStorageAccount(pb.getAzureStorageAccount());
    model.setAzureStorageService(pb.getAzureStorageService());
    model.setBucketName(pb.getBucketName());
    model.setRegion(pb.getRegion());
    model.setType(pb.getType());

    return model;
  }

  public static class EgressNetworkPolicyInternetAccessPolicyStorageDestinationSerializer
      extends JsonSerializer<EgressNetworkPolicyInternetAccessPolicyStorageDestination> {
    @Override
    public void serialize(
        EgressNetworkPolicyInternetAccessPolicyStorageDestination value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyInternetAccessPolicyStorageDestinationDeserializer
      extends JsonDeserializer<EgressNetworkPolicyInternetAccessPolicyStorageDestination> {
    @Override
    public EgressNetworkPolicyInternetAccessPolicyStorageDestination deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb pb =
          mapper.readValue(p, EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb.class);
      return EgressNetworkPolicyInternetAccessPolicyStorageDestination.fromPb(pb);
    }
  }
}
