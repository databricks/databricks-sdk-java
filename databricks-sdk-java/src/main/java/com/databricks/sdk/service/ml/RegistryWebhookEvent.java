// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
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