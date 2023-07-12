// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AWS resource associated with this error: credentials, VPC, subnet, security group, or network
 * ACL.
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
