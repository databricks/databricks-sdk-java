// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** unexpected state */
@Generated
public class InvalidState extends BadRequest {
  public InvalidState(String message, ErrorDetails details) {
    super("INVALID_STATE", message, details);
  }
}
