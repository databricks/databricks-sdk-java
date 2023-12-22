// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/** operation is rejected due to per-user rate limiting */
@Generated
public class ResourceExhausted extends TooManyRequests {
  public ResourceExhausted(String message, List<ErrorDetail> details) {
    super("RESOURCE_EXHAUSTED", message, 429, details);
  }
}
