// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateTransitionRequestResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateTransitionRequestResponse {
  /** Transition request details. */
  @JsonProperty("request")
  private TransitionRequest request;

  /**
   * <p>Setter for the field <code>request</code>.</p>
   *
   * @param request a {@link com.databricks.sdk.service.ml.TransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateTransitionRequestResponse} object
   */
  public CreateTransitionRequestResponse setRequest(TransitionRequest request) {
    this.request = request;
    return this;
  }

  /**
   * <p>Getter for the field <code>request</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.TransitionRequest} object
   */
  public TransitionRequest getRequest() {
    return request;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTransitionRequestResponse that = (CreateTransitionRequestResponse) o;
    return Objects.equals(request, that.request);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateTransitionRequestResponse.class).add("request", request).toString();
  }
}
