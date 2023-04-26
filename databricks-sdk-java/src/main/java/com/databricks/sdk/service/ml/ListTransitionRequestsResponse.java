// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListTransitionRequestsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListTransitionRequestsResponse {
  /** Array of open transition requests. */
  @JsonProperty("requests")
  private Collection<Activity> requests;

  /**
   * <p>Setter for the field <code>requests</code>.</p>
   *
   * @param requests a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListTransitionRequestsResponse} object
   */
  public ListTransitionRequestsResponse setRequests(Collection<Activity> requests) {
    this.requests = requests;
    return this;
  }

  /**
   * <p>Getter for the field <code>requests</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Activity> getRequests() {
    return requests;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTransitionRequestsResponse that = (ListTransitionRequestsResponse) o;
    return Objects.equals(requests, that.requests);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsResponse.class)
        .add("requests", requests)
        .toString();
  }
}
