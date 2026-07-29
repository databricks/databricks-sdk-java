// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Behavioral configuration for a ModelProviderService: provider connection (auth +
 * provider-specific fields), the catalog of models this provider service can route to, and the
 * passthrough policy that governs how request headers, query parameters, and unmanaged subpaths
 * cross the trust boundary to the upstream provider.
 */
@Generated
public class ModelProviderServiceConfig {
  /**
   * When true, accepts any model exposed by the upstream provider; `targets` is not required and
   * does not restrict routability. When false, only models listed in `targets` are routable.
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
   * Whether to forward incoming request headers to the upstream provider. Applies to managed
   * (multi-model) requests as well as passthrough requests served by this provider service.
   * Governance-level decision by the provider service owner; not selectable per inference call.
   */
  @JsonProperty("forward_headers")
  private Boolean forwardHeaders;

  /**
   * Whether to forward incoming request query parameters to the upstream provider. Same
   * trust-boundary semantics as `forward_headers`.
   */
  @JsonProperty("forward_query_parameters")
  private Boolean forwardQueryParameters;

  /**
   * Whether to forward request paths that fall outside this service's managed API set to the
   * upstream provider as opaque passthrough. When true, requests addressed to subpaths not
   * recognized by the managed API surface are proxied to the upstream provider over the same
   * provider connection. When false, only managed-API paths are served. Governance-level decision
   * by the provider service owner; expanding this expands the trust boundary that the
   * ModelProviderService exposes.
   */
  @JsonProperty("forward_unmanaged_paths")
  private Boolean forwardUnmanagedPaths;

  /** */
  @JsonProperty("gemini_enterprise")
  private ModelProviderServiceConfigGeminiEnterpriseProviderConfig geminiEnterprise;

  /**
   * Inference table configuration for payload logging when this provider service is invoked
   * directly. When it is invoked through a model service, the model service's own inference table
   * captures the invocation instead. Mirrors `ModelServiceConfig.inference_table` /
   * `AgentServiceConfig.inference_table`.
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
   * Provider type discriminator. Required at create time; immutable after. Determines which variant
   * of the `provider` oneof must be set. May not be changed via Update; attempts to include
   * `config.provider_type` in `UpdateModelProviderServiceRequest.update_mask` are rejected.
   *
   * <p>Required on CreateModelProviderService and immutable thereafter.
   */
  @JsonProperty("provider_type")
  private ModelProviderServiceConfigExternalModelProviderType providerType;

  /**
   * Rate limits applied when this provider service is invoked directly. When it is invoked through
   * a model service, the model service's own `rate_limits` apply instead. Mirrors
   * `ModelServiceConfig.rate_limits` / `McpServiceConfig.rate_limits`.
   */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /**
   * Routing targets this provider service exposes (provider-side model identifier + unified API
   * types per entry). Required (>=1) when `allow_all_targets = false`; optional and additive when
   * `allow_all_targets = true`. References from `ExternalModelConfig.target` must match an entry
   * here unless `allow_all_targets = true`.
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
