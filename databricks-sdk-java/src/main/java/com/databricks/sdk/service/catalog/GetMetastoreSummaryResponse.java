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
@JsonSerialize(using = GetMetastoreSummaryResponse.GetMetastoreSummaryResponseSerializer.class)
@JsonDeserialize(using = GetMetastoreSummaryResponse.GetMetastoreSummaryResponseDeserializer.class)
public class GetMetastoreSummaryResponse {
  /** Cloud vendor of the metastore home shard (e.g., `aws`, `azure`, `gcp`). */
  private String cloud;

  /** Time at which this metastore was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of metastore creator. */
  private String createdBy;

  /** Unique identifier of the metastore's (Default) Data Access Configuration. */
  private String defaultDataAccessConfigId;

  /**
   * The organization name of a Delta Sharing entity, to be used in Databricks-to-Databricks Delta
   * Sharing as the official name.
   */
  private String deltaSharingOrganizationName;

  /** The lifetime of delta sharing recipient token in seconds. */
  private Long deltaSharingRecipientTokenLifetimeInSeconds;

  /** The scope of Delta Sharing enabled for the metastore. */
  private DeltaSharingScopeEnum deltaSharingScope;

  /** Whether to allow non-DBR clients to directly access entities under the metastore. */
  private Boolean externalAccessEnabled;

  /**
   * Globally unique metastore ID across clouds and regions, of the form
   * `cloud:region:metastore_id`.
   */
  private String globalMetastoreId;

  /** Unique identifier of metastore. */
  private String metastoreId;

  /** The user-specified name of the metastore. */
  private String name;

  /** The owner of the metastore. */
  private String owner;

  /** Privilege model version of the metastore, of the form `major.minor` (e.g., `1.0`). */
  private String privilegeModelVersion;

  /** Cloud region which the metastore serves (e.g., `us-west-2`, `westus`). */
  private String region;

  /** The storage root URL for metastore */
  private String storageRoot;

  /** UUID of storage credential to access the metastore storage_root. */
  private String storageRootCredentialId;

  /** Name of the storage credential to access the metastore storage_root. */
  private String storageRootCredentialName;

  /** Time at which the metastore was last modified, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified the metastore. */
  private String updatedBy;

  public GetMetastoreSummaryResponse setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public GetMetastoreSummaryResponse setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public GetMetastoreSummaryResponse setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public GetMetastoreSummaryResponse setDefaultDataAccessConfigId(
      String defaultDataAccessConfigId) {
    this.defaultDataAccessConfigId = defaultDataAccessConfigId;
    return this;
  }

  public String getDefaultDataAccessConfigId() {
    return defaultDataAccessConfigId;
  }

