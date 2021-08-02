package com.zhaokang.rebateServer.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class editConfig {
  public static void setDataSource(String data) {
    String profilepath = editConfig.class.getResource("/").getPath() + "jdbc.properties";
    try {
      PropertiesConfiguration config = new PropertiesConfiguration(profilepath);
      config.setAutoSave(true);
      config.setProperty("test", data);
      System.out.println(config.getString("server.uiserverport"));
    } catch (ConfigurationException cex) {
      System.err.println("loading of the configuration file failed");
    }
  }
}
