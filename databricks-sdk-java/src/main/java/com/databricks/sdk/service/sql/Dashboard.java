// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A JSON representing a dashboard containing widgets of visualizations and text
 * boxes.
 */
public class Dashboard {
    /**
     * Whether the authenticated user can edit the query definition.
     */
    @JsonProperty("can_edit")
    private Boolean canEdit;
    
    /**
     * Timestamp when this dashboard was created.
     */
    @JsonProperty("created_at")
    private String createdAt;
    
    /**
     * In the web application, query filters that share a name are coupled to a
     * single selection box if this value is `true`.
     */
    @JsonProperty("dashboard_filters_enabled")
    private Boolean dashboardFiltersEnabled;
    
    /**
     * The ID for this dashboard.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Indicates whether a dashboard is trashed. Trashed dashboards won't appear
     * in list views. If this boolean is `true`, the `options` property for this
     * dashboard includes a `moved_to_trash_at` timestamp. Items in trash are
     * permanently deleted after 30 days.
     */
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    /**
     * Whether a dashboard is a draft. Draft dashboards only appear in list
     * views for their owners.
     */
    @JsonProperty("is_draft")
    private Boolean isDraft;
    
    /**
     * Indicates whether this query object appears in the current user's
     * favorites list. This flag determines whether the star icon for favorites
     * is selected.
     */
    @JsonProperty("is_favorite")
    private Boolean isFavorite;
    
    /**
     * The title of the dashboard that appears in list views and at the top of
     * the dashboard page.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     
     */
    @JsonProperty("options")
    private DashboardOptions options;
    
    /**
     * The identifier of the parent folder containing the dashboard. Available
     * for dashboards in workspace.
     */
    @JsonProperty("parent")
    private String parent;
    
    /**
     * This describes an enum
     */
    @JsonProperty("permission_tier")
    private PermissionLevel permissionTier;
    
    /**
     * URL slug. Usually mirrors the query name with dashes (`-`) instead of
     * spaces. Appears in the URL for this query.
     */
    @JsonProperty("slug")
    private String slug;
    
    /**
     
     */
    @JsonProperty("tags")
    private java.util.List<String> tags;
    
    /**
     * Timestamp when this dashboard was last updated.
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    
    /**
     
     */
    @JsonProperty("user")
    private User user;
    
    /**
     * The ID of the user that created and owns this dashboard.
     */
    @JsonProperty("user_id")
    private Long userId;
    
    /**
     
     */
    @JsonProperty("widgets")
    private java.util.List<Widget> widgets;
    
    public Dashboard setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }
    
    public Dashboard setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    
    public Dashboard setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
        this.dashboardFiltersEnabled = dashboardFiltersEnabled;
        return this;
    }

    public Boolean getDashboardFiltersEnabled() {
        return dashboardFiltersEnabled;
    }
    
    public Dashboard setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public Dashboard setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    
    public Dashboard setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
        return this;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    
    public Dashboard setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }
    
    public Dashboard setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public Dashboard setOptions(DashboardOptions options) {
        this.options = options;
        return this;
    }

    public DashboardOptions getOptions() {
        return options;
    }
    
    public Dashboard setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent() {
        return parent;
    }
    
    public Dashboard setPermissionTier(PermissionLevel permissionTier) {
        this.permissionTier = permissionTier;
        return this;
    }

    public PermissionLevel getPermissionTier() {
        return permissionTier;
    }
    
    public Dashboard setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getSlug() {
        return slug;
    }
    
    public Dashboard setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    
    public Dashboard setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    
    public Dashboard setUser(User user) {
        this.user = user;
        return this;
    }

    public User getUser() {
        return user;
    }
    
    public Dashboard setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }
    
    public Dashboard setWidgets(java.util.List<Widget> widgets) {
        this.widgets = widgets;
        return this;
    }

    public java.util.List<Widget> getWidgets() {
        return widgets;
    }
    
}
