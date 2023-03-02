// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The state of an endpoint, indicating whether or not the endpoint is
 * queryable. An endpoint is READY if all of the served models in its active
 * configuration are ready. If any of the actively served models are in a
 * non-ready state, the endpoint state will be NOT_READY.
 */
public enum EndpointStateReady{
    NOT_READY,
    READY,
    
}