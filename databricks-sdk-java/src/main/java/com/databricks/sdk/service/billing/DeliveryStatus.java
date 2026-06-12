// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * The status string for log delivery. Possible values are: {@code CREATED}: There were no log
 * delivery attempts since the config was created. {@code SUCCEEDED}: The latest attempt of log
 * delivery has succeeded completely. {@code USER_FAILURE}: The latest attempt of log delivery
 * failed because of misconfiguration of customer provided permissions on role or storage. {@code
 * SYSTEM_FAILURE}: The latest attempt of log delivery failed because of an Databricks internal
 * error. Contact support if it doesn't go away soon. {@code NOT_FOUND}: The log delivery status as
 * the configuration has been disabled since the release of this feature or there are no workspaces
 * in the account.
 */
@Generated
public enum DeliveryStatus {
  CREATED,
  NOT_FOUND,
  SUCCEEDED,
  SYSTEM_FAILURE,
  USER_FAILURE,
}
