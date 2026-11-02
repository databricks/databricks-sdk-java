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

  /** Creates a directory in a sandbox, including missing parents by default. */
  public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) {
    return impl.createDirectory(request);
  }

  /** Creates a new Sandbox. */
  public Sandbox createSandbox(CreateSandboxRequest request) {
    return impl.createSandbox(request);
  }

  /**
   * Deletes a file, symlink, or empty directory, with an option for recursive deletion. Succeeds if
   * the path is already absent.
   */
  public DeletePathResponse deletePath(DeletePathRequest request) {
    return impl.deletePath(request);
  }

  public void deleteSandbox(String name) {
    deleteSandbox(new DeleteSandboxRequest().setName(name));
  }

  /** Deletes a Sandbox. */
  public void deleteSandbox(DeleteSandboxRequest request) {
    impl.deleteSandbox(request);
  }

  public DownloadFileResponse downloadFile(String parent, String path) {
    return downloadFile(new DownloadFileRequest().setParent(parent).setPath(path));
  }

  /**
   * Downloads a regular file from a sandbox as an application/octet-stream body. The sandbox starts
   * automatically if it is stopped. Filesystem access uses the sandbox user's permissions and
   * follows symbolic links.
   *
   * <p>A full download returns 200 OK. A satisfiable single byte range returns 206 Partial Content.
   * Multiple byte ranges are unsupported and return 400. Invalid ranges are ignored; an
   * unsatisfiable range returns 416 with Content-Range describing the file length. Range is ignored
   * for empty files.
   *
   * <p>Conditional requests can return 304 Not Modified or 412 Precondition Failed. If-Range
   * selects a partial response only when its strong entity tag matches; otherwise, the entire file
   * is returned. HTTP-date validators in If-Range cause a full download. Reads are not snapshots:
   * concurrent in-place writes can affect the returned bytes. HEAD is unsupported.
   *
   * <p>Range and conditional options may be supplied as query parameters or HTTP headers. A
   * parameter and one header may both be supplied when their values match exactly. Conflicting
   * values or repeated parameters return 400.
   */
  public DownloadFileResponse downloadFile(DownloadFileRequest request) {
    return impl.downloadFile(request);
  }

  /**
   * Runs a command in the sandbox and blocks until it exits, returning the captured stdout, stderr
   * and exit code in a single response.
   */
  public ExecuteCommandSyncResponse executeCommandSync(ExecuteCommandSyncRequest request) {
    return impl.executeCommandSync(request);
  }

  public GetMetadataResponse getMetadata(String parent, String path) {
    return getMetadata(new GetMetadataRequest().setParent(parent).setPath(path));
  }

  /** Returns metadata for a path without following its final symlink. */
  public GetMetadataResponse getMetadata(GetMetadataRequest request) {
    return impl.getMetadata(request);
  }

  public Sandbox getSandbox(String name) {
    return getSandbox(new GetSandboxRequest().setName(name));
  }

  /** Retrieves a Sandbox by name. */
  public Sandbox getSandbox(GetSandboxRequest request) {
    return impl.getSandbox(request);
  }

  public ListCommandsResponse listCommands(String parent) {
    return listCommands(new ListCommandsRequest().setParent(parent));
  }

  /** Lists the tracked command executions (running and completed) in a sandbox. */
  public ListCommandsResponse listCommands(ListCommandsRequest request) {
    return impl.listCommands(request);
  }

  public Iterable<SandboxFileInfo> listDirectoryContents(String parent, String path) {
    return listDirectoryContents(
        new ListDirectoryContentsRequest().setParent(parent).setPath(path));
  }

  /**
   * Lists a directory's immediate children in UTF-8 name order. Later pages may reflect concurrent
   * changes.
   */
  public Iterable<SandboxFileInfo> listDirectoryContents(ListDirectoryContentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDirectoryContents,
        ListDirectoryContentsResponse::getContents,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
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

  /** Renames a path within a sandbox. The destination must be absent and on the same filesystem. */
  public RenamePathResponse renamePath(RenamePathRequest request) {
    return impl.renamePath(request);
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

  /**
   * Uploads an application/octet-stream body to a sandbox. The sandbox starts automatically if it
   * is stopped. Filesystem access uses the sandbox user's permissions and follows symbolic links.
   *
   * <p>Creates the file or replaces its entire contents, creating parent directories if missing.
   * The completed upload becomes visible atomically. A failure before commit leaves an existing
   * destination unchanged; a lost response after commit does not undo the upload. Completion does
   * not guarantee crash durability.
   *
   * <p>Returns 201 Created for a new file or 204 No Content for a replacement. Partial and
   * conditional uploads are unsupported: Content-Range, If-Match, If-None-Match, and
   * If-Unmodified-Since return 400.
   */
  public void uploadFile(UploadFileRequest request) {
    impl.uploadFile(request);
  }

  public SandboxService impl() {
    return impl;
  }
}
