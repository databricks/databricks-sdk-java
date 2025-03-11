// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieQueryAttachment {
  /** Description of the query */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("id")
  private String id;

  /** Time when the user updated the query last */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** AI generated SQL query */
  @JsonProperty("query")
  private String query;

  /** Metadata associated with the query result. */
  @JsonProperty("query_result_metadata")
  private GenieResultMetadata queryResultMetadata;

  /**
   * Statement Execution API statement id. Use [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) to get the full result data.
   */
  @JsonProperty("statement_id")
  private String statementId;

  /** Name of the query */
  @JsonProperty("title")
  private String title;

  public GenieQueryAttachment setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieQueryAttachment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieQueryAttachment setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieQueryAttachment setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public GenieQueryAttachment setQueryResultMetadata(GenieResultMetadata queryResultMetadata) {
    this.queryResultMetadata = queryResultMetadata;
    return this;
  }

  public GenieResultMetadata getQueryResultMetadata() {
    return queryResultMetadata;
  }

  public GenieQueryAttachment setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public GenieQueryAttachment setTitle(String title) {
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
    GenieQueryAttachment that = (GenieQueryAttachment) o;
    return Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(query, that.query)
        && Objects.equals(queryResultMetadata, that.queryResultMetadata)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, id, lastUpdatedTimestamp, query, queryResultMetadata, statementId, title);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieQueryAttachment.class)
        .add("description", description)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("query", query)
        .add("queryResultMetadata", queryResultMetadata)
        .add("statementId", statementId)
        .add("title", title)
        .toString();
  }
}
