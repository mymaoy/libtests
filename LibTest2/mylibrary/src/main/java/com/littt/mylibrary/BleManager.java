package com.littt.mylibrary;

public class BleManager {
    public static BleManager getInstance() {
        return BleManagerHolder.sBleManager;
    }
    private static class BleManagerHolder {
        private static final BleManager sBleManager = new BleManager();
    }
}
