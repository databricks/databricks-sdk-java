// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class NotebookTask {
    /**
     * Base parameters to be used for each run of this job. If the run is
     * initiated by a call to :method:jobs/runNow with parameters specified, the
     * two parameters maps are merged. If the same key is specified in
     * `base_parameters` and in `run-now`, the value from `run-now` is used.
     * 
     * Use [Task parameter variables] to set parameters containing information
     * about job runs.
     * 
     * If the notebook takes a parameter that is not specified in the job’s
     * `base_parameters` or the `run-now` override parameters, the default value
     * from the notebook is used.
     * 
     * Retrieve these parameters in a notebook using [dbutils.widgets.get].
     * 
     * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
     * [dbutils.widgets.get]: https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-widgets
     */
    @JsonProperty("base_parameters")
    private Map<String,String> baseParameters;
    
    /**
     * The path of the notebook to be run in the Databricks workspace or remote
     * repository. For notebooks stored in the Databricks workspace, the path
     * must be absolute and begin with a slash. For notebooks stored in a remote
     * repository, the path must be relative. This field is required.
     */
    @JsonProperty("notebook_path")
    private String notebookPath;
    
    /**
     * This describes an enum
     */
    @JsonProperty("source")
    private NotebookTaskSource source;
    
    public NotebookTask setBaseParameters(Map<String,String> baseParameters) {
        this.baseParameters = baseParameters;
        return this;
    }

    public Map<String,String> getBaseParameters() {
        return baseParameters;
    }
    
    public NotebookTask setNotebookPath(String notebookPath) {
        this.notebookPath = notebookPath;
        return this;
    }

    public String getNotebookPath() {
        return notebookPath;
    }
    
    public NotebookTask setSource(NotebookTaskSource source) {
        this.source = source;
        return this;
    }

    public NotebookTaskSource getSource() {
        return source;
    }
    
}
