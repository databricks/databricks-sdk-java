// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Dirty state indicates the job is not fully synced with the job specification in the remote
 * repository.
 *
 * <p>Possible values are:
 *
 * <ul>
 *   <li>{@code NOT_SYNCED}: The job is not yet synced with the remote job specification. Import the
 *       remote job specification from UI to make the job fully synced.
 *   <li>{@code DISCONNECTED}: The job is temporary disconnected from the remote job specification
 *       and is allowed for live edit. Import the remote job specification again from UI to make the
 *       job fully synced.
 * </ul>
 */
@Generated
public enum JobSourceDirtyState {
  DISCONNECTED, // The job is temporary disconnected from the remote job specification and is
  // allowed for live edit. Import the remote job specification again from UI to
  // make the job fully synced.
  NOT_SYNCED, // The job is not yet synced with the remote job specification. Import the
  // remote job specification from UI to make the job fully synced.

}
