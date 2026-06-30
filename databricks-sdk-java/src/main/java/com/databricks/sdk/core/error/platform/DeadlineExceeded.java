// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the deadline expired before the operation could complete */
@Generated
public class DeadlineExceeded extends DatabricksError {
  public DeadlineExceeded(String message, ErrorDetails details) {
    super("DEADLINE_EXCEEDED", message, 504, details);
  }

  public DeadlineExceeded(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 504, details);
  }
}
