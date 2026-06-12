// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * An optional value indicating the condition that determines whether the task should be run once
 * its dependencies have been completed. When omitted, defaults to {@code ALL_SUCCESS}.
 *
 * <p>Possible values are:
 *
 * <ul>
 *   <li>{@code ALL_SUCCESS}: All dependencies have executed and succeeded
 *   <li>{@code AT_LEAST_ONE_SUCCESS}: At least one dependency has succeeded
 *   <li>{@code NONE_FAILED}: None of the dependencies have failed and at least one was executed
 *   <li>{@code ALL_DONE}: All dependencies have been completed
 *   <li>{@code AT_LEAST_ONE_FAILED}: At least one dependency failed
 *   <li>{@code ALL_FAILED}: ALl dependencies have failed
 * </ul>
 */
@Generated
public enum RunIf {
  ALL_DONE, // All dependencies have been completed
  ALL_FAILED, // ALl dependencies have failed
  ALL_SUCCESS, // All dependencies have executed and succeeded
  AT_LEAST_ONE_FAILED, // At least one dependency failed
  AT_LEAST_ONE_SUCCESS, // At least one dependency has succeeded
  NONE_FAILED, // None of the dependencies have failed and at least one was executed
}
