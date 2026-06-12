// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 *
 *
 * <ul>
 *   <li>{@code SUCCESS}: The run terminated without any issues
 *   <li>{@code INTERNAL_ERROR}: An error occurred in the Databricks platform. Please look at the <a
 *       href="https://status.databricks.com/">status page</a> or contact support if the issue
 *       persists.
 *   <li>{@code CLIENT_ERROR}: The run was terminated because of an error caused by user input or
 *       the job configuration.
 *   <li>{@code CLOUD_FAILURE}: The run was terminated because of an issue with your cloud provider.
 * </ul>
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
