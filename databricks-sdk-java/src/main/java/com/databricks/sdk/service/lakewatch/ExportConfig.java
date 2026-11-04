// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for delivering events / alerts to an external destination.
 *
 * <p>Exactly one of the destination variants is set; the server picks it via the `oneof`.
 */
@Generated
public class ExportConfig {
  /** Whether export is currently active. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** */
  @JsonProperty("jira")
  private JiraExportConfig jira;

  /** */
  @JsonProperty("service_now")
  private ServiceNowExportConfig serviceNow;

  /** */
  @JsonProperty("slack")
  private SlackExportConfig slack;

  /** */
  @JsonProperty("tines")
  private TinesExportConfig tines;

  /** */
  @JsonProperty("webhook")
  private WebhookExportConfig webhook;

  /**
   * Deprecated and ignored: exports always egress through the request's own workspace. Kept so
   * configs stored by older builds still round-trip.
   */
  @JsonProperty("workspace_id")
  private String workspaceId;

  public ExportConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public ExportConfig setJira(JiraExportConfig jira) {
    this.jira = jira;
    return this;
  }

  public JiraExportConfig getJira() {
    return jira;
  }

  public ExportConfig setServiceNow(ServiceNowExportConfig serviceNow) {
    this.serviceNow = serviceNow;
    return this;
  }

  public ServiceNowExportConfig getServiceNow() {
    return serviceNow;
  }

  public ExportConfig setSlack(SlackExportConfig slack) {
    this.slack = slack;
    return this;
  }

  public SlackExportConfig getSlack() {
    return slack;
  }

  public ExportConfig setTines(TinesExportConfig tines) {
    this.tines = tines;
    return this;
  }

  public TinesExportConfig getTines() {
    return tines;
  }

  public ExportConfig setWebhook(WebhookExportConfig webhook) {
    this.webhook = webhook;
    return this;
  }

  public WebhookExportConfig getWebhook() {
    return webhook;
  }

  public ExportConfig setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public String getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportConfig that = (ExportConfig) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(jira, that.jira)
        && Objects.equals(serviceNow, that.serviceNow)
        && Objects.equals(slack, that.slack)
        && Objects.equals(tines, that.tines)
        && Objects.equals(webhook, that.webhook)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, jira, serviceNow, slack, tines, webhook, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportConfig.class)
        .add("enabled", enabled)
        .add("jira", jira)
        .add("serviceNow", serviceNow)
        .add("slack", slack)
        .add("tines", tines)
        .add("webhook", webhook)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
