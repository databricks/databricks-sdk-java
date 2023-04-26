// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows you to download billable usage logs for the specified account and date range.
 * This feature works with all account types.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BillableUsageAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BillableUsageAPI.class);

  private final BillableUsageService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public BillableUsageAPI(ApiClient apiClient) {
    impl = new BillableUsageImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.billing.BillableUsageService} object
   */
  public BillableUsageAPI(BillableUsageService mock) {
    impl = mock;
  }

  /**
   * <p>download.</p>
   *
   * @param startMonth a {@link java.lang.String} object
   * @param endMonth a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.billing.DownloadRequest} object
   */
  public void download(DownloadRequest request) {
    impl.download(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.BillableUsageService} object
   */
  public BillableUsageService impl() {
    return impl;
  }
}
