// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AWS resource associated with this warning: a subnet or a security group. */
@Generated
public enum WarningType {
  @JsonProperty("securityGroup")
  SECURITYGROUP,

  @JsonProperty("subnet")
  SUBNET,
}
