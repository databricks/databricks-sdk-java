// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum RegistryWebhookStatus{
    ACTIVE,// Webhook is triggered when an associated event happens.
    DISABLED,// Webhook is not triggered.
    TEST_MODE,// Webhook can be triggered through the test endpoint, but is not triggered on a
// real event.
    
}