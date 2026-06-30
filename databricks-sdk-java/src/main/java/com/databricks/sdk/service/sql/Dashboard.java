// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A JSON representing a dashboard containing widgets of visualizations and text boxes. */
@Generated
public class Dashboard {
  /** Whether the authenticated user can edit the query definition. */
  @JsonProperty("can_edit")
  private Boolean canEdit;

  /** Timestamp when this dashboard was created. */
  @JsonProperty("created_at")
  private String createdAt;

  /**
   * In the web application, query filters that share a name are coupled to a single selection box
   * if this value is `true`.
   */
  @JsonProperty("dashboard_filters_enabled")
  private Boolean dashboardFiltersEnabled;

  /** The ID for this dashboard. */
  @JsonProperty("id")
  private String id;

  /**
   * Indicates whether a dashboard is trashed. Trashed dashboards won't appear in list views. If
   * this boolean is `true`, the `options` property for this dashboard includes a
   * `moved_to_trash_at` timestamp. Items in trash are permanently deleted after 30 days.
   */
  @JsonProperty("is_archived")
  private Boolean isArchived;

  /**
   * Whether a dashboard is a draft. Draft dashboards only appear in list views for their owners.
   */
  @JsonProperty("is_draft")
  private Boolean isDraft;

  /**
   * Indicates whether this query object appears in the current user's favorites list. This flag
   * determines whether the star icon for favorites is selected.
   */
  @JsonProperty("is_favorite")
  private Boolean isFavorite;

  /** The title of the dashboard that appears in list views and at the top of the dashboard page. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("options")
  private DashboardOptions options;

  /** The identifier of the workspace folder containing the object. */
  @JsonProperty("parent")
  private String parent;

  /**
   * * `CAN_VIEW`: Can view the query * `CAN_RUN`: Can run the query * `CAN_EDIT`: Can edit the
   * query * `CAN_MANAGE`: Can manage the query
   */
  @JsonProperty("permission_tier")
  private PermissionLevel permissionTier;

  /**
   * URL slug. Usually mirrors the query name with dashes (`-`) instead of spaces. Appears in the
   * URL for this query.
   */
  @JsonProperty("slug")
  private String slug;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  /** Timestamp when this dashboard was last updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  /** */
  @JsonProperty("user")
  private User user;

  /** The ID of the user who owns the dashboard. */
  @JsonProperty("user_id")
  private Long userId;

  /** */
  @JsonProperty("widgets")
  private Collection<Widget> widgets;

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

  public Dashboard setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
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

  public Dashboard setWidgets(Collection<Widget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Collection<Widget> getWidgets() {
    return widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dashboard that = (Dashboard) o;
    return Objects.equals(canEdit, that.canEdit)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(dashboardFiltersEnabled, that.dashboardFiltersEnabled)
        && Objects.equals(id, that.id)
        && Objects.equals(isArchived, that.isArchived)
        && Objects.equals(isDraft, that.isDraft)
        && Objects.equals(isFavorite, that.isFavorite)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(permissionTier, that.permissionTier)
        && Objects.equals(slug, that.slug)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(user, that.user)
        && Objects.equals(userId, that.userId)
        && Objects.equals(widgets, that.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canEdit,
        createdAt,
        dashboardFiltersEnabled,
        id,
        isArchived,
        isDraft,
        isFavorite,
        name,
        options,
        parent,
        permissionTier,
        slug,
        tags,
        updatedAt,
        user,
        userId,
        widgets);
  }

  @Override
  public String toString() {
    return new ToStringer(Dashboard.class)
        .add("canEdit", canEdit)
        .add("createdAt", createdAt)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("id", id)
        .add("isArchived", isArchived)
        .add("isDraft", isDraft)
        .add("isFavorite", isFavorite)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("permissionTier", permissionTier)
        .add("slug", slug)
        .add("tags", tags)
        .add("updatedAt", updatedAt)
        .add("user", user)
        .add("userId", userId)
        .add("widgets", widgets)
        .toString();
  }
}
