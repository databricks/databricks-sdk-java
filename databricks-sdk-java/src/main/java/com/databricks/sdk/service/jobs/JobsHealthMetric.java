// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Specifies the health metric that is being evaluated for a particular health rule.
 *
 * <ul>
 *   <li>{@code RUN_DURATION_SECONDS}: Expected total time for a run in seconds.
 *   <li>{@code STREAMING_BACKLOG_BYTES}: An estimate of the maximum bytes of data waiting to be
 *       consumed across all streams. This metric is in Public Preview.
 *   <li>{@code STREAMING_BACKLOG_RECORDS}: An estimate of the maximum offset lag across all
 *       streams. This metric is in Public Preview.
 *   <li>{@code STREAMING_BACKLOG_SECONDS}: An estimate of the maximum consumer delay across all
 *       streams. This metric is in Public Preview.
 *   <li>{@code STREAMING_BACKLOG_FILES}: An estimate of the maximum number of outstanding files
 *       across all streams. This metric is in Public Preview.
 * </ul>
 */
@Generated
public enum JobsHealthMetric {
  RUN_DURATION_SECONDS, // Expected total time for a run in seconds.
  STREAMING_BACKLOG_BYTES, // An estimate of the maximum bytes of data waiting to be consumed across
  // all
  // streams. This metric is in Public Preview.
  STREAMING_BACKLOG_FILES, // An estimate of the maximum number of outstanding files across all
  // streams.
  // This metric is in Public Preview.
  STREAMING_BACKLOG_RECORDS, // An estimate of the maximum offset lag across all streams. This
  // metric is in
  // Public Preview.
  STREAMING_BACKLOG_SECONDS, // An estimate of the maximum consumer delay across all streams. This
  // metric is
  // in Public Preview.

}
