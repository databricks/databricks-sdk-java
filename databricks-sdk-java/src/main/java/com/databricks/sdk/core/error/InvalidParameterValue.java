// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/** supplied value for a parameter was invalid */
@Generated
public class InvalidParameterValue extends BadRequest {
  public InvalidParameterValue(String message, List<ErrorDetail> details) {
    super("INVALID_PARAMETER_VALUE", message, details);
  }
}