  public GetMetastoreSummaryResponse setDeltaSharingOrganizationName(
      String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public GetMetastoreSummaryResponse setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public GetMetastoreSummaryResponse setDeltaSharingScope(DeltaSharingScopeEnum deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public DeltaSharingScopeEnum getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public GetMetastoreSummaryResponse setExternalAccessEnabled(Boolean externalAccessEnabled) {
    this.externalAccessEnabled = externalAccessEnabled;
    return this;
  }

  public Boolean getExternalAccessEnabled() {
    return externalAccessEnabled;
  }

  public GetMetastoreSummaryResponse setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public GetMetastoreSummaryResponse setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public GetMetastoreSummaryResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetMetastoreSummaryResponse setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public GetMetastoreSummaryResponse setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public GetMetastoreSummaryResponse setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public GetMetastoreSummaryResponse setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public GetMetastoreSummaryResponse setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

  public GetMetastoreSummaryResponse setStorageRootCredentialName(
      String storageRootCredentialName) {
    this.storageRootCredentialName = storageRootCredentialName;
    return this;
  }

  public String getStorageRootCredentialName() {
    return storageRootCredentialName;
  }

  public GetMetastoreSummaryResponse setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public GetMetastoreSummaryResponse setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetastoreSummaryResponse that = (GetMetastoreSummaryResponse) o;
    return Objects.equals(cloud, that.cloud)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(defaultDataAccessConfigId, that.defaultDataAccessConfigId)
        && Objects.equals(deltaSharingOrganizationName, that.deltaSharingOrganizationName)
        && Objects.equals(
            deltaSharingRecipientTokenLifetimeInSeconds,
            that.deltaSharingRecipientTokenLifetimeInSeconds)
        && Objects.equals(deltaSharingScope, that.deltaSharingScope)
        && Objects.equals(externalAccessEnabled, that.externalAccessEnabled)
        && Objects.equals(globalMetastoreId, that.globalMetastoreId)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(privilegeModelVersion, that.privilegeModelVersion)
        && Objects.equals(region, that.region)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(storageRootCredentialId, that.storageRootCredentialId)
        && Objects.equals(storageRootCredentialName, that.storageRootCredentialName)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cloud,
        createdAt,
        createdBy,
        defaultDataAccessConfigId,
        deltaSharingOrganizationName,
        deltaSharingRecipientTokenLifetimeInSeconds,
        deltaSharingScope,
        externalAccessEnabled,
        globalMetastoreId,
        metastoreId,
        name,
        owner,
        privilegeModelVersion,
        region,
        storageRoot,
        storageRootCredentialId,
        storageRootCredentialName,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetastoreSummaryResponse.class)
        .add("cloud", cloud)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("defaultDataAccessConfigId", defaultDataAccessConfigId)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
        .add("externalAccessEnabled", externalAccessEnabled)
        .add("globalMetastoreId", globalMetastoreId)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("privilegeModelVersion", privilegeModelVersion)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .add("storageRootCredentialId", storageRootCredentialId)
        .add("storageRootCredentialName", storageRootCredentialName)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  GetMetastoreSummaryResponsePb toPb() {
    GetMetastoreSummaryResponsePb pb = new GetMetastoreSummaryResponsePb();
    pb.setCloud(cloud);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setDefaultDataAccessConfigId(defaultDataAccessConfigId);
    pb.setDeltaSharingOrganizationName(deltaSharingOrganizationName);
    pb.setDeltaSharingRecipientTokenLifetimeInSeconds(deltaSharingRecipientTokenLifetimeInSeconds);
    pb.setDeltaSharingScope(deltaSharingScope);
    pb.setExternalAccessEnabled(externalAccessEnabled);
    pb.setGlobalMetastoreId(globalMetastoreId);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setPrivilegeModelVersion(privilegeModelVersion);
    pb.setRegion(region);
    pb.setStorageRoot(storageRoot);
    pb.setStorageRootCredentialId(storageRootCredentialId);
    pb.setStorageRootCredentialName(storageRootCredentialName);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static GetMetastoreSummaryResponse fromPb(GetMetastoreSummaryResponsePb pb) {
    GetMetastoreSummaryResponse model = new GetMetastoreSummaryResponse();
    model.setCloud(pb.getCloud());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setDefaultDataAccessConfigId(pb.getDefaultDataAccessConfigId());
    model.setDeltaSharingOrganizationName(pb.getDeltaSharingOrganizationName());
    model.setDeltaSharingRecipientTokenLifetimeInSeconds(
        pb.getDeltaSharingRecipientTokenLifetimeInSeconds());
    model.setDeltaSharingScope(pb.getDeltaSharingScope());
    model.setExternalAccessEnabled(pb.getExternalAccessEnabled());
    model.setGlobalMetastoreId(pb.getGlobalMetastoreId());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setPrivilegeModelVersion(pb.getPrivilegeModelVersion());
    model.setRegion(pb.getRegion());
    model.setStorageRoot(pb.getStorageRoot());
    model.setStorageRootCredentialId(pb.getStorageRootCredentialId());
    model.setStorageRootCredentialName(pb.getStorageRootCredentialName());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class GetMetastoreSummaryResponseSerializer
      extends JsonSerializer<GetMetastoreSummaryResponse> {
    @Override
    public void serialize(
        GetMetastoreSummaryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetMetastoreSummaryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetMetastoreSummaryResponseDeserializer
      extends JsonDeserializer<GetMetastoreSummaryResponse> {
    @Override
    public GetMetastoreSummaryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetMetastoreSummaryResponsePb pb = mapper.readValue(p, GetMetastoreSummaryResponsePb.class);
      return GetMetastoreSummaryResponse.fromPb(pb);
    }
  }
}
