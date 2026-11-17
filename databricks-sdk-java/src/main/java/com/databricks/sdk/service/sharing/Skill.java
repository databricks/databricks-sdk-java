// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An agent skill shared through a Delta Sharing share, as served to a recipient. */
@Generated
public class Skill {
  /** The name from the skill bundle frontmatter, which may differ from the resource name. */
  @JsonProperty("bundle_name")
  private String bundleName;

  /** The comment of the skill. */
  @JsonProperty("comment")
  private String comment;

  /** The bundle description parsed from the skill bundle's SKILL.md frontmatter. */
  @JsonProperty("description")
  private String description;

  /**
   * The shared-object ID that recipients match replicas on. For a skill shared through its schema,
   * which has no shared-object row, this is derived from the shared schema and the skill.
   */
  @JsonProperty("id")
  private String id;

  /** The name of the skill. */
  @JsonProperty("name")
  private String name;

  /** The name of the schema that the skill belongs to. */
  @JsonProperty("schema")
  private String schema;

  /** The name of the share that the skill belongs to. */
  @JsonProperty("share")
  private String share;

  /** The id of the share that the skill belongs to. */
  @JsonProperty("share_id")
  private String shareId;

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

  public Skill setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Skill setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Skill setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Skill setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public Skill setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public Skill setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Skill that = (Skill) o;
    return Objects.equals(bundleName, that.bundleName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleName, comment, description, id, name, schema, share, shareId);
  }

  @Override
  public String toString() {
    return new ToStringer(Skill.class)
        .add("bundleName", bundleName)
        .add("comment", comment)
        .add("description", description)
        .add("id", id)
        .add("name", name)
        .add("schema", schema)
        .add("share", share)
        .add("shareId", shareId)
        .toString();
  }
}
