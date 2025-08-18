// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the operation was performed on a resource that does not exist */
@Generated
public class NotFound extends DatabricksError {
  public NotFound(String message, ErrorDetails details) {
    super("NOT_FOUND", message, 404, details);
  }

  public NotFound(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 404, details);
  }
}
