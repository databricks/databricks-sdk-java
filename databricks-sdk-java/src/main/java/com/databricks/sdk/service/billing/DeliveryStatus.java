// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum DeliveryStatus {
  @JsonProperty("CREATED")
  CREATED, // There were no log delivery attempts since the config was created.

  @JsonProperty("NOT_FOUND")
  NOT_FOUND, // The log delivery status as the configuration has been disabled since the
  // release of this feature or there are no workspaces in the account.

  @JsonProperty("SUCCEEDED")
  SUCCEEDED, // The latest attempt of log delivery has succeeded completely.

  @JsonProperty("SYSTEM_FAILURE")
  SYSTEM_FAILURE, // The latest attempt of log delivery failed because of an <Databricks> internal
  // error. Contact support if it doesn't go away soon.

  @JsonProperty("USER_FAILURE")
  USER_FAILURE, // The latest attempt of log delivery failed because of misconfiguration of
  // customer provided permissions on role or storage.

}
