// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** invalid parameter value */
@Generated
public class InvalidParameterValue extends BadRequest {
  public InvalidParameterValue(String message, ErrorDetails details) {
    super("INVALID_PARAMETER_VALUE", message, details);
  }
}
