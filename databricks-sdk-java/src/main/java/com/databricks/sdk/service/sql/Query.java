// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Query class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Query {
  /** Describes whether the authenticated user is allowed to edit the definition of this query. */
  @JsonProperty("can_edit")
  private Boolean canEdit;

  /** The timestamp when this query was created. */
  @JsonProperty("created_at")
  private String createdAt;

  /**
   * Data Source ID. The UUID that uniquely identifies this data source / SQL warehouse across the
   * API.
   */
  @JsonProperty("data_source_id")
  private String dataSourceId;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("id")
  private String id;

  /**
   * Indicates whether the query is trashed. Trashed queries can't be used in dashboards, or appear
   * in search results. If this boolean is `true`, the `options` property for this query includes a
   * `moved_to_trash_at` timestamp. Trashed queries are permanently deleted after 30 days.
   */
  @JsonProperty("is_archived")
  private Boolean isArchived;

  /**
   * Whether the query is a draft. Draft queries only appear in list views for their owners.
   * Visualizations from draft queries cannot appear on dashboards.
   */
  @JsonProperty("is_draft")
  private Boolean isDraft;

  /**
   * Whether this query object appears in the current user's favorites list. This flag determines
   * whether the star icon for favorites is selected.
   */
  @JsonProperty("is_favorite")
  private Boolean isFavorite;

  /**
   * Text parameter types are not safe from SQL injection for all types of data source. Set this
   * Boolean parameter to `true` if a query either does not use any text type parameters or uses a
   * data source type where text type parameters are handled safely.
   */
  @JsonProperty("is_safe")
  private Boolean isSafe;

  /** */
  @JsonProperty("last_modified_by")
  private User lastModifiedBy;

  /** The ID of the user who last saved changes to this query. */
  @JsonProperty("last_modified_by_id")
  private Long lastModifiedById;

  /**
   * If there is a cached result for this query and user, this field includes the query result ID.
   * If this query uses parameters, this field is always null.
   */
  @JsonProperty("latest_query_data_id")
  private String latestQueryDataId;

  /** The title of this query that appears in list views, widget headings, and on the query page. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("options")
  private QueryOptions options;

  /**
   * The identifier of the parent folder containing the query. Available for queries in workspace.
   */
  @JsonProperty("parent")
  private String parent;

  /** This describes an enum */
  @JsonProperty("permission_tier")
  private PermissionLevel permissionTier;

  /** The text of the query to be run. */
  @JsonProperty("query")
  private String query;

  /** A SHA-256 hash of the query text along with the authenticated user ID. */
  @JsonProperty("query_hash")
  private String queryHash;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  /** The timestamp at which this query was last updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  /** */
  @JsonProperty("user")
  private User user;

  /** The ID of the user who created this query. */
  @JsonProperty("user_id")
  private Long userId;

  /** */
  @JsonProperty("visualizations")
  private Collection<Visualization> visualizations;

  /**
   * <p>Setter for the field <code>canEdit</code>.</p>
   *
   * @param canEdit a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * <p>Getter for the field <code>canEdit</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCanEdit() {
    return canEdit;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>dataSourceId</code>.</p>
   *
   * @param dataSourceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataSourceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDataSourceId() {
    return dataSourceId;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>isArchived</code>.</p>
   *
   * @param isArchived a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * <p>Getter for the field <code>isArchived</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsArchived() {
    return isArchived;
  }

  /**
   * <p>Setter for the field <code>isDraft</code>.</p>
   *
   * @param isDraft a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDraft</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDraft() {
    return isDraft;
  }

  /**
   * <p>Setter for the field <code>isFavorite</code>.</p>
   *
   * @param isFavorite a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * <p>Getter for the field <code>isFavorite</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  /**
   * <p>Setter for the field <code>isSafe</code>.</p>
   *
   * @param isSafe a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setIsSafe(Boolean isSafe) {
    this.isSafe = isSafe;
    return this;
  }

  /**
   * <p>Getter for the field <code>isSafe</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsSafe() {
    return isSafe;
  }

  /**
   * <p>Setter for the field <code>lastModifiedBy</code>.</p>
   *
   * @param lastModifiedBy a {@link com.databricks.sdk.service.sql.User} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setLastModifiedBy(User lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastModifiedBy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * <p>Setter for the field <code>lastModifiedById</code>.</p>
   *
   * @param lastModifiedById a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setLastModifiedById(Long lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastModifiedById</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastModifiedById() {
    return lastModifiedById;
  }

  /**
   * <p>Setter for the field <code>latestQueryDataId</code>.</p>
   *
   * @param latestQueryDataId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setLatestQueryDataId(String latestQueryDataId) {
    this.latestQueryDataId = latestQueryDataId;
    return this;
  }

  /**
   * <p>Getter for the field <code>latestQueryDataId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLatestQueryDataId() {
    return latestQueryDataId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>options</code>.</p>
   *
   * @param options a {@link com.databricks.sdk.service.sql.QueryOptions} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setOptions(QueryOptions options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryOptions} object
   */
  public QueryOptions getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>parent</code>.</p>
   *
   * @param parent a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setParent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * <p>Getter for the field <code>parent</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getParent() {
    return parent;
  }

  /**
   * <p>Setter for the field <code>permissionTier</code>.</p>
   *
   * @param permissionTier a {@link com.databricks.sdk.service.sql.PermissionLevel} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setPermissionTier(PermissionLevel permissionTier) {
    this.permissionTier = permissionTier;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionTier</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.PermissionLevel} object
   */
  public PermissionLevel getPermissionTier() {
    return permissionTier;
  }

  /**
   * <p>Setter for the field <code>query</code>.</p>
   *
   * @param query a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setQuery(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Getter for the field <code>query</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQuery() {
    return query;
  }

  /**
   * <p>Setter for the field <code>queryHash</code>.</p>
   *
   * @param queryHash a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setQueryHash(String queryHash) {
    this.queryHash = queryHash;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryHash</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryHash() {
    return queryHash;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>user</code>.</p>
   *
   * @param user a {@link com.databricks.sdk.service.sql.User} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * <p>Getter for the field <code>user</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User getUser() {
    return user;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUserId() {
    return userId;
  }

  /**
   * <p>Setter for the field <code>visualizations</code>.</p>
   *
   * @param visualizations a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query setVisualizations(Collection<Visualization> visualizations) {
    this.visualizations = visualizations;
    return this;
  }

  /**
   * <p>Getter for the field <code>visualizations</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Visualization> getVisualizations() {
    return visualizations;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Query that = (Query) o;
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
        && Objects.equals(tags, that.tags)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(user, that.user)
        && Objects.equals(userId, that.userId)
        && Objects.equals(visualizations, that.visualizations);
  }

  /** {@inheritDoc} */
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
        tags,
        updatedAt,
        user,
        userId,
        visualizations);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Query.class)
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
        .add("tags", tags)
        .add("updatedAt", updatedAt)
        .add("user", user)
        .add("userId", userId)
        .add("visualizations", visualizations)
        .toString();
  }
}
