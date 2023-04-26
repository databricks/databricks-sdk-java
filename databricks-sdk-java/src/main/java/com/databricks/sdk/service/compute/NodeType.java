// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>NodeType class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NodeType {
  /** */
  @JsonProperty("category")
  private String category;

  /** A string description associated with this node type, e.g., "r3.xlarge". */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("display_order")
  private Long displayOrder;

  /** An identifier for the type of hardware that this node runs on, e.g., "r3.2xlarge" in AWS. */
  @JsonProperty("instance_type_id")
  private String instanceTypeId;

  /** Whether the node type is deprecated. Non-deprecated node types offer greater performance. */
  @JsonProperty("is_deprecated")
  private Boolean isDeprecated;

  /**
   * AWS specific, whether this instance supports encryption in transit, used for hipaa and pci
   * workloads.
   */
  @JsonProperty("is_encrypted_in_transit")
  private Boolean isEncryptedInTransit;

  /** */
  @JsonProperty("is_graviton")
  private Boolean isGraviton;

  /** */
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  /** */
  @JsonProperty("is_io_cache_enabled")
  private Boolean isIoCacheEnabled;

  /** Memory (in MB) available for this node type. */
  @JsonProperty("memory_mb")
  private Long memoryMb;

  /** */
  @JsonProperty("node_info")
  private CloudProviderNodeInfo nodeInfo;

  /** */
  @JsonProperty("node_instance_type")
  private NodeInstanceType nodeInstanceType;

  /** Unique identifier for this node type. */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /**
   * Number of CPU cores available for this node type. Note that this can be fractional, e.g., 2.5
   * cores, if the the number of cores on a machine instance is not divisible by the number of Spark
   * nodes on that machine.
   */
  @JsonProperty("num_cores")
  private Float numCores;

  /** */
  @JsonProperty("num_gpus")
  private Long numGpus;

  /** */
  @JsonProperty("photon_driver_capable")
  private Boolean photonDriverCapable;

  /** */
  @JsonProperty("photon_worker_capable")
  private Boolean photonWorkerCapable;

  /** */
  @JsonProperty("support_cluster_tags")
  private Boolean supportClusterTags;

  /** */
  @JsonProperty("support_ebs_volumes")
  private Boolean supportEbsVolumes;

  /** */
  @JsonProperty("support_port_forwarding")
  private Boolean supportPortForwarding;

  /**
   * <p>Setter for the field <code>category</code>.</p>
   *
   * @param category a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setCategory(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>Getter for the field <code>category</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCategory() {
    return category;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>displayOrder</code>.</p>
   *
   * @param displayOrder a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * <p>Getter for the field <code>displayOrder</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDisplayOrder() {
    return displayOrder;
  }

  /**
   * <p>Setter for the field <code>instanceTypeId</code>.</p>
   *
   * @param instanceTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  /**
   * <p>Setter for the field <code>isDeprecated</code>.</p>
   *
   * @param isDeprecated a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDeprecated</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDeprecated() {
    return isDeprecated;
  }

  /**
   * <p>Setter for the field <code>isEncryptedInTransit</code>.</p>
   *
   * @param isEncryptedInTransit a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setIsEncryptedInTransit(Boolean isEncryptedInTransit) {
    this.isEncryptedInTransit = isEncryptedInTransit;
    return this;
  }

  /**
   * <p>Getter for the field <code>isEncryptedInTransit</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsEncryptedInTransit() {
    return isEncryptedInTransit;
  }

  /**
   * <p>Setter for the field <code>isGraviton</code>.</p>
   *
   * @param isGraviton a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setIsGraviton(Boolean isGraviton) {
    this.isGraviton = isGraviton;
    return this;
  }

  /**
   * <p>Getter for the field <code>isGraviton</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsGraviton() {
    return isGraviton;
  }

  /**
   * <p>Setter for the field <code>isHidden</code>.</p>
   *
   * @param isHidden a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * <p>Getter for the field <code>isHidden</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsHidden() {
    return isHidden;
  }

  /**
   * <p>Setter for the field <code>isIoCacheEnabled</code>.</p>
   *
   * @param isIoCacheEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setIsIoCacheEnabled(Boolean isIoCacheEnabled) {
    this.isIoCacheEnabled = isIoCacheEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>isIoCacheEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsIoCacheEnabled() {
    return isIoCacheEnabled;
  }

  /**
   * <p>Setter for the field <code>memoryMb</code>.</p>
   *
   * @param memoryMb a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setMemoryMb(Long memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * <p>Getter for the field <code>memoryMb</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMemoryMb() {
    return memoryMb;
  }

  /**
   * <p>Setter for the field <code>nodeInfo</code>.</p>
   *
   * @param nodeInfo a {@link com.databricks.sdk.service.compute.CloudProviderNodeInfo} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setNodeInfo(CloudProviderNodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.CloudProviderNodeInfo} object
   */
  public CloudProviderNodeInfo getNodeInfo() {
    return nodeInfo;
  }

  /**
   * <p>Setter for the field <code>nodeInstanceType</code>.</p>
   *
   * @param nodeInstanceType a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setNodeInstanceType(NodeInstanceType nodeInstanceType) {
    this.nodeInstanceType = nodeInstanceType;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeInstanceType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType getNodeInstanceType() {
    return nodeInstanceType;
  }

  /**
   * <p>Setter for the field <code>nodeTypeId</code>.</p>
   *
   * @param nodeTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeTypeId() {
    return nodeTypeId;
  }

  /**
   * <p>Setter for the field <code>numCores</code>.</p>
   *
   * @param numCores a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setNumCores(Float numCores) {
    this.numCores = numCores;
    return this;
  }

  /**
   * <p>Getter for the field <code>numCores</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getNumCores() {
    return numCores;
  }

  /**
   * <p>Setter for the field <code>numGpus</code>.</p>
   *
   * @param numGpus a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setNumGpus(Long numGpus) {
    this.numGpus = numGpus;
    return this;
  }

  /**
   * <p>Getter for the field <code>numGpus</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumGpus() {
    return numGpus;
  }

  /**
   * <p>Setter for the field <code>photonDriverCapable</code>.</p>
   *
   * @param photonDriverCapable a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setPhotonDriverCapable(Boolean photonDriverCapable) {
    this.photonDriverCapable = photonDriverCapable;
    return this;
  }

  /**
   * <p>Getter for the field <code>photonDriverCapable</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPhotonDriverCapable() {
    return photonDriverCapable;
  }

  /**
   * <p>Setter for the field <code>photonWorkerCapable</code>.</p>
   *
   * @param photonWorkerCapable a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setPhotonWorkerCapable(Boolean photonWorkerCapable) {
    this.photonWorkerCapable = photonWorkerCapable;
    return this;
  }

  /**
   * <p>Getter for the field <code>photonWorkerCapable</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPhotonWorkerCapable() {
    return photonWorkerCapable;
  }

  /**
   * <p>Setter for the field <code>supportClusterTags</code>.</p>
   *
   * @param supportClusterTags a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setSupportClusterTags(Boolean supportClusterTags) {
    this.supportClusterTags = supportClusterTags;
    return this;
  }

  /**
   * <p>Getter for the field <code>supportClusterTags</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSupportClusterTags() {
    return supportClusterTags;
  }

  /**
   * <p>Setter for the field <code>supportEbsVolumes</code>.</p>
   *
   * @param supportEbsVolumes a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setSupportEbsVolumes(Boolean supportEbsVolumes) {
    this.supportEbsVolumes = supportEbsVolumes;
    return this;
  }

  /**
   * <p>Getter for the field <code>supportEbsVolumes</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSupportEbsVolumes() {
    return supportEbsVolumes;
  }

  /**
   * <p>Setter for the field <code>supportPortForwarding</code>.</p>
   *
   * @param supportPortForwarding a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.NodeType} object
   */
  public NodeType setSupportPortForwarding(Boolean supportPortForwarding) {
    this.supportPortForwarding = supportPortForwarding;
    return this;
  }

  /**
   * <p>Getter for the field <code>supportPortForwarding</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSupportPortForwarding() {
    return supportPortForwarding;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NodeType that = (NodeType) o;
    return Objects.equals(category, that.category)
        && Objects.equals(description, that.description)
        && Objects.equals(displayOrder, that.displayOrder)
        && Objects.equals(instanceTypeId, that.instanceTypeId)
        && Objects.equals(isDeprecated, that.isDeprecated)
        && Objects.equals(isEncryptedInTransit, that.isEncryptedInTransit)
        && Objects.equals(isGraviton, that.isGraviton)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(isIoCacheEnabled, that.isIoCacheEnabled)
        && Objects.equals(memoryMb, that.memoryMb)
        && Objects.equals(nodeInfo, that.nodeInfo)
        && Objects.equals(nodeInstanceType, that.nodeInstanceType)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(numCores, that.numCores)
        && Objects.equals(numGpus, that.numGpus)
        && Objects.equals(photonDriverCapable, that.photonDriverCapable)
        && Objects.equals(photonWorkerCapable, that.photonWorkerCapable)
        && Objects.equals(supportClusterTags, that.supportClusterTags)
        && Objects.equals(supportEbsVolumes, that.supportEbsVolumes)
        && Objects.equals(supportPortForwarding, that.supportPortForwarding);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        description,
        displayOrder,
        instanceTypeId,
        isDeprecated,
        isEncryptedInTransit,
        isGraviton,
        isHidden,
        isIoCacheEnabled,
        memoryMb,
        nodeInfo,
        nodeInstanceType,
        nodeTypeId,
        numCores,
        numGpus,
        photonDriverCapable,
        photonWorkerCapable,
        supportClusterTags,
        supportEbsVolumes,
        supportPortForwarding);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NodeType.class)
        .add("category", category)
        .add("description", description)
        .add("displayOrder", displayOrder)
        .add("instanceTypeId", instanceTypeId)
        .add("isDeprecated", isDeprecated)
        .add("isEncryptedInTransit", isEncryptedInTransit)
        .add("isGraviton", isGraviton)
        .add("isHidden", isHidden)
        .add("isIoCacheEnabled", isIoCacheEnabled)
        .add("memoryMb", memoryMb)
        .add("nodeInfo", nodeInfo)
        .add("nodeInstanceType", nodeInstanceType)
        .add("nodeTypeId", nodeTypeId)
        .add("numCores", numCores)
        .add("numGpus", numGpus)
        .add("photonDriverCapable", photonDriverCapable)
        .add("photonWorkerCapable", photonWorkerCapable)
        .add("supportClusterTags", supportClusterTags)
        .add("supportEbsVolumes", supportEbsVolumes)
        .add("supportPortForwarding", supportPortForwarding)
        .toString();
  }
}
