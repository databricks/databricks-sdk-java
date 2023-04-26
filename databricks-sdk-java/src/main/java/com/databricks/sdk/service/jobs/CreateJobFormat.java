// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

/**
 * Used to tell what is the format of the job. This field is ignored in Create/Update/Reset calls.
 * When using the Jobs API 2.1 this value is always set to `"MULTI_TASK"`.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public enum CreateJobFormat {
  MULTI_TASK,
  SINGLE_TASK,
}
