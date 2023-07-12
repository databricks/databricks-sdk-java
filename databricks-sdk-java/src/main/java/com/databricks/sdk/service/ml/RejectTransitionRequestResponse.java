// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class RejectTransitionRequestResponse {
  /**
   * Activity recorded for the action.
   */
  @JsonProperty("activity")
  private Activity activity;
  
  public RejectTransitionRequestResponse setActivity(Activity activity) {
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
    RejectTransitionRequestResponse that = (RejectTransitionRequestResponse) o;
    return Objects.equals(activity, that.activity)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  @Override
  public String toString() {
    return new ToStringer(RejectTransitionRequestResponse.class)
      .add("activity", activity).toString();
  }
}
