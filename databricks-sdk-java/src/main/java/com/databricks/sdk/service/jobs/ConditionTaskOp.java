// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 *
 *
 * <ul>
 *   <li>{@code EQUAL_TO}, {@code NOT_EQUAL} operators perform string comparison of their operands.
 *       This means that {@code “12.0” == “12”} will evaluate to {@code false}.
 *   <li>{@code GREATER_THAN}, {@code GREATER_THAN_OR_EQUAL}, {@code LESS_THAN}, {@code
 *       LESS_THAN_OR_EQUAL} operators perform numeric comparison of their operands. {@code “12.0”
 *       >= “12”} will evaluate to {@code true}, {@code “10.0” >= “12”} will evaluate to {@code
 *       false}.
 * </ul>
 *
 * The boolean comparison to task values can be implemented with operators {@code EQUAL_TO}, {@code
 * NOT_EQUAL}. If a task value was set to a boolean value, it will be serialized to {@code “true”}
 * or {@code “false”} for the comparison.
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
