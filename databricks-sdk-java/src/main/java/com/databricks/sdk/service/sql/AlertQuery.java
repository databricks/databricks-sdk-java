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
@JsonSerialize(using = AlertQuery.AlertQuerySerializer.class)
@JsonDeserialize(using = AlertQuery.AlertQueryDeserializer.class)
public class AlertQuery {
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
   * Text parameter types are not safe from SQL injection for all types of data source. Set this
   * Boolean parameter to `true` if a query either does not use any text type parameters or uses a
   * data source type where text type parameters are handled safely.
   */
  private Boolean isSafe;

  /** The title of this query that appears in list views, widget headings, and on the query page. */
  private String name;

  /** */
  private QueryOptions options;

  /** The text of the query to be run. */
  private String query;

  /** */
  private Collection<String> tags;

  /** The timestamp at which this query was last updated. */
  private String updatedAt;

  /** The ID of the user who owns the query. */
  private Long userId;

  public AlertQuery setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public AlertQuery setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public AlertQuery setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AlertQuery setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AlertQuery setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  public Boolean getIsArchived() {
    return isArchived;
  }

  public AlertQuery setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public AlertQuery setIsSafe(Boolean isSafe) {
    this.isSafe = isSafe;
    return this;
  }

  public Boolean getIsSafe() {
    return isSafe;
  }

  public AlertQuery setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AlertQuery setOptions(QueryOptions options) {
    this.options = options;
    return this;
  }

  public QueryOptions getOptions() {
    return options;
  }

  public AlertQuery setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public AlertQuery setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public AlertQuery setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public AlertQuery setUserId(Long userId) {
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
    AlertQuery that = (AlertQuery) o;
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
    return new ToStringer(AlertQuery.class)
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

  AlertQueryPb toPb() {
    AlertQueryPb pb = new AlertQueryPb();
    pb.setCreatedAt(createdAt);
    pb.setDataSourceId(dataSourceId);
    pb.setDescription(description);
    pb.setId(id);
    pb.setIsArchived(isArchived);
    pb.setIsDraft(isDraft);
    pb.setIsSafe(isSafe);
    pb.setName(name);
    pb.setOptions(options);
    pb.setQuery(query);
    pb.setTags(tags);
    pb.setUpdatedAt(updatedAt);
    pb.setUserId(userId);

    return pb;
  }

  static AlertQuery fromPb(AlertQueryPb pb) {
    AlertQuery model = new AlertQuery();
    model.setCreatedAt(pb.getCreatedAt());
    model.setDataSourceId(pb.getDataSourceId());
    model.setDescription(pb.getDescription());
    model.setId(pb.getId());
    model.setIsArchived(pb.getIsArchived());
    model.setIsDraft(pb.getIsDraft());
    model.setIsSafe(pb.getIsSafe());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setQuery(pb.getQuery());
    model.setTags(pb.getTags());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class AlertQuerySerializer extends JsonSerializer<AlertQuery> {
    @Override
    public void serialize(AlertQuery value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertQueryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertQueryDeserializer extends JsonDeserializer<AlertQuery> {
    @Override
    public AlertQuery deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertQueryPb pb = mapper.readValue(p, AlertQueryPb.class);
      return AlertQuery.fromPb(pb);
    }
  }
}
