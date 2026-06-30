// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileEventQueue {
  /** */
  @JsonProperty("managed_aqs")
  private AzureQueueStorage managedAqs;

  /** */
  @JsonProperty("managed_pubsub")
  private GcpPubsub managedPubsub;

  /** */
  @JsonProperty("managed_sqs")
  private AwsSqsQueue managedSqs;

  /** */
  @JsonProperty("provided_aqs")
  private AzureQueueStorage providedAqs;

  /** */
  @JsonProperty("provided_pubsub")
  private GcpPubsub providedPubsub;

  /** */
  @JsonProperty("provided_sqs")
  private AwsSqsQueue providedSqs;

  public FileEventQueue setManagedAqs(AzureQueueStorage managedAqs) {
    this.managedAqs = managedAqs;
    return this;
  }

  public AzureQueueStorage getManagedAqs() {
    return managedAqs;
  }

  public FileEventQueue setManagedPubsub(GcpPubsub managedPubsub) {
    this.managedPubsub = managedPubsub;
    return this;
  }

  public GcpPubsub getManagedPubsub() {
    return managedPubsub;
  }

  public FileEventQueue setManagedSqs(AwsSqsQueue managedSqs) {
    this.managedSqs = managedSqs;
    return this;
  }

  public AwsSqsQueue getManagedSqs() {
    return managedSqs;
  }

  public FileEventQueue setProvidedAqs(AzureQueueStorage providedAqs) {
    this.providedAqs = providedAqs;
    return this;
  }

  public AzureQueueStorage getProvidedAqs() {
    return providedAqs;
  }

  public FileEventQueue setProvidedPubsub(GcpPubsub providedPubsub) {
    this.providedPubsub = providedPubsub;
    return this;
  }

  public GcpPubsub getProvidedPubsub() {
    return providedPubsub;
  }

  public FileEventQueue setProvidedSqs(AwsSqsQueue providedSqs) {
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
    FileEventQueue that = (FileEventQueue) o;
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
    return new ToStringer(FileEventQueue.class)
        .add("managedAqs", managedAqs)
        .add("managedPubsub", managedPubsub)
        .add("managedSqs", managedSqs)
        .add("providedAqs", providedAqs)
        .add("providedPubsub", providedPubsub)
        .add("providedSqs", providedSqs)
        .toString();
  }
}
