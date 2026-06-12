// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 *
 *
 * <ul>
 *   <li>{@code BUNDLE}: The job is managed by Databricks Asset Bundle.
 *   <li>{@code SYSTEM_MANAGED}: The job is managed by Databricks and is read-only.
 * </ul>
 */
@Generated
public enum JobDeploymentKind {
  BUNDLE, // The job is managed by Databricks Asset Bundle.
  SYSTEM_MANAGED, // The job is managed by <Databricks> and is read-only.
}
