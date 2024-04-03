// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/**
 * the operation was aborted, typically due to a concurrency issue such as a sequencer check failure
 */
@Generated
public class Aborted extends ResourceConflict {
  public Aborted(String message, List<ErrorDetail> details) {
    super("ABORTED", message, details);
  }
}
