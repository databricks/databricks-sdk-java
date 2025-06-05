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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = RegisteredModelInfo.RegisteredModelInfoSerializer.class)
@JsonDeserialize(using = RegisteredModelInfo.RegisteredModelInfoDeserializer.class)
public class RegisteredModelInfo {
  /** List of aliases associated with the registered model */
  private Collection<RegisteredModelAlias> aliases;

  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** The name of the catalog where the schema and the registered model reside */
  private String catalogName;

  /** The comment attached to the registered model */
  private String comment;

  /** Creation timestamp of the registered model in milliseconds since the Unix epoch */
  private Long createdAt;

  /** The identifier of the user who created the registered model */
  private String createdBy;

  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** The unique identifier of the metastore */
  private String metastoreId;

  /** The name of the registered model */
  private String name;

  /** The identifier of the user who owns the registered model */
  private String owner;

  /** The name of the schema where the registered model resides */
  private String schemaName;

  /** The storage location on the cloud under which model version data files are stored */
  private String storageLocation;

  /** Last-update timestamp of the registered model in milliseconds since the Unix epoch */
  private Long updatedAt;

  /** The identifier of the user who updated the registered model last time */
  private String updatedBy;

  public RegisteredModelInfo setAliases(Collection<RegisteredModelAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<RegisteredModelAlias> getAliases() {
    return aliases;
  }

  public RegisteredModelInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public RegisteredModelInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public RegisteredModelInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public RegisteredModelInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RegisteredModelInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RegisteredModelInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public RegisteredModelInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public RegisteredModelInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RegisteredModelInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public RegisteredModelInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public RegisteredModelInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public RegisteredModelInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RegisteredModelInfo setUpdatedBy(String updatedBy) {
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
    RegisteredModelInfo that = (RegisteredModelInfo) o;
    return Objects.equals(aliases, that.aliases)
        && Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aliases,
        browseOnly,
        catalogName,
        comment,
        createdAt,
        createdBy,
        fullName,
        metastoreId,
        name,
        owner,
        schemaName,
        storageLocation,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelInfo.class)
        .add("aliases", aliases)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  RegisteredModelInfoPb toPb() {
    RegisteredModelInfoPb pb = new RegisteredModelInfoPb();
    pb.setAliases(aliases);
    pb.setBrowseOnly(browseOnly);
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setFullName(fullName);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setSchemaName(schemaName);
    pb.setStorageLocation(storageLocation);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static RegisteredModelInfo fromPb(RegisteredModelInfoPb pb) {
    RegisteredModelInfo model = new RegisteredModelInfo();
    model.setAliases(pb.getAliases());
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setFullName(pb.getFullName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setSchemaName(pb.getSchemaName());
    model.setStorageLocation(pb.getStorageLocation());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class RegisteredModelInfoSerializer extends JsonSerializer<RegisteredModelInfo> {
    @Override
    public void serialize(RegisteredModelInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelInfoDeserializer
      extends JsonDeserializer<RegisteredModelInfo> {
    @Override
    public RegisteredModelInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelInfoPb pb = mapper.readValue(p, RegisteredModelInfoPb.class);
      return RegisteredModelInfo.fromPb(pb);
    }
  }
}
