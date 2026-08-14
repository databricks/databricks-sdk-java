// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * Release channel of the underlying pipeline's runtime. PREVIEW provides early access to the latest
 * features but may be less stable. Some source table configurations (e.g., read-time CDF) require
 * PREVIEW. Defaults to CURRENT if not specified.
 */
@Generated
public enum NewPipelineSpecPipelineChannel {
  CURRENT,
  PREVIEW,
}
