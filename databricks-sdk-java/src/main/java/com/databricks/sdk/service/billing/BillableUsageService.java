// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * This API allows you to download billable usage logs for the specified account
 * and date range. This feature works with all account types.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BillableUsageService {
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
  void download(DownloadRequest downloadRequest);
  
}