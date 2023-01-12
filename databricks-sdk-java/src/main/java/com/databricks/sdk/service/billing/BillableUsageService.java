// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * This API allows you to download billable usage logs for the specified account
 * and date range. This feature works with all account types.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface BillableUsageService {
	/**
     * Return billable usage logs.
     * 
     * Returns billable usage logs in CSV format for the specified account and
     * date range. For the data schema, see [CSV file schema]. Note that this
     * method might take multiple seconds to complete.
     * 
     * [CSV file schema]: https://docs.databricks.com/administration-guide/account-settings/usage-analysis.html#schema
     */
    void download(DownloadRequest downloadRequest);
    
}