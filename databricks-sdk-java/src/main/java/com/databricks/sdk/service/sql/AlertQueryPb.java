// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class AlertQueryPb {
  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("data_source_id")
  private String dataSourceId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_archived")
  private Boolean isArchived;

  @JsonProperty("is_draft")
  private Boolean isDraft;

  @JsonProperty("is_safe")
  private Boolean isSafe;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private QueryOptions options;

  @JsonProperty("query")
  private String query;

  @JsonProperty("tags")
  private Collection<String> tags;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("user_id")
  private Long userId;

  public AlertQueryPb setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public AlertQueryPb setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public AlertQueryPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AlertQueryPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AlertQueryPb setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  public Boolean getIsArchived() {
    return isArchived;
  }

  public AlertQueryPb setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public AlertQueryPb setIsSafe(Boolean isSafe) {
    this.isSafe = isSafe;
    return this;
  }

  public Boolean getIsSafe() {
    return isSafe;
  }

  public AlertQueryPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AlertQueryPb setOptions(QueryOptions options) {
    this.options = options;
    return this;
  }

  public QueryOptions getOptions() {
    return options;
  }

  public AlertQueryPb setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public AlertQueryPb setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public AlertQueryPb setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public AlertQueryPb setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertQueryPb that = (AlertQueryPb) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(isArchived, that.isArchived)
        && Objects.equals(isDraft, that.isDraft)
        && Objects.equals(isSafe, that.isSafe)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(query, that.query)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        dataSourceId,
        description,
        id,
        isArchived,
        isDraft,
        isSafe,
        name,
        options,
        query,
        tags,
        updatedAt,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertQueryPb.class)
        .add("createdAt", createdAt)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("id", id)
        .add("isArchived", isArchived)
        .add("isDraft", isDraft)
        .add("isSafe", isSafe)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("tags", tags)
        .add("updatedAt", updatedAt)
        .add("userId", userId)
        .toString();
  }
}
