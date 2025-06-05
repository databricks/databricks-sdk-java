// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EventDetailsPb {
  @JsonProperty("attributes")
  private ClusterAttributes attributes;

  @JsonProperty("cause")
  private EventDetailsCause cause;

  @JsonProperty("cluster_size")
  private ClusterSize clusterSize;

  @JsonProperty("current_num_vcpus")
  private Long currentNumVcpus;

  @JsonProperty("current_num_workers")
  private Long currentNumWorkers;

  @JsonProperty("did_not_expand_reason")
  private String didNotExpandReason;

  @JsonProperty("disk_size")
  private Long diskSize;

  @JsonProperty("driver_state_message")
  private String driverStateMessage;

  @JsonProperty("enable_termination_for_node_blocklisted")
  private Boolean enableTerminationForNodeBlocklisted;

  @JsonProperty("free_space")
  private Long freeSpace;

  @JsonProperty("init_scripts")
  private InitScriptEventDetails initScripts;

  @JsonProperty("instance_id")
  private String instanceId;

  @JsonProperty("job_run_name")
  private String jobRunName;

  @JsonProperty("previous_attributes")
  private ClusterAttributes previousAttributes;

  @JsonProperty("previous_cluster_size")
  private ClusterSize previousClusterSize;

  @JsonProperty("previous_disk_size")
  private Long previousDiskSize;

  @JsonProperty("reason")
  private TerminationReason reason;

  @JsonProperty("target_num_vcpus")
  private Long targetNumVcpus;

  @JsonProperty("target_num_workers")
  private Long targetNumWorkers;

  @JsonProperty("user")
  private String user;

  public EventDetailsPb setAttributes(ClusterAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public ClusterAttributes getAttributes() {
    return attributes;
  }

  public EventDetailsPb setCause(EventDetailsCause cause) {
    this.cause = cause;
    return this;
  }

  public EventDetailsCause getCause() {
    return cause;
  }

  public EventDetailsPb setClusterSize(ClusterSize clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public ClusterSize getClusterSize() {
    return clusterSize;
  }

  public EventDetailsPb setCurrentNumVcpus(Long currentNumVcpus) {
    this.currentNumVcpus = currentNumVcpus;
    return this;
  }

  public Long getCurrentNumVcpus() {
    return currentNumVcpus;
  }

  public EventDetailsPb setCurrentNumWorkers(Long currentNumWorkers) {
    this.currentNumWorkers = currentNumWorkers;
    return this;
  }

  public Long getCurrentNumWorkers() {
    return currentNumWorkers;
  }

  public EventDetailsPb setDidNotExpandReason(String didNotExpandReason) {
    this.didNotExpandReason = didNotExpandReason;
    return this;
  }

  public String getDidNotExpandReason() {
    return didNotExpandReason;
  }

  public EventDetailsPb setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

  public Long getDiskSize() {
    return diskSize;
  }

  public EventDetailsPb setDriverStateMessage(String driverStateMessage) {
    this.driverStateMessage = driverStateMessage;
    return this;
  }

  public String getDriverStateMessage() {
    return driverStateMessage;
  }

  public EventDetailsPb setEnableTerminationForNodeBlocklisted(
      Boolean enableTerminationForNodeBlocklisted) {
    this.enableTerminationForNodeBlocklisted = enableTerminationForNodeBlocklisted;
    return this;
  }

  public Boolean getEnableTerminationForNodeBlocklisted() {
    return enableTerminationForNodeBlocklisted;
  }

  public EventDetailsPb setFreeSpace(Long freeSpace) {
    this.freeSpace = freeSpace;
    return this;
  }

  public Long getFreeSpace() {
    return freeSpace;
  }

  public EventDetailsPb setInitScripts(InitScriptEventDetails initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public InitScriptEventDetails getInitScripts() {
    return initScripts;
  }

  public EventDetailsPb setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public EventDetailsPb setJobRunName(String jobRunName) {
    this.jobRunName = jobRunName;
    return this;
  }

  public String getJobRunName() {
    return jobRunName;
  }

  public EventDetailsPb setPreviousAttributes(ClusterAttributes previousAttributes) {
    this.previousAttributes = previousAttributes;
    return this;
  }

  public ClusterAttributes getPreviousAttributes() {
    return previousAttributes;
  }

  public EventDetailsPb setPreviousClusterSize(ClusterSize previousClusterSize) {
    this.previousClusterSize = previousClusterSize;
    return this;
  }

  public ClusterSize getPreviousClusterSize() {
    return previousClusterSize;
  }

  public EventDetailsPb setPreviousDiskSize(Long previousDiskSize) {
    this.previousDiskSize = previousDiskSize;
    return this;
  }

  public Long getPreviousDiskSize() {
    return previousDiskSize;
  }

  public EventDetailsPb setReason(TerminationReason reason) {
    this.reason = reason;
    return this;
  }

  public TerminationReason getReason() {
    return reason;
  }

  public EventDetailsPb setTargetNumVcpus(Long targetNumVcpus) {
    this.targetNumVcpus = targetNumVcpus;
    return this;
  }

  public Long getTargetNumVcpus() {
    return targetNumVcpus;
  }

  public EventDetailsPb setTargetNumWorkers(Long targetNumWorkers) {
    this.targetNumWorkers = targetNumWorkers;
    return this;
  }

  public Long getTargetNumWorkers() {
    return targetNumWorkers;
  }

  public EventDetailsPb setUser(String user) {
    this.user = user;
    return this;
  }

  public String getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventDetailsPb that = (EventDetailsPb) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(cause, that.cause)
        && Objects.equals(clusterSize, that.clusterSize)
        && Objects.equals(currentNumVcpus, that.currentNumVcpus)
        && Objects.equals(currentNumWorkers, that.currentNumWorkers)
        && Objects.equals(didNotExpandReason, that.didNotExpandReason)
        && Objects.equals(diskSize, that.diskSize)
        && Objects.equals(driverStateMessage, that.driverStateMessage)
        && Objects.equals(
            enableTerminationForNodeBlocklisted, that.enableTerminationForNodeBlocklisted)
        && Objects.equals(freeSpace, that.freeSpace)
        && Objects.equals(initScripts, that.initScripts)
        && Objects.equals(instanceId, that.instanceId)
        && Objects.equals(jobRunName, that.jobRunName)
        && Objects.equals(previousAttributes, that.previousAttributes)
        && Objects.equals(previousClusterSize, that.previousClusterSize)
        && Objects.equals(previousDiskSize, that.previousDiskSize)
        && Objects.equals(reason, that.reason)
        && Objects.equals(targetNumVcpus, that.targetNumVcpus)
        && Objects.equals(targetNumWorkers, that.targetNumWorkers)
        && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes,
        cause,
        clusterSize,
        currentNumVcpus,
        currentNumWorkers,
        didNotExpandReason,
        diskSize,
        driverStateMessage,
        enableTerminationForNodeBlocklisted,
        freeSpace,
        initScripts,
        instanceId,
        jobRunName,
        previousAttributes,
        previousClusterSize,
        previousDiskSize,
        reason,
        targetNumVcpus,
        targetNumWorkers,
        user);
  }

  @Override
  public String toString() {
    return new ToStringer(EventDetailsPb.class)
        .add("attributes", attributes)
        .add("cause", cause)
        .add("clusterSize", clusterSize)
        .add("currentNumVcpus", currentNumVcpus)
        .add("currentNumWorkers", currentNumWorkers)
        .add("didNotExpandReason", didNotExpandReason)
        .add("diskSize", diskSize)
        .add("driverStateMessage", driverStateMessage)
        .add("enableTerminationForNodeBlocklisted", enableTerminationForNodeBlocklisted)
        .add("freeSpace", freeSpace)
        .add("initScripts", initScripts)
        .add("instanceId", instanceId)
        .add("jobRunName", jobRunName)
        .add("previousAttributes", previousAttributes)
        .add("previousClusterSize", previousClusterSize)
        .add("previousDiskSize", previousDiskSize)
        .add("reason", reason)
        .add("targetNumVcpus", targetNumVcpus)
        .add("targetNumWorkers", targetNumWorkers)
        .add("user", user)
        .toString();
  }
}
