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
  /** Creates a directory in a sandbox, including missing parents by default. */
  CreateDirectoryResponse createDirectory(CreateDirectoryRequest createDirectoryRequest);

  /** Creates a new Sandbox. */
  Sandbox createSandbox(CreateSandboxRequest createSandboxRequest);

  /**
   * Deletes a file, symlink, or empty directory, with an option for recursive deletion. Succeeds if
   * the path is already absent.
   */
  DeletePathResponse deletePath(DeletePathRequest deletePathRequest);

  /** Deletes a Sandbox. */
  void deleteSandbox(DeleteSandboxRequest deleteSandboxRequest);

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
  DownloadFileResponse downloadFile(DownloadFileRequest downloadFileRequest);

  /**
   * Runs a command in the sandbox and blocks until it exits, returning the captured stdout, stderr
   * and exit code in a single response.
   */
  ExecuteCommandSyncResponse executeCommandSync(
      ExecuteCommandSyncRequest executeCommandSyncRequest);

  /** Returns metadata for a path without following its final symlink. */
  GetMetadataResponse getMetadata(GetMetadataRequest getMetadataRequest);

  /** Retrieves a Sandbox by name. */
  Sandbox getSandbox(GetSandboxRequest getSandboxRequest);

  /** Lists the tracked command executions (running and completed) in a sandbox. */
  ListCommandsResponse listCommands(ListCommandsRequest listCommandsRequest);

  /**
   * Lists a directory's immediate children in UTF-8 name order. Later pages may reflect concurrent
   * changes.
   */
  ListDirectoryContentsResponse listDirectoryContents(
      ListDirectoryContentsRequest listDirectoryContentsRequest);

  /** Lists all Sandboxes. */
  ListSandboxesResponse listSandboxes(ListSandboxesRequest listSandboxesRequest);

  /** Renames a path within a sandbox. The destination must be absent and on the same filesystem. */
  RenamePathResponse renamePath(RenamePathRequest renamePathRequest);

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
  void uploadFile(UploadFileRequest uploadFileRequest);
}
