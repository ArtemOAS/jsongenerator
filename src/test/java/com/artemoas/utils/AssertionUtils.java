package com.artemoas.utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

/**
 * Chris on 2/9/16:12:05 AM.
 */
public final class AssertionUtils {

    private AssertionUtils() {
    }

    public static void assertJsonEquals(String expected, String actual) {
        try {
            new JSONObject(actual);
            Assert.assertEquals(expected, actual);
        } catch (JSONException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

}
