// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>QueryEditContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryEditContent {
  /** The ID of the data source / SQL warehouse where this query will run. */
  @JsonProperty("data_source_id")
  private String dataSourceId;

  /**
   * General description that can convey additional information about this query such as usage
   * notes.
   */
  @JsonProperty("description")
  private String description;

  /** The name or title of this query to display in list views. */
  @JsonProperty("name")
  private String name;

  /**
   * Exclusively used for storing a list parameter definitions. A parameter is an object with
   * `title`, `name`, `type`, and `value` properties. The `value` field here is the default value.
   * It can be overridden at runtime.
   */
  @JsonProperty("options")
  private Object /* MISSING TYPE */ options;

  /** The text of the query. */
  @JsonProperty("query")
  private String query;

  /** */
  private String queryId;

  /**
   * <p>Setter for the field <code>dataSourceId</code>.</p>
   *
   * @param dataSourceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setDataSourceId(String dataSourceId) {
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
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setDescription(String description) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setName(String name) {
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
   * @param options a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setOptions(Object /* MISSING TYPE */ options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>query</code>.</p>
   *
   * @param query a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setQuery(String query) {
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
   * <p>Setter for the field <code>queryId</code>.</p>
   *
   * @param queryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   */
  public QueryEditContent setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryId() {
    return queryId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEditContent that = (QueryEditContent) o;
    return Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(query, that.query)
        && Objects.equals(queryId, that.queryId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, query, queryId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryEditContent.class)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("queryId", queryId)
        .toString();
  }
}
