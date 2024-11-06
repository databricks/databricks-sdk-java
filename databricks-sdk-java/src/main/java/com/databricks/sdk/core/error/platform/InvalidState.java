// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** unexpected state */
@Generated
public class InvalidState extends BadRequest {
  public InvalidState(String message, List<ErrorDetail> details) {
    super("INVALID_STATE", message, details);
  }
}
