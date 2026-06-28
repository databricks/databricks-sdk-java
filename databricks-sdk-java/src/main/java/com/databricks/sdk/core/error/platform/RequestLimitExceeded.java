// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** cluster request was rejected because it would exceed a resource limit */
@Generated
public class RequestLimitExceeded extends TooManyRequests {
  public RequestLimitExceeded(String message, ErrorDetails details) {
    super("REQUEST_LIMIT_EXCEEDED", message, details);
  }
}
