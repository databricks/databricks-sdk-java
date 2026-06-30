// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** this error is used as a fallback if the platform-side mapping is missing some reason */
@Generated
public class Unknown extends InternalError {
  public Unknown(String message, ErrorDetails details) {
    super("UNKNOWN", message, details);
  }
}
