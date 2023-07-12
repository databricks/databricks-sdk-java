// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Library {
  /**
   * Specification of a CRAN library to be installed as part of the library
   */
  @JsonProperty("cran")
  private RCranLibrary cran;
  
  /**
   * URI of the egg to be installed. Currently only DBFS and S3 URIs are
   * supported. For example: `{ "egg": "dbfs:/my/egg" }` or `{ "egg":
   * "s3://my-bucket/egg" }`. If S3 is used, please make sure the cluster has
   * read access on the library. You may need to launch the cluster with an IAM
   * role to access the S3 URI.
   */
  @JsonProperty("egg")
  private String egg;
  
  /**
   * URI of the jar to be installed. Currently only DBFS and S3 URIs are
   * supported. For example: `{ "jar": "dbfs:/mnt/databricks/library.jar" }` or
   * `{ "jar": "s3://my-bucket/library.jar" }`. If S3 is used, please make sure
   * the cluster has read access on the library. You may need to launch the
   * cluster with an IAM role to access the S3 URI.
   */
  @JsonProperty("jar")
  private String jar;
  
  /**
   * Specification of a maven library to be installed. For example: `{
   * "coordinates": "org.jsoup:jsoup:1.7.2" }`
   */
  @JsonProperty("maven")
  private MavenLibrary maven;
  
  /**
   * Specification of a PyPi library to be installed. For example: `{ "package":
   * "simplejson" }`
   */
  @JsonProperty("pypi")
  private PythonPyPiLibrary pypi;
  
  /**
   * URI of the wheel to be installed. For example: `{ "whl": "dbfs:/my/whl" }`
   * or `{ "whl": "s3://my-bucket/whl" }`. If S3 is used, please make sure the
   * cluster has read access on the library. You may need to launch the cluster
   * with an IAM role to access the S3 URI.
   */
  @JsonProperty("whl")
  private String whl;
  
  public Library setCran(RCranLibrary cran) {
    this.cran = cran;
    return this;
  }

  public RCranLibrary getCran() {
    return cran;
  }
  
  public Library setEgg(String egg) {
    this.egg = egg;
    return this;
  }

  public String getEgg() {
    return egg;
  }
  
  public Library setJar(String jar) {
    this.jar = jar;
    return this;
  }

  public String getJar() {
    return jar;
  }
  
  public Library setMaven(MavenLibrary maven) {
    this.maven = maven;
    return this;
  }

  public MavenLibrary getMaven() {
    return maven;
  }
  
  public Library setPypi(PythonPyPiLibrary pypi) {
    this.pypi = pypi;
    return this;
  }

  public PythonPyPiLibrary getPypi() {
    return pypi;
  }
  
  public Library setWhl(String whl) {
    this.whl = whl;
    return this;
  }

  public String getWhl() {
    return whl;
  }
  

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
    && Objects.equals(whl, that.whl)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cran, egg, jar, maven, pypi, whl);
  }

  @Override
  public String toString() {
    return new ToStringer(Library.class)
      .add("cran", cran)
      .add("egg", egg)
      .add("jar", jar)
      .add("maven", maven)
      .add("pypi", pypi)
      .add("whl", whl).toString();
  }
}
