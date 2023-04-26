package com.databricks.sdk.mixin;

/**
 * <p>NodeTypeSelector class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NodeTypeSelector {
  Integer minMemoryGb;
  Integer gbPerCore;
  Integer minCores;
  Integer minGpus;
  Boolean localDisk;
  Integer localDiskMinSize;
  String category;
  Boolean photonWorkerCapable;
  Boolean photonDriverCapable;
  Boolean graviton;
  Boolean isIoCacheEnabled;
  Boolean supportPortForwarding;
  String fleet;

  /**
   * <p>withMinMemoryGb.</p>
   *
   * @param minMemoryGb a {@link java.lang.Integer} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withMinMemoryGb(Integer minMemoryGb) {
    this.minMemoryGb = minMemoryGb;
    return this;
  }

  /**
   * <p>withGbPerCore.</p>
   *
   * @param gbPerCore a {@link java.lang.Integer} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withGbPerCore(Integer gbPerCore) {
    this.gbPerCore = gbPerCore;
    return this;
  }

  /**
   * <p>withMinCores.</p>
   *
   * @param minCores a {@link java.lang.Integer} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withMinCores(Integer minCores) {
    this.minCores = minCores;
    return this;
  }

  /**
   * <p>withMinGpus.</p>
   *
   * @param minGpus a {@link java.lang.Integer} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withMinGpus(Integer minGpus) {
    this.minGpus = minGpus;
    return this;
  }

  /**
   * <p>withLocalDisk.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withLocalDisk() {
    this.localDisk = true;
    return this;
  }

  /**
   * <p>withLocalDiskMinSize.</p>
   *
   * @param localDiskMinSize a {@link java.lang.Integer} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withLocalDiskMinSize(Integer localDiskMinSize) {
    this.localDiskMinSize = localDiskMinSize;
    return this;
  }

  /**
   * <p>withCategory.</p>
   *
   * @param category a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withCategory(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>withPhotonWorkerCapable.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withPhotonWorkerCapable() {
    this.photonWorkerCapable = true;
    return this;
  }

  /**
   * <p>withPhotonDriverCapable.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withPhotonDriverCapable() {
    this.photonDriverCapable = true;
    return this;
  }

  /**
   * <p>withGraviton.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withGraviton() {
    this.graviton = true;
    return this;
  }

  /**
   * <p>withIsIoCacheEnabled.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withIsIoCacheEnabled() {
    this.isIoCacheEnabled = true;
    return this;
  }

  /**
   * <p>withSupportPortForwarding.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withSupportPortForwarding() {
    this.supportPortForwarding = true;
    return this;
  }

  /**
   * <p>withFleet.</p>
   *
   * @param fleet a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.mixin.NodeTypeSelector} object
   */
  public NodeTypeSelector withFleet(String fleet) {
    this.fleet = fleet;
    return this;
  }
}
