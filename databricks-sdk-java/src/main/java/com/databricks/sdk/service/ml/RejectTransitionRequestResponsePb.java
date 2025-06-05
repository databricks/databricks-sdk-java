// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RejectTransitionRequestResponsePb {
  @JsonProperty("activity")
  private Activity activity;

  public RejectTransitionRequestResponsePb setActivity(Activity activity) {
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
    RejectTransitionRequestResponsePb that = (RejectTransitionRequestResponsePb) o;
    return Objects.equals(activity, that.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  @Override
  public String toString() {
    return new ToStringer(RejectTransitionRequestResponsePb.class)
        .add("activity", activity)
        .toString();
  }
}
