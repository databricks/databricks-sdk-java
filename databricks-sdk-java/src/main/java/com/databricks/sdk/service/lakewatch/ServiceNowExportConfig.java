// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * ServiceNow destination. Alerts are delivered to the instance's Table API, authorized by an OAuth
 * 2.0 client-credentials token minted from the registered application's client ID and secret.
 */
@Generated
public class ServiceNowExportConfig {
  /**
   * OAuth client ID of the registered ServiceNow application. An identifier rather than secret
   * material — ServiceNow shows it on the application record — so it is stored and read back
   * verbatim.
   */
  @JsonProperty("client_id")
  private String clientId;

  /**
   * Three-level Unity Catalog name (`catalog.schema.secret`) of the secret holding the OAuth client
   * secret. Only the name is stored; the secret is read when an alert is exported, so rotating it
   * takes effect without editing this config.
   */
  @JsonProperty("client_secret_uc_secret")
  private String clientSecretUcSecret;

  /**
   * ServiceNow instance ID — the host label only, not the full URL. For an instance reachable at
   * `https://acme.service-now.com`, this is `acme`.
   */
  @JsonProperty("instance_id")
  private String instanceId;

  public ServiceNowExportConfig setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public ServiceNowExportConfig setClientSecretUcSecret(String clientSecretUcSecret) {
    this.clientSecretUcSecret = clientSecretUcSecret;
    return this;
  }

  public String getClientSecretUcSecret() {
    return clientSecretUcSecret;
  }

  public ServiceNowExportConfig setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServiceNowExportConfig that = (ServiceNowExportConfig) o;
    return Objects.equals(clientId, that.clientId)
        && Objects.equals(clientSecretUcSecret, that.clientSecretUcSecret)
        && Objects.equals(instanceId, that.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecretUcSecret, instanceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServiceNowExportConfig.class)
        .add("clientId", clientId)
        .add("clientSecretUcSecret", clientSecretUcSecret)
        .add("instanceId", instanceId)
        .toString();
  }
}
