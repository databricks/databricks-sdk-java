// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RunParameters {
    /**
     * An array of commands to execute for jobs with the dbt task, for example
     * `"dbt_commands": ["dbt deps", "dbt seed", "dbt run"]`
     */
    @JsonProperty("dbt_commands")
    private java.util.List<String> dbtCommands;
    
    /**
     * A list of parameters for jobs with Spark JAR tasks, for example
     * `\"jar_params\": [\"john doe\", \"35\"]`. The parameters are used to
     * invoke the main function of the main class specified in the Spark JAR
     * task. If not specified upon `run-now`, it defaults to an empty list.
     * jar_params cannot be specified in conjunction with notebook_params. The
     * JSON representation of this field (for example `{\"jar_params\":[\"john
     * doe\",\"35\"]}`) cannot exceed 10,000 bytes.
     * 
     * Use [Task parameter variables](/jobs.html"#parameter-variables") to set
     * parameters containing information about job runs.
     */
    @JsonProperty("jar_params")
    private java.util.List<String> jarParams;
    
    /**
     * A map from keys to values for jobs with notebook task, for example
     * `\"notebook_params\": {\"name\": \"john doe\", \"age\": \"35\"}`. The map
     * is passed to the notebook and is accessible through the
     * [dbutils.widgets.get] function.
     * 
     * If not specified upon `run-now`, the triggered run uses the job’s base
     * parameters.
     * 
     * notebook_params cannot be specified in conjunction with jar_params.
     * 
     * Use [Task parameter variables] to set parameters containing information
     * about job runs.
     * 
     * The JSON representation of this field (for example
     * `{\"notebook_params\":{\"name\":\"john doe\",\"age\":\"35\"}}`) cannot
     * exceed 10,000 bytes.
     * 
     * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
     * [dbutils.widgets.get]: https://docs.databricks.com/dev-tools/databricks-utils.html
     */
    @JsonProperty("notebook_params")
    private Map<String,String> notebookParams;
    
    /**
     
     */
    @JsonProperty("pipeline_params")
    private PipelineParams pipelineParams;
    
    /**
     * A map from keys to values for jobs with Python wheel task, for example
     * `"python_named_params": {"name": "task", "data":
     * "dbfs:/path/to/data.json"}`.
     */
    @JsonProperty("python_named_params")
    private Map<String,String> pythonNamedParams;
    
    /**
     * A list of parameters for jobs with Python tasks, for example
     * `\"python_params\": [\"john doe\", \"35\"]`. The parameters are passed to
     * Python file as command-line parameters. If specified upon `run-now`, it
     * would overwrite the parameters specified in job setting. The JSON
     * representation of this field (for example `{\"python_params\":[\"john
     * doe\",\"35\"]}`) cannot exceed 10,000 bytes.
     * 
     * Use [Task parameter variables] to set parameters containing information
     * about job runs.
     * 
     * Important
     * 
     * These parameters accept only Latin characters (ASCII character set).
     * Using non-ASCII characters returns an error. Examples of invalid,
     * non-ASCII characters are Chinese, Japanese kanjis, and emojis.
     * 
     * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
     */
    @JsonProperty("python_params")
    private java.util.List<String> pythonParams;
    
    /**
     * A list of parameters for jobs with spark submit task, for example
     * `\"spark_submit_params\": [\"--class\",
     * \"org.apache.spark.examples.SparkPi\"]`. The parameters are passed to
     * spark-submit script as command-line parameters. If specified upon
     * `run-now`, it would overwrite the parameters specified in job setting.
     * The JSON representation of this field (for example
     * `{\"python_params\":[\"john doe\",\"35\"]}`) cannot exceed 10,000 bytes.
     * 
     * Use [Task parameter variables] to set parameters containing information
     * about job runs
     * 
     * Important
     * 
     * These parameters accept only Latin characters (ASCII character set).
     * Using non-ASCII characters returns an error. Examples of invalid,
     * non-ASCII characters are Chinese, Japanese kanjis, and emojis.
     * 
     * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
     */
    @JsonProperty("spark_submit_params")
    private java.util.List<String> sparkSubmitParams;
    
    /**
     * A map from keys to values for jobs with SQL task, for example
     * `"sql_params": {"name": "john doe", "age": "35"}`. The SQL alert task
     * does not support custom parameters.
     */
    @JsonProperty("sql_params")
    private Map<String,String> sqlParams;
    
    public RunParameters setDbtCommands(java.util.List<String> dbtCommands) {
        this.dbtCommands = dbtCommands;
        return this;
    }

    public java.util.List<String> getDbtCommands() {
        return dbtCommands;
    }
    
    public RunParameters setJarParams(java.util.List<String> jarParams) {
        this.jarParams = jarParams;
        return this;
    }

    public java.util.List<String> getJarParams() {
        return jarParams;
    }
    
    public RunParameters setNotebookParams(Map<String,String> notebookParams) {
        this.notebookParams = notebookParams;
        return this;
    }

    public Map<String,String> getNotebookParams() {
        return notebookParams;
    }
    
    public RunParameters setPipelineParams(PipelineParams pipelineParams) {
        this.pipelineParams = pipelineParams;
        return this;
    }

    public PipelineParams getPipelineParams() {
        return pipelineParams;
    }
    
    public RunParameters setPythonNamedParams(Map<String,String> pythonNamedParams) {
        this.pythonNamedParams = pythonNamedParams;
        return this;
    }

    public Map<String,String> getPythonNamedParams() {
        return pythonNamedParams;
    }
    
    public RunParameters setPythonParams(java.util.List<String> pythonParams) {
        this.pythonParams = pythonParams;
        return this;
    }

    public java.util.List<String> getPythonParams() {
        return pythonParams;
    }
    
    public RunParameters setSparkSubmitParams(java.util.List<String> sparkSubmitParams) {
        this.sparkSubmitParams = sparkSubmitParams;
        return this;
    }

    public java.util.List<String> getSparkSubmitParams() {
        return sparkSubmitParams;
    }
    
    public RunParameters setSqlParams(Map<String,String> sqlParams) {
        this.sqlParams = sqlParams;
        return this;
    }

    public Map<String,String> getSqlParams() {
        return sqlParams;
    }
    
}
