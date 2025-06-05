// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class QueryBackedValuePb {
  @JsonProperty("multi_values_options")
  private MultiValuesOptions multiValuesOptions;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("values")
  private Collection<String> values;

  public QueryBackedValuePb setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public QueryBackedValuePb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryBackedValuePb setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryBackedValuePb that = (QueryBackedValuePb) o;
    return Objects.equals(multiValuesOptions, that.multiValuesOptions)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiValuesOptions, queryId, values);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryBackedValuePb.class)
        .add("multiValuesOptions", multiValuesOptions)
        .add("queryId", queryId)
        .add("values", values)
        .toString();
  }
}
