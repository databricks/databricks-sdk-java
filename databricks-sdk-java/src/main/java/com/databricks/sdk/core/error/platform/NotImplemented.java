// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the operation is not implemented or is not supported/enabled in this service */
@Generated
public class NotImplemented extends DatabricksError {
  public NotImplemented(String message, ErrorDetails details) {
    super("NOT_IMPLEMENTED", message, 501, details);
  }

  public NotImplemented(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 501, details);
  }
}
