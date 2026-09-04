// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Behavioral configuration for a ModelProviderService: provider authentication and
 * provider-specific fields, the catalog of models this provider service can route to, and the
 * passthrough policy that governs how request headers, query parameters, and unmanaged subpaths
 * cross the trust boundary to the upstream provider.
 */
@Generated
public class ModelProviderServiceConfig {
  /**
   * When true, accepts any model exposed by the upstream provider; `targets` is not required and
   * does not restrict routability. When false, only models listed in `targets` are routable.
   * Defaults to false.
   */
  @JsonProperty("allow_all_targets")
  private Boolean allowAllTargets;

  /** */
  @JsonProperty("amazon_bedrock")
  private ModelProviderServiceConfigAmazonBedrockProviderConfig amazonBedrock;

  /** */
  @JsonProperty("anthropic")
  private ModelProviderServiceConfigAnthropicProviderConfig anthropic;

  /** */
  @JsonProperty("azure_openai")
  private ModelProviderServiceConfigAzureOpenAiProviderConfig azureOpenai;

  /** */
  @JsonProperty("custom")
  private ModelProviderServiceConfigCustomProviderConfig custom;

  /**
   * Whether to forward incoming HTTP headers to the upstream provider. Defaults to false and is
   * configured for the entire provider service, not per request. Upstream authentication is
   * configured separately in the provider-specific configuration.
   */
  @JsonProperty("forward_headers")
  private Boolean forwardHeaders;

  /**
   * Whether to forward incoming query parameters to the upstream provider. Defaults to false and is
   * configured for the entire provider service, not per request.
   */
  @JsonProperty("forward_query_parameters")
  private Boolean forwardQueryParameters;

  /**
   * Whether to proxy paths that AI Gateway does not recognize as configured provider-native API
   * types. Defaults to false. When true, these paths are forwarded unchanged to the upstream
   * provider. When false, only recognized API paths are served. Enabling this broadens the upstream
   * API surface exposed through the provider service.
   */
  @JsonProperty("forward_unmanaged_paths")
  private Boolean forwardUnmanagedPaths;

  /** */
  @JsonProperty("gemini_enterprise")
  private ModelProviderServiceConfigGeminiEnterpriseProviderConfig geminiEnterprise;

  /**
   * Payload logging configuration for requests sent directly to this provider service. Requests
   * routed through a model service are captured by that model service's inference table instead.
   */
  @JsonProperty("inference_table")
  private InferenceTableConfig inferenceTable;

  /** */
  @JsonProperty("microsoft_foundry")
  private ModelProviderServiceConfigMicrosoftFoundryProviderConfig microsoftFoundry;

  /** */
  @JsonProperty("openai")
  private ModelProviderServiceConfigOpenAiProviderConfig openai;

  /**
   * External model provider. Required on Create and immutable thereafter. Set the matching
   * provider-specific configuration, such as `openai`, `azure_openai`, or `amazon_bedrock`.
   */
  @JsonProperty("provider_type")
  private ModelProviderServiceConfigExternalModelProviderType providerType;

  /**
   * Rate limits for requests sent directly to this provider service. Requests routed through a
   * model service use that model service's rate limits instead.
   */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /**
   * Models and provider-native API types exposed by this provider service. Each entry must include
   * at least one `native_api_types` value. When `allow_all_targets` is false, at least one entry is
   * required and model service destinations can reference only listed models. When
   * `allow_all_targets` is true, any upstream model is routable; entries in this list provide
   * API-type metadata without restricting other models.
   */
  @JsonProperty("targets")
  private Collection<ModelProviderServiceConfigModelTargetConfig> targets;

  public ModelProviderServiceConfig setAllowAllTargets(Boolean allowAllTargets) {
    this.allowAllTargets = allowAllTargets;
    return this;
  }

  public Boolean getAllowAllTargets() {
    return allowAllTargets;
  }

  public ModelProviderServiceConfig setAmazonBedrock(
      ModelProviderServiceConfigAmazonBedrockProviderConfig amazonBedrock) {
    this.amazonBedrock = amazonBedrock;
    return this;
  }

  public ModelProviderServiceConfigAmazonBedrockProviderConfig getAmazonBedrock() {
    return amazonBedrock;
  }

  public ModelProviderServiceConfig setAnthropic(
      ModelProviderServiceConfigAnthropicProviderConfig anthropic) {
    this.anthropic = anthropic;
    return this;
  }

  public ModelProviderServiceConfigAnthropicProviderConfig getAnthropic() {
    return anthropic;
  }

