// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



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
     * read access on the library. You may need to launch the cluster with an
     * IAM role to access the S3 URI.
     */
    @JsonProperty("egg")
    private String egg;
    
    /**
     * URI of the jar to be installed. Currently only DBFS and S3 URIs are
     * supported. For example: `{ "jar": "dbfs:/mnt/databricks/library.jar" }`
     * or `{ "jar": "s3://my-bucket/library.jar" }`. If S3 is used, please make
     * sure the cluster has read access on the library. You may need to launch
     * the cluster with an IAM role to access the S3 URI.
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
     * Specification of a PyPi library to be installed. For example: `{
     * "package": "simplejson" }`
     */
    @JsonProperty("pypi")
    private PythonPyPiLibrary pypi;
    
    /**
     * URI of the wheel to be installed. For example: `{ "whl": "dbfs:/my/whl"
     * }` or `{ "whl": "s3://my-bucket/whl" }`. If S3 is used, please make sure
     * the cluster has read access on the library. You may need to launch the
     * cluster with an IAM role to access the S3 URI.
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
    
}
