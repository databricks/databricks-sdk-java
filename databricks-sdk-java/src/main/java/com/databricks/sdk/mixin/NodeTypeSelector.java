package com.databricks.sdk.mixin;

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

  public NodeTypeSelector withMinMemoryGb(Integer minMemoryGb) {
    this.minMemoryGb = minMemoryGb;
    return this;
  }

  public NodeTypeSelector withGbPerCore(Integer gbPerCore) {
    this.gbPerCore = gbPerCore;
    return this;
  }

  public NodeTypeSelector withMinCores(Integer minCores) {
    this.minCores = minCores;
    return this;
  }

  public NodeTypeSelector withMinGpus(Integer minGpus) {
    this.minGpus = minGpus;
    return this;
  }

  public NodeTypeSelector withLocalDisk() {
    this.localDisk = true;
    return this;
  }

  public NodeTypeSelector withLocalDiskMinSize(Integer localDiskMinSize) {
    this.localDiskMinSize = localDiskMinSize;
    return this;
  }

  public NodeTypeSelector withCategory(String category) {
    this.category = category;
    return this;
  }

  public NodeTypeSelector withPhotonWorkerCapable() {
    this.photonWorkerCapable = true;
    return this;
  }

  public NodeTypeSelector withPhotonDriverCapable() {
    this.photonDriverCapable = true;
    return this;
  }

  public NodeTypeSelector withGraviton() {
    this.graviton = true;
    return this;
  }

  public NodeTypeSelector withIsIoCacheEnabled() {
    this.isIoCacheEnabled = true;
    return this;
  }

  public NodeTypeSelector withSupportPortForwarding() {
    this.supportPortForwarding = true;
    return this;
  }

  public NodeTypeSelector withFleet(String fleet) {
    this.fleet = fleet;
    return this;
  }
}
