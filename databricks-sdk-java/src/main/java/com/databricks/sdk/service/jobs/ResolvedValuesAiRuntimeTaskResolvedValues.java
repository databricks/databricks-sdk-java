// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Resolved env_vars for an AiRuntimeTask after dynamic-value substitution. Mirrors the task's
 * `resolved_parameters_field` (env_vars) so Jobs can expand `{{tasks.<key>.values.<name>}}`
 * references before submission.
 */
@Generated
public class ResolvedValuesAiRuntimeTaskResolvedValues {

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
    return new ToStringer(ResolvedValuesAiRuntimeTaskResolvedValues.class).toString();
  }
}
