package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.time.Duration;

/**
 * RetryInfo describes when clients can retry a failed request.
 *
 * <p>Clients could ignore the recommendation here or retry when this information is missing from
 * error responses. However, it's always recommended that clients should use exponential backoff
 * when retrying.
 *
 * <p>Clients should wait until the {@code retryDelay} amount of time has passed since receiving the
 * error response before retrying. If retrying requests also fail, clients should use an exponential
 * backoff scheme to gradually increase the delay between retries based on {@code retryDelay}, until
 * either a maximum number of retries have been reached or a maximum retry delay cap has been
 * reached.
 *
 * <p>This information helps clients implement intelligent retry strategies that respect the
 * service's recommendations while avoiding overwhelming the service with rapid retry attempts.
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_RetryInfo.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RetryInfo {

  /**
   * Clients should wait at least this long between retrying the same request.
   *
   * <p>Note: This is serialized as a string in the format "3.000000001s" where the string ends in
   * the suffix "s" (indicating seconds) and is preceded by a decimal number of seconds.
   *
   * <p>Examples of valid formats:
   *
   * <ul>
   *   <li>"30s" - 30 seconds
   *   <li>"1.5s" - 1.5 seconds
   *   <li>"0.001s" - 1 millisecond
   *   <li>"3.000000001s" - 3 seconds and 1 nanosecond
   * </ul>
   *
   * @return the recommended delay before retrying
   */
  @JsonProperty("retry_delay")
  @JsonDeserialize(using = RetryInfo.DurationDeserializer.class)
  public abstract Duration retryDelay();

  /**
   * Creates a new builder for constructing RetryInfo instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_RetryInfo.Builder();
  }

  /** Builder for constructing RetryInfo instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the retry delay.
     *
     * @param retryDelay the recommended delay before retrying
     * @return this builder for method chaining
     */
    @JsonProperty("retry_delay")
    @JsonDeserialize(using = RetryInfo.DurationDeserializer.class)
    public abstract Builder setRetryDelay(Duration retryDelay);

    /**
     * Builds the RetryInfo instance.
     *
     * @return a new RetryInfo instance
     */
    public abstract RetryInfo build();
  }

  /**
   * Custom deserializer for Duration field to handle "30s" format.
   *
   * <p>This deserializer is strict and will reject invalid duration formats by throwing an
   * IOException. Valid formats must:
   *
   * <ul>
   *   <li>Be a string value
   *   <li>End with the 's' suffix
   *   <li>Contain a valid decimal number before the suffix
   * </ul>
   *
   * <p>Examples of valid formats: "30s", "1.5s", "0.001s", "3.000000001s" Examples of invalid
   * formats: "30", "30ms", "abc", 42
   */
  static class DurationDeserializer extends JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      JsonNode node = p.getCodec().readTree(p);

      if (!node.isTextual()) {
        throw new IOException("Duration must be a string, got: " + node.getNodeType());
      }

      String delayStr = node.asText();
      if (!delayStr.endsWith("s")) {
        throw new IOException("Duration must end with 's' suffix: " + delayStr);
      }

      String numeric = delayStr.substring(0, delayStr.length() - 1).trim();
      if (numeric.isEmpty()) {
        throw new IOException("Invalid duration format: " + delayStr);
      }
      if (numeric.startsWith("-")) {
        throw new IOException("Duration must be non-negative: " + delayStr);
      }

      int dotIdx = numeric.indexOf('.');
      String secondsPart = dotIdx >= 0 ? numeric.substring(0, dotIdx) : numeric;
      String fractionPart = dotIdx >= 0 ? numeric.substring(dotIdx + 1) : "";

      if (fractionPart.length() > 9) {
        throw new IOException("Fractional seconds precision exceeds nanoseconds: " + delayStr);
      }

      String fractionPadded =
          fractionPart.isEmpty() ? "" : (fractionPart + "000000000").substring(0, 9);

      try {
        long seconds = secondsPart.isEmpty() ? 0L : Long.parseLong(secondsPart);
        long nanos = fractionPadded.isEmpty() ? 0L : Long.parseLong(fractionPadded);
        return Duration.ofSeconds(seconds, nanos);
      } catch (NumberFormatException e) {
        throw new IOException("Invalid duration format: " + delayStr, e);
      }
    }
  }
}
