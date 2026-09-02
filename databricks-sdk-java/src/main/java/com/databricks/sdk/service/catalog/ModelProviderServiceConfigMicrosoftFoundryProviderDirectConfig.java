// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of Microsoft Foundry provider config.
 *
 * <p>Authentication is one of three mutually exclusive modes, exactly one of which must be supplied
 * on Create: - API key: set `api_key`, leave `entra_service_principal` and `service_credential`
 * unset. - Entra ID (service principal): set `entra_service_principal`, leave `api_key` and
 * `service_credential` unset. AI Gateway exchanges these for an Entra bearer token on outbound
 * requests via the OAuth2 client-credentials grant. - Unity Catalog service credential: set
 * `service_credential.name` to the resource name `credentials/{name}`, leave `api_key` and
 * `entra_service_principal` unset. The credential value lives in Unity Catalog and is referenced by
 * name, not held on this message. Only supported on Azure-hosted workspaces. Setting more than one
 * mode is rejected.
 */
@Generated
public class ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig {
  /**
   * Microsoft Foundry API key. Mutually exclusive with the Entra and service-credential modes.
   * Supplied as inline plaintext via `ProviderSecret.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  /** Microsoft Foundry endpoint URL. Required on Create. */
  @JsonProperty("base_url")
  private String baseUrl;

  /**
   * Entra ID (service principal) auth. Mutually exclusive with `api_key` and `service_credential`.
   */
  @JsonProperty("entra_service_principal")
  private ModelProviderServiceConfigEntraServicePrincipal entraServicePrincipal;

  /**
   * Reference to a Unity Catalog service credential authorizing Microsoft Foundry requests. On
   * Create, supply `service_credential.name` in the form `credentials/{name}`. Required on Create
   * when using service-credential authentication; mutually exclusive with `api_key` and
   * `entra_service_principal`. The credential is referenced by name; its value is not carried here.
   * On read, the resolved `id` and `is_deleted` are also populated. Only supported on Azure-hosted
   * workspaces; Create requests from other clouds are rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

  public ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  public ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig setEntraServicePrincipal(
      ModelProviderServiceConfigEntraServicePrincipal entraServicePrincipal) {
    this.entraServicePrincipal = entraServicePrincipal;
    return this;
  }

  public ModelProviderServiceConfigEntraServicePrincipal getEntraServicePrincipal() {
    return entraServicePrincipal;
  }

  public ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig setServiceCredential(
      ModelProviderServiceConfigServiceCredential serviceCredential) {
    this.serviceCredential = serviceCredential;
    return this;
  }

  public ModelProviderServiceConfigServiceCredential getServiceCredential() {
    return serviceCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig that =
        (ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(baseUrl, that.baseUrl)
        && Objects.equals(entraServicePrincipal, that.entraServicePrincipal)
        && Objects.equals(serviceCredential, that.serviceCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, baseUrl, entraServicePrincipal, serviceCredential);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .add("entraServicePrincipal", entraServicePrincipal)
        .add("serviceCredential", serviceCredential)
        .toString();
  }
}
