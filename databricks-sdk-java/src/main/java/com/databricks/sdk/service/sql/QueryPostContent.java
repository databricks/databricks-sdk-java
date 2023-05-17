// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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
  private Object options;

  /**
   * The identifier of the workspace folder containing the query. The default is the user's home
   * folder.
   */
  @JsonProperty("parent")
  private String parent;

  /** The text of the query. */
  @JsonProperty("query")
  private String query;

  public QueryPostContent setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public QueryPostContent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QueryPostContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryPostContent setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public QueryPostContent setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public QueryPostContent setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, parent, query);
  }

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
