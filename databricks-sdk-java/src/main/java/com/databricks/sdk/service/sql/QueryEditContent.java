// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueryEditContent {
  /**
   * Data source ID maps to the ID of the data source used by the resource and is distinct from the
   * warehouse ID. [Learn more].
   *
   * <p>[Learn more]: https://docs.databricks.com/api/workspace/datasources/list
   */
  @JsonProperty("data_source_id")
  private String dataSourceId;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  @JsonProperty("description")
  private String description;

  /** The title of this query that appears in list views, widget headings, and on the query page. */
  @JsonProperty("name")
  private String name;

  /**
   * Exclusively used for storing a list parameter definitions. A parameter is an object with
   * `title`, `name`, `type`, and `value` properties. The `value` field here is the default value.
   * It can be overridden at runtime.
   */
  @JsonProperty("options")
  private Object options;

  /** The text of the query to be run. */
  @JsonProperty("query")
  private String query;

  /** */
  private String queryId;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  public QueryEditContent setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public QueryEditContent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QueryEditContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryEditContent setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public QueryEditContent setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public QueryEditContent setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryEditContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

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
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(runAsRole, that.runAsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, query, queryId, runAsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEditContent.class)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("queryId", queryId)
        .add("runAsRole", runAsRole)
        .toString();
  }
}
