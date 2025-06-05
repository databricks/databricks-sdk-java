// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

/**
 * A value indicating the run's lifecycle state. The possible values are: * `QUEUED`: The run is
 * queued. * `PENDING`: The run is waiting to be executed while the cluster and execution context
 * are being prepared. * `RUNNING`: The task of this run is being executed. * `TERMINATING`: The
 * task of this run has completed, and the cluster and execution context are being cleaned up. *
 * `TERMINATED`: The task of this run has completed, and the cluster and execution context have been
 * cleaned up. This state is terminal. * `SKIPPED`: This run was aborted because a previous run of
 * the same job was already active. This state is terminal. * `INTERNAL_ERROR`: An exceptional state
 * that indicates a failure in the Jobs service, such as network failure over a long period. If a
 * run on a new cluster ends in the `INTERNAL_ERROR` state, the Jobs service terminates the cluster
 * as soon as possible. This state is terminal. * `BLOCKED`: The run is blocked on an upstream
 * dependency. * `WAITING_FOR_RETRY`: The run is waiting for a retry.
 */
