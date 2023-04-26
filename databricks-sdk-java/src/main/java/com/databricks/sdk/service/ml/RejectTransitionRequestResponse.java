// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RejectTransitionRequestResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RejectTransitionRequestResponse {
  /** Activity recorded for the action. */
  @JsonProperty("activity")
  private Activity activity;

  /**
   * <p>Setter for the field <code>activity</code>.</p>
   *
   * @param activity a {@link com.databricks.sdk.service.ml.Activity} object
   * @return a {@link com.databricks.sdk.service.ml.RejectTransitionRequestResponse} object
   */
  public RejectTransitionRequestResponse setActivity(Activity activity) {
    this.activity = activity;
    return this;
  }

  /**
   * <p>Getter for the field <code>activity</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity getActivity() {
    return activity;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RejectTransitionRequestResponse that = (RejectTransitionRequestResponse) o;
    return Objects.equals(activity, that.activity);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RejectTransitionRequestResponse.class)
        .add("activity", activity)
        .toString();
  }
}
