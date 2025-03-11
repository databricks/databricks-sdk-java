// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The state of a Cluster. The current allowable state transitions are as follows:
 *
 * <p>- ``ACTIVE`` -> ``STOPPED`` - ``ACTIVE`` -> ``DELETED`` - ``STOPPED`` -> ``ACTIVE`` -
 * ``STOPPED`` -> ``DELETED``
 */
@Generated
public enum InstancePoolState {
  ACTIVE,
  DELETED,
  STOPPED,
}
