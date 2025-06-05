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
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedValues.ResolvedValuesSerializer.class)
@JsonDeserialize(using = ResolvedValues.ResolvedValuesDeserializer.class)
public class ResolvedValues {
  /** */
  private ResolvedConditionTaskValues conditionTask;

  /** */
  private ResolvedDbtTaskValues dbtTask;

  /** */
  private ResolvedNotebookTaskValues notebookTask;

  /** */
  private ResolvedPythonWheelTaskValues pythonWheelTask;

  /** */
  private ResolvedRunJobTaskValues runJobTask;

  /** */
  private ResolvedParamPairValues simulationTask;

  /** */
  private ResolvedStringParamsValues sparkJarTask;

  /** */
  private ResolvedStringParamsValues sparkPythonTask;

  /** */
  private ResolvedStringParamsValues sparkSubmitTask;

  /** */
  private ResolvedParamPairValues sqlTask;

  public ResolvedValues setConditionTask(ResolvedConditionTaskValues conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ResolvedConditionTaskValues getConditionTask() {
    return conditionTask;
  }

  public ResolvedValues setDbtTask(ResolvedDbtTaskValues dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public ResolvedDbtTaskValues getDbtTask() {
    return dbtTask;
  }

  public ResolvedValues setNotebookTask(ResolvedNotebookTaskValues notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public ResolvedNotebookTaskValues getNotebookTask() {
    return notebookTask;
  }

  public ResolvedValues setPythonWheelTask(ResolvedPythonWheelTaskValues pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public ResolvedPythonWheelTaskValues getPythonWheelTask() {
    return pythonWheelTask;
  }

  public ResolvedValues setRunJobTask(ResolvedRunJobTaskValues runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public ResolvedRunJobTaskValues getRunJobTask() {
    return runJobTask;
  }

  public ResolvedValues setSimulationTask(ResolvedParamPairValues simulationTask) {
    this.simulationTask = simulationTask;
    return this;
  }

  public ResolvedParamPairValues getSimulationTask() {
    return simulationTask;
  }

  public ResolvedValues setSparkJarTask(ResolvedStringParamsValues sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkJarTask() {
    return sparkJarTask;
  }

  public ResolvedValues setSparkPythonTask(ResolvedStringParamsValues sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkPythonTask() {
    return sparkPythonTask;
  }

  public ResolvedValues setSparkSubmitTask(ResolvedStringParamsValues sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public ResolvedValues setSqlTask(ResolvedParamPairValues sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public ResolvedParamPairValues getSqlTask() {
    return sqlTask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedValues that = (ResolvedValues) o;
    return Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(runJobTask, that.runJobTask)
        && Objects.equals(simulationTask, that.simulationTask)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditionTask,
        dbtTask,
        notebookTask,
        pythonWheelTask,
        runJobTask,
        simulationTask,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedValues.class)
        .add("conditionTask", conditionTask)
        .add("dbtTask", dbtTask)
        .add("notebookTask", notebookTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("runJobTask", runJobTask)
        .add("simulationTask", simulationTask)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .toString();
  }

  ResolvedValuesPb toPb() {
    ResolvedValuesPb pb = new ResolvedValuesPb();
    pb.setConditionTask(conditionTask);
    pb.setDbtTask(dbtTask);
    pb.setNotebookTask(notebookTask);
    pb.setPythonWheelTask(pythonWheelTask);
    pb.setRunJobTask(runJobTask);
    pb.setSimulationTask(simulationTask);
    pb.setSparkJarTask(sparkJarTask);
    pb.setSparkPythonTask(sparkPythonTask);
    pb.setSparkSubmitTask(sparkSubmitTask);
    pb.setSqlTask(sqlTask);

    return pb;
  }

  static ResolvedValues fromPb(ResolvedValuesPb pb) {
    ResolvedValues model = new ResolvedValues();
    model.setConditionTask(pb.getConditionTask());
    model.setDbtTask(pb.getDbtTask());
    model.setNotebookTask(pb.getNotebookTask());
    model.setPythonWheelTask(pb.getPythonWheelTask());
    model.setRunJobTask(pb.getRunJobTask());
    model.setSimulationTask(pb.getSimulationTask());
    model.setSparkJarTask(pb.getSparkJarTask());
    model.setSparkPythonTask(pb.getSparkPythonTask());
    model.setSparkSubmitTask(pb.getSparkSubmitTask());
    model.setSqlTask(pb.getSqlTask());

    return model;
  }

  public static class ResolvedValuesSerializer extends JsonSerializer<ResolvedValues> {
    @Override
    public void serialize(ResolvedValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedValuesDeserializer extends JsonDeserializer<ResolvedValues> {
    @Override
    public ResolvedValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedValuesPb pb = mapper.readValue(p, ResolvedValuesPb.class);
      return ResolvedValues.fromPb(pb);
    }
  }
}
