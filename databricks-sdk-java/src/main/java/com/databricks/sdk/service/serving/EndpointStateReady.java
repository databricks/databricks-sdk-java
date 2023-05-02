// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * The state of an endpoint, indicating whether or not the endpoint is queryable. An endpoint is
 * READY if all of the served models in its active configuration are ready. If any of the actively
 * served models are in a non-ready state, the endpoint state will be NOT_READY.
 */
@Generated
public enum EndpointStateReady {
  NOT_READY,
  READY,
}
