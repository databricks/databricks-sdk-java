package com.databricks.sdk.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.*;

class BodyLogger {
  private final Set<String> redactKeys =
      new HashSet<String>() {
        {
          add("string_value");
          add("token_value");
          add("content");
        }
      };
  private int maxBytes = 1023;
  private int debugTruncateBytes = 96;
  private final ObjectMapper mapper;

  /**
   * <p>Constructor for BodyLogger.</p>
   *
   * @param mapper a {@link com.fasterxml.jackson.databind.ObjectMapper} object
   * @param maxBytes a int
   * @param debugTruncateBytes a int
   */
  public BodyLogger(ObjectMapper mapper, int maxBytes, int debugTruncateBytes) {
    this.mapper = mapper;
    if (maxBytes == 0) {
      maxBytes = 1024;
    }
    if (debugTruncateBytes > maxBytes) {
      maxBytes = debugTruncateBytes;
    }
    this.maxBytes = maxBytes;
    this.debugTruncateBytes = debugTruncateBytes;
  }

  private List<String> mapKeys(TreeNode node) {
    List<String> keys = new ArrayList<>();
    node.fieldNames().forEachRemaining(keys::add);
    Collections.sort(keys);
    return keys;
  }

  /**
   * <p>redactedDump.</p>
   *
   * @param body a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  public String redactedDump(String body) {
    if (body == null || body.isEmpty()) {
      return "";
    }
    try {
      JsonNode rootNode = mapper.readTree(body);
      Object result = recursiveMarshal(rootNode, maxBytes);
      return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
    } catch (JsonProcessingException e) {
      // Unable to unmarshal means the body isn't JSON (or something else)
      return String.format("[unable to marshal: %s]", e.getMessage());
    }
  }

  private Object recursiveMarshal(JsonNode node, int budget) {
    if (node.isObject()) {
      return recursiveMarshalObject(node, budget);
    }
    if (node.isArray()) {
      return recursiveMarshalArray((ArrayNode) node, budget);
    }
    if (node.isTextual()) {
      return onlyNBytes(node.asText(), debugTruncateBytes);
    }
    if (node.isNumber()) {
      return node.asLong();
    }
    if (node.isDouble()) {
      return node.asDouble();
    }
    if (node.isBoolean()) {
      return node.asBoolean();
    }
    return node.asToken().asString();
  }

  private List<Object> recursiveMarshalArray(ArrayNode rawArray, int budget) {
    List<Object> out = new ArrayList<>();

    // The first element of a slice appears in the output, regardless of character budget.
    // Subsequent elements are included if the budget allows.
    for (int i = 0; i < rawArray.size(); i++) {
      // If we're out of character budget, include trailer.
      if (i > 0 && budget <= 0) {
        out.add(String.format("... (%d additional elements)", rawArray.size() - out.size()));
        break;
      }
      Object raw = recursiveMarshal(rawArray.get(i), budget);
      out.add(raw);
      budget -= raw.toString().length();
    }

    return out;
  }

  private Map<String, Object> recursiveMarshalObject(JsonNode node, int budget) {
    Map<String, Object> out = new TreeMap<>();

    // Each key in the map appears in the output, regardless of character budget.
    for (String key : mapKeys(node)) {
      if (redactKeys.contains(key)) {
        out.put(key, "**REDACTED**");
        continue;
      }
      JsonNode valueNode = node.get(key);
      Object result = recursiveMarshal(valueNode, budget);
      budget -= result.toString().length();
      out.put(key, result);
    }

    return out;
  }

  private static String onlyNBytes(String j, int numBytes) {
    int diff = j.getBytes().length - numBytes;
    if (diff > 0) {
      return String.format("%s... (%d more bytes)", j.substring(0, numBytes), diff);
    }
    return j;
  }
}
