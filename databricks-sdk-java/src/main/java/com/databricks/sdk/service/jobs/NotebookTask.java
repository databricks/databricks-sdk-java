// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = NotebookTask.NotebookTaskSerializer.class)
@JsonDeserialize(using = NotebookTask.NotebookTaskDeserializer.class)
public class NotebookTask {
  /**
   * Base parameters to be used for each run of this job. If the run is initiated by a call to
   * :method:jobs/run Now with parameters specified, the two parameters maps are merged. If the same
   * key is specified in `base_parameters` and in `run-now`, the value from `run-now` is used. Use
   * [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>If the notebook takes a parameter that is not specified in the job’s `base_parameters` or
   * the `run-now` override parameters, the default value from the notebook is used.
   *
   * <p>Retrieve these parameters in a notebook using [dbutils.widgets.get].
   *
   * <p>The JSON representation of this field cannot exceed 1MB.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   * [dbutils.widgets.get]:
   * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-widgets
   */
  private Map<String, String> baseParameters;

  /**
   * The path of the notebook to be run in the Databricks workspace or remote repository. For
   * notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash.
   * For notebooks stored in a remote repository, the path must be relative. This field is required.
   */
  private String notebookPath;

  /**
   * Optional location type of the notebook. When set to `WORKSPACE`, the notebook will be retrieved
   * from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a
   * Git repository defined in `git_source`. If the value is empty, the task will use `GIT` if
   * `git_source` is defined and `WORKSPACE` otherwise. * `WORKSPACE`: Notebook is located in
   * Databricks workspace. * `GIT`: Notebook is located in cloud Git provider.
   */
  private Source source;

  /**
   * Optional `warehouse_id` to run the notebook on a SQL warehouse. Classic SQL warehouses are NOT
   * supported, please use serverless or pro SQL warehouses.
   *
   * <p>Note that SQL warehouses only support SQL cells; if the notebook contains non-SQL cells, the
   * run will fail.
   */
  private String warehouseId;

  public NotebookTask setBaseParameters(Map<String, String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  public Map<String, String> getBaseParameters() {
    return baseParameters;
  }

  public NotebookTask setNotebookPath(String notebookPath) {
    this.notebookPath = notebookPath;
    return this;
  }

  public String getNotebookPath() {
    return notebookPath;
  }

  public NotebookTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public NotebookTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookTask that = (NotebookTask) o;
    return Objects.equals(baseParameters, that.baseParameters)
        && Objects.equals(notebookPath, that.notebookPath)
        && Objects.equals(source, that.source)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseParameters, notebookPath, source, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookTask.class)
        .add("baseParameters", baseParameters)
        .add("notebookPath", notebookPath)
        .add("source", source)
        .add("warehouseId", warehouseId)
        .toString();
  }

  NotebookTaskPb toPb() {
    NotebookTaskPb pb = new NotebookTaskPb();
    pb.setBaseParameters(baseParameters);
    pb.setNotebookPath(notebookPath);
    pb.setSource(source);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static NotebookTask fromPb(NotebookTaskPb pb) {
    NotebookTask model = new NotebookTask();
    model.setBaseParameters(pb.getBaseParameters());
    model.setNotebookPath(pb.getNotebookPath());
    model.setSource(pb.getSource());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class NotebookTaskSerializer extends JsonSerializer<NotebookTask> {
    @Override
    public void serialize(NotebookTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NotebookTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NotebookTaskDeserializer extends JsonDeserializer<NotebookTask> {
    @Override
    public NotebookTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NotebookTaskPb pb = mapper.readValue(p, NotebookTaskPb.class);
      return NotebookTask.fromPb(pb);
    }
  }
}
