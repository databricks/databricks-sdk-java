// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

/**
 * An optional value indicating the condition that determines whether the task should be run once
 * its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`.
 *
 * <p>Possible values are: * `ALL_SUCCESS`: All dependencies have executed and succeeded *
 * `AT_LEAST_ONE_SUCCESS`: At least one dependency has succeeded * `NONE_FAILED`: None of the
 * dependencies have failed and at least one was executed * `ALL_DONE`: All dependencies have been
 * completed * `AT_LEAST_ONE_FAILED`: At least one dependency failed * `ALL_FAILED`: ALl
 * dependencies have failed
 */
