// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Throughput information for an AI Search endpoint, including requested and current concurrency
 * settings.
 */
@Generated
public class EndpointThroughputInfo {
  /** Additional information about the throughput change request */
  @JsonProperty("change_request_message")
  private String changeRequestMessage;

  /** The state of the most recent throughput change request */
  @JsonProperty("change_request_state")
  private ThroughputChangeRequestState changeRequestState;

  /** The current concurrency (total CPU) allocated to the endpoint */
  @JsonProperty("current_concurrency")
  private Double currentConcurrency;

  /** The current utilization of concurrency as a percentage (0-100) */
  @JsonProperty("current_concurrency_utilization_percentage")
  private Double currentConcurrencyUtilizationPercentage;

  /** The current number of replicas allocated to the endpoint */
  @JsonProperty("current_num_replicas")
  private Long currentNumReplicas;

  /** The maximum concurrency allowed for this endpoint */
  @JsonProperty("maximum_concurrency_allowed")
  private Double maximumConcurrencyAllowed;

  /** The minimum concurrency allowed for this endpoint */
  @JsonProperty("minimal_concurrency_allowed")
  private Double minimalConcurrencyAllowed;

  /** The requested concurrency (total CPU) for the endpoint */
  @JsonProperty("requested_concurrency")
  private Double requestedConcurrency;

  /** The requested number of replicas for the endpoint */
  @JsonProperty("requested_num_replicas")
  private Long requestedNumReplicas;

  public EndpointThroughputInfo setChangeRequestMessage(String changeRequestMessage) {
    this.changeRequestMessage = changeRequestMessage;
    return this;
  }

  public String getChangeRequestMessage() {
    return changeRequestMessage;
  }

  public EndpointThroughputInfo setChangeRequestState(
      ThroughputChangeRequestState changeRequestState) {
    this.changeRequestState = changeRequestState;
    return this;
  }

  public ThroughputChangeRequestState getChangeRequestState() {
    return changeRequestState;
  }

  public EndpointThroughputInfo setCurrentConcurrency(Double currentConcurrency) {
    this.currentConcurrency = currentConcurrency;
    return this;
  }

  public Double getCurrentConcurrency() {
    return currentConcurrency;
  }

  public EndpointThroughputInfo setCurrentConcurrencyUtilizationPercentage(
      Double currentConcurrencyUtilizationPercentage) {
    this.currentConcurrencyUtilizationPercentage = currentConcurrencyUtilizationPercentage;
    return this;
  }

  public Double getCurrentConcurrencyUtilizationPercentage() {
    return currentConcurrencyUtilizationPercentage;
  }

  public EndpointThroughputInfo setCurrentNumReplicas(Long currentNumReplicas) {
    this.currentNumReplicas = currentNumReplicas;
    return this;
  }

  public Long getCurrentNumReplicas() {
    return currentNumReplicas;
  }

  public EndpointThroughputInfo setMaximumConcurrencyAllowed(Double maximumConcurrencyAllowed) {
    this.maximumConcurrencyAllowed = maximumConcurrencyAllowed;
    return this;
  }

  public Double getMaximumConcurrencyAllowed() {
    return maximumConcurrencyAllowed;
  }

  public EndpointThroughputInfo setMinimalConcurrencyAllowed(Double minimalConcurrencyAllowed) {
    this.minimalConcurrencyAllowed = minimalConcurrencyAllowed;
    return this;
  }

  public Double getMinimalConcurrencyAllowed() {
    return minimalConcurrencyAllowed;
  }

  public EndpointThroughputInfo setRequestedConcurrency(Double requestedConcurrency) {
    this.requestedConcurrency = requestedConcurrency;
    return this;
  }

  public Double getRequestedConcurrency() {
    return requestedConcurrency;
  }

  public EndpointThroughputInfo setRequestedNumReplicas(Long requestedNumReplicas) {
    this.requestedNumReplicas = requestedNumReplicas;
    return this;
  }

  public Long getRequestedNumReplicas() {
    return requestedNumReplicas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointThroughputInfo that = (EndpointThroughputInfo) o;
    return Objects.equals(changeRequestMessage, that.changeRequestMessage)
        && Objects.equals(changeRequestState, that.changeRequestState)
        && Objects.equals(currentConcurrency, that.currentConcurrency)
        && Objects.equals(
            currentConcurrencyUtilizationPercentage, that.currentConcurrencyUtilizationPercentage)
        && Objects.equals(currentNumReplicas, that.currentNumReplicas)
        && Objects.equals(maximumConcurrencyAllowed, that.maximumConcurrencyAllowed)
        && Objects.equals(minimalConcurrencyAllowed, that.minimalConcurrencyAllowed)
        && Objects.equals(requestedConcurrency, that.requestedConcurrency)
        && Objects.equals(requestedNumReplicas, that.requestedNumReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changeRequestMessage,
        changeRequestState,
        currentConcurrency,
        currentConcurrencyUtilizationPercentage,
        currentNumReplicas,
        maximumConcurrencyAllowed,
        minimalConcurrencyAllowed,
        requestedConcurrency,
        requestedNumReplicas);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointThroughputInfo.class)
        .add("changeRequestMessage", changeRequestMessage)
        .add("changeRequestState", changeRequestState)
        .add("currentConcurrency", currentConcurrency)
        .add("currentConcurrencyUtilizationPercentage", currentConcurrencyUtilizationPercentage)
        .add("currentNumReplicas", currentNumReplicas)
        .add("maximumConcurrencyAllowed", maximumConcurrencyAllowed)
        .add("minimalConcurrencyAllowed", minimalConcurrencyAllowed)
        .add("requestedConcurrency", requestedConcurrency)
        .add("requestedNumReplicas", requestedNumReplicas)
        .toString();
  }
}
