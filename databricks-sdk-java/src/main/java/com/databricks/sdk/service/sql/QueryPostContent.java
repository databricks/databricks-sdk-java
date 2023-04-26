// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>QueryPostContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryPostContent {
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

  /**
   * The identifier of the workspace folder containing the query. The default is the user's home
   * folder.
   */
  @JsonProperty("parent")
  private String parent;

  /** The text of the query. */
  @JsonProperty("query")
  private String query;

  /**
   * <p>Setter for the field <code>dataSourceId</code>.</p>
   *
   * @param dataSourceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setDataSourceId(String dataSourceId) {
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
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setDescription(String description) {
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
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setOptions(Object /* MISSING TYPE */ options) {
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
   * <p>Setter for the field <code>parent</code>.</p>
   *
   * @param parent a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setParent(String parent) {
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
   * <p>Setter for the field <code>query</code>.</p>
   *
   * @param query a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   */
  public QueryPostContent setQuery(String query) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryPostContent that = (QueryPostContent) o;
    return Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(query, that.query);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, parent, query);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryPostContent.class)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("query", query)
        .toString();
  }
}
