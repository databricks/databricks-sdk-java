// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * When in synchronous mode with `wait_timeout > 0s` it determines the action taken when the timeout
 * is reached:
 *
 * <p>`CONTINUE` → the statement execution continues asynchronously and the call returns a statement
 * ID immediately.
 *
 * <p>`CANCEL` → the statement execution is canceled and the call returns immediately with a
 * `CANCELED` state.
 */
@Generated
public enum TimeoutAction {
  CANCEL,

  CONTINUE,
}
