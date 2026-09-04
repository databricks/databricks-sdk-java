// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A destination the model service can route traffic to. Exactly one of the per-type configs inside
 * `type_config` must be set, and it must match `destination_type`.
 */
@Generated
public class ModelServiceConfigDestinationConfig {
  /**
   * Backing-model category. Provide the matching type-specific configuration and leave the other
   * type-specific configurations unset.
   */
  @JsonProperty("destination_type")
  private ModelServiceConfigDestinationConfigDestinationType destinationType;

  /** Configuration for an external model reached through a model provider service. */
  @JsonProperty("external_model_config")
  private ModelServiceConfigExternalModelConfig externalModelConfig;

  /**
   * Whether the destination's backing model or model provider service has been deleted. The
   * destination remains visible so you can identify the broken dependency. Requests cannot use this
   * destination until the backing resource is restored or the destination is replaced.
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /** User-facing label for this destination, used in routing references. */
  @JsonProperty("name")
  private String name;

  /** Configuration for a pay-per-token Databricks foundation model. */
  @JsonProperty("pay_per_token_config")
  private ModelServiceConfigPayPerTokenConfig payPerTokenConfig;

  /** Configuration for a provisioned-throughput Databricks foundation model. */
  @JsonProperty("provisioned_throughput_config")
  private ModelServiceConfigProvisionedThroughputConfig provisionedThroughputConfig;

  /**
   * Percentage of primary traffic sent to this destination, from 0 to 100. Required when there is
   * more than one primary destination, in which case the primary percentages must sum to 100; a
   * single primary destination receives all traffic. Fallback destinations are ordered and do not
   * use this field.
   */
  @JsonProperty("traffic_percentage")
  private Long trafficPercentage;

  public ModelServiceConfigDestinationConfig setDestinationType(
      ModelServiceConfigDestinationConfigDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public ModelServiceConfigDestinationConfigDestinationType getDestinationType() {
    return destinationType;
  }

  public ModelServiceConfigDestinationConfig setExternalModelConfig(
      ModelServiceConfigExternalModelConfig externalModelConfig) {
    this.externalModelConfig = externalModelConfig;
    return this;
  }

  public ModelServiceConfigExternalModelConfig getExternalModelConfig() {
    return externalModelConfig;
  }

  public ModelServiceConfigDestinationConfig setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public ModelServiceConfigDestinationConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelServiceConfigDestinationConfig setPayPerTokenConfig(
      ModelServiceConfigPayPerTokenConfig payPerTokenConfig) {
    this.payPerTokenConfig = payPerTokenConfig;
    return this;
  }

  public ModelServiceConfigPayPerTokenConfig getPayPerTokenConfig() {
    return payPerTokenConfig;
  }

  public ModelServiceConfigDestinationConfig setProvisionedThroughputConfig(
      ModelServiceConfigProvisionedThroughputConfig provisionedThroughputConfig) {
    this.provisionedThroughputConfig = provisionedThroughputConfig;
    return this;
  }

  public ModelServiceConfigProvisionedThroughputConfig getProvisionedThroughputConfig() {
    return provisionedThroughputConfig;
  }

  public ModelServiceConfigDestinationConfig setTrafficPercentage(Long trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
  }

  public Long getTrafficPercentage() {
    return trafficPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigDestinationConfig that = (ModelServiceConfigDestinationConfig) o;
    return Objects.equals(destinationType, that.destinationType)
        && Objects.equals(externalModelConfig, that.externalModelConfig)
        && Objects.equals(isDeleted, that.isDeleted)
        && Objects.equals(name, that.name)
        && Objects.equals(payPerTokenConfig, that.payPerTokenConfig)
        && Objects.equals(provisionedThroughputConfig, that.provisionedThroughputConfig)
        && Objects.equals(trafficPercentage, that.trafficPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationType,
        externalModelConfig,
        isDeleted,
        name,
        payPerTokenConfig,
        provisionedThroughputConfig,
        trafficPercentage);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigDestinationConfig.class)
        .add("destinationType", destinationType)
        .add("externalModelConfig", externalModelConfig)
        .add("isDeleted", isDeleted)
        .add("name", name)
        .add("payPerTokenConfig", payPerTokenConfig)
        .add("provisionedThroughputConfig", provisionedThroughputConfig)
        .add("trafficPercentage", trafficPercentage)
        .toString();
  }
}
