package com.databricks.sdk.mixin;

public class SparkVersionSelector {
  boolean longTermSupport;
  boolean beta;
  boolean latest;
  boolean ml;
  boolean genomics;
  boolean gpu;
  String scala;
  String sparkVersion;
  boolean photon;
  boolean graviton;

  public SparkVersionSelector withLongTermSupport() {
    this.longTermSupport = true;
    return this;
  }

  public SparkVersionSelector withBeta() {
    this.beta = true;
    return this;
  }

  public SparkVersionSelector withLatest() {
    this.latest = true;
    return this;
  }

  public SparkVersionSelector withML() {
    this.ml = true;
    return this;
  }

  public SparkVersionSelector withGenomics() {
    this.genomics = true;
    return this;
  }

  public SparkVersionSelector withGPU() {
    this.gpu = true;
    return this;
  }

  public SparkVersionSelector withScala(String scala) {
    this.scala = scala;
    return this;
  }

  public SparkVersionSelector withSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  public SparkVersionSelector withPhoton() {
    this.photon = true;
    return this;
  }

  public SparkVersionSelector withGraviton() {
    this.graviton = true;
    return this;
  }
}
