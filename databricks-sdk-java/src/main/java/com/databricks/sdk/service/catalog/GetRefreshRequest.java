// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get refresh */
@Generated
public class GetRefreshRequest {
  /** Full name of the table. */
  private String fullName;

  /** ID of the refresh. */
  private String refreshId;

  public GetRefreshRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetRefreshRequest setRefreshId(String refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public String getRefreshId() {
    return refreshId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRefreshRequest that = (GetRefreshRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(refreshId, that.refreshId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, refreshId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRefreshRequest.class)
        .add("fullName", fullName)
        .add("refreshId", refreshId)
        .toString();
  }
}
