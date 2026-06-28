// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Metadata for the WorkspaceBaseEnvironment long-running operations. This message tracks the
 * progress of the workspace base environment long-running process.
 */
@Generated
public class WorkspaceBaseEnvironmentOperationMetadata {

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
    return new ToStringer(WorkspaceBaseEnvironmentOperationMetadata.class).toString();
  }
}
