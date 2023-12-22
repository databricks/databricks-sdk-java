// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/** cluster request was rejected because it would exceed a resource limit */
@Generated
public class RequestLimitExceeded extends TooManyRequests {
  public RequestLimitExceeded(String message, List<ErrorDetail> details) {
    super("REQUEST_LIMIT_EXCEEDED", message, 429, details);
  }
}
