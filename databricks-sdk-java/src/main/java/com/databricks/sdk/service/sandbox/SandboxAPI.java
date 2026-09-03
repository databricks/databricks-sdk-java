// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Create, manage, and control the lifecycle of sandboxes -- isolated, pre-configured, low-latency
 * Serverless compute environments for running code.
 */
@Generated
public class SandboxAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SandboxAPI.class);

  private final SandboxService impl;

  /** Regular-use constructor */
  public SandboxAPI(ApiClient apiClient) {
    impl = new SandboxImpl(apiClient);
  }

  /** Constructor for mocks */
  public SandboxAPI(SandboxService mock) {
    impl = mock;
  }

  /** Creates a new Sandbox. */
  public Sandbox createSandbox(CreateSandboxRequest request) {
    return impl.createSandbox(request);
  }

  public void deleteSandbox(String name) {
    deleteSandbox(new DeleteSandboxRequest().setName(name));
  }

  /** Deletes a Sandbox. */
  public void deleteSandbox(DeleteSandboxRequest request) {
    impl.deleteSandbox(request);
  }

  public Sandbox getSandbox(String name) {
    return getSandbox(new GetSandboxRequest().setName(name));
  }

  /** Retrieves a Sandbox by name. */
  public Sandbox getSandbox(GetSandboxRequest request) {
    return impl.getSandbox(request);
  }

  /** Lists all Sandboxes. */
  public Iterable<Sandbox> listSandboxes(ListSandboxesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSandboxes,
        ListSandboxesResponse::getSandboxes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Starts a stopped Sandbox by atomically restoring the TerminatedSandbox tombstone to the active
   * table in PENDING and re-running the provisioning workflow. The provisioning workflow's
   * claimWarmPoolSandbox step re-mints the app_instance_name (deterministic from sandbox_id, so
   * equal to the prior life's name). The tombstone's volume_id is preserved so the new AppInstance
   * binds to the same backing device file. The restored sandbox gets a fresh uid and create_time.
   * Returns NOT_FOUND if no tombstone exists for the given (workspace_id, sandbox_id) — the sandbox
   * may not exist or may currently be active; clients can disambiguate via Get.
   */
  public Sandbox startSandbox(StartSandboxRequest request) {
    return impl.startSandbox(request);
  }

  /**
   * Stops a Sandbox, terminating the sandbox while allowing future use of StartSandbox to
   * re-provision the same Sandbox without re-creating a brand new one. Transitions the active row
   * to TERMINATING with USER_REQUEST_STOP; the termination workflow settles to a TerminatedSandbox
   * tombstone (no row drop) so the sandbox can later be restarted via StartSandbox.
   */
  public Sandbox stopSandbox(StopSandboxRequest request) {
    return impl.stopSandbox(request);
  }

  /**
   * Updates mutable fields on an existing Sandbox. Allowlisted update_mask paths today:
   * metadata.display_name, spec.compute.inactivity_timeout. Returns INVALID_PARAMETER_VALUE for
   * empty masks or unknown paths; NOT_FOUND if no active row or tombstone exists for the given
   * sandbox. Concurrent-update conflicts surface as ABORTED via EStore OccConflict.
   */
  public Sandbox updateSandbox(UpdateSandboxRequest request) {
    return impl.updateSandbox(request);
  }

  public SandboxService impl() {
    return impl;
  }
}
