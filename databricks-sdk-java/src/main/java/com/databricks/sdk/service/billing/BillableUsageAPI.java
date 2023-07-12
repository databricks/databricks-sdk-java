// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



/**
 * This API allows you to download billable usage logs for the specified account
 * and date range. This feature works with all account types.
 */
@Generated
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
    download(new DownloadRequest()
      .setStartMonth(startMonth)
      .setEndMonth(endMonth));
  }
  

	/**
   * Return billable usage logs.
   * 
   * Returns billable usage logs in CSV format for the specified account and
   * date range. For the data schema, see [CSV file schema]. Note that this
   * method might take multiple minutes to complete.
   * 
   * **Warning**: Depending on the queried date range, the number of workspaces
   * in the account, the size of the response and the internet speed of the
   * caller, this API may hit a timeout after a few minutes. If you experience
   * this, try to mitigate by calling the API with narrower date ranges.
   * 
   * [CSV file schema]: https://docs.databricks.com/administration-guide/account-settings/usage-analysis.html#schema
   */
  public void download(DownloadRequest request) {
    impl.download(request);
  }
  
  public BillableUsageService impl() {
    return impl;
  }
}












