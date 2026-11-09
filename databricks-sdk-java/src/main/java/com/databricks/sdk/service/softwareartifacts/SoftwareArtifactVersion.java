// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/** An immutable version of a software artifact, identified by its content digest. */
@Generated
public class SoftwareArtifactVersion {
  /** Time at which this software artifact version was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Principal name of the software artifact version creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Content digest of the version, for example `sha256:...`. */
  @JsonProperty("digest")
  private String digest;

  /** Image acceleration information for this version. */
  @JsonProperty("image_acceleration_details")
  private ImageAccelerationDetail imageAccelerationDetails;

  /**
   * Resource name of the version, of the form
   * `software-artifacts/{catalog}.{schema}.{artifact}/versions/{version}`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Tags (aliases) that currently point at this version, for example `latest` or `v1.2.3`. Bounded
   * at 10 per version; a version pointed at by more tags returns an arbitrary 10 of them.
   */
  @JsonProperty("tags")
  private Collection<String> tags;

  /** Time at which this software artifact version was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Principal name that last updated this software artifact version. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public SoftwareArtifactVersion setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SoftwareArtifactVersion setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SoftwareArtifactVersion setDigest(String digest) {
    this.digest = digest;
    return this;
  }

  public String getDigest() {
    return digest;
  }

  public SoftwareArtifactVersion setImageAccelerationDetails(
      ImageAccelerationDetail imageAccelerationDetails) {
    this.imageAccelerationDetails = imageAccelerationDetails;
    return this;
  }

  public ImageAccelerationDetail getImageAccelerationDetails() {
    return imageAccelerationDetails;
  }

  public SoftwareArtifactVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SoftwareArtifactVersion setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public SoftwareArtifactVersion setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public SoftwareArtifactVersion setUpdatedBy(String updatedBy) {
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
    SoftwareArtifactVersion that = (SoftwareArtifactVersion) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(digest, that.digest)
        && Objects.equals(imageAccelerationDetails, that.imageAccelerationDetails)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime, createdBy, digest, imageAccelerationDetails, name, tags, updateTime, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(SoftwareArtifactVersion.class)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("digest", digest)
        .add("imageAccelerationDetails", imageAccelerationDetails)
        .add("name", name)
        .add("tags", tags)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
