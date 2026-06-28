// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/**
 * the operation was aborted, typically due to a concurrency issue such as a sequencer check failure
 */
@Generated
public class Aborted extends ResourceConflict {
  public Aborted(String message, ErrorDetails details) {
    super("ABORTED", message, details);
  }
}
