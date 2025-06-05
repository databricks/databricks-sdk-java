// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FileEventQueuePb {
  @JsonProperty("managed_aqs")
  private AzureQueueStorage managedAqs;

  @JsonProperty("managed_pubsub")
  private GcpPubsub managedPubsub;

  @JsonProperty("managed_sqs")
  private AwsSqsQueue managedSqs;

  @JsonProperty("provided_aqs")
  private AzureQueueStorage providedAqs;

  @JsonProperty("provided_pubsub")
  private GcpPubsub providedPubsub;

  @JsonProperty("provided_sqs")
  private AwsSqsQueue providedSqs;

  public FileEventQueuePb setManagedAqs(AzureQueueStorage managedAqs) {
    this.managedAqs = managedAqs;
    return this;
  }

  public AzureQueueStorage getManagedAqs() {
    return managedAqs;
  }

  public FileEventQueuePb setManagedPubsub(GcpPubsub managedPubsub) {
    this.managedPubsub = managedPubsub;
    return this;
  }

  public GcpPubsub getManagedPubsub() {
    return managedPubsub;
  }

  public FileEventQueuePb setManagedSqs(AwsSqsQueue managedSqs) {
    this.managedSqs = managedSqs;
    return this;
  }

  public AwsSqsQueue getManagedSqs() {
    return managedSqs;
  }

  public FileEventQueuePb setProvidedAqs(AzureQueueStorage providedAqs) {
    this.providedAqs = providedAqs;
    return this;
  }

  public AzureQueueStorage getProvidedAqs() {
    return providedAqs;
  }

  public FileEventQueuePb setProvidedPubsub(GcpPubsub providedPubsub) {
    this.providedPubsub = providedPubsub;
    return this;
  }

  public GcpPubsub getProvidedPubsub() {
    return providedPubsub;
  }

  public FileEventQueuePb setProvidedSqs(AwsSqsQueue providedSqs) {
    this.providedSqs = providedSqs;
    return this;
  }

  public AwsSqsQueue getProvidedSqs() {
    return providedSqs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileEventQueuePb that = (FileEventQueuePb) o;
    return Objects.equals(managedAqs, that.managedAqs)
        && Objects.equals(managedPubsub, that.managedPubsub)
        && Objects.equals(managedSqs, that.managedSqs)
        && Objects.equals(providedAqs, that.providedAqs)
        && Objects.equals(providedPubsub, that.providedPubsub)
        && Objects.equals(providedSqs, that.providedSqs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        managedAqs, managedPubsub, managedSqs, providedAqs, providedPubsub, providedSqs);
  }

  @Override
  public String toString() {
    return new ToStringer(FileEventQueuePb.class)
        .add("managedAqs", managedAqs)
        .add("managedPubsub", managedPubsub)
        .add("managedSqs", managedSqs)
        .add("providedAqs", providedAqs)
        .add("providedPubsub", providedPubsub)
        .add("providedSqs", providedSqs)
        .toString();
  }
}
