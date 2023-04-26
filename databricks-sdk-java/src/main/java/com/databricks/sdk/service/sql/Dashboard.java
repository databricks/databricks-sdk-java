// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A JSON representing a dashboard containing widgets of visualizations and text boxes.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * The identifier of the parent folder containing the dashboard. Available for dashboards in
   * workspace.
   */
  @JsonProperty("parent")
  private String parent;

  /** This describes an enum */
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

  /** The ID of the user that created and owns this dashboard. */
  @JsonProperty("user_id")
  private Long userId;

  /** */
  @JsonProperty("widgets")
  private Collection<Widget> widgets;

  /**
   * <p>Setter for the field <code>canEdit</code>.</p>
   *
   * @param canEdit a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setCanEdit(Boolean canEdit) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setCreatedAt(String createdAt) {
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
   * <p>Setter for the field <code>dashboardFiltersEnabled</code>.</p>
   *
   * @param dashboardFiltersEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboardFiltersEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setId(String id) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setIsArchived(Boolean isArchived) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setIsDraft(Boolean isDraft) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setIsFavorite(Boolean isFavorite) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setName(String name) {
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
   * @param options a {@link com.databricks.sdk.service.sql.DashboardOptions} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setOptions(DashboardOptions options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.DashboardOptions} object
   */
  public DashboardOptions getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>parent</code>.</p>
   *
   * @param parent a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setParent(String parent) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setPermissionTier(PermissionLevel permissionTier) {
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
   * <p>Setter for the field <code>slug</code>.</p>
   *
   * @param slug a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setSlug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * <p>Getter for the field <code>slug</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSlug() {
    return slug;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setTags(Collection<String> tags) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setUpdatedAt(String updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setUser(User user) {
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
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setUserId(Long userId) {
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
   * <p>Setter for the field <code>widgets</code>.</p>
   *
   * @param widgets a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard setWidgets(Collection<Widget> widgets) {
    this.widgets = widgets;
    return this;
  }

  /**
   * <p>Getter for the field <code>widgets</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Widget> getWidgets() {
    return widgets;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
