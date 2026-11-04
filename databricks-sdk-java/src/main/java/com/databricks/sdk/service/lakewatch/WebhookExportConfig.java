// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WebhookExportConfig {
  /**
   * Whether a later change to an already-exported alert is delivered too, as a second
   * `lakewatch.alert.updated` event to the same webhook URL (a close is such an update, carrying a
   * terminal `alert_state`). Creation export is unaffected either way.
   *
   * <p>Opt-in, and unset means off: a webhook is an event transport rather than a system whose
   * record is edited in place, so an update is an extra event the receiving consumer has to
   * correlate to the alert it already handled. A destination configured before this event existed
   * must not start receiving more without its owner asking.
   */
  @JsonProperty("export_updates")
  private Boolean exportUpdates;

  /**
   * Webhook destination the server POSTs payloads to, in plaintext. Userinfo (`user:password@`) is
   * sent as HTTP Basic auth.
   */
  @JsonProperty("url")
  private String url;

  public WebhookExportConfig setExportUpdates(Boolean exportUpdates) {
    this.exportUpdates = exportUpdates;
    return this;
  }

  public Boolean getExportUpdates() {
    return exportUpdates;
  }

  public WebhookExportConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookExportConfig that = (WebhookExportConfig) o;
    return Objects.equals(exportUpdates, that.exportUpdates) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportUpdates, url);
  }

  @Override
  public String toString() {
    return new ToStringer(WebhookExportConfig.class)
        .add("exportUpdates", exportUpdates)
        .add("url", url)
        .toString();
  }
}
