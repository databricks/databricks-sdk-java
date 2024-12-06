// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueryAttachment {
  /** */
  @JsonProperty("cached_query_schema")
  private QuerySchema cachedQuerySchema;

  /** Description of the query */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("id")
  private String id;

  /** If the query was created on an instruction (trusted asset) we link to the id */
  @JsonProperty("instruction_id")
  private String instructionId;

  /**
   * Always store the title next to the id in case the original instruction title changes or the
   * instruction is deleted.
   */
  @JsonProperty("instruction_title")
  private String instructionTitle;

  /** Time when the user updated the query last */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** AI generated SQL query */
  @JsonProperty("query")
  private String query;

  /** Name of the query */
  @JsonProperty("title")
  private String title;

  public QueryAttachment setCachedQuerySchema(QuerySchema cachedQuerySchema) {
    this.cachedQuerySchema = cachedQuerySchema;
    return this;
  }

  public QuerySchema getCachedQuerySchema() {
    return cachedQuerySchema;
  }

  public QueryAttachment setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QueryAttachment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public QueryAttachment setInstructionId(String instructionId) {
    this.instructionId = instructionId;
    return this;
  }

  public String getInstructionId() {
    return instructionId;
  }

  public QueryAttachment setInstructionTitle(String instructionTitle) {
    this.instructionTitle = instructionTitle;
    return this;
  }

  public String getInstructionTitle() {
    return instructionTitle;
  }

  public QueryAttachment setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public QueryAttachment setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public QueryAttachment setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryAttachment that = (QueryAttachment) o;
    return Objects.equals(cachedQuerySchema, that.cachedQuerySchema)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(instructionId, that.instructionId)
        && Objects.equals(instructionTitle, that.instructionTitle)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(query, that.query)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cachedQuerySchema,
        description,
        id,
        instructionId,
        instructionTitle,
        lastUpdatedTimestamp,
        query,
        title);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryAttachment.class)
        .add("cachedQuerySchema", cachedQuerySchema)
        .add("description", description)
        .add("id", id)
        .add("instructionId", instructionId)
        .add("instructionTitle", instructionTitle)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("query", query)
        .add("title", title)
        .toString();
  }
}
