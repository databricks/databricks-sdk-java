// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/**
 * The status string for log delivery. Possible values are: * `CREATED`: There were no log delivery
 * attempts since the config was created. * `SUCCEEDED`: The latest attempt of log delivery has
 * succeeded completely. * `USER_FAILURE`: The latest attempt of log delivery failed because of
 * misconfiguration of customer provided permissions on role or storage. * `SYSTEM_FAILURE`: The
 * latest attempt of log delivery failed because of an Databricks internal error. Contact support if
 * it doesn't go away soon. * `NOT_FOUND`: The log delivery status as the configuration has been
 * disabled since the release of this feature or there are no workspaces in the account.
 */
