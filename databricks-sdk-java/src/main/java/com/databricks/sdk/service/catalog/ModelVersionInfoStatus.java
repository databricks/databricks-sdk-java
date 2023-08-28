// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Current status of the model version. Newly created model versions start in PENDING_REGISTRATION
 * status, then move to READY status once the model version files are uploaded and the model version
 * is finalized. Only model versions in READY status can be loaded for inference or served.
 */
@Generated
public enum ModelVersionInfoStatus {
  FAILED_REGISTRATION,
  PENDING_REGISTRATION,
  READY,
}
