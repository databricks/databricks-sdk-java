// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * The environment variables and files associated with a job environment variable entry. Runtime
 * environment variables override inline `variables`, which override values from `files`, on
 * duplicate keys.
 */
@Generated
public class JobEnvironmentVariablesSpec {
  /**
   * Workspace (`/Workspace/...`) or UC Volumes (`/Volumes/...`) paths to `.env` files. Maximum 5
   * files. Files are read, parsed, and merged at task execution time, not at job creation or update
   * API call time.
   *
   * <p>File format: each line containing a variable must be exactly `KEY=VALUE`. Empty and
   * whitespace-only lines, and lines beginning with `#`, are ignored. Keys must match the same
   * regex as inlined variable names (`^[A-Za-z_][A-Za-z0-9_]*$`); the value continues to the end of
   * the line. No other syntax is supported — no inline comments, no quoted values, no escape
   * sequences, no variable interpolation. Any other line that does not match the `KEY=VALUE` shape
   * fails the run.
   *
   * <p>Size limits: maximum 32,768 bytes (32 KiB) per file on disk; maximum 1,024 bytes (1 KiB) per
   * `KEY=VALUE` line combined. Files or lines exceeding these limits fail the run.
   *
   * <p>On a duplicate key, the later file wins; `variables` override values from any file.
   */
  @JsonProperty("files")
  private Collection<String> files;

  /**
   * Environment variables specified directly as key/value pairs. Maximum 20 entries.
   *
   * <p>Each key must be 1 to 256 characters and match `^[A-Za-z_][A-Za-z0-9_]*$`: it must start
   * with an ASCII letter or underscore and contain only ASCII letters, digits, and underscores.
   * Each value can be any Unicode string of up to 512 characters, including an empty string.
   */
  @JsonProperty("variables")
  private Map<String, String> variables;

  public JobEnvironmentVariablesSpec setFiles(Collection<String> files) {
    this.files = files;
    return this;
  }

  public Collection<String> getFiles() {
    return files;
  }

  public JobEnvironmentVariablesSpec setVariables(Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public Map<String, String> getVariables() {
    return variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobEnvironmentVariablesSpec that = (JobEnvironmentVariablesSpec) o;
    return Objects.equals(files, that.files) && Objects.equals(variables, that.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, variables);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEnvironmentVariablesSpec.class)
        .add("files", files)
        .add("variables", variables)
        .toString();
  }
}
