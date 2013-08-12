

package com.millcreeksoftware.amliclookup.util;

import java.util.Properties;

/**
 * The Class AppProps.
 *
 * @author Mike Bryant
 */
public class AppProps {
  
  /** The location of the properties file. */
  private static final String PROPS_FILE = "/app.properties";

  /** Properties object. */
  private static Properties props;
  
  
  /**
   * Returns the key value, or empty string if key doesn't exist.
   *
   * @param key the key
   * @return key value or empty string
   */
  public static String get(String key) {
    return AppProps.get(key, "");
  }
  
  
  /**
   * Returns the key value, or defaultVal if key doesn't exist.
   *
   * @param key the key
   * @param defaultVal what to use if key doesn't exits
   * @return key value or defaultVal
   */
  public static String get(String key, String defaultVal) {
    if (AppProps.props == null) {
      AppProps.loadProps();
    }
    
    return AppProps.props.getProperty(key, defaultVal);
  }
  
  
  /**
   * Loads the properties file.
   */
  private static void loadProps() {
    AppProps.props = new Properties();
    
    try {
      AppProps.props.load(AppProps.class.getClassLoader().getResourceAsStream(PROPS_FILE));
    } catch (Exception e) {
		e.printStackTrace();
    }
    
    return;
  }
  
}
