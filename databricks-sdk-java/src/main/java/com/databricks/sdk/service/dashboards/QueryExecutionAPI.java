// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Query execution APIs for AI / BI Dashboards */
@Generated
public class QueryExecutionAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueryExecutionAPI.class);

  private final QueryExecutionService impl;

  /** Regular-use constructor */
  public QueryExecutionAPI(ApiClient apiClient) {
    impl = new QueryExecutionImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueryExecutionAPI(QueryExecutionService mock) {
    impl = mock;
  }

  public CancelQueryExecutionResponse cancelPublishedQueryExecution(
      String dashboardName, String dashboardRevisionId) {
    return cancelPublishedQueryExecution(
        new CancelPublishedQueryExecutionRequest()
            .setDashboardName(dashboardName)
            .setDashboardRevisionId(dashboardRevisionId));
  }

  /** Cancel the results for the a query for a published, embedded dashboard. */
  public CancelQueryExecutionResponse cancelPublishedQueryExecution(
      CancelPublishedQueryExecutionRequest request) {
    return impl.cancelPublishedQueryExecution(request);
  }

  /** Execute a query for a published dashboard. */
  public void executePublishedDashboardQuery(ExecutePublishedDashboardQueryRequest request) {
    impl.executePublishedDashboardQuery(request);
  }

  public PollQueryStatusResponse pollPublishedQueryStatus(
      String dashboardName, String dashboardRevisionId) {
    return pollPublishedQueryStatus(
        new PollPublishedQueryStatusRequest()
            .setDashboardName(dashboardName)
            .setDashboardRevisionId(dashboardRevisionId));
  }

  /** Poll the results for the a query for a published, embedded dashboard. */
  public PollQueryStatusResponse pollPublishedQueryStatus(PollPublishedQueryStatusRequest request) {
    return impl.pollPublishedQueryStatus(request);
  }

  public QueryExecutionService impl() {
    return impl;
  }
}
