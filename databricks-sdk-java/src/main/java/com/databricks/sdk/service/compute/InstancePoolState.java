// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The state of a Cluster. The current allowable state transitions are as follows:
 *
 * <ul>
 *   <li>{@code ACTIVE} -&gt; {@code STOPPED}
 *   <li>{@code ACTIVE} -&gt; {@code DELETED}
 *   <li>{@code STOPPED} -&gt; {@code ACTIVE}
 *   <li>{@code STOPPED} -&gt; {@code DELETED}
 * </ul>
 */
@Generated
public enum InstancePoolState {
  ACTIVE,
  DELETED,
  STOPPED,
}
