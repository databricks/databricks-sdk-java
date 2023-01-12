// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public enum RegistryWebhookEvent{
    COMMENT_CREATED,
    MODEL_VERSION_CREATED,
    MODEL_VERSION_TAG_SET,
    MODEL_VERSION_TRANSITIONED_STAGE,
    MODEL_VERSION_TRANSITIONED_TO_ARCHIVED,
    MODEL_VERSION_TRANSITIONED_TO_PRODUCTION,
    MODEL_VERSION_TRANSITIONED_TO_STAGING,
    REGISTERED_MODEL_CREATED,
    TRANSITION_REQUEST_CREATED,
    TRANSITION_REQUEST_TO_ARCHIVED_CREATED,
    TRANSITION_REQUEST_TO_PRODUCTION_CREATED,
    TRANSITION_REQUEST_TO_STAGING_CREATED,
    
}