// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * This describes an enum
 */
@Generated
public enum RegistryWebhookStatus{
  ACTIVE,// Webhook is triggered when an associated event happens.
  DISABLED,// Webhook is not triggered.
  TEST_MODE,// Webhook can be triggered through the test endpoint, but is not triggered on a
// real event.
  
}