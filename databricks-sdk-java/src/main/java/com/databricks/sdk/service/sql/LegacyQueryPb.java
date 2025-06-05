// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LegacyQueryPb {
  @JsonProperty("can_edit")
  private Boolean canEdit;

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

  @JsonProperty("is_favorite")
  private Boolean isFavorite;

  @JsonProperty("is_safe")
  private Boolean isSafe;

  @JsonProperty("last_modified_by")
  private User lastModifiedBy;

  @JsonProperty("last_modified_by_id")
  private Long lastModifiedById;

  @JsonProperty("latest_query_data_id")
  private String latestQueryDataId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private QueryOptions options;

  @JsonProperty("parent")
  private String parent;

  @JsonProperty("permission_tier")
  private PermissionLevel permissionTier;

  @JsonProperty("query")
  private String query;

  @JsonProperty("query_hash")
  private String queryHash;

  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  @JsonProperty("tags")
  private Collection<String> tags;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("user")
  private User user;

  @JsonProperty("user_id")
  private Long userId;

  @JsonProperty("visualizations")
  private Collection<LegacyVisualization> visualizations;

  public LegacyQueryPb setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  public Boolean getCanEdit() {
    return canEdit;
  }

  public LegacyQueryPb setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyQueryPb setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public LegacyQueryPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public LegacyQueryPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyQueryPb setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  public Boolean getIsArchived() {
    return isArchived;
  }

  public LegacyQueryPb setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public LegacyQueryPb setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public LegacyQueryPb setIsSafe(Boolean isSafe) {
    this.isSafe = isSafe;
    return this;
  }

  public Boolean getIsSafe() {
    return isSafe;
  }

  public LegacyQueryPb setLastModifiedBy(User lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public User getLastModifiedBy() {
    return lastModifiedBy;
  }

  public LegacyQueryPb setLastModifiedById(Long lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

  public Long getLastModifiedById() {
    return lastModifiedById;
  }

  public LegacyQueryPb setLatestQueryDataId(String latestQueryDataId) {
    this.latestQueryDataId = latestQueryDataId;
    return this;
  }

  public String getLatestQueryDataId() {
    return latestQueryDataId;
  }

  public LegacyQueryPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyQueryPb setOptions(QueryOptions options) {
    this.options = options;
    return this;
  }

  public QueryOptions getOptions() {
    return options;
  }

  public LegacyQueryPb setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public LegacyQueryPb setPermissionTier(PermissionLevel permissionTier) {
    this.permissionTier = permissionTier;
    return this;
  }

  public PermissionLevel getPermissionTier() {
    return permissionTier;
  }

  public LegacyQueryPb setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public LegacyQueryPb setQueryHash(String queryHash) {
    this.queryHash = queryHash;
    return this;
  }

  public String getQueryHash() {
    return queryHash;
  }

  public LegacyQueryPb setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public LegacyQueryPb setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public LegacyQueryPb setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public LegacyQueryPb setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  public LegacyQueryPb setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public LegacyQueryPb setVisualizations(Collection<LegacyVisualization> visualizations) {
    this.visualizations = visualizations;
    return this;
  }

  public Collection<LegacyVisualization> getVisualizations() {
    return visualizations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LegacyQueryPb that = (LegacyQueryPb) o;
    return Objects.equals(canEdit, that.canEdit)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(isArchived, that.isArchived)
        && Objects.equals(isDraft, that.isDraft)
        && Objects.equals(isFavorite, that.isFavorite)
        && Objects.equals(isSafe, that.isSafe)
        && Objects.equals(lastModifiedBy, that.lastModifiedBy)
        && Objects.equals(lastModifiedById, that.lastModifiedById)
        && Objects.equals(latestQueryDataId, that.latestQueryDataId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(permissionTier, that.permissionTier)
        && Objects.equals(query, that.query)
        && Objects.equals(queryHash, that.queryHash)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(user, that.user)
        && Objects.equals(userId, that.userId)
        && Objects.equals(visualizations, that.visualizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canEdit,
        createdAt,
        dataSourceId,
        description,
        id,
        isArchived,
        isDraft,
        isFavorite,
        isSafe,
        lastModifiedBy,
        lastModifiedById,
        latestQueryDataId,
        name,
        options,
        parent,
        permissionTier,
        query,
        queryHash,
        runAsRole,
        tags,
        updatedAt,
        user,
        userId,
        visualizations);
  }

  @Override
  public String toString() {
    return new ToStringer(LegacyQueryPb.class)
        .add("canEdit", canEdit)
        .add("createdAt", createdAt)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("id", id)
        .add("isArchived", isArchived)
        .add("isDraft", isDraft)
        .add("isFavorite", isFavorite)
        .add("isSafe", isSafe)
        .add("lastModifiedBy", lastModifiedBy)
        .add("lastModifiedById", lastModifiedById)
        .add("latestQueryDataId", latestQueryDataId)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("permissionTier", permissionTier)
        .add("query", query)
        .add("queryHash", queryHash)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .add("updatedAt", updatedAt)
        .add("user", user)
        .add("userId", userId)
        .add("visualizations", visualizations)
        .toString();
  }
}
