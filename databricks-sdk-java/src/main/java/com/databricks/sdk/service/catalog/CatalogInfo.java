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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = CatalogInfo.CatalogInfoSerializer.class)
@JsonDeserialize(using = CatalogInfo.CatalogInfoDeserializer.class)
public class CatalogInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** The type of the catalog. */
  private CatalogType catalogType;

  /** User-provided free-form text description. */
  private String comment;

  /** The name of the connection to an external data source. */
  private String connectionName;

  /** Time at which this catalog was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of catalog creator. */
  private String createdBy;

  /** */
  private EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /** The full name of the catalog. Corresponds with the name field. */
  private String fullName;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  private CatalogIsolationMode isolationMode;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  /** Name of catalog. */
  private String name;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** Username of current owner of catalog. */
  private String owner;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /**
   * The name of delta sharing provider.
   *
   * <p>A Delta Sharing catalog is a catalog that is based on a Delta share on a remote sharing
   * server.
   */
  private String providerName;

  /** Status of an asynchronously provisioned resource. */
  private ProvisioningInfo provisioningInfo;

  /** The type of Unity Catalog securable. */
  private SecurableType securableType;

  /** The name of the share under the share provider. */
  private String shareName;

  /** Storage Location URL (full path) for managed tables within catalog. */
  private String storageLocation;

  /** Storage root URL for managed tables within catalog. */
  private String storageRoot;

  /** Time at which this catalog was last modified, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified catalog. */
  private String updatedBy;

  public CatalogInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public CatalogInfo setCatalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  public CatalogType getCatalogType() {
    return catalogType;
  }

  public CatalogInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CatalogInfo setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public CatalogInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CatalogInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public CatalogInfo setEffectivePredictiveOptimizationFlag(
      EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
    this.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
    return this;
  }

  public EffectivePredictiveOptimizationFlag getEffectivePredictiveOptimizationFlag() {
    return effectivePredictiveOptimizationFlag;
  }

  public CatalogInfo setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public CatalogInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CatalogInfo setIsolationMode(CatalogIsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public CatalogIsolationMode getIsolationMode() {
    return isolationMode;
  }

  public CatalogInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public CatalogInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CatalogInfo setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CatalogInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CatalogInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CatalogInfo setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public CatalogInfo setProvisioningInfo(ProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
    return this;
  }

  public ProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }

  public CatalogInfo setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  public CatalogInfo setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public CatalogInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public CatalogInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public CatalogInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public CatalogInfo setUpdatedBy(String updatedBy) {
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
    CatalogInfo that = (CatalogInfo) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(
            effectivePredictiveOptimizationFlag, that.effectivePredictiveOptimizationFlag)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(provisioningInfo, that.provisioningInfo)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogType,
        comment,
        connectionName,
        createdAt,
        createdBy,
        effectivePredictiveOptimizationFlag,
        enablePredictiveOptimization,
        fullName,
        isolationMode,
        metastoreId,
        name,
        options,
        owner,
        properties,
        providerName,
        provisioningInfo,
        securableType,
        shareName,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogInfo.class)
        .add("browseOnly", browseOnly)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("connectionName", connectionName)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("effectivePredictiveOptimizationFlag", effectivePredictiveOptimizationFlag)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("isolationMode", isolationMode)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("provisioningInfo", provisioningInfo)
        .add("securableType", securableType)
        .add("shareName", shareName)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  CatalogInfoPb toPb() {
    CatalogInfoPb pb = new CatalogInfoPb();
    pb.setBrowseOnly(browseOnly);
    pb.setCatalogType(catalogType);
    pb.setComment(comment);
    pb.setConnectionName(connectionName);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setEffectivePredictiveOptimizationFlag(effectivePredictiveOptimizationFlag);
    pb.setEnablePredictiveOptimization(enablePredictiveOptimization);
    pb.setFullName(fullName);
    pb.setIsolationMode(isolationMode);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOptions(options);
    pb.setOwner(owner);
    pb.setProperties(properties);
    pb.setProviderName(providerName);
    pb.setProvisioningInfo(provisioningInfo);
    pb.setSecurableType(securableType);
    pb.setShareName(shareName);
    pb.setStorageLocation(storageLocation);
    pb.setStorageRoot(storageRoot);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static CatalogInfo fromPb(CatalogInfoPb pb) {
    CatalogInfo model = new CatalogInfo();
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setCatalogType(pb.getCatalogType());
    model.setComment(pb.getComment());
    model.setConnectionName(pb.getConnectionName());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setEffectivePredictiveOptimizationFlag(pb.getEffectivePredictiveOptimizationFlag());
    model.setEnablePredictiveOptimization(pb.getEnablePredictiveOptimization());
    model.setFullName(pb.getFullName());
    model.setIsolationMode(pb.getIsolationMode());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setOwner(pb.getOwner());
    model.setProperties(pb.getProperties());
    model.setProviderName(pb.getProviderName());
    model.setProvisioningInfo(pb.getProvisioningInfo());
    model.setSecurableType(pb.getSecurableType());
    model.setShareName(pb.getShareName());
    model.setStorageLocation(pb.getStorageLocation());
    model.setStorageRoot(pb.getStorageRoot());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class CatalogInfoSerializer extends JsonSerializer<CatalogInfo> {
    @Override
    public void serialize(CatalogInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CatalogInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CatalogInfoDeserializer extends JsonDeserializer<CatalogInfo> {
    @Override
    public CatalogInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CatalogInfoPb pb = mapper.readValue(p, CatalogInfoPb.class);
      return CatalogInfo.fromPb(pb);
    }
  }
}
