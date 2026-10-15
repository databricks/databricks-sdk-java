// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** A quality or operational problem found in an experiment's traces. */
@Generated
public class Issue {
  /**
   * At most 10 values of at most 64 UTF-8 bytes each, unique case-insensitively. Leading and
   * trailing whitespace is trimmed.
   */
  @JsonProperty("categories")
  private Collection<String> categories;

  /** When the Issue was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * The email of the user whose request created the Issue. source_type tells whether issue
   * detection created it.
   */
  @JsonProperty("created_by")
  private String createdBy;

  /** Markdown, at most 32 KiB. */
  @JsonProperty("description")
  private String description;

  /** The last segment of `name`. Issue assessments on traces reference the Issue by this ID. */
  @JsonProperty("issue_id")
  private String issueId;

  /**
   * The request time of the latest trace the Issue affects. Required, and can't be cleared, unless
   * source_type is MANUAL. A MANUAL Issue without one returns its create_time.
   */
  @JsonProperty("last_seen_time")
  private Timestamp lastSeenTime;

  /** The email of the user whose request last updated the Issue. */
  @JsonProperty("last_updated_by")
  private String lastUpdatedBy;

  /**
   * Additional details about the Issue, such as how issue detection observed it. Not a stable
   * contract: keys and values can change without notice, so clients must tolerate unknown and
   * missing keys. At most 20 entries, with keys of at most 64 UTF-8 bytes.
   */
  @JsonProperty("metadata")
  private Map<String, String> metadata;

  /** experiments/{experiment}/issues/{issue} */
  @JsonProperty("name")
  private String name;

  /** Cannot be cleared: an Issue without a severity would match no severity filter. */
  @JsonProperty("severity")
  private IssueSeverity severity;

  /**
   * Set once at create. For ADHOC_RUN and SCHEDULED_RUN, the ID of the issue detection run in the
   * same experiment that created the Issue. Absent for MANUAL.
   */
  @JsonProperty("source_id")
  private String sourceId;

  /** Set once at create. Defaults to MANUAL. */
  @JsonProperty("source_type")
  private IssueSourceType sourceType;

  /** Defaults to PENDING on create, and can't be cleared. */
  @JsonProperty("status")
  private IssueStatus status;

  /**
   * Caller-owned; the server never writes system values here. At most 10 entries. Keys match
   * ^[A-Za-z0-9_.:/-]+$ and are at most 128 UTF-8 bytes; values are at most 256 UTF-8 bytes.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  /** Non-empty, at most 250 UTF-8 bytes. */
  @JsonProperty("title")
  private String title;

  /** When the Issue was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Issue setCategories(Collection<String> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<String> getCategories() {
    return categories;
  }

  public Issue setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Issue setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Issue setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Issue setIssueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  public String getIssueId() {
    return issueId;
  }

  public Issue setLastSeenTime(Timestamp lastSeenTime) {
    this.lastSeenTime = lastSeenTime;
    return this;
  }

  public Timestamp getLastSeenTime() {
    return lastSeenTime;
  }

  public Issue setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public Issue setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public Issue setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Issue setSeverity(IssueSeverity severity) {
    this.severity = severity;
    return this;
  }

  public IssueSeverity getSeverity() {
    return severity;
  }

  public Issue setSourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  public String getSourceId() {
    return sourceId;
  }

  public Issue setSourceType(IssueSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public IssueSourceType getSourceType() {
    return sourceType;
  }

  public Issue setStatus(IssueStatus status) {
    this.status = status;
    return this;
  }

  public IssueStatus getStatus() {
    return status;
  }

  public Issue setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public Issue setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Issue setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Issue that = (Issue) o;
    return Objects.equals(categories, that.categories)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(issueId, that.issueId)
        && Objects.equals(lastSeenTime, that.lastSeenTime)
        && Objects.equals(lastUpdatedBy, that.lastUpdatedBy)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(name, that.name)
        && Objects.equals(severity, that.severity)
        && Objects.equals(sourceId, that.sourceId)
        && Objects.equals(sourceType, that.sourceType)
        && Objects.equals(status, that.status)
        && Objects.equals(tags, that.tags)
        && Objects.equals(title, that.title)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        categories,
        createTime,
        createdBy,
        description,
        issueId,
        lastSeenTime,
        lastUpdatedBy,
        metadata,
        name,
        severity,
        sourceId,
        sourceType,
        status,
        tags,
        title,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Issue.class)
        .add("categories", categories)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("issueId", issueId)
        .add("lastSeenTime", lastSeenTime)
        .add("lastUpdatedBy", lastUpdatedBy)
        .add("metadata", metadata)
        .add("name", name)
        .add("severity", severity)
        .add("sourceId", sourceId)
        .add("sourceType", sourceType)
        .add("status", status)
        .add("tags", tags)
        .add("title", title)
        .add("updateTime", updateTime)
        .toString();
  }
}
