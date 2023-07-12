// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class AlertQuery {
  /**
   * The timestamp when this query was created.
   */
  @JsonProperty("created_at")
  private String createdAt;
  
  /**
   * Data source ID.
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
   * Query ID.
   */
  @JsonProperty("id")
  private String id;
  
  /**
   * Indicates whether the query is trashed. Trashed queries can't be used in
   * dashboards, or appear in search results. If this boolean is `true`, the
   * `options` property for this query includes a `moved_to_trash_at` timestamp.
   * Trashed queries are permanently deleted after 30 days.
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
   * Text parameter types are not safe from SQL injection for all types of data
   * source. Set this Boolean parameter to `true` if a query either does not use
   * any text type parameters or uses a data source type where text type
   * parameters are handled safely.
   */
  @JsonProperty("is_safe")
  private Boolean isSafe;
  
  /**
   * The title of this query that appears in list views, widget headings, and on
   * the query page.
   */
  @JsonProperty("name")
  private String name;
  
  /**
   
   */
  @JsonProperty("options")
  private QueryOptions options;
  
  /**
   * The text of the query to be run.
   */
  @JsonProperty("query")
  private String query;
  
  /**
   
   */
  @JsonProperty("tags")
  private Collection<String> tags;
  
  /**
   * The timestamp at which this query was last updated.
   */
  @JsonProperty("updated_at")
  private String updatedAt;
  
  /**
   * The ID of the user who created this query.
   */
  @JsonProperty("user_id")
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
    && Objects.equals(userId, that.userId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, dataSourceId, description, id, isArchived, isDraft, isSafe, name, options, query, tags, updatedAt, userId);
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
      .add("userId", userId).toString();
  }
}
