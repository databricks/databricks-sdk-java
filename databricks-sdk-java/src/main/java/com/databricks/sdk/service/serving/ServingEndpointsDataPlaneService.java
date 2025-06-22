// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * Serving endpoints DataPlane provides a set of operations to interact with data plane endpoints
 * for Serving endpoints service.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ServingEndpointsDataPlaneService {

  QueryEndpointResponse query(QueryEndpointInput queryEndpointInput);
}
