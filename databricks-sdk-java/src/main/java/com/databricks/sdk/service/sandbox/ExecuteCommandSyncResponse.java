// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Result of a completed unary command execution: captured output, exit code, and terminal status.
 */
@Generated
public class ExecuteCommandSyncResponse {
  /**
   * Daemon-generated identifier for this command execution, for correlation (for example in
   * `ListCommands`).
   */
  @JsonProperty("command_id")
  private String commandId;

  /**
   * Process exit code. Unset when the process was terminated by a signal (e.g. on `TIMED_OUT`) or
   * never started (`FAILED`) rather than exiting normally.
   */
  @JsonProperty("exit_code")
  private Long exitCode;

  /**
   * Terminal status of the command execution. Always set on a successful response; never
   * `EXECUTE_COMMAND_STATUS_UNSPECIFIED`.
   */
  @JsonProperty("status")
  private ExecuteCommandStatus status;

  /** Captured standard error, with the same UTF-8 semantics as `stdout`. */
  @JsonProperty("stderr")
  private String stderr;

  /**
   * Captured standard output as UTF-8 text. Invalid UTF-8 bytes are replaced with the Unicode
   * replacement character (U+FFFD).
   */
  @JsonProperty("stdout")
  private String stdout;

  /**
   * True when `stdout` / `stderr` were truncated because the captured output exceeded the server's
   * per-response size cap. The dropped output is not included in this response and is not
   * recoverable through this unary API.
   */
  @JsonProperty("truncated")
  private Boolean truncated;

  public ExecuteCommandSyncResponse setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public ExecuteCommandSyncResponse setExitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  public Long getExitCode() {
    return exitCode;
  }

  public ExecuteCommandSyncResponse setStatus(ExecuteCommandStatus status) {
    this.status = status;
    return this;
  }

  public ExecuteCommandStatus getStatus() {
    return status;
  }

  public ExecuteCommandSyncResponse setStderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

  public String getStderr() {
    return stderr;
  }

  public ExecuteCommandSyncResponse setStdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

  public String getStdout() {
    return stdout;
  }

  public ExecuteCommandSyncResponse setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecuteCommandSyncResponse that = (ExecuteCommandSyncResponse) o;
    return Objects.equals(commandId, that.commandId)
        && Objects.equals(exitCode, that.exitCode)
        && Objects.equals(status, that.status)
        && Objects.equals(stderr, that.stderr)
        && Objects.equals(stdout, that.stdout)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, exitCode, status, stderr, stdout, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecuteCommandSyncResponse.class)
        .add("commandId", commandId)
        .add("exitCode", exitCode)
        .add("status", status)
        .add("stderr", stderr)
        .add("stdout", stdout)
        .add("truncated", truncated)
        .toString();
  }
}
