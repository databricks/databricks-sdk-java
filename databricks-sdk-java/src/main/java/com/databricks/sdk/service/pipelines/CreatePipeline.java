// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreatePipeline {
    /**
     * If false, deployment will fail if name conflicts with that of another
     * pipeline.
     */
    @JsonProperty("allow_duplicate_names")
    private Boolean allowDuplicateNames;
    
    /**
     * Catalog in UC to add tables to. If target is specified, tables in this
     * pipeline will be published to a "target" schema inside catalog (i.e.
     * <catalog>.<target>.<table>).
     */
    @JsonProperty("catalog")
    private String catalog;
    
    /**
     * DLT Release Channel that specifies which version to use.
     */
    @JsonProperty("channel")
    private String channel;
    
    /**
     * Cluster settings for this pipeline deployment.
     */
    @JsonProperty("clusters")
    private java.util.List<PipelineCluster> clusters;
    
    /**
     * String-String configuration for this pipeline execution.
     */
    @JsonProperty("configuration")
    private Map<String,String> configuration;
    
    /**
     * Whether the pipeline is continuous or triggered. This replaces `trigger`.
     */
    @JsonProperty("continuous")
    private Boolean continuous;
    
    /**
     * Whether the pipeline is in Development mode. Defaults to false.
     */
    @JsonProperty("development")
    private Boolean development;
    
    /**
     
     */
    @JsonProperty("dry_run")
    private Boolean dryRun;
    
    /**
     * Pipeline product edition.
     */
    @JsonProperty("edition")
    private String edition;
    
    /**
     * Filters on which Pipeline packages to include in the deployed graph.
     */
    @JsonProperty("filters")
    private Filters filters;
    
    /**
     * Unique identifier for this pipeline.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Libraries or code needed by this deployment.
     */
    @JsonProperty("libraries")
    private java.util.List<PipelineLibrary> libraries;
    
    /**
     * Friendly identifier for this pipeline.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Whether Photon is enabled for this pipeline.
     */
    @JsonProperty("photon")
    private Boolean photon;
    
    /**
     * DBFS root directory for storing checkpoints and tables.
     */
    @JsonProperty("storage")
    private String storage;
    
    /**
     * Target schema (database) to add tables in this pipeline to.
     */
    @JsonProperty("target")
    private String target;
    
    /**
     * Which pipeline trigger to use. Deprecated: Use `continuous` instead.
     */
    @JsonProperty("trigger")
    private PipelineTrigger trigger;
    
    public CreatePipeline setAllowDuplicateNames(Boolean allowDuplicateNames) {
        this.allowDuplicateNames = allowDuplicateNames;
        return this;
    }

    public Boolean getAllowDuplicateNames() {
        return allowDuplicateNames;
    }
    
    public CreatePipeline setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    public String getCatalog() {
        return catalog;
    }
    
    public CreatePipeline setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getChannel() {
        return channel;
    }
    
    public CreatePipeline setClusters(java.util.List<PipelineCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    public java.util.List<PipelineCluster> getClusters() {
        return clusters;
    }
    
    public CreatePipeline setConfiguration(Map<String,String> configuration) {
        this.configuration = configuration;
        return this;
    }

    public Map<String,String> getConfiguration() {
        return configuration;
    }
    
    public CreatePipeline setContinuous(Boolean continuous) {
        this.continuous = continuous;
        return this;
    }

    public Boolean getContinuous() {
        return continuous;
    }
    
    public CreatePipeline setDevelopment(Boolean development) {
        this.development = development;
        return this;
    }

    public Boolean getDevelopment() {
        return development;
    }
    
    public CreatePipeline setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }
    
    public CreatePipeline setEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public String getEdition() {
        return edition;
    }
    
    public CreatePipeline setFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    public Filters getFilters() {
        return filters;
    }
    
    public CreatePipeline setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public CreatePipeline setLibraries(java.util.List<PipelineLibrary> libraries) {
        this.libraries = libraries;
        return this;
    }

    public java.util.List<PipelineLibrary> getLibraries() {
        return libraries;
    }
    
    public CreatePipeline setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreatePipeline setPhoton(Boolean photon) {
        this.photon = photon;
        return this;
    }

    public Boolean getPhoton() {
        return photon;
    }
    
    public CreatePipeline setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getStorage() {
        return storage;
    }
    
    public CreatePipeline setTarget(String target) {
        this.target = target;
        return this;
    }

    public String getTarget() {
        return target;
    }
    
    public CreatePipeline setTrigger(PipelineTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public PipelineTrigger getTrigger() {
        return trigger;
    }
    
}
