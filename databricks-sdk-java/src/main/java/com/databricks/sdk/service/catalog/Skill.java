// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Skill is an agentskills.io bundle registered in Unity Catalog. Clients transfer bundle bytes
 * through the Files API. FinalizeSkill reads the uploaded SKILL.md and projects its frontmatter
 * onto the Skill metadata.
 */
@Generated
public class Skill {
  /**
   * Name from the most recently successfully finalized SKILL.md. It may differ from the final
   * component of the Skill resource name. Unset until FinalizeSkill succeeds.
   */
  @JsonProperty("bundle_name")
  private String bundleName;

  /**
   * User-provided comment for the skill. Free-text, user-editable via UpdateSkill (listed in its
   * `update_mask`). DISTINCT from `description`, which is the server-parsed, OUTPUT_ONLY SKILL.md
   * frontmatter value: `comment` is the customer's own annotation and is preserved across bundle
   * re-uploads. When `comment` is in the update mask, omitting it clears the field, while an
   * explicitly empty string is retained.
   */
  @JsonProperty("comment")
  private String comment;

  /** Time the skill was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator identity. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * Description from the most recently successfully finalized SKILL.md. Unset until FinalizeSkill
   * succeeds.
   */
  @JsonProperty("description")
  private String description;

  /** Owner of the skill. */
  @JsonProperty("effective_owner")
  private String effectiveOwner;

  /**
   * Optimistic concurrency token returned on every read. To make an Update or Delete conditional,
   * pass the last-read value in that request's `etag` field. In REST responses, this value is a
   * base64 string; URL-encode it when setting the `etag` query parameter.
   */
  @JsonProperty("etag")
  private String etag;

  /** Time of the most recent successful FinalizeSkill. Unset until one succeeds. */
  @JsonProperty("finalize_time")
  private Timestamp finalizeTime;

  /** Metastore hosting the skill. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * Resource name of the skill. Format: `skills/{catalog}.{schema}.{skill}`. Each `{...}` component
   * is capped at 255 characters individually. Server-derived on Create from `parent` + `skill_id`;
   * required and immutable on Update/Get/Delete.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Time of the most recent Skill metadata mutation. Uploading bundle files alone does not change
   * this value.
   */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Identity of the last updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public Skill setBundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  public String getBundleName() {
    return bundleName;
  }

  public Skill setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Skill setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Skill setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Skill setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Skill setEffectiveOwner(String effectiveOwner) {
    this.effectiveOwner = effectiveOwner;
    return this;
  }

  public String getEffectiveOwner() {
    return effectiveOwner;
  }

  public Skill setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Skill setFinalizeTime(Timestamp finalizeTime) {
    this.finalizeTime = finalizeTime;
    return this;
  }

  public Timestamp getFinalizeTime() {
    return finalizeTime;
  }

  public Skill setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public Skill setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Skill setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Skill setUpdatedBy(String updatedBy) {
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
    Skill that = (Skill) o;
    return Objects.equals(bundleName, that.bundleName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveOwner, that.effectiveOwner)
        && Objects.equals(etag, that.etag)
        && Objects.equals(finalizeTime, that.finalizeTime)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bundleName,
        comment,
        createTime,
        createdBy,
        description,
        effectiveOwner,
        etag,
        finalizeTime,
        metastoreId,
        name,
        updateTime,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(Skill.class)
        .add("bundleName", bundleName)
        .add("comment", comment)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("effectiveOwner", effectiveOwner)
        .add("etag", etag)
        .add("finalizeTime", finalizeTime)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
