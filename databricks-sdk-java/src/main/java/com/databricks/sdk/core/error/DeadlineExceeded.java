// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the deadline expired before the operation could complete */
@Generated
public class DeadlineExceeded extends DatabricksError {
  public DeadlineExceeded(String message, List<ErrorDetail> details) {
    super("DEADLINE_EXCEEDED", message, 504, details);
  }

  DeadlineExceeded(String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}
