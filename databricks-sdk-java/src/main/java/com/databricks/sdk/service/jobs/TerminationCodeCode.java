// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The code indicates why the run was terminated. Additional codes might be introduced in future
 * releases. * `SUCCESS`: The run was completed successfully. * `USER_CANCELED`: The run was
 * successfully canceled during execution by a user. * `CANCELED`: The run was canceled during
 * execution by the Databricks platform; for example, if the maximum run duration was exceeded. *
 * `SKIPPED`: Run was never executed, for example, if the upstream task run failed, the dependency
 * type condition was not met, or there were no material tasks to execute. * `INTERNAL_ERROR`: The
 * run encountered an unexpected error. Refer to the state message for further details. *
 * `DRIVER_ERROR`: The run encountered an error while communicating with the Spark Driver. *
 * `CLUSTER_ERROR`: The run failed due to a cluster error. Refer to the state message for further
 * details. * `REPOSITORY_CHECKOUT_FAILED`: Failed to complete the checkout due to an error when
 * communicating with the third party service. * `INVALID_CLUSTER_REQUEST`: The run failed because
 * it issued an invalid request to start the cluster. * `WORKSPACE_RUN_LIMIT_EXCEEDED`: The
 * workspace has reached the quota for the maximum number of concurrent active runs. Consider
 * scheduling the runs over a larger time frame. * `FEATURE_DISABLED`: The run failed because it
 * tried to access a feature unavailable for the workspace. * `CLUSTER_REQUEST_LIMIT_EXCEEDED`: The
 * number of cluster creation, start, and upsize requests have exceeded the allotted rate limit.
 * Consider spreading the run execution over a larger time frame. * `STORAGE_ACCESS_ERROR`: The run
 * failed due to an error when accessing the customer blob storage. Refer to the state message for
 * further details. * `RUN_EXECUTION_ERROR`: The run was completed with task failures. For more
 * details, refer to the state message or run output. * `UNAUTHORIZED_ERROR`: The run failed due to
 * a permission issue while accessing a resource. Refer to the state message for further details. *
 * `LIBRARY_INSTALLATION_ERROR`: The run failed while installing the user-requested library. Refer
 * to the state message for further details. The causes might include, but are not limited to: The
 * provided library is invalid, there are insufficient permissions to install the library, and so
 * forth. * `MAX_CONCURRENT_RUNS_EXCEEDED`: The scheduled run exceeds the limit of maximum
 * concurrent runs set for the job. * `MAX_SPARK_CONTEXTS_EXCEEDED`: The run is scheduled on a
 * cluster that has already reached the maximum number of contexts it is configured to create. See:
 * [Link]. * `RESOURCE_NOT_FOUND`: A resource necessary for run execution does not exist. Refer to
 * the state message for further details. * `INVALID_RUN_CONFIGURATION`: The run failed due to an
 * invalid configuration. Refer to the state message for further details. * `CLOUD_FAILURE`: The run
 * failed due to a cloud provider issue. Refer to the state message for further details. *
 * `MAX_JOB_QUEUE_SIZE_EXCEEDED`: The run was skipped due to reaching the job level queue size
 * limit. * `DISABLED`: The run was never executed because it was disabled explicitly by the user.
 *
 * <p>[Link]:
 * https://kb.databricks.com/en_US/notebooks/too-many-execution-contexts-are-open-right-now
 */
@Generated
public enum TerminationCodeCode {
  BUDGET_POLICY_LIMIT_EXCEEDED,
  CANCELED, // The run was canceled during execution by the <Databricks> platform; for
  // example, if the maximum run duration was exceeded.
  CLOUD_FAILURE, // The run failed due to a cloud provider issue. Refer to the state message for
  // further details.
  CLUSTER_ERROR, // The run failed due to a cluster error. Refer to the state message for further
  // details.
  CLUSTER_REQUEST_LIMIT_EXCEEDED, // The number of cluster creation, start, and upsize requests have
  // exceeded the
  // allotted rate limit. Consider spreading the run execution over a larger time
  // frame.
  DISABLED, // The run was never executed because it was disabled explicitly by the user.
  DRIVER_ERROR, // The run encountered an error while communicating with the Spark Driver.
  FEATURE_DISABLED, // The run failed because it tried to access a feature unavailable for the
  // workspace.
  INTERNAL_ERROR, // The run encountered an unexpected error. Refer to the state message for
  // further details.
  INVALID_CLUSTER_REQUEST, // The run failed because it issued an invalid request to start the
  // cluster.
  INVALID_RUN_CONFIGURATION, // The run failed due to an invalid configuration. Refer to the state
  // message
  // for further details.
  LIBRARY_INSTALLATION_ERROR, // The run failed while installing the user-requested library. Refer
  // to the
  // state message for further details. The causes might include, but are not
  // limited to: The provided library is invalid, there are insufficient
  // permissions to install the library, and so forth.
  MAX_CONCURRENT_RUNS_EXCEEDED, // The scheduled run exceeds the limit of maximum concurrent runs
  // set for the
  // job.
  MAX_JOB_QUEUE_SIZE_EXCEEDED, // The run was skipped due to reaching the job level queue size
  // limit.
  MAX_SPARK_CONTEXTS_EXCEEDED, // The run is scheduled on a cluster that has already reached the
  // maximum number
  // of contexts it is configured to create. See: [Link].
  //
  // [Link]:
  // https://kb.databricks.com/en_US/notebooks/too-many-execution-contexts-are-open-right-now
  REPOSITORY_CHECKOUT_FAILED, // Failed to complete the checkout due to an error when communicating
  // with the
  // third party service.
  RESOURCE_NOT_FOUND, // A resource necessary for run execution does not exist. Refer to the state
  // message for further details.
  RUN_EXECUTION_ERROR, // The run was completed with task failures. For more details, refer to the
  // state message or run output.
  SKIPPED, // Run was never executed, for example, if the upstream task run failed, the
  // dependency type condition was not met, or there were no material tasks to
  // execute.
  STORAGE_ACCESS_ERROR, // The run failed due to an error when accessing the customer blob storage.
  // Refer to the state message for further details.
  SUCCESS, // The run was completed successfully.
  UNAUTHORIZED_ERROR, // The run failed due to a permission issue while accessing a resource. Refer
  // to
  // the state message for further details.
  USER_CANCELED, // The run was successfully canceled during execution by a user.
  WORKSPACE_RUN_LIMIT_EXCEEDED, // The workspace has reached the quota for the maximum number of
  // concurrent
  // active runs. Consider scheduling the runs over a larger time frame.

}