  public ModelProviderServiceConfig setAzureOpenai(
      ModelProviderServiceConfigAzureOpenAiProviderConfig azureOpenai) {
    this.azureOpenai = azureOpenai;
    return this;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderConfig getAzureOpenai() {
    return azureOpenai;
  }

  public ModelProviderServiceConfig setCustom(
      ModelProviderServiceConfigCustomProviderConfig custom) {
    this.custom = custom;
    return this;
  }

  public ModelProviderServiceConfigCustomProviderConfig getCustom() {
    return custom;
  }

  public ModelProviderServiceConfig setForwardHeaders(Boolean forwardHeaders) {
    this.forwardHeaders = forwardHeaders;
    return this;
  }

  public Boolean getForwardHeaders() {
    return forwardHeaders;
  }

  public ModelProviderServiceConfig setForwardQueryParameters(Boolean forwardQueryParameters) {
    this.forwardQueryParameters = forwardQueryParameters;
    return this;
  }

  public Boolean getForwardQueryParameters() {
    return forwardQueryParameters;
  }

  public ModelProviderServiceConfig setForwardUnmanagedPaths(Boolean forwardUnmanagedPaths) {
    this.forwardUnmanagedPaths = forwardUnmanagedPaths;
    return this;
  }

  public Boolean getForwardUnmanagedPaths() {
    return forwardUnmanagedPaths;
  }

  public ModelProviderServiceConfig setGeminiEnterprise(
      ModelProviderServiceConfigGeminiEnterpriseProviderConfig geminiEnterprise) {
    this.geminiEnterprise = geminiEnterprise;
    return this;
  }

  public ModelProviderServiceConfigGeminiEnterpriseProviderConfig getGeminiEnterprise() {
    return geminiEnterprise;
  }

  public ModelProviderServiceConfig setInferenceTable(InferenceTableConfig inferenceTable) {
    this.inferenceTable = inferenceTable;
    return this;
  }

  public InferenceTableConfig getInferenceTable() {
    return inferenceTable;
  }

  public ModelProviderServiceConfig setMicrosoftFoundry(
      ModelProviderServiceConfigMicrosoftFoundryProviderConfig microsoftFoundry) {
    this.microsoftFoundry = microsoftFoundry;
    return this;
  }

  public ModelProviderServiceConfigMicrosoftFoundryProviderConfig getMicrosoftFoundry() {
    return microsoftFoundry;
  }

  public ModelProviderServiceConfig setOpenai(
      ModelProviderServiceConfigOpenAiProviderConfig openai) {
    this.openai = openai;
    return this;
  }

  public ModelProviderServiceConfigOpenAiProviderConfig getOpenai() {
    return openai;
  }

  public ModelProviderServiceConfig setProviderType(
      ModelProviderServiceConfigExternalModelProviderType providerType) {
    this.providerType = providerType;
    return this;
  }

  public ModelProviderServiceConfigExternalModelProviderType getProviderType() {
    return providerType;
  }

  public ModelProviderServiceConfig setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  public ModelProviderServiceConfig setTargets(
      Collection<ModelProviderServiceConfigModelTargetConfig> targets) {
    this.targets = targets;
    return this;
  }

  public Collection<ModelProviderServiceConfigModelTargetConfig> getTargets() {
    return targets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfig that = (ModelProviderServiceConfig) o;
    return Objects.equals(allowAllTargets, that.allowAllTargets)
        && Objects.equals(amazonBedrock, that.amazonBedrock)
        && Objects.equals(anthropic, that.anthropic)
        && Objects.equals(azureOpenai, that.azureOpenai)
        && Objects.equals(custom, that.custom)
        && Objects.equals(forwardHeaders, that.forwardHeaders)
        && Objects.equals(forwardQueryParameters, that.forwardQueryParameters)
        && Objects.equals(forwardUnmanagedPaths, that.forwardUnmanagedPaths)
        && Objects.equals(geminiEnterprise, that.geminiEnterprise)
        && Objects.equals(inferenceTable, that.inferenceTable)
        && Objects.equals(microsoftFoundry, that.microsoftFoundry)
        && Objects.equals(openai, that.openai)
        && Objects.equals(providerType, that.providerType)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(targets, that.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowAllTargets,
        amazonBedrock,
        anthropic,
        azureOpenai,
        custom,
        forwardHeaders,
        forwardQueryParameters,
        forwardUnmanagedPaths,
        geminiEnterprise,
        inferenceTable,
        microsoftFoundry,
        openai,
        providerType,
        rateLimits,
        targets);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfig.class)
        .add("allowAllTargets", allowAllTargets)
        .add("amazonBedrock", amazonBedrock)
        .add("anthropic", anthropic)
        .add("azureOpenai", azureOpenai)
        .add("custom", custom)
        .add("forwardHeaders", forwardHeaders)
        .add("forwardQueryParameters", forwardQueryParameters)
        .add("forwardUnmanagedPaths", forwardUnmanagedPaths)
        .add("geminiEnterprise", geminiEnterprise)
        .add("inferenceTable", inferenceTable)
        .add("microsoftFoundry", microsoftFoundry)
        .add("openai", openai)
        .add("providerType", providerType)
        .add("rateLimits", rateLimits)
        .add("targets", targets)
        .toString();
  }
}
