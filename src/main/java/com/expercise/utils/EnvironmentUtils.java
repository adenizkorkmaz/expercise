package com.expercise.utils;

public final class EnvironmentUtils {

    private EnvironmentUtils() {
    }

    public static boolean isProduction(String environment) {
        return "production".equals(environment);
    }

    public static boolean isDevelopment(String environment) {
        return "development".equals(environment);
    }

    public static boolean isNotDevelopment(String environment) {
        return !isDevelopment(environment);
    }

}
