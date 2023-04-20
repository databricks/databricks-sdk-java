// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class QueryEndpointResponse {
  /** The predictions returned by the serving endpoint. */
  @JsonProperty("predictions")
  private Collection<Object /* MISSING TYPE */> predictions;

  public QueryEndpointResponse setPredictions(Collection<Object /* MISSING TYPE */> predictions) {
    this.predictions = predictions;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getPredictions() {
    return predictions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointResponse that = (QueryEndpointResponse) o;
    return Objects.equals(predictions, that.predictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictions);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointResponse.class).add("predictions", predictions).toString();
  }
}
