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

/** Next ID: 40 */
@Generated
@JsonSerialize(using = SchemaInfo.SchemaInfoSerializer.class)
@JsonDeserialize(using = SchemaInfo.SchemaInfoDeserializer.class)
public class SchemaInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** Name of parent catalog. */
  private String catalogName;

  /** The type of the parent catalog. */
  private CatalogType catalogType;

  /** User-provided free-form text description. */
  private String comment;

  /** Time at which this schema was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of schema creator. */
  private String createdBy;

  /** */
  private EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /** Full name of schema, in form of __catalog_name__.__schema_name__. */
  private String fullName;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  /** Name of schema, relative to parent catalog. */
  private String name;

  /** Username of current owner of schema. */
  private String owner;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /** The unique identifier of the schema. */
  private String schemaId;

  /** Storage location for managed tables within schema. */
  private String storageLocation;

  /** Storage root URL for managed tables within schema. */
  private String storageRoot;

  /** Time at which this schema was created, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified schema. */
  private String updatedBy;

  public SchemaInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public SchemaInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public SchemaInfo setCatalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  public CatalogType getCatalogType() {
    return catalogType;
  }

  public SchemaInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public SchemaInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public SchemaInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SchemaInfo setEffectivePredictiveOptimizationFlag(
      EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
    this.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
    return this;
  }

  public EffectivePredictiveOptimizationFlag getEffectivePredictiveOptimizationFlag() {
    return effectivePredictiveOptimizationFlag;
  }

  public SchemaInfo setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public SchemaInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public SchemaInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public SchemaInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SchemaInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public SchemaInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public SchemaInfo setSchemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  public String getSchemaId() {
    return schemaId;
  }

  public SchemaInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public SchemaInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public SchemaInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public SchemaInfo setUpdatedBy(String updatedBy) {
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
    SchemaInfo that = (SchemaInfo) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(
            effectivePredictiveOptimizationFlag, that.effectivePredictiveOptimizationFlag)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(schemaId, that.schemaId)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogName,
        catalogType,
        comment,
        createdAt,
        createdBy,
        effectivePredictiveOptimizationFlag,
        enablePredictiveOptimization,
        fullName,
        metastoreId,
        name,
        owner,
        properties,
        schemaId,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaInfo.class)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("effectivePredictiveOptimizationFlag", effectivePredictiveOptimizationFlag)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .add("schemaId", schemaId)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  SchemaInfoPb toPb() {
    SchemaInfoPb pb = new SchemaInfoPb();
    pb.setBrowseOnly(browseOnly);
    pb.setCatalogName(catalogName);
    pb.setCatalogType(catalogType);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setEffectivePredictiveOptimizationFlag(effectivePredictiveOptimizationFlag);
    pb.setEnablePredictiveOptimization(enablePredictiveOptimization);
    pb.setFullName(fullName);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setProperties(properties);
    pb.setSchemaId(schemaId);
    pb.setStorageLocation(storageLocation);
    pb.setStorageRoot(storageRoot);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static SchemaInfo fromPb(SchemaInfoPb pb) {
    SchemaInfo model = new SchemaInfo();
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setCatalogName(pb.getCatalogName());
    model.setCatalogType(pb.getCatalogType());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setEffectivePredictiveOptimizationFlag(pb.getEffectivePredictiveOptimizationFlag());
    model.setEnablePredictiveOptimization(pb.getEnablePredictiveOptimization());
    model.setFullName(pb.getFullName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setProperties(pb.getProperties());
    model.setSchemaId(pb.getSchemaId());
    model.setStorageLocation(pb.getStorageLocation());
    model.setStorageRoot(pb.getStorageRoot());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class SchemaInfoSerializer extends JsonSerializer<SchemaInfo> {
    @Override
    public void serialize(SchemaInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SchemaInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SchemaInfoDeserializer extends JsonDeserializer<SchemaInfo> {
    @Override
    public SchemaInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SchemaInfoPb pb = mapper.readValue(p, SchemaInfoPb.class);
      return SchemaInfo.fromPb(pb);
    }
  }
}
