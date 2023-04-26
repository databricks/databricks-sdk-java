// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>QueryEndpointResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryEndpointResponse {
  /** The predictions returned by the serving endpoint. */
  @JsonProperty("predictions")
  private Collection<Object /* MISSING TYPE */> predictions;

  /**
   * <p>Setter for the field <code>predictions</code>.</p>
   *
   * @param predictions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.QueryEndpointResponse} object
   */
  public QueryEndpointResponse setPredictions(Collection<Object /* MISSING TYPE */> predictions) {
    this.predictions = predictions;
    return this;
  }

  /**
   * <p>Getter for the field <code>predictions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Object /* MISSING TYPE */> getPredictions() {
    return predictions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointResponse that = (QueryEndpointResponse) o;
    return Objects.equals(predictions, that.predictions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(predictions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryEndpointResponse.class).add("predictions", predictions).toString();
  }
}
