// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Response for SyncIndex. Empty today; reserved so future sync metadata (e.g. an operation handle)
 * can be added without breaking the wire contract.
 */
@Generated
public class SyncIndexResponse {

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
    return new ToStringer(SyncIndexResponse.class).toString();
  }
}
