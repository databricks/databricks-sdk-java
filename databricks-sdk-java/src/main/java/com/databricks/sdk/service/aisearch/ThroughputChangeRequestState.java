// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/**
 * State of the most recent throughput change request issued against a Storage Optimized endpoint.
 * Surfaced on `EndpointThroughputInfo.change_request_state`.
 */
@Generated
public enum ThroughputChangeRequestState {
  CHANGE_ADJUSTED,
  CHANGE_FAILED,
  CHANGE_IN_PROGRESS,
  CHANGE_REACHED_MAXIMUM,
  CHANGE_REACHED_MINIMUM,
  CHANGE_SUCCESS,
}
