// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Request to run a command in the given sandbox and wait for it to finish. */
@Generated
public class ExecuteCommandSyncRequest {
  /** Arguments passed to `cmd`. */
  @JsonProperty("args")
  private Collection<String> args;

  /**
   * Executable or command to run (e.g. `/bin/echo`, `python3`). A request with no `cmd` is rejected
   * with `INVALID_ARGUMENT`.
   */
  @JsonProperty("cmd")
  private String cmd;

  /**
   * Extra environment variables for the command's process, merged over the sandbox's default
   * environment.
   */
  @JsonProperty("envs")
  private Map<String, String> envs;

  /**
   * Maximum time to wait for the command to finish. When it elapses the command is terminated and
   * the response carries status `TIMED_OUT`. The server applies a default when unset and clamps to
   * an upper bound; negative or otherwise invalid durations are rejected with `INVALID_ARGUMENT`.
   */
  @JsonProperty("execution_timeout")
  private Duration executionTimeout;

  /**
   * Resource name of the sandbox to run the command in, in the form `sandboxes/{sandbox_id}`. Bound
   * from the URL path.
   */
  @JsonIgnore private String name;

  public ExecuteCommandSyncRequest setArgs(Collection<String> args) {
    this.args = args;
    return this;
  }

  public Collection<String> getArgs() {
    return args;
  }

  public ExecuteCommandSyncRequest setCmd(String cmd) {
    this.cmd = cmd;
    return this;
  }

  public String getCmd() {
    return cmd;
  }

  public ExecuteCommandSyncRequest setEnvs(Map<String, String> envs) {
    this.envs = envs;
    return this;
  }

  public Map<String, String> getEnvs() {
    return envs;
  }

  public ExecuteCommandSyncRequest setExecutionTimeout(Duration executionTimeout) {
    this.executionTimeout = executionTimeout;
    return this;
  }

  public Duration getExecutionTimeout() {
    return executionTimeout;
  }

  public ExecuteCommandSyncRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecuteCommandSyncRequest that = (ExecuteCommandSyncRequest) o;
    return Objects.equals(args, that.args)
        && Objects.equals(cmd, that.cmd)
        && Objects.equals(envs, that.envs)
        && Objects.equals(executionTimeout, that.executionTimeout)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, cmd, envs, executionTimeout, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecuteCommandSyncRequest.class)
        .add("args", args)
        .add("cmd", cmd)
        .add("envs", envs)
        .add("executionTimeout", executionTimeout)
        .add("name", name)
        .toString();
  }
}
