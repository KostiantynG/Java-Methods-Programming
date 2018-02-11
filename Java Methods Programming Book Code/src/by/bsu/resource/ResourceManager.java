package by.bsu.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * # 11 # менеджер ресурсов # ResourceManager.java
 */
public enum ResourceManager {
    INSTANCE;
    private final String resourceName = "property.text";
    private ResourceBundle resourceBundle;

    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}