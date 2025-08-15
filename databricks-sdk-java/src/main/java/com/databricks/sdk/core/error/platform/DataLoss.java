// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** unrecoverable data loss or corruption */
@Generated
public class DataLoss extends InternalError {
  public DataLoss(String message, ErrorDetails details) {
    super("DATA_LOSS", message, details);
  }
}
