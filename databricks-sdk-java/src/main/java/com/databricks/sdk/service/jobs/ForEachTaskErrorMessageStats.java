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
@JsonSerialize(using = ForEachTaskErrorMessageStats.ForEachTaskErrorMessageStatsSerializer.class)
@JsonDeserialize(
    using = ForEachTaskErrorMessageStats.ForEachTaskErrorMessageStatsDeserializer.class)
public class ForEachTaskErrorMessageStats {
  /** Describes the count of such error message encountered during the iterations. */
  private Long count;

  /** Describes the error message occured during the iterations. */
  private String errorMessage;

  /** Describes the termination reason for the error message. */
  private String terminationCategory;

  public ForEachTaskErrorMessageStats setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public ForEachTaskErrorMessageStats setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public ForEachTaskErrorMessageStats setTerminationCategory(String terminationCategory) {
    this.terminationCategory = terminationCategory;
    return this;
  }

  public String getTerminationCategory() {
    return terminationCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachTaskErrorMessageStats that = (ForEachTaskErrorMessageStats) o;
    return Objects.equals(count, that.count)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(terminationCategory, that.terminationCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, errorMessage, terminationCategory);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachTaskErrorMessageStats.class)
        .add("count", count)
        .add("errorMessage", errorMessage)
        .add("terminationCategory", terminationCategory)
        .toString();
  }

  ForEachTaskErrorMessageStatsPb toPb() {
    ForEachTaskErrorMessageStatsPb pb = new ForEachTaskErrorMessageStatsPb();
    pb.setCount(count);
    pb.setErrorMessage(errorMessage);
    pb.setTerminationCategory(terminationCategory);

    return pb;
  }

  static ForEachTaskErrorMessageStats fromPb(ForEachTaskErrorMessageStatsPb pb) {
    ForEachTaskErrorMessageStats model = new ForEachTaskErrorMessageStats();
    model.setCount(pb.getCount());
    model.setErrorMessage(pb.getErrorMessage());
    model.setTerminationCategory(pb.getTerminationCategory());

    return model;
  }

  public static class ForEachTaskErrorMessageStatsSerializer
      extends JsonSerializer<ForEachTaskErrorMessageStats> {
    @Override
    public void serialize(
        ForEachTaskErrorMessageStats value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForEachTaskErrorMessageStatsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForEachTaskErrorMessageStatsDeserializer
      extends JsonDeserializer<ForEachTaskErrorMessageStats> {
    @Override
    public ForEachTaskErrorMessageStats deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForEachTaskErrorMessageStatsPb pb = mapper.readValue(p, ForEachTaskErrorMessageStatsPb.class);
      return ForEachTaskErrorMessageStats.fromPb(pb);
    }
  }
}
