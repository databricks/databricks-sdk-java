// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * * `BUNDLE`: The job is managed by Databricks Asset Bundle. * `SYSTEM_MANAGED`: The job is managed
 * by Databricks and is read-only.
 */
@Generated
public enum JobDeploymentKind {
  BUNDLE, // The job is managed by Databricks Asset Bundle.
  SYSTEM_MANAGED, // The job is managed by <Databricks> and is read-only.
}
