// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ApproveTransitionRequestResponse {
  /** New activity generated as a result of this operation. */
  @JsonProperty("activity")
  private Activity activity;

  public ApproveTransitionRequestResponse setActivity(Activity activity) {
    this.activity = activity;
    return this;
  }

  public Activity getActivity() {
    return activity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproveTransitionRequestResponse that = (ApproveTransitionRequestResponse) o;
    return Objects.equals(activity, that.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproveTransitionRequestResponse.class)
        .add("activity", activity)
        .toString();
  }
}
