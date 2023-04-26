package com.databricks.sdk.mixin;

/**
 * <p>SparkVersionSelector class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>withLongTermSupport.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withLongTermSupport() {
    this.longTermSupport = true;
    return this;
  }

  /**
   * <p>withBeta.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withBeta() {
    this.beta = true;
    return this;
  }

  /**
   * <p>withLatest.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withLatest() {
    this.latest = true;
    return this;
  }

  /**
   * <p>withML.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withML() {
    this.ml = true;
    return this;
  }

  /**
   * <p>withGenomics.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withGenomics() {
    this.genomics = true;
    return this;
  }

  /**
   * <p>withGPU.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withGPU() {
    this.gpu = true;
    return this;
  }

  /**
   * <p>withScala.</p>
   *
   * @param scala a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withScala(String scala) {
    this.scala = scala;
    return this;
  }

  /**
   * <p>withSparkVersion.</p>
   *
   * @param sparkVersion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  /**
   * <p>withPhoton.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withPhoton() {
    this.photon = true;
    return this;
  }

  /**
   * <p>withGraviton.</p>
   *
   * @return a {@link com.databricks.sdk.mixin.SparkVersionSelector} object
   */
  public SparkVersionSelector withGraviton() {
    this.graviton = true;
    return this;
  }
}
