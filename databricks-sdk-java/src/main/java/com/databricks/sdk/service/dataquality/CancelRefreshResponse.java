// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response to cancelling a refresh. */
@Generated
public class CancelRefreshResponse {
  /** The refresh to cancel. */
  @JsonProperty("refresh")
  private Refresh refresh;

  public CancelRefreshResponse setRefresh(Refresh refresh) {
    this.refresh = refresh;
    return this;
  }

  public Refresh getRefresh() {
    return refresh;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelRefreshResponse that = (CancelRefreshResponse) o;
    return Objects.equals(refresh, that.refresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refresh);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRefreshResponse.class).add("refresh", refresh).toString();
  }
}
