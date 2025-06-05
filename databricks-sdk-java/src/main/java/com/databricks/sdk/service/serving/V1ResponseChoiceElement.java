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
@JsonSerialize(using = V1ResponseChoiceElement.V1ResponseChoiceElementSerializer.class)
@JsonDeserialize(using = V1ResponseChoiceElement.V1ResponseChoiceElementDeserializer.class)
public class V1ResponseChoiceElement {
  /** The finish reason returned by the endpoint. */
  private String finishReason;

  /** The index of the choice in the __chat or completions__ response. */
  private Long index;

  /** The logprobs returned only by the __completions__ endpoint. */
  private Long logprobs;

  /** The message response from the __chat__ endpoint. */
  private ChatMessage message;

  /** The text response from the __completions__ endpoint. */
  private String text;

  public V1ResponseChoiceElement setFinishReason(String finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  public String getFinishReason() {
    return finishReason;
  }

  public V1ResponseChoiceElement setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public V1ResponseChoiceElement setLogprobs(Long logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  public Long getLogprobs() {
    return logprobs;
  }

  public V1ResponseChoiceElement setMessage(ChatMessage message) {
    this.message = message;
    return this;
  }

  public ChatMessage getMessage() {
    return message;
  }

  public V1ResponseChoiceElement setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResponseChoiceElement that = (V1ResponseChoiceElement) o;
    return Objects.equals(finishReason, that.finishReason)
        && Objects.equals(index, that.index)
        && Objects.equals(logprobs, that.logprobs)
        && Objects.equals(message, that.message)
        && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, message, text);
  }

  @Override
  public String toString() {
    return new ToStringer(V1ResponseChoiceElement.class)
        .add("finishReason", finishReason)
        .add("index", index)
        .add("logprobs", logprobs)
        .add("message", message)
        .add("text", text)
        .toString();
  }

  V1ResponseChoiceElementPb toPb() {
    V1ResponseChoiceElementPb pb = new V1ResponseChoiceElementPb();
    pb.setFinishReason(finishReason);
    pb.setIndex(index);
    pb.setLogprobs(logprobs);
    pb.setMessage(message);
    pb.setText(text);

    return pb;
  }

  static V1ResponseChoiceElement fromPb(V1ResponseChoiceElementPb pb) {
    V1ResponseChoiceElement model = new V1ResponseChoiceElement();
    model.setFinishReason(pb.getFinishReason());
    model.setIndex(pb.getIndex());
    model.setLogprobs(pb.getLogprobs());
    model.setMessage(pb.getMessage());
    model.setText(pb.getText());

    return model;
  }

  public static class V1ResponseChoiceElementSerializer
      extends JsonSerializer<V1ResponseChoiceElement> {
    @Override
    public void serialize(
        V1ResponseChoiceElement value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      V1ResponseChoiceElementPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class V1ResponseChoiceElementDeserializer
      extends JsonDeserializer<V1ResponseChoiceElement> {
    @Override
    public V1ResponseChoiceElement deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      V1ResponseChoiceElementPb pb = mapper.readValue(p, V1ResponseChoiceElementPb.class);
      return V1ResponseChoiceElement.fromPb(pb);
    }
  }
}
