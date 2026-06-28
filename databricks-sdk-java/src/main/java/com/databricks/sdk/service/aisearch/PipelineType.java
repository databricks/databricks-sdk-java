// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/**
 * Pipeline execution mode for a Delta Sync index. Required on create for Delta Sync indexes; the
 * legacy backend rejects an unset value with INVALID_PARAMETER_VALUE. - `TRIGGERED`: the pipeline
 * stops after refreshing the source table once, using the data available when the update started. -
 * `CONTINUOUS`: the pipeline processes new data as it arrives in the source table to keep the index
 * fresh.
 */
@Generated
public enum PipelineType {
  CONTINUOUS, // the pipeline processes new data as it arrives in the source table to
  TRIGGERED, // the pipeline stops after refreshing the source table once, using the
}
