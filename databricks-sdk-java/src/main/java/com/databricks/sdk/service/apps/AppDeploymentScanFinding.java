// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A single security scan finding for an app deployment. Findings are produced when a deployment's
 * source code is scanned, and their triage `status` is preserved across re-scans of the same
 * deployment.
 */
@Generated
public class AppDeploymentScanFinding {
  /** The app-relative path of the file the finding was reported in. */
  @JsonProperty("file_path")
  private String filePath;

  /**
   * The stable id of the finding (the last segment of `name`), derived from the rule, file, and
   * line so the same issue keeps its triage status across re-scans.
   */
  @JsonProperty("finding_id")
  private String findingId;

  /** The line number the finding was reported at. */
  @JsonProperty("line")
  private Long line;

  /** A human-readable description of the finding. */
  @JsonProperty("message")
  private String message;

  /**
   * The resource name of the finding, in the form
   * `apps/{app}/deployments/{deployment}/scanFindings/{finding_id}`.
   */
  @JsonProperty("name")
  private String name;

  /** The scanner rule that produced the finding. */
  @JsonProperty("rule_id")
  private String ruleId;

  /** The scanner that produced the finding. */
  @JsonProperty("scanner_type")
  private ScanFindingScannerType scannerType;

  /** The severity reported by the scanner. */
  @JsonProperty("severity")
  private ScanFindingSeverity severity;

  /**
   * The triage status of the finding. This is the only client-writable field; set it to resolve or
   * ignore a finding.
   */
  @JsonProperty("status")
  private ScanFindingStatus status;

  public AppDeploymentScanFinding setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public AppDeploymentScanFinding setFindingId(String findingId) {
    this.findingId = findingId;
    return this;
  }

  public String getFindingId() {
    return findingId;
  }

  public AppDeploymentScanFinding setLine(Long line) {
    this.line = line;
    return this;
  }

  public Long getLine() {
    return line;
  }

  public AppDeploymentScanFinding setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public AppDeploymentScanFinding setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppDeploymentScanFinding setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public AppDeploymentScanFinding setScannerType(ScanFindingScannerType scannerType) {
    this.scannerType = scannerType;
    return this;
  }

  public ScanFindingScannerType getScannerType() {
    return scannerType;
  }

  public AppDeploymentScanFinding setSeverity(ScanFindingSeverity severity) {
    this.severity = severity;
    return this;
  }

  public ScanFindingSeverity getSeverity() {
    return severity;
  }

  public AppDeploymentScanFinding setStatus(ScanFindingStatus status) {
    this.status = status;
    return this;
  }

  public ScanFindingStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDeploymentScanFinding that = (AppDeploymentScanFinding) o;
    return Objects.equals(filePath, that.filePath)
        && Objects.equals(findingId, that.findingId)
        && Objects.equals(line, that.line)
        && Objects.equals(message, that.message)
        && Objects.equals(name, that.name)
        && Objects.equals(ruleId, that.ruleId)
        && Objects.equals(scannerType, that.scannerType)
        && Objects.equals(severity, that.severity)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        filePath, findingId, line, message, name, ruleId, scannerType, severity, status);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentScanFinding.class)
        .add("filePath", filePath)
        .add("findingId", findingId)
        .add("line", line)
        .add("message", message)
        .add("name", name)
        .add("ruleId", ruleId)
        .add("scannerType", scannerType)
        .add("severity", severity)
        .add("status", status)
        .toString();
  }
}
