// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * This enumeration represents the type of Databricks VPC [endpoint service] that was used when
 * creating this VPC endpoint.
 *
 * <p>[endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/endpoint-service.html
 */
@Generated
public enum EndpointUseCase {
  DATAPLANE_RELAY_ACCESS,
  WORKSPACE_ACCESS,
}
