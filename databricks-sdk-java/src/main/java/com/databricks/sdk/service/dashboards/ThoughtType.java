// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * ThoughtType. The possible values are:
 *
 * <ul>
 *   <li>{@code THOUGHT_TYPE_UNSPECIFIED}: Default value that should not be used.
 *   <li>{@code THOUGHT_TYPE_DESCRIPTION}: A high-level description of how the question was
 *       interpreted.
 *   <li>{@code THOUGHT_TYPE_UNDERSTANDING}: How ambiguous parts of the question were resolved.
 *   <li>{@code THOUGHT_TYPE_DATA_SOURCING}: Which tables or datasets were identified as relevant.
 *   <li>{@code THOUGHT_TYPE_INSTRUCTIONS}: Which author-defined instructions were referenced.
 *   <li>{@code THOUGHT_TYPE_STEPS}: The logical steps taken to compute the answer. The category of
 *       a Thought. Additional values may be added in the future.
 * </ul>
 */
@Generated
public enum ThoughtType {
  THOUGHT_TYPE_DATA_SOURCING, // Which tables or datasets were identified as relevant.
  THOUGHT_TYPE_DESCRIPTION, // A high-level description of how the question was interpreted.
  THOUGHT_TYPE_INSTRUCTIONS, // Which author-defined instructions were referenced.
  THOUGHT_TYPE_STEPS, // The logical steps taken to compute the answer.
  THOUGHT_TYPE_UNDERSTANDING, // How ambiguous parts of the question were resolved.
}
