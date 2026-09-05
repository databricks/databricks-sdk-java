// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;

/**
 * Create, manage, and control the lifecycle of sandboxes -- isolated, pre-configured, low-latency
 * Serverless compute environments for running code.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SandboxService {
  /** Creates a new Sandbox. */
  Sandbox createSandbox(CreateSandboxRequest createSandboxRequest);

  /** Deletes a Sandbox. */
  void deleteSandbox(DeleteSandboxRequest deleteSandboxRequest);

  /**
   * Runs a command in the sandbox and blocks until it exits, returning the captured stdout, stderr
   * and exit code in a single response.
   */
  ExecuteCommandSyncResponse executeCommandSync(
      ExecuteCommandSyncRequest executeCommandSyncRequest);

  /** Retrieves a Sandbox by name. */
  Sandbox getSandbox(GetSandboxRequest getSandboxRequest);

  /** Lists all Sandboxes. */
  ListSandboxesResponse listSandboxes(ListSandboxesRequest listSandboxesRequest);

  /**
   * Starts a previously stopped Sandbox under the same sandbox name. Returns NOT_FOUND if there is
   * no stopped sandbox to start for the given name.
   */
  Sandbox startSandbox(StartSandboxRequest startSandboxRequest);

  /** Stops a running Sandbox, preserving it so it can later be restarted with a Start request. */
  Sandbox stopSandbox(StopSandboxRequest stopSandboxRequest);

  /**
   * Updates mutable fields on an existing Sandbox. Allowlisted update_mask paths today:
   * display_name, spec.compute.inactivity_timeout. Returns INVALID_PARAMETER_VALUE for empty masks
   * or unknown paths; NOT_FOUND if the sandbox does not exist.
   */
  Sandbox updateSandbox(UpdateSandboxRequest updateSandboxRequest);
}
