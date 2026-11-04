// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Batch SQL input for a detection rule. */
@Generated
public class RuleInputBatchSql {
  /**
   * Default catalog used to resolve unqualified identifiers in `query`. If unset, the rule's
   * `catalog_name` is used.
   */
  @JsonProperty("default_catalog_name")
  private String defaultCatalogName;

  /**
   * Default schema used to resolve unqualified identifiers in `query`. If unset, the rule's
   * `schema_name` is used.
   */
  @JsonProperty("default_schema_name")
  private String defaultSchemaName;

  /** SQL query evaluated as the rule input. */
  @JsonProperty("query")
  private String query;

  public RuleInputBatchSql setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public RuleInputBatchSql setDefaultSchemaName(String defaultSchemaName) {
    this.defaultSchemaName = defaultSchemaName;
    return this;
  }

  public String getDefaultSchemaName() {
    return defaultSchemaName;
  }

  public RuleInputBatchSql setQuery(String query) {
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
    RuleInputBatchSql that = (RuleInputBatchSql) o;
    return Objects.equals(defaultCatalogName, that.defaultCatalogName)
        && Objects.equals(defaultSchemaName, that.defaultSchemaName)
        && Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCatalogName, defaultSchemaName, query);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleInputBatchSql.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("defaultSchemaName", defaultSchemaName)
        .add("query", query)
        .toString();
  }
}
