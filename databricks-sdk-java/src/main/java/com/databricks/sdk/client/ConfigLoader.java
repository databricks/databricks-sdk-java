package com.databricks.sdk.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import jdk.internal.joptsimple.internal.Strings;
import org.ini4j.Ini;
import org.ini4j.Profile;


public class ConfigLoader {
    private static List<ConfigAttributeAccessor> accessors = attributeAccessors();

    static List<ConfigAttributeAccessor> attributeAccessors() {
        ArrayList<ConfigAttributeAccessor> attrs = new ArrayList<>();
        for (Field field: DatabricksConfig.class.getDeclaredFields()) {
            ConfigAttribute attribute = field.getAnnotation(ConfigAttribute.class);
            if (attribute != null) {
                attrs.add(new ConfigAttributeAccessor(attribute, field));
            }
        }
        return attrs;
    }

    public static DatabricksConfig getDefault() {
        return new DatabricksConfig().resolve();
    }

    public static DatabricksConfig resolve(DatabricksConfig cfg, Function<String,String> getEnv) {
        try {
            loadFromConfig(cfg, getEnv); // TODO: just return new config?..
            loadFromEnvironmentVariables(cfg, getEnv);
            return cfg;
        } catch (IllegalAccessException e) {
            throw new DatabricksException("Cannot create default config", e);
        }
    }

    static void loadFromEnvironmentVariables(DatabricksConfig cfg, Function<String, String> getEnv)
            throws IllegalAccessException {
        for (ConfigAttributeAccessor accessor : accessors) {
            String env = accessor.getEnv(getEnv);
            if (env == null || env.equals("")) continue;
            accessor.setValue(cfg, env);
        }
    }

    private static boolean isNullOrEmpty(String target) {
        return target == null || target.isEmpty();
    }

    static void loadFromConfig(DatabricksConfig cfg, Function<String, String> getEnv)
            throws IllegalAccessException {
        Ini ini = parseDatabricksCfg(cfg, getEnv);
        if (ini == null) return;
        String profile = cfg.getProfile();
        boolean hasExplicitProfile = !isNullOrEmpty(profile);
        if (!hasExplicitProfile) {
            profile = "DEFAULT";
        }
        Profile.Section section = ini.get(profile);
        if (section == null && !hasExplicitProfile) {
            //logger.Debugf("%s has no %s profile configured", configFile, profile)
            return;
        }
        if (section == null) {
            throw new DatabricksException(cfg.getConfigFile() + "has no " + profile +
                    " profile configured");
        }
        for (ConfigAttributeAccessor accessor : accessors) {
            String value = section.get(accessor.getName());
            if (isNullOrEmpty(value)) {
                continue;
            }
            accessor.setValue(cfg, value);
        }
    }

    private static Ini parseDatabricksCfg(DatabricksConfig cfg, Function<String, String> getEnv) {
        String configFile = cfg.getConfigFile();
        boolean isDefaultConfig = configFile.equals(DatabricksConfig.DEFAULT_CONFIG_FILE);
        String userHome = getEnv.apply("HOME");
        if (userHome.equals("")) {
            userHome = System.getProperty("user.home");
        }
        configFile = configFile.replaceFirst("^~", userHome);
        Ini ini = new Ini();
        try {
            ini.load(new File(configFile));
        } catch (FileNotFoundException e) {
            if (isDefaultConfig) {
                return null;
            }
            throw new DatabricksException("Cannot find "+configFile, e);
        } catch (IOException e) {
            throw new DatabricksException("Cannot load "+configFile, e);
        }
        return ini;
    }
}
