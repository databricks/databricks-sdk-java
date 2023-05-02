// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Used to tell what is the format of the job. This field is ignored in Create/Update/Reset calls.
 * When using the Jobs API 2.1 this value is always set to `"MULTI_TASK"`.
 */
@Generated
public enum JobSettingsFormat {
  MULTI_TASK,
  SINGLE_TASK,
}
