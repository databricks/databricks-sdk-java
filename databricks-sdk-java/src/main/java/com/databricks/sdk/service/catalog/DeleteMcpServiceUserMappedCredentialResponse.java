// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete returns no resource; a dedicated (empty) response keeps the revoke RPC's shape owned here
 * rather than google.protobuf.Empty.
 */
@Generated
public class DeleteMcpServiceUserMappedCredentialResponse {

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
    return new ToStringer(DeleteMcpServiceUserMappedCredentialResponse.class).toString();
  }
}
