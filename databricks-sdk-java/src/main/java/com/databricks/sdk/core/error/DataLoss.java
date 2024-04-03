// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/** unrecoverable data loss or corruption */
@Generated
public class DataLoss extends InternalError {
  public DataLoss(String message, List<ErrorDetail> details) {
    super("DATA_LOSS", message, details);
  }
}
