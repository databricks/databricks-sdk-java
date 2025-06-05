// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class LibraryPb {
  @JsonProperty("cran")
  private RCranLibrary cran;

  @JsonProperty("egg")
  private String egg;

  @JsonProperty("jar")
  private String jar;

  @JsonProperty("maven")
  private MavenLibrary maven;

  @JsonProperty("pypi")
  private PythonPyPiLibrary pypi;

  @JsonProperty("requirements")
  private String requirements;

  @JsonProperty("whl")
  private String whl;

  public LibraryPb setCran(RCranLibrary cran) {
    this.cran = cran;
    return this;
  }

  public RCranLibrary getCran() {
    return cran;
  }

  public LibraryPb setEgg(String egg) {
    this.egg = egg;
    return this;
  }

  public String getEgg() {
    return egg;
  }

  public LibraryPb setJar(String jar) {
    this.jar = jar;
    return this;
  }

  public String getJar() {
    return jar;
  }

  public LibraryPb setMaven(MavenLibrary maven) {
    this.maven = maven;
    return this;
  }

  public MavenLibrary getMaven() {
    return maven;
  }

  public LibraryPb setPypi(PythonPyPiLibrary pypi) {
    this.pypi = pypi;
    return this;
  }

  public PythonPyPiLibrary getPypi() {
    return pypi;
  }

  public LibraryPb setRequirements(String requirements) {
    this.requirements = requirements;
    return this;
  }

  public String getRequirements() {
    return requirements;
  }

  public LibraryPb setWhl(String whl) {
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
    LibraryPb that = (LibraryPb) o;
    return Objects.equals(cran, that.cran)
        && Objects.equals(egg, that.egg)
        && Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(pypi, that.pypi)
        && Objects.equals(requirements, that.requirements)
        && Objects.equals(whl, that.whl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cran, egg, jar, maven, pypi, requirements, whl);
  }

  @Override
  public String toString() {
    return new ToStringer(LibraryPb.class)
        .add("cran", cran)
        .add("egg", egg)
        .add("jar", jar)
        .add("maven", maven)
        .add("pypi", pypi)
        .add("requirements", requirements)
        .add("whl", whl)
        .toString();
  }
}
