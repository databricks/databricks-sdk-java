// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface MLflowMetricsService {
	/**
     * Get history of a given metric within a run.
     * 
     * Gets a list of all values for the specified metric for a given run.
     */
    GetMetricHistoryResponse getHistory(GetHistoryRequest getHistoryRequest);
    
}