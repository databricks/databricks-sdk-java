// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An aggregation function applied over a time window. */
@Generated
public class AggregationFunction {
  /** */
  @JsonProperty("approx_count_distinct")
  private ApproxCountDistinctFunction approxCountDistinct;

  /** */
  @JsonProperty("approx_percentile")
  private ApproxPercentileFunction approxPercentile;

  /** */
  @JsonProperty("avg")
  private AvgFunction avg;

  /** */
  @JsonProperty("count_function")
  private CountFunction countFunction;

  /** */
  @JsonProperty("first")
  private FirstFunction first;

  /** */
  @JsonProperty("last")
  private LastFunction last;

  /** */
  @JsonProperty("max")
  private MaxFunction max;

  /** */
  @JsonProperty("min")
  private MinFunction min;

  /** */
  @JsonProperty("stddev_pop")
  private StddevPopFunction stddevPop;

  /** */
  @JsonProperty("stddev_samp")
  private StddevSampFunction stddevSamp;

  /** */
  @JsonProperty("sum")
  private SumFunction sum;

  /** The time window over which the aggregation is computed. */
  @JsonProperty("time_window")
  private TimeWindow timeWindow;

  /** */
  @JsonProperty("var_pop")
  private VarPopFunction varPop;

  /** */
  @JsonProperty("var_samp")
  private VarSampFunction varSamp;

  public AggregationFunction setApproxCountDistinct(
      ApproxCountDistinctFunction approxCountDistinct) {
    this.approxCountDistinct = approxCountDistinct;
    return this;
  }

  public ApproxCountDistinctFunction getApproxCountDistinct() {
    return approxCountDistinct;
  }

  public AggregationFunction setApproxPercentile(ApproxPercentileFunction approxPercentile) {
    this.approxPercentile = approxPercentile;
    return this;
  }

  public ApproxPercentileFunction getApproxPercentile() {
    return approxPercentile;
  }

  public AggregationFunction setAvg(AvgFunction avg) {
    this.avg = avg;
    return this;
  }

  public AvgFunction getAvg() {
    return avg;
  }

  public AggregationFunction setCountFunction(CountFunction countFunction) {
    this.countFunction = countFunction;
    return this;
  }

  public CountFunction getCountFunction() {
    return countFunction;
  }

  public AggregationFunction setFirst(FirstFunction first) {
    this.first = first;
    return this;
  }

  public FirstFunction getFirst() {
    return first;
  }

  public AggregationFunction setLast(LastFunction last) {
    this.last = last;
    return this;
  }

  public LastFunction getLast() {
    return last;
  }

  public AggregationFunction setMax(MaxFunction max) {
    this.max = max;
    return this;
  }

  public MaxFunction getMax() {
    return max;
  }

  public AggregationFunction setMin(MinFunction min) {
    this.min = min;
    return this;
  }

  public MinFunction getMin() {
    return min;
  }

  public AggregationFunction setStddevPop(StddevPopFunction stddevPop) {
    this.stddevPop = stddevPop;
    return this;
  }

  public StddevPopFunction getStddevPop() {
    return stddevPop;
  }

  public AggregationFunction setStddevSamp(StddevSampFunction stddevSamp) {
    this.stddevSamp = stddevSamp;
    return this;
  }

  public StddevSampFunction getStddevSamp() {
    return stddevSamp;
  }

  public AggregationFunction setSum(SumFunction sum) {
    this.sum = sum;
    return this;
  }

  public SumFunction getSum() {
    return sum;
  }

  public AggregationFunction setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public AggregationFunction setVarPop(VarPopFunction varPop) {
    this.varPop = varPop;
    return this;
  }

  public VarPopFunction getVarPop() {
    return varPop;
  }

  public AggregationFunction setVarSamp(VarSampFunction varSamp) {
    this.varSamp = varSamp;
    return this;
  }

  public VarSampFunction getVarSamp() {
    return varSamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AggregationFunction that = (AggregationFunction) o;
    return Objects.equals(approxCountDistinct, that.approxCountDistinct)
        && Objects.equals(approxPercentile, that.approxPercentile)
        && Objects.equals(avg, that.avg)
        && Objects.equals(countFunction, that.countFunction)
        && Objects.equals(first, that.first)
        && Objects.equals(last, that.last)
        && Objects.equals(max, that.max)
        && Objects.equals(min, that.min)
        && Objects.equals(stddevPop, that.stddevPop)
        && Objects.equals(stddevSamp, that.stddevSamp)
        && Objects.equals(sum, that.sum)
        && Objects.equals(timeWindow, that.timeWindow)
        && Objects.equals(varPop, that.varPop)
        && Objects.equals(varSamp, that.varSamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        approxCountDistinct,
        approxPercentile,
        avg,
        countFunction,
        first,
        last,
        max,
        min,
        stddevPop,
        stddevSamp,
        sum,
        timeWindow,
        varPop,
        varSamp);
  }

  @Override
  public String toString() {
    return new ToStringer(AggregationFunction.class)
        .add("approxCountDistinct", approxCountDistinct)
        .add("approxPercentile", approxPercentile)
        .add("avg", avg)
        .add("countFunction", countFunction)
        .add("first", first)
        .add("last", last)
        .add("max", max)
        .add("min", min)
        .add("stddevPop", stddevPop)
        .add("stddevSamp", stddevSamp)
        .add("sum", sum)
        .add("timeWindow", timeWindow)
        .add("varPop", varPop)
        .add("varSamp", varSamp)
        .toString();
  }
}
