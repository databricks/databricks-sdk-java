// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the operation was performed on a resource that does not exist */
@Generated
public class NotFound extends DatabricksError {
  public NotFound(String message, List<ErrorDetail> details) {
    super("NOT_FOUND", message, 404, details);
  }

  NotFound(String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}
