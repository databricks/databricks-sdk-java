// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * * `SUCCESS`: The run terminated without any issues * `INTERNAL_ERROR`: An error occurred in the
 * Databricks platform. Please look at the [status page] or contact support if the issue persists. *
 * `CLIENT_ERROR`: The run was terminated because of an error caused by user input or the job
 * configuration. * `CLOUD_FAILURE`: The run was terminated because of an issue with your cloud
 * provider.
 *
 * <p>[status page]: https://status.databricks.com/
 */
@Generated
public enum TerminationTypeType {
  CLIENT_ERROR, // The run was terminated because of an error caused by user input or the job
  // configuration.
  CLOUD_FAILURE, // The run was terminated because of an issue with your cloud provider.
  INTERNAL_ERROR, // An error occurred in the <Databricks> platform. Please look at the [status
  // page] or contact support if the issue persists.
  //
  // [status page]: https://status.databricks.com/
  SUCCESS, // The run terminated without any issues
}
