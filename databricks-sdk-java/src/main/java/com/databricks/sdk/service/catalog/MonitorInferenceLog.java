// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = MonitorInferenceLog.MonitorInferenceLogSerializer.class)
@JsonDeserialize(using = MonitorInferenceLog.MonitorInferenceLogDeserializer.class)
public class MonitorInferenceLog {
  /**
   * Granularities for aggregating data into time windows based on their timestamp. Currently the
   * following static granularities are supported: {``"5 minutes"``, ``"30 minutes"``, ``"1 hour"``,
   * ``"1 day"``, ``"<n> week(s)"``, ``"1 month"``, ``"1 year"``}.
   */
  private Collection<String> granularities;

  /** Optional column that contains the ground truth for the prediction. */
  private String labelCol;

  /**
   * Column that contains the id of the model generating the predictions. Metrics will be computed
   * per model id by default, and also across all model ids.
   */
  private String modelIdCol;

  /** Column that contains the output/prediction from the model. */
  private String predictionCol;

  /**
   * Optional column that contains the prediction probabilities for each class in a classification
   * problem type. The values in this column should be a map, mapping each class label to the
   * prediction probability for a given sample. The map should be of PySpark MapType().
   */
  private String predictionProbaCol;

  /**
   * Problem type the model aims to solve. Determines the type of model-quality metrics that will be
   * computed.
   */
  private MonitorInferenceLogProblemType problemType;

  /**
   * Column that contains the timestamps of requests. The column must be one of the following: - A
   * ``TimestampType`` column - A column whose values can be converted to timestamps through the
   * pyspark ``to_timestamp`` [function].
   *
   * <p>[function]:
   * https://spark.apache.org/docs/latest/api/python/reference/pyspark.sql/api/pyspark.sql.functions.to_timestamp.html
   */
  private String timestampCol;

  public MonitorInferenceLog setGranularities(Collection<String> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<String> getGranularities() {
    return granularities;
  }

  public MonitorInferenceLog setLabelCol(String labelCol) {
    this.labelCol = labelCol;
    return this;
  }

  public String getLabelCol() {
    return labelCol;
  }

  public MonitorInferenceLog setModelIdCol(String modelIdCol) {
    this.modelIdCol = modelIdCol;
    return this;
  }

  public String getModelIdCol() {
    return modelIdCol;
  }

  public MonitorInferenceLog setPredictionCol(String predictionCol) {
    this.predictionCol = predictionCol;
    return this;
  }

  public String getPredictionCol() {
    return predictionCol;
  }

  public MonitorInferenceLog setPredictionProbaCol(String predictionProbaCol) {
    this.predictionProbaCol = predictionProbaCol;
    return this;
  }

  public String getPredictionProbaCol() {
    return predictionProbaCol;
  }

  public MonitorInferenceLog setProblemType(MonitorInferenceLogProblemType problemType) {
    this.problemType = problemType;
    return this;
  }

  public MonitorInferenceLogProblemType getProblemType() {
    return problemType;
  }

  public MonitorInferenceLog setTimestampCol(String timestampCol) {
    this.timestampCol = timestampCol;
    return this;
  }

  public String getTimestampCol() {
    return timestampCol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorInferenceLog that = (MonitorInferenceLog) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(labelCol, that.labelCol)
        && Objects.equals(modelIdCol, that.modelIdCol)
        && Objects.equals(predictionCol, that.predictionCol)
        && Objects.equals(predictionProbaCol, that.predictionProbaCol)
        && Objects.equals(problemType, that.problemType)
        && Objects.equals(timestampCol, that.timestampCol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        granularities,
        labelCol,
        modelIdCol,
        predictionCol,
        predictionProbaCol,
        problemType,
        timestampCol);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorInferenceLog.class)
        .add("granularities", granularities)
        .add("labelCol", labelCol)
        .add("modelIdCol", modelIdCol)
        .add("predictionCol", predictionCol)
        .add("predictionProbaCol", predictionProbaCol)
        .add("problemType", problemType)
        .add("timestampCol", timestampCol)
        .toString();
  }

  MonitorInferenceLogPb toPb() {
    MonitorInferenceLogPb pb = new MonitorInferenceLogPb();
    pb.setGranularities(granularities);
    pb.setLabelCol(labelCol);
    pb.setModelIdCol(modelIdCol);
    pb.setPredictionCol(predictionCol);
    pb.setPredictionProbaCol(predictionProbaCol);
    pb.setProblemType(problemType);
    pb.setTimestampCol(timestampCol);

    return pb;
  }

  static MonitorInferenceLog fromPb(MonitorInferenceLogPb pb) {
    MonitorInferenceLog model = new MonitorInferenceLog();
    model.setGranularities(pb.getGranularities());
    model.setLabelCol(pb.getLabelCol());
    model.setModelIdCol(pb.getModelIdCol());
    model.setPredictionCol(pb.getPredictionCol());
    model.setPredictionProbaCol(pb.getPredictionProbaCol());
    model.setProblemType(pb.getProblemType());
    model.setTimestampCol(pb.getTimestampCol());

    return model;
  }

  public static class MonitorInferenceLogSerializer extends JsonSerializer<MonitorInferenceLog> {
    @Override
    public void serialize(MonitorInferenceLog value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorInferenceLogPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorInferenceLogDeserializer
      extends JsonDeserializer<MonitorInferenceLog> {
    @Override
    public MonitorInferenceLog deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorInferenceLogPb pb = mapper.readValue(p, MonitorInferenceLogPb.class);
      return MonitorInferenceLog.fromPb(pb);
    }
  }
}
