package org.lzh.framework.updatepluginlib.strategy;

import org.lzh.framework.updatepluginlib.model.Update;
import org.lzh.framework.updatepluginlib.util.NetworkUtil;

public class WifiFirstStrategy implements UpdateStrategy {

    private boolean isWifi;

    @Override
    public boolean isShowUpdateDialog(Update update) {
        isWifi = NetworkUtil.isConnectedByWifi();
        return !isWifi;
    }

    @Override
    public boolean isAutoInstall() {
        return !isWifi;
    }

    @Override
    public boolean isShowDownloadDialog() {
        return !isWifi;
    }
}
