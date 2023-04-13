// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows you to download billable usage logs for the specified account and date range.
 * This feature works with all account types.
 */
public class BillableUsageAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BillableUsageAPI.class);

  private final BillableUsageService impl;

  /** Regular-use constructor */
  public BillableUsageAPI(ApiClient apiClient) {
    impl = new BillableUsageImpl(apiClient);
  }

  /** Constructor for mocks */
  public BillableUsageAPI(BillableUsageService mock) {
    impl = mock;
  }

  public void download(String startMonth, String endMonth) {
    download(new DownloadRequest().setStartMonth(startMonth).setEndMonth(endMonth));
  }

  /**
   * Return billable usage logs.
   *
   * <p>Returns billable usage logs in CSV format for the specified account and date range. For the
   * data schema, see [CSV file schema]. Note that this method might take multiple seconds to
   * complete.
   *
   * <p>[CSV file schema]:
   * https://docs.databricks.com/administration-guide/account-settings/usage-analysis.html#schema
   */
  public void download(DownloadRequest request) {
    impl.download(request);
  }

  public BillableUsageService impl() {
    return impl;
  }
}
