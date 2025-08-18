// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** operation is rejected due to per-user rate limiting */
@Generated
public class ResourceExhausted extends TooManyRequests {
  public ResourceExhausted(String message, ErrorDetails details) {
    super("RESOURCE_EXHAUSTED", message, details);
  }
}
