// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * Query execution APIs for AI / BI Dashboards
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueryExecutionService {
  /** Cancel the results for the a query for a published, embedded dashboard. */
  CancelQueryExecutionResponse cancelPublishedQueryExecution(
      CancelPublishedQueryExecutionRequest cancelPublishedQueryExecutionRequest);

  /** Execute a query for a published dashboard. */
  void executePublishedDashboardQuery(
      ExecutePublishedDashboardQueryRequest executePublishedDashboardQueryRequest);

  /** Poll the results for the a query for a published, embedded dashboard. */
  PollQueryStatusResponse pollPublishedQueryStatus(
      PollPublishedQueryStatusRequest pollPublishedQueryStatusRequest);
}
