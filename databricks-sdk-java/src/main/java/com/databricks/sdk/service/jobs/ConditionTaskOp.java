// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * * `EQUAL_TO`, `NOT_EQUAL` operators perform string comparison of their operands. This means that
 * `“12.0” == “12”` will evaluate to `false`. * `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`,
 * `LESS_THAN`, `LESS_THAN_OR_EQUAL` operators perform numeric comparison of their operands. `“12.0”
 * >= “12”` will evaluate to `true`, `“10.0” >= “12”` will evaluate to `false`.
 *
 * <p>The boolean comparison to task values can be implemented with operators `EQUAL_TO`,
 * `NOT_EQUAL`. If a task value was set to a boolean value, it will be serialized to `“true”` or
 * `“false”` for the comparison.
 */
@Generated
public enum ConditionTaskOp {
  EQUAL_TO,
  GREATER_THAN,
  GREATER_THAN_OR_EQUAL,
  LESS_THAN,
  LESS_THAN_OR_EQUAL,
  NOT_EQUAL,
}
