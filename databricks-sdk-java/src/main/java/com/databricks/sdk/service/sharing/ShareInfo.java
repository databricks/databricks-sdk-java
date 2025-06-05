// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = ShareInfo.ShareInfoSerializer.class)
@JsonDeserialize(using = ShareInfo.ShareInfoDeserializer.class)
public class ShareInfo {
  /** User-provided free-form text description. */
  private String comment;

  /** Time at which this share was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of share creator. */
  private String createdBy;

  /** Name of the share. */
  private String name;

  /** A list of shared data objects within the share. */
  private Collection<SharedDataObject> objects;

  /** Username of current owner of share. */
  private String owner;

  /** Storage Location URL (full path) for the share. */
  private String storageLocation;

  /** Storage root URL for the share. */
  private String storageRoot;

  /** Time at which this share was updated, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of share updater. */
  private String updatedBy;

  public ShareInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ShareInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ShareInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ShareInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ShareInfo setObjects(Collection<SharedDataObject> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<SharedDataObject> getObjects() {
    return objects;
  }

  public ShareInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ShareInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public ShareInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public ShareInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ShareInfo setUpdatedBy(String updatedBy) {
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
    ShareInfo that = (ShareInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(name, that.name)
        && Objects.equals(objects, that.objects)
        && Objects.equals(owner, that.owner)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        createdAt,
        createdBy,
        name,
        objects,
        owner,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareInfo.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("name", name)
        .add("objects", objects)
        .add("owner", owner)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  ShareInfoPb toPb() {
    ShareInfoPb pb = new ShareInfoPb();
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setName(name);
    pb.setObjects(objects);
    pb.setOwner(owner);
    pb.setStorageLocation(storageLocation);
    pb.setStorageRoot(storageRoot);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static ShareInfo fromPb(ShareInfoPb pb) {
    ShareInfo model = new ShareInfo();
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setName(pb.getName());
    model.setObjects(pb.getObjects());
    model.setOwner(pb.getOwner());
    model.setStorageLocation(pb.getStorageLocation());
    model.setStorageRoot(pb.getStorageRoot());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class ShareInfoSerializer extends JsonSerializer<ShareInfo> {
    @Override
    public void serialize(ShareInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ShareInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ShareInfoDeserializer extends JsonDeserializer<ShareInfo> {
    @Override
    public ShareInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ShareInfoPb pb = mapper.readValue(p, ShareInfoPb.class);
      return ShareInfo.fromPb(pb);
    }
  }
}
