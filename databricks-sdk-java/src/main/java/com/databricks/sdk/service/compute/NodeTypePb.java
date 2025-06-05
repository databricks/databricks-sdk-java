// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A description of a Spark node type including both the dimensions of the node and the instance
 * type on which it will be hosted.
 */
@Generated
class NodeTypePb {
  @JsonProperty("category")
  private String category;

  @JsonProperty("description")
  private String description;

  @JsonProperty("display_order")
  private Long displayOrder;

  @JsonProperty("instance_type_id")
  private String instanceTypeId;

  @JsonProperty("is_deprecated")
  private Boolean isDeprecated;

  @JsonProperty("is_encrypted_in_transit")
  private Boolean isEncryptedInTransit;

  @JsonProperty("is_graviton")
  private Boolean isGraviton;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("is_io_cache_enabled")
  private Boolean isIoCacheEnabled;

  @JsonProperty("memory_mb")
  private Long memoryMb;

  @JsonProperty("node_info")
  private CloudProviderNodeInfo nodeInfo;

  @JsonProperty("node_instance_type")
  private NodeInstanceType nodeInstanceType;

  @JsonProperty("node_type_id")
  private String nodeTypeId;

  @JsonProperty("num_cores")
  private Double numCores;

  @JsonProperty("num_gpus")
  private Long numGpus;

  @JsonProperty("photon_driver_capable")
  private Boolean photonDriverCapable;

  @JsonProperty("photon_worker_capable")
  private Boolean photonWorkerCapable;

  @JsonProperty("support_cluster_tags")
  private Boolean supportClusterTags;

  @JsonProperty("support_ebs_volumes")
  private Boolean supportEbsVolumes;

  @JsonProperty("support_port_forwarding")
  private Boolean supportPortForwarding;

  public NodeTypePb setCategory(String category) {
    this.category = category;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public NodeTypePb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public NodeTypePb setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  public Long getDisplayOrder() {
    return displayOrder;
  }

  public NodeTypePb setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public NodeTypePb setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  public Boolean getIsDeprecated() {
    return isDeprecated;
  }

  public NodeTypePb setIsEncryptedInTransit(Boolean isEncryptedInTransit) {
    this.isEncryptedInTransit = isEncryptedInTransit;
    return this;
  }

  public Boolean getIsEncryptedInTransit() {
    return isEncryptedInTransit;
  }

  public NodeTypePb setIsGraviton(Boolean isGraviton) {
    this.isGraviton = isGraviton;
    return this;
  }

  public Boolean getIsGraviton() {
    return isGraviton;
  }

  public NodeTypePb setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public NodeTypePb setIsIoCacheEnabled(Boolean isIoCacheEnabled) {
    this.isIoCacheEnabled = isIoCacheEnabled;
    return this;
  }

  public Boolean getIsIoCacheEnabled() {
    return isIoCacheEnabled;
  }

  public NodeTypePb setMemoryMb(Long memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  public Long getMemoryMb() {
    return memoryMb;
  }

  public NodeTypePb setNodeInfo(CloudProviderNodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public CloudProviderNodeInfo getNodeInfo() {
    return nodeInfo;
  }

  public NodeTypePb setNodeInstanceType(NodeInstanceType nodeInstanceType) {
    this.nodeInstanceType = nodeInstanceType;
    return this;
  }

  public NodeInstanceType getNodeInstanceType() {
    return nodeInstanceType;
  }

  public NodeTypePb setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public NodeTypePb setNumCores(Double numCores) {
    this.numCores = numCores;
    return this;
  }

  public Double getNumCores() {
    return numCores;
  }

  public NodeTypePb setNumGpus(Long numGpus) {
    this.numGpus = numGpus;
    return this;
  }

  public Long getNumGpus() {
    return numGpus;
  }

  public NodeTypePb setPhotonDriverCapable(Boolean photonDriverCapable) {
    this.photonDriverCapable = photonDriverCapable;
    return this;
  }

  public Boolean getPhotonDriverCapable() {
    return photonDriverCapable;
  }

  public NodeTypePb setPhotonWorkerCapable(Boolean photonWorkerCapable) {
    this.photonWorkerCapable = photonWorkerCapable;
    return this;
  }

  public Boolean getPhotonWorkerCapable() {
    return photonWorkerCapable;
  }

  public NodeTypePb setSupportClusterTags(Boolean supportClusterTags) {
    this.supportClusterTags = supportClusterTags;
    return this;
  }

  public Boolean getSupportClusterTags() {
    return supportClusterTags;
  }

  public NodeTypePb setSupportEbsVolumes(Boolean supportEbsVolumes) {
    this.supportEbsVolumes = supportEbsVolumes;
    return this;
  }

  public Boolean getSupportEbsVolumes() {
    return supportEbsVolumes;
  }

  public NodeTypePb setSupportPortForwarding(Boolean supportPortForwarding) {
    this.supportPortForwarding = supportPortForwarding;
    return this;
  }

  public Boolean getSupportPortForwarding() {
    return supportPortForwarding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NodeTypePb that = (NodeTypePb) o;
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

  @Override
  public String toString() {
    return new ToStringer(NodeTypePb.class)
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
