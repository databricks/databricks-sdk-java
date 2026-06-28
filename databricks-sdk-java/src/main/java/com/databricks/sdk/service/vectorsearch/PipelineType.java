// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * Pipeline execution mode. - `TRIGGERED`: If the pipeline uses the triggered execution mode, the
 * system stops processing after successfully refreshing the source table in the pipeline once,
 * ensuring the table is updated based on the data available when the update started. -
 * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it
 * arrives in the source table to keep vector index fresh.
 */
@Generated
public enum PipelineType {
  CONTINUOUS, // If the pipeline uses continuous execution, the pipeline processes new data as
  // it arrives in the source table to keep vector index fresh.
  TRIGGERED, // If the pipeline uses the triggered execution mode, the system stops
  // processing after successfully refreshing the source table in the pipeline
  // once, ensuring the table is updated based on the data available when the
  // update started.

}
