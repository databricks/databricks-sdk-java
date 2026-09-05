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

  /**
   * Runs a command in the sandbox and blocks until it exits, returning the captured stdout, stderr
   * and exit code in a single response.
   */
  public ExecuteCommandSyncResponse executeCommandSync(ExecuteCommandSyncRequest request) {
    return impl.executeCommandSync(request);
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
   * Starts a previously stopped Sandbox under the same sandbox name. Returns NOT_FOUND if there is
   * no stopped sandbox to start for the given name.
   */
  public Sandbox startSandbox(StartSandboxRequest request) {
    return impl.startSandbox(request);
  }

  /** Stops a running Sandbox, preserving it so it can later be restarted with a Start request. */
  public Sandbox stopSandbox(StopSandboxRequest request) {
    return impl.stopSandbox(request);
  }

  /**
   * Updates mutable fields on an existing Sandbox. Allowlisted update_mask paths today:
   * display_name, spec.compute.inactivity_timeout. Returns INVALID_PARAMETER_VALUE for empty masks
   * or unknown paths; NOT_FOUND if the sandbox does not exist.
   */
  public Sandbox updateSandbox(UpdateSandboxRequest request) {
    return impl.updateSandbox(request);
  }

  public SandboxService impl() {
    return impl;
  }
}
