// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = ExternalModelUsageElement.ExternalModelUsageElementSerializer.class)
@JsonDeserialize(using = ExternalModelUsageElement.ExternalModelUsageElementDeserializer.class)
public class ExternalModelUsageElement {
  /** The number of tokens in the chat/completions response. */
  private Long completionTokens;

  /** The number of tokens in the prompt. */
  private Long promptTokens;

  /** The total number of tokens in the prompt and response. */
  private Long totalTokens;

  public ExternalModelUsageElement setCompletionTokens(Long completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  public Long getCompletionTokens() {
    return completionTokens;
  }

  public ExternalModelUsageElement setPromptTokens(Long promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  public Long getPromptTokens() {
    return promptTokens;
  }

  public ExternalModelUsageElement setTotalTokens(Long totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  public Long getTotalTokens() {
    return totalTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalModelUsageElement that = (ExternalModelUsageElement) o;
    return Objects.equals(completionTokens, that.completionTokens)
        && Objects.equals(promptTokens, that.promptTokens)
        && Objects.equals(totalTokens, that.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModelUsageElement.class)
        .add("completionTokens", completionTokens)
        .add("promptTokens", promptTokens)
        .add("totalTokens", totalTokens)
        .toString();
  }

  ExternalModelUsageElementPb toPb() {
    ExternalModelUsageElementPb pb = new ExternalModelUsageElementPb();
    pb.setCompletionTokens(completionTokens);
    pb.setPromptTokens(promptTokens);
    pb.setTotalTokens(totalTokens);

    return pb;
  }

  static ExternalModelUsageElement fromPb(ExternalModelUsageElementPb pb) {
    ExternalModelUsageElement model = new ExternalModelUsageElement();
    model.setCompletionTokens(pb.getCompletionTokens());
    model.setPromptTokens(pb.getPromptTokens());
    model.setTotalTokens(pb.getTotalTokens());

    return model;
  }

  public static class ExternalModelUsageElementSerializer
      extends JsonSerializer<ExternalModelUsageElement> {
    @Override
    public void serialize(
        ExternalModelUsageElement value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalModelUsageElementPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalModelUsageElementDeserializer
      extends JsonDeserializer<ExternalModelUsageElement> {
    @Override
    public ExternalModelUsageElement deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalModelUsageElementPb pb = mapper.readValue(p, ExternalModelUsageElementPb.class);
      return ExternalModelUsageElement.fromPb(pb);
    }
  }
}
