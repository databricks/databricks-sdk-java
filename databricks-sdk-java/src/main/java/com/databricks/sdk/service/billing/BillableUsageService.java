// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

/**
 * This API allows you to download billable usage logs for the specified account and date range.
 * This feature works with all account types.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface BillableUsageService {
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
   * @param downloadRequest a {@link com.databricks.sdk.service.billing.DownloadRequest} object
   */
  void download(DownloadRequest downloadRequest);
}
