// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * This describes an enum
 */
@Generated
public enum RunLifeCycleState{
  BLOCKED,// The run is blocked on an upstream dependency.
  INTERNAL_ERROR,// An exceptional state that indicates a failure in the Jobs service, such as
// network failure over a long period. If a run on a new cluster ends in the
// `INTERNAL_ERROR` state, the Jobs service terminates the cluster as soon as
// possible. This state is terminal.
  PENDING,// The run has been triggered. If there is not an active run of the same job,
// the cluster and execution context are being prepared. If there is already an
// active run of the same job, the run immediately transitions into the
// `SKIPPED` state without preparing any resources.
  RUNNING,// The task of this run is being executed.
  SKIPPED,// This run was aborted because a previous run of the same job was already
// active. This state is terminal.
  TERMINATED,// The task of this run has completed, and the cluster and execution context
// have been cleaned up. This state is terminal.
  TERMINATING,// The task of this run has completed, and the cluster and execution context are
// being cleaned up.
  WAITING_FOR_RETRY,// The run is waiting for a retry.
  
}