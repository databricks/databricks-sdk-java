// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A single command execution. */
@Generated
public class Command {
  /** Arguments passed to the program. */
  @JsonProperty("args")
  private Collection<String> args;

  /** The program that was executed. */
  @JsonProperty("cmd")
  private String cmd;

  /** Stable identifier for this command. */
  @JsonProperty("command_id")
  private String commandId;

  /**
   * Process exit code. Only present when finished is true and the process exited normally (not
   * killed by signal or failed to start).
   */
  @JsonProperty("exit_code")
  private Long exitCode;

  /** Whether the command has finished executing. */
  @JsonProperty("finished")
  private Boolean finished;

  /** PID of the spawned process. Absent if the process failed to start. */
  @JsonProperty("pid")
  private Long pid;

  public Command setArgs(Collection<String> args) {
    this.args = args;
    return this;
  }

  public Collection<String> getArgs() {
    return args;
  }

  public Command setCmd(String cmd) {
    this.cmd = cmd;
    return this;
  }

  public String getCmd() {
    return cmd;
  }

  public Command setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public Command setExitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  public Long getExitCode() {
    return exitCode;
  }

  public Command setFinished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  public Boolean getFinished() {
    return finished;
  }

  public Command setPid(Long pid) {
    this.pid = pid;
    return this;
  }

  public Long getPid() {
    return pid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Command that = (Command) o;
    return Objects.equals(args, that.args)
        && Objects.equals(cmd, that.cmd)
        && Objects.equals(commandId, that.commandId)
        && Objects.equals(exitCode, that.exitCode)
        && Objects.equals(finished, that.finished)
        && Objects.equals(pid, that.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, cmd, commandId, exitCode, finished, pid);
  }

  @Override
  public String toString() {
    return new ToStringer(Command.class)
        .add("args", args)
        .add("cmd", cmd)
        .add("commandId", commandId)
        .add("exitCode", exitCode)
        .add("finished", finished)
        .add("pid", pid)
        .toString();
  }
}
