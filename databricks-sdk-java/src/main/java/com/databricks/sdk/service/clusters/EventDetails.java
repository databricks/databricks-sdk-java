// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EventDetails {
    /**
     * * For created clusters, the attributes of the cluster. * For edited
     * clusters, the new attributes of the cluster.
     */
    @JsonProperty("attributes")
    private ClusterAttributes attributes;
    
    /**
     * The cause of a change in target size.
     */
    @JsonProperty("cause")
    private EventDetailsCause cause;
    
    /**
     * The actual cluster size that was set in the cluster creation or edit.
     */
    @JsonProperty("cluster_size")
    private ClusterSize clusterSize;
    
    /**
     * The current number of vCPUs in the cluster.
     */
    @JsonProperty("current_num_vcpus")
    private Long currentNumVcpus;
    
    /**
     * The current number of nodes in the cluster.
     */
    @JsonProperty("current_num_workers")
    private Long currentNumWorkers;
    
    /**
     * <needs content added>
     */
    @JsonProperty("did_not_expand_reason")
    private String didNotExpandReason;
    
    /**
     * Current disk size in bytes
     */
    @JsonProperty("disk_size")
    private Long diskSize;
    
    /**
     * More details about the change in driver's state
     */
    @JsonProperty("driver_state_message")
    private String driverStateMessage;
    
    /**
     * Whether or not a blocklisted node should be terminated. For
     * ClusterEventType NODE_BLACKLISTED.
     */
    @JsonProperty("enable_termination_for_node_blocklisted")
    private Boolean enableTerminationForNodeBlocklisted;
    
    /**
     * <needs content added>
     */
    @JsonProperty("free_space")
    private Long freeSpace;
    
    /**
     * Instance Id where the event originated from
     */
    @JsonProperty("instance_id")
    private String instanceId;
    
    /**
     * Unique identifier of the specific job run associated with this cluster
     * event * For clusters created for jobs, this will be the same as the
     * cluster name
     */
    @JsonProperty("job_run_name")
    private String jobRunName;
    
    /**
     * The cluster attributes before a cluster was edited.
     */
    @JsonProperty("previous_attributes")
    private ClusterAttributes previousAttributes;
    
    /**
     * The size of the cluster before an edit or resize.
     */
    @JsonProperty("previous_cluster_size")
    private ClusterSize previousClusterSize;
    
    /**
     * Previous disk size in bytes
     */
    @JsonProperty("previous_disk_size")
    private Long previousDiskSize;
    
    /**
     * A termination reason: * On a TERMINATED event, this is the reason of the
     * termination. * On a RESIZE_COMPLETE event, this indicates the reason that
     * we failed to acquire some nodes.
     */
    @JsonProperty("reason")
    private TerminationReason reason;
    
    /**
     * The targeted number of vCPUs in the cluster.
     */
    @JsonProperty("target_num_vcpus")
    private Long targetNumVcpus;
    
    /**
     * The targeted number of nodes in the cluster.
     */
    @JsonProperty("target_num_workers")
    private Long targetNumWorkers;
    
    /**
     * The user that caused the event to occur. (Empty if it was done by the
     * control plane.)
     */
    @JsonProperty("user")
    private String user;
    
    public EventDetails setAttributes(ClusterAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ClusterAttributes getAttributes() {
        return attributes;
    }
    
    public EventDetails setCause(EventDetailsCause cause) {
        this.cause = cause;
        return this;
    }

    public EventDetailsCause getCause() {
        return cause;
    }
    
    public EventDetails setClusterSize(ClusterSize clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    public ClusterSize getClusterSize() {
        return clusterSize;
    }
    
    public EventDetails setCurrentNumVcpus(Long currentNumVcpus) {
        this.currentNumVcpus = currentNumVcpus;
        return this;
    }

    public Long getCurrentNumVcpus() {
        return currentNumVcpus;
    }
    
    public EventDetails setCurrentNumWorkers(Long currentNumWorkers) {
        this.currentNumWorkers = currentNumWorkers;
        return this;
    }

    public Long getCurrentNumWorkers() {
        return currentNumWorkers;
    }
    
    public EventDetails setDidNotExpandReason(String didNotExpandReason) {
        this.didNotExpandReason = didNotExpandReason;
        return this;
    }

    public String getDidNotExpandReason() {
        return didNotExpandReason;
    }
    
    public EventDetails setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public Long getDiskSize() {
        return diskSize;
    }
    
    public EventDetails setDriverStateMessage(String driverStateMessage) {
        this.driverStateMessage = driverStateMessage;
        return this;
    }

    public String getDriverStateMessage() {
        return driverStateMessage;
    }
    
    public EventDetails setEnableTerminationForNodeBlocklisted(Boolean enableTerminationForNodeBlocklisted) {
        this.enableTerminationForNodeBlocklisted = enableTerminationForNodeBlocklisted;
        return this;
    }

    public Boolean getEnableTerminationForNodeBlocklisted() {
        return enableTerminationForNodeBlocklisted;
    }
    
    public EventDetails setFreeSpace(Long freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    public Long getFreeSpace() {
        return freeSpace;
    }
    
    public EventDetails setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }
    
    public EventDetails setJobRunName(String jobRunName) {
        this.jobRunName = jobRunName;
        return this;
    }

    public String getJobRunName() {
        return jobRunName;
    }
    
    public EventDetails setPreviousAttributes(ClusterAttributes previousAttributes) {
        this.previousAttributes = previousAttributes;
        return this;
    }

    public ClusterAttributes getPreviousAttributes() {
        return previousAttributes;
    }
    
    public EventDetails setPreviousClusterSize(ClusterSize previousClusterSize) {
        this.previousClusterSize = previousClusterSize;
        return this;
    }

    public ClusterSize getPreviousClusterSize() {
        return previousClusterSize;
    }
    
    public EventDetails setPreviousDiskSize(Long previousDiskSize) {
        this.previousDiskSize = previousDiskSize;
        return this;
    }

    public Long getPreviousDiskSize() {
        return previousDiskSize;
    }
    
    public EventDetails setReason(TerminationReason reason) {
        this.reason = reason;
        return this;
    }

    public TerminationReason getReason() {
        return reason;
    }
    
    public EventDetails setTargetNumVcpus(Long targetNumVcpus) {
        this.targetNumVcpus = targetNumVcpus;
        return this;
    }

    public Long getTargetNumVcpus() {
        return targetNumVcpus;
    }
    
    public EventDetails setTargetNumWorkers(Long targetNumWorkers) {
        this.targetNumWorkers = targetNumWorkers;
        return this;
    }

    public Long getTargetNumWorkers() {
        return targetNumWorkers;
    }
    
    public EventDetails setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return user;
    }
    
}
