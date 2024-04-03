// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Cancel refresh */
@Generated
public class CancelRefreshRequest {
  /** Full name of the table. */
  private String fullName;

  /** ID of the refresh. */
  private String refreshId;

  public CancelRefreshRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CancelRefreshRequest setRefreshId(String refreshId) {
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
    CancelRefreshRequest that = (CancelRefreshRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(refreshId, that.refreshId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, refreshId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRefreshRequest.class)
        .add("fullName", fullName)
        .add("refreshId", refreshId)
        .toString();
  }
}
