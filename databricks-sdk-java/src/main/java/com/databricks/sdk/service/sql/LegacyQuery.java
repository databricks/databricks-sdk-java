// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = LegacyQuery.LegacyQuerySerializer.class)
@JsonDeserialize(using = LegacyQuery.LegacyQueryDeserializer.class)
public class LegacyQuery {
  /** Describes whether the authenticated user is allowed to edit the definition of this query. */
  private Boolean canEdit;

  /** The timestamp when this query was created. */
  private String createdAt;

  /**
   * Data source ID maps to the ID of the data source used by the resource and is distinct from the
   * warehouse ID. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/api/workspace/datasources/list
   */
  private String dataSourceId;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  private String description;

  /** Query ID. */
  private String id;

  /**
   * Indicates whether the query is trashed. Trashed queries can't be used in dashboards, or appear
   * in search results. If this boolean is `true`, the `options` property for this query includes a
   * `moved_to_trash_at` timestamp. Trashed queries are permanently deleted after 30 days.
   */
  private Boolean isArchived;

  /**
   * Whether the query is a draft. Draft queries only appear in list views for their owners.
   * Visualizations from draft queries cannot appear on dashboards.
   */
  private Boolean isDraft;

  /**
   * Whether this query object appears in the current user's favorites list. This flag determines
   * whether the star icon for favorites is selected.
   */
  private Boolean isFavorite;

  /**
   * Text parameter types are not safe from SQL injection for all types of data source. Set this
   * Boolean parameter to `true` if a query either does not use any text type parameters or uses a
   * data source type where text type parameters are handled safely.
   */
  private Boolean isSafe;

  /** */
  private User lastModifiedBy;

  /** The ID of the user who last saved changes to this query. */
  private Long lastModifiedById;

  /**
   * If there is a cached result for this query and user, this field includes the query result ID.
   * If this query uses parameters, this field is always null.
   */
  private String latestQueryDataId;

  /** The title of this query that appears in list views, widget headings, and on the query page. */
  private String name;

  /** */
  private QueryOptions options;

  /** The identifier of the workspace folder containing the object. */
  private String parent;

  /**
   * * `CAN_VIEW`: Can view the query * `CAN_RUN`: Can run the query * `CAN_EDIT`: Can edit the
   * query * `CAN_MANAGE`: Can manage the query
   */
  private PermissionLevel permissionTier;

  /** The text of the query to be run. */
  private String query;

  /** A SHA-256 hash of the query text along with the authenticated user ID. */
  private String queryHash;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  private RunAsRole runAsRole;

  /** */
  private Collection<String> tags;

  /** The timestamp at which this query was last updated. */
  private String updatedAt;

  /** */
  private User user;

  /** The ID of the user who owns the query. */
  private Long userId;

  /** */
  private Collection<LegacyVisualization> visualizations;

  public LegacyQuery setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  public Boolean getCanEdit() {
    return canEdit;
  }

  public LegacyQuery setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyQuery setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public LegacyQuery setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public LegacyQuery setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyQuery setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  public Boolean getIsArchived() {
    return isArchived;
  }

  public LegacyQuery setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public LegacyQuery setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public LegacyQuery setIsSafe(Boolean isSafe) {
    this.isSafe = isSafe;
    return this;
  }

  public Boolean getIsSafe() {
    return isSafe;
  }

  public LegacyQuery setLastModifiedBy(User lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public User getLastModifiedBy() {
    return lastModifiedBy;
  }

  public LegacyQuery setLastModifiedById(Long lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

  public Long getLastModifiedById() {
    return lastModifiedById;
  }

  public LegacyQuery setLatestQueryDataId(String latestQueryDataId) {
    this.latestQueryDataId = latestQueryDataId;
    return this;
  }

  public String getLatestQueryDataId() {
    return latestQueryDataId;
  }

  public LegacyQuery setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyQuery setOptions(QueryOptions options) {
    this.options = options;
    return this;
  }

  public QueryOptions getOptions() {
    return options;
  }

  public LegacyQuery setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public LegacyQuery setPermissionTier(PermissionLevel permissionTier) {
    this.permissionTier = permissionTier;
    return this;
  }

  public PermissionLevel getPermissionTier() {
    return permissionTier;
  }

  public LegacyQuery setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public LegacyQuery setQueryHash(String queryHash) {
    this.queryHash = queryHash;
    return this;
  }

  public String getQueryHash() {
    return queryHash;
  }

  public LegacyQuery setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public LegacyQuery setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public LegacyQuery setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public LegacyQuery setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  public LegacyQuery setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public LegacyQuery setVisualizations(Collection<LegacyVisualization> visualizations) {
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
    LegacyQuery that = (LegacyQuery) o;
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
    return new ToStringer(LegacyQuery.class)
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

  LegacyQueryPb toPb() {
    LegacyQueryPb pb = new LegacyQueryPb();
    pb.setCanEdit(canEdit);
    pb.setCreatedAt(createdAt);
    pb.setDataSourceId(dataSourceId);
    pb.setDescription(description);
    pb.setId(id);
    pb.setIsArchived(isArchived);
    pb.setIsDraft(isDraft);
    pb.setIsFavorite(isFavorite);
    pb.setIsSafe(isSafe);
    pb.setLastModifiedBy(lastModifiedBy);
    pb.setLastModifiedById(lastModifiedById);
    pb.setLatestQueryDataId(latestQueryDataId);
    pb.setName(name);
    pb.setOptions(options);
    pb.setParent(parent);
    pb.setPermissionTier(permissionTier);
    pb.setQuery(query);
    pb.setQueryHash(queryHash);
    pb.setRunAsRole(runAsRole);
    pb.setTags(tags);
    pb.setUpdatedAt(updatedAt);
    pb.setUser(user);
    pb.setUserId(userId);
    pb.setVisualizations(visualizations);

    return pb;
  }

  static LegacyQuery fromPb(LegacyQueryPb pb) {
    LegacyQuery model = new LegacyQuery();
    model.setCanEdit(pb.getCanEdit());
    model.setCreatedAt(pb.getCreatedAt());
    model.setDataSourceId(pb.getDataSourceId());
    model.setDescription(pb.getDescription());
    model.setId(pb.getId());
    model.setIsArchived(pb.getIsArchived());
    model.setIsDraft(pb.getIsDraft());
    model.setIsFavorite(pb.getIsFavorite());
    model.setIsSafe(pb.getIsSafe());
    model.setLastModifiedBy(pb.getLastModifiedBy());
    model.setLastModifiedById(pb.getLastModifiedById());
    model.setLatestQueryDataId(pb.getLatestQueryDataId());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setParent(pb.getParent());
    model.setPermissionTier(pb.getPermissionTier());
    model.setQuery(pb.getQuery());
    model.setQueryHash(pb.getQueryHash());
    model.setRunAsRole(pb.getRunAsRole());
    model.setTags(pb.getTags());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUser(pb.getUser());
    model.setUserId(pb.getUserId());
    model.setVisualizations(pb.getVisualizations());

    return model;
  }

  public static class LegacyQuerySerializer extends JsonSerializer<LegacyQuery> {
    @Override
    public void serialize(LegacyQuery value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LegacyQueryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LegacyQueryDeserializer extends JsonDeserializer<LegacyQuery> {
    @Override
    public LegacyQuery deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LegacyQueryPb pb = mapper.readValue(p, LegacyQueryPb.class);
      return LegacyQuery.fromPb(pb);
    }
  }
}
