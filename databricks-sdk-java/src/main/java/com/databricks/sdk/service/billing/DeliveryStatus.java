// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * This describes an enum
 */
@Generated
public enum DeliveryStatus{
  CREATED,// There were no log delivery attempts since the config was created.
  NOT_FOUND,// The log delivery status as the configuration has been disabled since the
// release of this feature or there are no workspaces in the account.
  SUCCEEDED,// The latest attempt of log delivery has succeeded completely.
  SYSTEM_FAILURE,// The latest attempt of log delivery failed because of an <Databricks> internal
// error. Contact support if it doesn't go away soon.
  USER_FAILURE,// The latest attempt of log delivery failed because of misconfiguration of
// customer provided permissions on role or storage.
  
}