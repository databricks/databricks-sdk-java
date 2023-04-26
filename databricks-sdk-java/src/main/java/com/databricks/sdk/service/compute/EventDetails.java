// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EventDetails class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EventDetails {
  /**
   * * For created clusters, the attributes of the cluster. * For edited clusters, the new
   * attributes of the cluster.
   */
  @JsonProperty("attributes")
  private ClusterAttributes attributes;

  /** The cause of a change in target size. */
  @JsonProperty("cause")
  private EventDetailsCause cause;

  /** The actual cluster size that was set in the cluster creation or edit. */
  @JsonProperty("cluster_size")
  private ClusterSize clusterSize;

  /** The current number of vCPUs in the cluster. */
  @JsonProperty("current_num_vcpus")
  private Long currentNumVcpus;

  /** The current number of nodes in the cluster. */
  @JsonProperty("current_num_workers")
  private Long currentNumWorkers;

  /** <needs content added> */
  @JsonProperty("did_not_expand_reason")
  private String didNotExpandReason;

  /** Current disk size in bytes */
  @JsonProperty("disk_size")
  private Long diskSize;

  /** More details about the change in driver's state */
  @JsonProperty("driver_state_message")
  private String driverStateMessage;

  /**
   * Whether or not a blocklisted node should be terminated. For ClusterEventType NODE_BLACKLISTED.
   */
  @JsonProperty("enable_termination_for_node_blocklisted")
  private Boolean enableTerminationForNodeBlocklisted;

  /** <needs content added> */
  @JsonProperty("free_space")
  private Long freeSpace;

  /** Instance Id where the event originated from */
  @JsonProperty("instance_id")
  private String instanceId;

  /**
   * Unique identifier of the specific job run associated with this cluster event * For clusters
   * created for jobs, this will be the same as the cluster name
   */
  @JsonProperty("job_run_name")
  private String jobRunName;

  /** The cluster attributes before a cluster was edited. */
  @JsonProperty("previous_attributes")
  private ClusterAttributes previousAttributes;

  /** The size of the cluster before an edit or resize. */
  @JsonProperty("previous_cluster_size")
  private ClusterSize previousClusterSize;

  /** Previous disk size in bytes */
  @JsonProperty("previous_disk_size")
  private Long previousDiskSize;

  /**
   * A termination reason: * On a TERMINATED event, this is the reason of the termination. * On a
   * RESIZE_COMPLETE event, this indicates the reason that we failed to acquire some nodes.
   */
  @JsonProperty("reason")
  private TerminationReason reason;

  /** The targeted number of vCPUs in the cluster. */
  @JsonProperty("target_num_vcpus")
  private Long targetNumVcpus;

  /** The targeted number of nodes in the cluster. */
  @JsonProperty("target_num_workers")
  private Long targetNumWorkers;

  /** The user that caused the event to occur. (Empty if it was done by the control plane.) */
  @JsonProperty("user")
  private String user;

  /**
   * <p>Setter for the field <code>attributes</code>.</p>
   *
   * @param attributes a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setAttributes(ClusterAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>attributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes getAttributes() {
    return attributes;
  }

  /**
   * <p>Setter for the field <code>cause</code>.</p>
   *
   * @param cause a {@link com.databricks.sdk.service.compute.EventDetailsCause} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setCause(EventDetailsCause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * <p>Getter for the field <code>cause</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.EventDetailsCause} object
   */
  public EventDetailsCause getCause() {
    return cause;
  }

  /**
   * <p>Setter for the field <code>clusterSize</code>.</p>
   *
   * @param clusterSize a {@link com.databricks.sdk.service.compute.ClusterSize} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setClusterSize(ClusterSize clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterSize</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterSize} object
   */
  public ClusterSize getClusterSize() {
    return clusterSize;
  }

  /**
   * <p>Setter for the field <code>currentNumVcpus</code>.</p>
   *
   * @param currentNumVcpus a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setCurrentNumVcpus(Long currentNumVcpus) {
    this.currentNumVcpus = currentNumVcpus;
    return this;
  }

  /**
   * <p>Getter for the field <code>currentNumVcpus</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCurrentNumVcpus() {
    return currentNumVcpus;
  }

  /**
   * <p>Setter for the field <code>currentNumWorkers</code>.</p>
   *
   * @param currentNumWorkers a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setCurrentNumWorkers(Long currentNumWorkers) {
    this.currentNumWorkers = currentNumWorkers;
    return this;
  }

  /**
   * <p>Getter for the field <code>currentNumWorkers</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCurrentNumWorkers() {
    return currentNumWorkers;
  }

  /**
   * <p>Setter for the field <code>didNotExpandReason</code>.</p>
   *
   * @param didNotExpandReason a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setDidNotExpandReason(String didNotExpandReason) {
    this.didNotExpandReason = didNotExpandReason;
    return this;
  }

  /**
   * <p>Getter for the field <code>didNotExpandReason</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDidNotExpandReason() {
    return didNotExpandReason;
  }

  /**
   * <p>Setter for the field <code>diskSize</code>.</p>
   *
   * @param diskSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDiskSize() {
    return diskSize;
  }

  /**
   * <p>Setter for the field <code>driverStateMessage</code>.</p>
   *
   * @param driverStateMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setDriverStateMessage(String driverStateMessage) {
    this.driverStateMessage = driverStateMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>driverStateMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDriverStateMessage() {
    return driverStateMessage;
  }

  /**
   * <p>Setter for the field <code>enableTerminationForNodeBlocklisted</code>.</p>
   *
   * @param enableTerminationForNodeBlocklisted a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setEnableTerminationForNodeBlocklisted(
      Boolean enableTerminationForNodeBlocklisted) {
    this.enableTerminationForNodeBlocklisted = enableTerminationForNodeBlocklisted;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableTerminationForNodeBlocklisted</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableTerminationForNodeBlocklisted() {
    return enableTerminationForNodeBlocklisted;
  }

  /**
   * <p>Setter for the field <code>freeSpace</code>.</p>
   *
   * @param freeSpace a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setFreeSpace(Long freeSpace) {
    this.freeSpace = freeSpace;
    return this;
  }

  /**
   * <p>Getter for the field <code>freeSpace</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getFreeSpace() {
    return freeSpace;
  }

  /**
   * <p>Setter for the field <code>instanceId</code>.</p>
   *
   * @param instanceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * <p>Setter for the field <code>jobRunName</code>.</p>
   *
   * @param jobRunName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setJobRunName(String jobRunName) {
    this.jobRunName = jobRunName;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobRunName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJobRunName() {
    return jobRunName;
  }

  /**
   * <p>Setter for the field <code>previousAttributes</code>.</p>
   *
   * @param previousAttributes a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setPreviousAttributes(ClusterAttributes previousAttributes) {
    this.previousAttributes = previousAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>previousAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes getPreviousAttributes() {
    return previousAttributes;
  }

  /**
   * <p>Setter for the field <code>previousClusterSize</code>.</p>
   *
   * @param previousClusterSize a {@link com.databricks.sdk.service.compute.ClusterSize} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setPreviousClusterSize(ClusterSize previousClusterSize) {
    this.previousClusterSize = previousClusterSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>previousClusterSize</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterSize} object
   */
  public ClusterSize getPreviousClusterSize() {
    return previousClusterSize;
  }

  /**
   * <p>Setter for the field <code>previousDiskSize</code>.</p>
   *
   * @param previousDiskSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setPreviousDiskSize(Long previousDiskSize) {
    this.previousDiskSize = previousDiskSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>previousDiskSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPreviousDiskSize() {
    return previousDiskSize;
  }

  /**
   * <p>Setter for the field <code>reason</code>.</p>
   *
   * @param reason a {@link com.databricks.sdk.service.compute.TerminationReason} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setReason(TerminationReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * <p>Getter for the field <code>reason</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.TerminationReason} object
   */
  public TerminationReason getReason() {
    return reason;
  }

  /**
   * <p>Setter for the field <code>targetNumVcpus</code>.</p>
   *
   * @param targetNumVcpus a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setTargetNumVcpus(Long targetNumVcpus) {
    this.targetNumVcpus = targetNumVcpus;
    return this;
  }

  /**
   * <p>Getter for the field <code>targetNumVcpus</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTargetNumVcpus() {
    return targetNumVcpus;
  }

  /**
   * <p>Setter for the field <code>targetNumWorkers</code>.</p>
   *
   * @param targetNumWorkers a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setTargetNumWorkers(Long targetNumWorkers) {
    this.targetNumWorkers = targetNumWorkers;
    return this;
  }

  /**
   * <p>Getter for the field <code>targetNumWorkers</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTargetNumWorkers() {
    return targetNumWorkers;
  }

  /**
   * <p>Setter for the field <code>user</code>.</p>
   *
   * @param user a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails setUser(String user) {
    this.user = user;
    return this;
  }

  /**
   * <p>Getter for the field <code>user</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUser() {
    return user;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventDetails that = (EventDetails) o;
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EventDetails.class)
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
