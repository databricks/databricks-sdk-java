// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage workspaces for this account. A Databricks workspace is an environment for
 * accessing all of your Databricks assets. The workspace organizes objects (notebooks, libraries,
 * and experiments) into folders, and provides access to data and computational resources such as
 * clusters and jobs.
 *
 * <p>These endpoints are available if your account is on the E2 version of the platform or on a
 * select custom plan that allows multiple workspaces per account.
 */
@Generated
public class WorkspacesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspacesAPI.class);

  private final WorkspacesService impl;

  /** Regular-use constructor */
  public WorkspacesAPI(ApiClient apiClient) {
    impl = new WorkspacesImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspacesAPI(WorkspacesService mock) {
    impl = mock;
  }

  public Workspace waitGetWorkspaceRunning(Long workspaceId) throws TimeoutException {
    return waitGetWorkspaceRunning(workspaceId, Duration.ofMinutes(20), null);
  }

  public Workspace waitGetWorkspaceRunning(
      Long workspaceId, Duration timeout, Consumer<Workspace> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<WorkspaceStatus> targetStates = Arrays.asList(WorkspaceStatus.RUNNING);
    java.util.List<WorkspaceStatus> failureStates =
        Arrays.asList(WorkspaceStatus.BANNED, WorkspaceStatus.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      Workspace poll = get(new GetWorkspaceRequest().setWorkspaceId(workspaceId));
      WorkspaceStatus status = poll.getWorkspaceStatus();
      statusMessage = poll.getWorkspaceStatusMessage();
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach RUNNING, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("workspaceId=%s", workspaceId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Creates a new workspace using a credential configuration and a storage configuration, an
   * optional network configuration (if using a customer-managed VPC), an optional managed services
   * key configuration (if using customer-managed keys for managed services), and an optional
   * storage key configuration (if using customer-managed keys for storage). The key configurations
   * used for managed services and storage encryption can be the same or different.
   *
   * <p>Important: This operation is asynchronous. A response with HTTP status code 200 means the
   * request has been accepted and is in progress, but does not mean that the workspace deployed
   * successfully and is running. The initial workspace status is typically PROVISIONING. Use the
   * workspace ID (workspace_id) field in the response to identify the new workspace and make
   * repeated GET requests with the workspace ID and check its status. The workspace becomes
   * available when the status changes to RUNNING.
   *
   * <p>You can share one customer-managed VPC with multiple workspaces in a single account. It is
   * not required to create a new VPC for each workspace. However, you cannot reuse subnets or
   * Security Groups between workspaces. If you plan to share one VPC with multiple workspaces, make
   * sure you size your VPC and subnets accordingly. Because a Databricks Account API network
   * configuration encapsulates this information, you cannot reuse a Databricks Account API network
   * configuration across workspaces.
   *
   * <p>For information about how to create a new workspace with this API including error handling,
   * see [Create a new workspace using the Account API].
   *
   * <p>Important: Customer-managed VPCs, PrivateLink, and customer-managed keys are supported on a
   * limited set of deployment and subscription types. If you have questions about availability,
   * contact your Databricks representative.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  public Wait<Workspace, Workspace> create(CreateWorkspaceRequest request) {
    Workspace response = impl.create(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetWorkspaceRunning(response.getWorkspaceId(), timeout, callback),
        response);
  }

  public Workspace delete(long workspaceId) {
    return delete(new DeleteWorkspaceRequest().setWorkspaceId(workspaceId));
  }

  /** Deletes a Databricks workspace, both specified by ID. */
  public Workspace delete(DeleteWorkspaceRequest request) {
    return impl.delete(request);
  }

  public Workspace get(long workspaceId) {
    return get(new GetWorkspaceRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Gets information including status for a Databricks workspace, specified by ID. In the response,
   * the `workspace_status` field indicates the current status. After initial workspace creation
   * (which is asynchronous), make repeated `GET` requests with the workspace ID and check its
   * status. The workspace becomes available when the status changes to `RUNNING`. For information
   * about how to create a new workspace with this API **including error handling**, see [Create a
   * new workspace using the Account API].
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  public Workspace get(GetWorkspaceRequest request) {
    return impl.get(request);
  }

  /** Lists Databricks workspaces for an account. */
  public Iterable<Workspace> list() {
    return impl.list();
  }

  /** Updates a workspace. */
  public Wait<Workspace, Workspace> update(UpdateWorkspaceRequest request) {
    Workspace response = impl.update(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetWorkspaceRunning(response.getWorkspaceId(), timeout, callback),
        response);
  }

  public WorkspacesService impl() {
    return impl;
  }
}
