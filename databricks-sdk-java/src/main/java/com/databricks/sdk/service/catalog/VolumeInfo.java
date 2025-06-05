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
@JsonSerialize(using = VolumeInfo.VolumeInfoSerializer.class)
@JsonDeserialize(using = VolumeInfo.VolumeInfoDeserializer.class)
public class VolumeInfo {
  /** The AWS access point to use when accesing s3 for this external location. */
  private String accessPoint;

  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** The name of the catalog where the schema and the volume are */
  private String catalogName;

  /** The comment attached to the volume */
  private String comment;

  /** */
  private Long createdAt;

  /** The identifier of the user who created the volume */
  private String createdBy;

  /** Encryption options that apply to clients connecting to cloud storage. */
  private EncryptionDetails encryptionDetails;

  /** The three-level (fully qualified) name of the volume */
  private String fullName;

  /** The unique identifier of the metastore */
  private String metastoreId;

  /** The name of the volume */
  private String name;

  /** The identifier of the user who owns the volume */
  private String owner;

  /** The name of the schema where the volume is */
  private String schemaName;

  /** The storage location on the cloud */
  private String storageLocation;

  /** */
  private Long updatedAt;

  /** The identifier of the user who updated the volume last time */
  private String updatedBy;

  /** The unique identifier of the volume */
  private String volumeId;

  /**
   * The type of the volume. An external volume is located in the specified external location. A
   * managed volume is located in the default location which is specified by the parent schema, or
   * the parent catalog, or the Metastore. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/aws/en/volumes/managed-vs-external
   */
  private VolumeType volumeType;

  public VolumeInfo setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public VolumeInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public VolumeInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public VolumeInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public VolumeInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public VolumeInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public VolumeInfo setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public VolumeInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public VolumeInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public VolumeInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VolumeInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public VolumeInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public VolumeInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public VolumeInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public VolumeInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public VolumeInfo setVolumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  public String getVolumeId() {
    return volumeId;
  }

  public VolumeInfo setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  public VolumeType getVolumeType() {
    return volumeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumeInfo that = (VolumeInfo) o;
    return Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(volumeId, that.volumeId)
        && Objects.equals(volumeType, that.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessPoint,
        browseOnly,
        catalogName,
        comment,
        createdAt,
        createdBy,
        encryptionDetails,
        fullName,
        metastoreId,
        name,
        owner,
        schemaName,
        storageLocation,
        updatedAt,
        updatedBy,
        volumeId,
        volumeType);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumeInfo.class)
        .add("accessPoint", accessPoint)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("encryptionDetails", encryptionDetails)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("volumeId", volumeId)
        .add("volumeType", volumeType)
        .toString();
  }

  VolumeInfoPb toPb() {
    VolumeInfoPb pb = new VolumeInfoPb();
    pb.setAccessPoint(accessPoint);
    pb.setBrowseOnly(browseOnly);
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setEncryptionDetails(encryptionDetails);
    pb.setFullName(fullName);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setSchemaName(schemaName);
    pb.setStorageLocation(storageLocation);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setVolumeId(volumeId);
    pb.setVolumeType(volumeType);

    return pb;
  }

  static VolumeInfo fromPb(VolumeInfoPb pb) {
    VolumeInfo model = new VolumeInfo();
    model.setAccessPoint(pb.getAccessPoint());
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setEncryptionDetails(pb.getEncryptionDetails());
    model.setFullName(pb.getFullName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setSchemaName(pb.getSchemaName());
    model.setStorageLocation(pb.getStorageLocation());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setVolumeId(pb.getVolumeId());
    model.setVolumeType(pb.getVolumeType());

    return model;
  }

  public static class VolumeInfoSerializer extends JsonSerializer<VolumeInfo> {
    @Override
    public void serialize(VolumeInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VolumeInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VolumeInfoDeserializer extends JsonDeserializer<VolumeInfo> {
    @Override
    public VolumeInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VolumeInfoPb pb = mapper.readValue(p, VolumeInfoPb.class);
      return VolumeInfo.fromPb(pb);
    }
  }
}
