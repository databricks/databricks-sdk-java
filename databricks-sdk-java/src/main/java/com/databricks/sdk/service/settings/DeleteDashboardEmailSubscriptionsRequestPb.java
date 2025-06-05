// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete the Dashboard Email Subscriptions setting */
@Generated
class DeleteDashboardEmailSubscriptionsRequestPb {
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  public DeleteDashboardEmailSubscriptionsRequestPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDashboardEmailSubscriptionsRequestPb that =
        (DeleteDashboardEmailSubscriptionsRequestPb) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDashboardEmailSubscriptionsRequestPb.class)
        .add("etag", etag)
        .toString();
  }
}
