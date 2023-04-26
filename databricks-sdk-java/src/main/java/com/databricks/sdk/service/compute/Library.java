// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Library class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Library {
  /** Specification of a CRAN library to be installed as part of the library */
  @JsonProperty("cran")
  private RCranLibrary cran;

  /**
   * URI of the egg to be installed. Currently only DBFS and S3 URIs are supported. For example: `{
   * "egg": "dbfs:/my/egg" }` or `{ "egg": "s3://my-bucket/egg" }`. If S3 is used, please make sure
   * the cluster has read access on the library. You may need to launch the cluster with an IAM role
   * to access the S3 URI.
   */
  @JsonProperty("egg")
  private String egg;

  /**
   * URI of the jar to be installed. Currently only DBFS and S3 URIs are supported. For example: `{
   * "jar": "dbfs:/mnt/databricks/library.jar" }` or `{ "jar": "s3://my-bucket/library.jar" }`. If
   * S3 is used, please make sure the cluster has read access on the library. You may need to launch
   * the cluster with an IAM role to access the S3 URI.
   */
  @JsonProperty("jar")
  private String jar;

  /**
   * Specification of a maven library to be installed. For example: `{ "coordinates":
   * "org.jsoup:jsoup:1.7.2" }`
   */
  @JsonProperty("maven")
  private MavenLibrary maven;

  /** Specification of a PyPi library to be installed. For example: `{ "package": "simplejson" }` */
  @JsonProperty("pypi")
  private PythonPyPiLibrary pypi;

  /**
   * URI of the wheel to be installed. For example: `{ "whl": "dbfs:/my/whl" }` or `{ "whl":
   * "s3://my-bucket/whl" }`. If S3 is used, please make sure the cluster has read access on the
   * library. You may need to launch the cluster with an IAM role to access the S3 URI.
   */
  @JsonProperty("whl")
  private String whl;

  /**
   * <p>Setter for the field <code>cran</code>.</p>
   *
   * @param cran a {@link com.databricks.sdk.service.compute.RCranLibrary} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setCran(RCranLibrary cran) {
    this.cran = cran;
    return this;
  }

  /**
   * <p>Getter for the field <code>cran</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.RCranLibrary} object
   */
  public RCranLibrary getCran() {
    return cran;
  }

  /**
   * <p>Setter for the field <code>egg</code>.</p>
   *
   * @param egg a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setEgg(String egg) {
    this.egg = egg;
    return this;
  }

  /**
   * <p>Getter for the field <code>egg</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEgg() {
    return egg;
  }

  /**
   * <p>Setter for the field <code>jar</code>.</p>
   *
   * @param jar a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setJar(String jar) {
    this.jar = jar;
    return this;
  }

  /**
   * <p>Getter for the field <code>jar</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJar() {
    return jar;
  }

  /**
   * <p>Setter for the field <code>maven</code>.</p>
   *
   * @param maven a {@link com.databricks.sdk.service.compute.MavenLibrary} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setMaven(MavenLibrary maven) {
    this.maven = maven;
    return this;
  }

  /**
   * <p>Getter for the field <code>maven</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.MavenLibrary} object
   */
  public MavenLibrary getMaven() {
    return maven;
  }

  /**
   * <p>Setter for the field <code>pypi</code>.</p>
   *
   * @param pypi a {@link com.databricks.sdk.service.compute.PythonPyPiLibrary} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setPypi(PythonPyPiLibrary pypi) {
    this.pypi = pypi;
    return this;
  }

  /**
   * <p>Getter for the field <code>pypi</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.PythonPyPiLibrary} object
   */
  public PythonPyPiLibrary getPypi() {
    return pypi;
  }

  /**
   * <p>Setter for the field <code>whl</code>.</p>
   *
   * @param whl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library setWhl(String whl) {
    this.whl = whl;
    return this;
  }

  /**
   * <p>Getter for the field <code>whl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWhl() {
    return whl;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Library that = (Library) o;
    return Objects.equals(cran, that.cran)
        && Objects.equals(egg, that.egg)
        && Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(pypi, that.pypi)
        && Objects.equals(whl, that.whl);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(cran, egg, jar, maven, pypi, whl);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Library.class)
        .add("cran", cran)
        .add("egg", egg)
        .add("jar", jar)
        .add("maven", maven)
        .add("pypi", pypi)
        .add("whl", whl)
        .toString();
  }
}
