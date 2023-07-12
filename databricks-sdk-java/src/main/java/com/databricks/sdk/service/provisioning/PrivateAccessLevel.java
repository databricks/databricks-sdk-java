// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The private access level controls which VPC endpoints can connect to the UI or API of any
 * workspace that attaches this private access settings object. * `ACCOUNT` level access (the
 * default) allows only VPC endpoints that are registered in your Databricks account connect to your
 * workspace. * `ENDPOINT` level access allows only specified VPC endpoints connect to your
 * workspace. For details, see `allowed_vpc_endpoint_ids`.
 */
@Generated
public enum PrivateAccessLevel {
  @JsonProperty("ACCOUNT")
  ACCOUNT,

  @JsonProperty("ENDPOINT")
  ENDPOINT,
}
