// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Model target configuration for an external model destination. */
@Generated
public class ModelProviderServiceConfigModelTargetConfig {
  /**
   * Provider-side model identifier (e.g. "gpt-5", "claude-opus-4-7"). This is a string on the LLM
   * provider's side, not a UC entity. The UC governance hook for external destinations is the
   * ModelProviderService referenced by `ExternalModelConfig.model_provider_service`, not the model
   * itself.
   */
  @JsonProperty("model")
  private String model;

  /**
   * Provider-native API types the model supports (e.g. "openai/v1/chat/completions"). Used by the
   * platform for request/response translation from the unified API type. At most 64 entries of at
   * most 256 characters each; the list is persisted into the destination binding's bounded storage
   * envelope.
   */
  @JsonProperty("native_api_types")
  private Collection<String> nativeApiTypes;

  public ModelProviderServiceConfigModelTargetConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public ModelProviderServiceConfigModelTargetConfig setNativeApiTypes(
      Collection<String> nativeApiTypes) {
    this.nativeApiTypes = nativeApiTypes;
    return this;
  }

  public Collection<String> getNativeApiTypes() {
    return nativeApiTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigModelTargetConfig that =
        (ModelProviderServiceConfigModelTargetConfig) o;
    return Objects.equals(model, that.model) && Objects.equals(nativeApiTypes, that.nativeApiTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, nativeApiTypes);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigModelTargetConfig.class)
        .add("model", model)
        .add("nativeApiTypes", nativeApiTypes)
        .toString();
  }
}
