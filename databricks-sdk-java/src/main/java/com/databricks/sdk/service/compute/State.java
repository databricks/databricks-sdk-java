// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The state of a Cluster. The current allowable state transitions are as follows:
 *
 * <p>- `PENDING` -> `RUNNING` - `PENDING` -> `TERMINATING` - `RUNNING` -> `RESIZING` - `RUNNING` ->
 * `RESTARTING` - `RUNNING` -> `TERMINATING` - `RESTARTING` -> `RUNNING` - `RESTARTING` ->
 * `TERMINATING` - `RESIZING` -> `RUNNING` - `RESIZING` -> `TERMINATING` - `TERMINATING` ->
 * `TERMINATED`
 */
@Generated
public enum State {
  ERROR,
  PENDING,
  RESIZING,
  RESTARTING,
  RUNNING,
  TERMINATED,
  TERMINATING,
  UNKNOWN,
}
