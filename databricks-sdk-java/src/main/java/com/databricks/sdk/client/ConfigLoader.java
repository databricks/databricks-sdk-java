package com.databricks.sdk.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import org.ini4j.Ini;
import org.ini4j.Profile;

public class ConfigLoader {
  private static List<ConfigAttributeAccessor> accessors = attributeAccessors();

  static List<ConfigAttributeAccessor> attributeAccessors() {
    ArrayList<ConfigAttributeAccessor> attrs = new ArrayList<>();
    for (Field field : DatabricksConfig.class.getDeclaredFields()) {
      ConfigAttribute attribute = field.getAnnotation(ConfigAttribute.class);
      if (attribute != null) {
        attrs.add(new ConfigAttributeAccessor(attribute, field));
      }
    }
    return attrs;
  }

  public static DatabricksConfig resolve(DatabricksConfig cfg) throws DatabricksException {
    try {
      loadFromEnvironmentVariables(cfg);
      loadFromConfig(cfg); // TODO: just return new config?..
      return cfg;
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  static void loadFromEnvironmentVariables(DatabricksConfig cfg) throws IllegalAccessException {
    try {
      for (ConfigAttributeAccessor accessor : accessors) {
        String env = accessor.getEnv(cfg.getEnv);
        if (isNullOrEmpty(env)) {
          continue;
        }
        // value already set in config then skip
        Object value = accessor.getValueFromConfig(cfg);
        if (!isNullOrEmpty(value)) {
          continue;
        }
        accessor.setValueOnConfig(cfg, env);
      }
    } catch (DatabricksException e) {
      String msg =
          String.format("%s auth: %s", cfg.getCredentialsProvider().authType(), e.getMessage());
      throw new DatabricksException(msg, e);
    }
  }

  static void loadFromConfig(DatabricksConfig cfg) throws IllegalAccessException {
    if (isNullOrEmpty(cfg.getProfile()) && (isAnyAuthConfigured(cfg) || cfg.isAzure())) {
      return;
    }

    String configFile = cfg.getConfigFile();
    boolean isDefaultConfig = false;
    if (isNullOrEmpty(configFile)) {
      configFile = DatabricksConfig.DEFAULT_CONFIG_FILE;
      isDefaultConfig = true;
    }

    String userHome = cfg.getEnv.apply("HOME");
    if (userHome.isEmpty()) {
      userHome = System.getProperty("user.home");
    }
    configFile = configFile.replaceFirst("^~", userHome);

    Ini ini = parseDatabricksCfg(configFile, isDefaultConfig);
    if (ini == null) return;
    String profile = cfg.getProfile();
    boolean hasExplicitProfile = !isNullOrEmpty(profile);
    if (!hasExplicitProfile) {
      profile = "DEFAULT";
    }

    Profile.Section section = ini.get(profile);
    if (section == null && !hasExplicitProfile) {
      // logger.Debugf("%s has no %s profile configured", configFile, profile)
      return;
    }

    if (section == null) {
      String msg = String.format("resolve: %s has no %s profile configured", configFile, profile);
      throw new DatabricksException(msg);
    }

    for (ConfigAttributeAccessor accessor : accessors) {
      String value = section.get(accessor.getName());
      if(!isNullOrEmpty(accessor.getValueFromConfig(cfg))) {
        continue;
      }
      accessor.setValueOnConfig(cfg, value);
    }
  }

  private static Ini parseDatabricksCfg(String configFile, boolean isDefaultConfig) {
    Ini ini = new Ini();
    try {
      ini.load(new File(configFile));
    } catch (FileNotFoundException e) {
      if (isDefaultConfig) {
        return null;
      }
    } catch (IOException e) {
      throw new DatabricksException("Cannot load " + configFile, e);
    }
    return ini;
  }

  public static void fixHostIfNeeded(DatabricksConfig cfg) {
    if (isNullOrEmpty(cfg.getHost())) {
      return;
    }

    URL url;
    String host = cfg.getHost();
    try {
      url = new URL(host);
    } catch (MalformedURLException e) {
      // only hostname is specified
      cfg.setHost("https://" + host);
      return;
    }
    cfg.setHost(url.getProtocol() + "://" + url.getAuthority());
  }

  static void validate(DatabricksConfig cfg) throws DatabricksException {
    try {
      if (!isNullOrEmpty(cfg.getAuthType())) {
        return;
      }
      Set<String> authSet = new TreeSet<>();
      for (ConfigAttributeAccessor accessor : accessors) {
        Object value = accessor.getValueFromConfig(cfg);
        if (isNullOrEmpty(value)) {
          continue;
        }

        String authType = accessor.getAuthType();
        if (isNullOrEmpty(authType)) {
          continue;
        }
        authSet.add(authType);
      }
      if (authSet.size() <= 1) return;
      String names = String.join(" and ", authSet);
      throw new DatabricksException(
          String.format("validate: more than one authorization method configured: %s", names));
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  public static DatabricksException makeNicerError(
      String message, Exception e, DatabricksConfig cfg) {
    return makeNicerError(message, e, 200, cfg);
  }

  public static DatabricksException makeNicerError(
      String message, Exception e, Integer statusCode, DatabricksConfig cfg) {
    boolean isHttpUnauthorizedOrForbidden =
        true; // TODO - pass status code with exception, default this to false
    if (statusCode == 401 || statusCode == 402) isHttpUnauthorizedOrForbidden = true;
    String debugString = "";
    if (cfg.getEnv != null) {
      debugString = debugString(cfg);
    }
    if (!debugString.isEmpty() && isHttpUnauthorizedOrForbidden) {
      message = String.format("%s. %s", message, debugString);
    }
    return new DatabricksException(message);
  }

  public static String debugString(DatabricksConfig cfg) {
    try {
      List<String> envsUsed = new ArrayList<>();
      List<String> attrsUsed = new ArrayList<>();
      List<String> buf = new ArrayList<>();

      Function<String, String> getEnv = cfg.getEnv;

      for (ConfigAttributeAccessor accessor : accessors) {
        String envVariable = accessor.getEnvVariable();
        String envValue = accessor.getEnv(getEnv);

        if (!isNullOrEmpty(envValue) && !isNullOrEmpty(envVariable)) {
          envsUsed.add(String.format("%s", envVariable));
        }

        Object value = accessor.getValueFromConfig(cfg);
        if (isNullOrEmpty(value)) {
          continue;
        }

        String valueAsString = accessor.getAsString(value);
        if (accessor.isSensitive()) {
          valueAsString = "***";
        }

        String name = accessor.getName();
        attrsUsed.add(String.format("%s=%s", name, valueAsString));
      }
      if (!attrsUsed.isEmpty()) {
        buf.add(String.format("Config: %s", String.join(", ", attrsUsed)));
      }
      if (!envsUsed.isEmpty()) {
        buf.add(String.format("Env: %s", String.join(", ", envsUsed)));
      }
      return String.join(". ", buf);
    } catch (Exception e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  public static DatabricksConfig getDefault() {
    DatabricksConfig cfg = new DatabricksConfig();
    return cfg.resolve();
  }

  public static boolean isNullOrEmpty(Object target) {
    return target == null || target.toString().isEmpty();
  }

  public static boolean isAnyAuthConfigured(DatabricksConfig cfg) throws IllegalAccessException {
    for (ConfigAttributeAccessor accessor : accessors) {
      if (isNullOrEmpty(accessor.getAuthType())) {
        continue;
      }
      Object value = accessor.getValueFromConfig(cfg);
      if (!isNullOrEmpty(value)) {
        return true;
      }
    }
    return false;
  }
}
