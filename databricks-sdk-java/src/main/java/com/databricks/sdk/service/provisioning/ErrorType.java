// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorType and WarningType are used to represent the type of error or warning by NetworkHealth and
 * NetworkWarning defined in central/api/accounts/accounts.proto
 */
@Generated
public enum ErrorType {
  @JsonProperty("credentials")
  CREDENTIALS,

  @JsonProperty("networkAcl")
  NETWORK_ACL,

  @JsonProperty("securityGroup")
  SECURITY_GROUP,

  @JsonProperty("subnet")
  SUBNET,

  @JsonProperty("vpc")
  VPC,
}
