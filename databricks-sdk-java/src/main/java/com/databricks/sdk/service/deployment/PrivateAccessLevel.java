// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The private access level controls which VPC endpoints can connect to the UI
 * or API of any workspace that attaches this private access settings object. *
 * `ANY` (deprecated): Any VPC endpoint can connect to your workspace. *
 * `ACCOUNT` level access (the default) allows only VPC endpoints that are
 * registered in your Databricks account connect to your workspace. * `ENDPOINT`
 * level access allows only specified VPC endpoints connect to your workspace.
 * For details, see `allowed_vpc_endpoint_ids`.
 */
public enum PrivateAccessLevel{
    ACCOUNT,
    ANY,
    ENDPOINT,
    
}