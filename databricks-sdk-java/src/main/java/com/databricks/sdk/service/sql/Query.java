// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Query {
    /**
     * Describes whether the authenticated user is allowed to edit the
     * definition of this query.
     */
    @JsonProperty("can_edit")
    private Boolean canEdit;
    
    /**
     * The timestamp when this query was created.
     */
    @JsonProperty("created_at")
    private String createdAt;
    
    /**
     * Data Source ID. The UUID that uniquely identifies this data source / SQL
     * warehouse across the API.
     */
    @JsonProperty("data_source_id")
    private String dataSourceId;
    
    /**
     * General description that conveys additional information about this query
     * such as usage notes.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Indicates whether the query is trashed. Trashed queries can't be used in
     * dashboards, or appear in search results. If this boolean is `true`, the
     * `options` property for this query includes a `moved_to_trash_at`
     * timestamp. Trashed queries are permanently deleted after 30 days.
     */
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    /**
     * Whether the query is a draft. Draft queries only appear in list views for
     * their owners. Visualizations from draft queries cannot appear on
     * dashboards.
     */
    @JsonProperty("is_draft")
    private Boolean isDraft;
    
    /**
     * Whether this query object appears in the current user's favorites list.
     * This flag determines whether the star icon for favorites is selected.
     */
    @JsonProperty("is_favorite")
    private Boolean isFavorite;
    
    /**
     * Text parameter types are not safe from SQL injection for all types of
     * data source. Set this Boolean parameter to `true` if a query either does
     * not use any text type parameters or uses a data source type where text
     * type parameters are handled safely.
     */
    @JsonProperty("is_safe")
    private Boolean isSafe;
    
    /**
     
     */
    @JsonProperty("last_modified_by")
    private User lastModifiedBy;
    
    /**
     * The ID of the user who last saved changes to this query.
     */
    @JsonProperty("last_modified_by_id")
    private Long lastModifiedById;
    
    /**
     * If there is a cached result for this query and user, this field includes
     * the query result ID. If this query uses parameters, this field is always
     * null.
     */
    @JsonProperty("latest_query_data_id")
    private String latestQueryDataId;
    
    /**
     * The title of this query that appears in list views, widget headings, and
     * on the query page.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     
     */
    @JsonProperty("options")
    private QueryOptions options;
    
    /**
     * The identifier of the parent folder containing the query. Available for
     * queries in workspace.
     */
    @JsonProperty("parent")
    private String parent;
    
    /**
     * This describes an enum
     */
    @JsonProperty("permission_tier")
    private PermissionLevel permissionTier;
    
    /**
     * The text of the query to be run.
     */
    @JsonProperty("query")
    private String query;
    
    /**
     * A SHA-256 hash of the query text along with the authenticated user ID.
     */
    @JsonProperty("query_hash")
    private String queryHash;
    
    /**
     
     */
    @JsonProperty("tags")
    private java.util.List<String> tags;
    
    /**
     * The timestamp at which this query was last updated.
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    
    /**
     
     */
    @JsonProperty("user")
    private User user;
    
    /**
     * The ID of the user who created this query.
     */
    @JsonProperty("user_id")
    private Long userId;
    
    /**
     
     */
    @JsonProperty("visualizations")
    private java.util.List<Visualization> visualizations;
    
    public Query setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }
    
    public Query setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    
    public Query setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    
    public Query setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public Query setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public Query setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    
    public Query setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
        return this;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    
    public Query setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }
    
    public Query setIsSafe(Boolean isSafe) {
        this.isSafe = isSafe;
        return this;
    }

    public Boolean getIsSafe() {
        return isSafe;
    }
    
    public Query setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }
    
    public Query setLastModifiedById(Long lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
        return this;
    }

    public Long getLastModifiedById() {
        return lastModifiedById;
    }
    
    public Query setLatestQueryDataId(String latestQueryDataId) {
        this.latestQueryDataId = latestQueryDataId;
        return this;
    }

    public String getLatestQueryDataId() {
        return latestQueryDataId;
    }
    
    public Query setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public Query setOptions(QueryOptions options) {
        this.options = options;
        return this;
    }

    public QueryOptions getOptions() {
        return options;
    }
    
    public Query setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent() {
        return parent;
    }
    
    public Query setPermissionTier(PermissionLevel permissionTier) {
        this.permissionTier = permissionTier;
        return this;
    }

    public PermissionLevel getPermissionTier() {
        return permissionTier;
    }
    
    public Query setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return query;
    }
    
    public Query setQueryHash(String queryHash) {
        this.queryHash = queryHash;
        return this;
    }

    public String getQueryHash() {
        return queryHash;
    }
    
    public Query setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    
    public Query setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    
    public Query setUser(User user) {
        this.user = user;
        return this;
    }

    public User getUser() {
        return user;
    }
    
    public Query setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }
    
    public Query setVisualizations(java.util.List<Visualization> visualizations) {
        this.visualizations = visualizations;
        return this;
    }

    public java.util.List<Visualization> getVisualizations() {
        return visualizations;
    }
    
}
