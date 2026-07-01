// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Response for canceling the pending enforcement for a cluster. If the cancel request succeeds, an
 * empty response object is returned. Otherwise, an error response is returned.
 */
@Generated
public class CancelPendingClusterEnforcementResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(CancelPendingClusterEnforcementResponse.class).toString();
  }
}
