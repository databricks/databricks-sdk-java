// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The state of a Cluster. The current allowable state transitions are as follows:
 *
 * <ul>
 *   <li>{@code PENDING} -&gt; {@code RUNNING}
 *   <li>{@code PENDING} -&gt; {@code TERMINATING}
 *   <li>{@code RUNNING} -&gt; {@code RESIZING}
 *   <li>{@code RUNNING} -&gt; {@code RESTARTING}
 *   <li>{@code RUNNING} -&gt; {@code TERMINATING}
 *   <li>{@code RESTARTING} -&gt; {@code RUNNING}
 *   <li>{@code RESTARTING} -&gt; {@code TERMINATING}
 *   <li>{@code RESIZING} -&gt; {@code RUNNING}
 *   <li>{@code RESIZING} -&gt; {@code TERMINATING}
 *   <li>{@code TERMINATING} -&gt; {@code TERMINATED}
 * </ul>
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
