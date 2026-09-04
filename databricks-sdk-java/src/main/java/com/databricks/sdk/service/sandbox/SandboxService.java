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
   * and exit code in a single response. Unary convenience variant of the streaming
   * command-execution API for callers that only need a command's final result (e.g. `curl`, the
   * SDK's `sandbox.exec`). The streaming `ExecuteCommand` RPC remains for interactive and
   * long-running use.
   */
  ExecuteCommandSyncResponse executeCommandSync(
      ExecuteCommandSyncRequest executeCommandSyncRequest);

  /** Retrieves a Sandbox by name. */
  Sandbox getSandbox(GetSandboxRequest getSandboxRequest);

  /** Lists all Sandboxes. */
  ListSandboxesResponse listSandboxes(ListSandboxesRequest listSandboxesRequest);

  /**
   * Starts a stopped Sandbox by atomically restoring the TerminatedSandbox tombstone to the active
   * table in PENDING and re-running the provisioning workflow. The provisioning workflow's
   * claimWarmPoolSandbox step re-mints the app_instance_name (deterministic from sandbox_id, so
   * equal to the prior life's name). The tombstone's volume_id is preserved so the new AppInstance
   * binds to the same backing device file. The restored sandbox gets a fresh uid and create_time.
   * Returns NOT_FOUND if no tombstone exists for the given (workspace_id, sandbox_id) — the sandbox
   * may not exist or may currently be active; clients can disambiguate via Get.
   */
  Sandbox startSandbox(StartSandboxRequest startSandboxRequest);

  /**
   * Stops a Sandbox, terminating the sandbox while allowing future use of StartSandbox to
   * re-provision the same Sandbox without re-creating a brand new one. Transitions the active row
   * to TERMINATING with USER_REQUEST_STOP; the termination workflow settles to a TerminatedSandbox
   * tombstone (no row drop) so the sandbox can later be restarted via StartSandbox.
   */
  Sandbox stopSandbox(StopSandboxRequest stopSandboxRequest);

  /**
   * Updates mutable fields on an existing Sandbox. Allowlisted update_mask paths today:
   * metadata.display_name, spec.compute.inactivity_timeout. Returns INVALID_PARAMETER_VALUE for
   * empty masks or unknown paths; NOT_FOUND if no active row or tombstone exists for the given
   * sandbox. Concurrent-update conflicts surface as ABORTED via EStore OccConflict.
   */
  Sandbox updateSandbox(UpdateSandboxRequest updateSandboxRequest);
}
