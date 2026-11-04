// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Tines destination. Alerts are delivered to a Tines webhook action, authorized by a secret sent in
 * the `Authorization` header.
 */
@Generated
public class TinesExportConfig {
  /**
   * Whether a later change to an already-exported alert is delivered too, as a second
   * `lakewatch.alert.updated` event to the same webhook action (a close is such an update, carrying
   * a terminal `alert_state`). Creation export is unaffected either way.
   *
   * <p>Opt-in, and unset means off: Tines is an event transport rather than a system whose record
   * is edited in place, so an update is an extra event the receiving story has to correlate to the
   * alert it already handled. A destination configured before this event existed must not start
   * receiving more without its owner asking.
   */
  @JsonProperty("export_updates")
  private Boolean exportUpdates;

  /**
   * Three-level Unity Catalog name (`catalog.schema.secret`) of the secret holding the Tines
   * webhook secret. Only the name is stored; the secret is read when an alert is exported, so
   * rotating it takes effect without editing this config. Required: without it the destination
   * would be an unauthenticated endpoint.
   */
  @JsonProperty("webhook_secret_uc_secret")
  private String webhookSecretUcSecret;

  /**
   * Tines webhook action URL, typically of the form `https://<tenant>.tines.com/webhook/<path>`.
   * Any HTTPS host is accepted, so that a Tines tenant on a custom domain works.
   *
   * <p>The secret is sent as a header, so it must not be embedded in the URL: a trailing secret
   * path segment (`/webhook/<path>/<secret>`) and a `secret` query parameter are both rejected.
   * API-path-prefix URLs (`/api/public/...`) are not supported.
   */
  @JsonProperty("webhook_uri")
  private String webhookUri;

  public TinesExportConfig setExportUpdates(Boolean exportUpdates) {
    this.exportUpdates = exportUpdates;
    return this;
  }

  public Boolean getExportUpdates() {
    return exportUpdates;
  }

  public TinesExportConfig setWebhookSecretUcSecret(String webhookSecretUcSecret) {
    this.webhookSecretUcSecret = webhookSecretUcSecret;
    return this;
  }

  public String getWebhookSecretUcSecret() {
    return webhookSecretUcSecret;
  }

  public TinesExportConfig setWebhookUri(String webhookUri) {
    this.webhookUri = webhookUri;
    return this;
  }

  public String getWebhookUri() {
    return webhookUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TinesExportConfig that = (TinesExportConfig) o;
    return Objects.equals(exportUpdates, that.exportUpdates)
        && Objects.equals(webhookSecretUcSecret, that.webhookSecretUcSecret)
        && Objects.equals(webhookUri, that.webhookUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportUpdates, webhookSecretUcSecret, webhookUri);
  }

  @Override
  public String toString() {
    return new ToStringer(TinesExportConfig.class)
        .add("exportUpdates", exportUpdates)
        .add("webhookSecretUcSecret", webhookSecretUcSecret)
        .add("webhookUri", webhookUri)
        .toString();
  }
}
