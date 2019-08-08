package com.wjz.test;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public class wjz extends CordovaPlugin {
    @Override public boolean execute (String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (action.equals("test")) {
                PackageManager packageManager = this.cordova.getActivity().getPackageManager();
                callbackContext.success("success");
                return true;
            }
            callbackContext.success("nothing");
            return true;
        } catch (Exception e) {
            callbackContext.success("failed");
            return true;
        }
    }
}
