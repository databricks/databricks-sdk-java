// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for an external-foundation-model destination. Provider auth and provider-specific
 * cloud configuration are owned by a separate, governed ModelProviderService entity referenced via
 * `model_provider_service`; the platform resolves the provider at invocation time.
 */
@Generated
public class ModelServiceConfigExternalModelConfig {
  /**
   * Resource name of the governed ModelProviderService that owns provider auth and
   * provider-specific configuration. The referenced ModelProviderService also carries the provider
   * type, so this message does not surface it directly. Format:
   * `model-provider-services/{catalog}.{schema}.{model_provider_service}`. Each `{...}` component
   * is capped at 255 characters individually.
   */
  @JsonProperty("model_provider_service")
  private String modelProviderService;

  /**
   * Routing target for the destination: the provider-side model selected from the referenced
   * ModelProviderService's `targets` catalog, plus the unified API types the platform should
   * translate to/from at request time.
   */
  @JsonProperty("target")
  private ModelProviderServiceConfigModelTargetConfig target;

  public ModelServiceConfigExternalModelConfig setModelProviderService(
      String modelProviderService) {
    this.modelProviderService = modelProviderService;
    return this;
  }

  public String getModelProviderService() {
    return modelProviderService;
  }

  public ModelServiceConfigExternalModelConfig setTarget(
      ModelProviderServiceConfigModelTargetConfig target) {
    this.target = target;
    return this;
  }

  public ModelProviderServiceConfigModelTargetConfig getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigExternalModelConfig that = (ModelServiceConfigExternalModelConfig) o;
    return Objects.equals(modelProviderService, that.modelProviderService)
        && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelProviderService, target);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigExternalModelConfig.class)
        .add("modelProviderService", modelProviderService)
        .add("target", target)
        .toString();
  }
}
