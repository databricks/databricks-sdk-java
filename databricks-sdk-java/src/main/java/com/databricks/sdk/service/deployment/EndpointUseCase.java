// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This enumeration represents the type of Databricks VPC [endpoint service]
 * that was used when creating this VPC endpoint.
 * 
 * If the VPC endpoint connects to the Databricks control plane for either the
 * front-end connection or the back-end REST API connection, the value is
 * `WORKSPACE_ACCESS`.
 * 
 * If the VPC endpoint connects to the Databricks workspace for the back-end
 * [secure cluster connectivity] relay, the value is `DATAPLANE_RELAY_ACCESS`.
 * 
 * [endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/endpoint-service.html
 * [secure cluster connectivity]: https://docs.databricks.com/security/secure-cluster-connectivity.html
 */
public enum EndpointUseCase{
    DATAPLANE_RELAY_ACCESS,
    WORKSPACE_ACCESS,
    
}