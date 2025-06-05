// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

/**
 * Dirty state indicates the job is not fully synced with the job specification in the remote
 * repository.
 *
 * <p>Possible values are: * `NOT_SYNCED`: The job is not yet synced with the remote job
 * specification. Import the remote job specification from UI to make the job fully synced. *
 * `DISCONNECTED`: The job is temporary disconnected from the remote job specification and is
 * allowed for live edit. Import the remote job specification again from UI to make the job fully
 * synced.
 */
