package com.pineone.icbms.so.device.logic;

import com.pineone.icbms.so.device.entity.Device;
import com.pineone.icbms.so.device.entity.DeviceStatusData;
import com.pineone.icbms.so.device.entity.ResultMessage;

import java.util.List;

public interface DeviceManager {
    void deviceRegister(String deviceUri, String time);
    void deviceRelease(String deviceId);
    String deviceExecute(String deviceId,String deviceCommand, String sessionId);
    String deviceControlResult(ResultMessage resultMessage);
    Device deviceSearchById(String deviceId);
    List<Device> deviceSearchByLocation(String location);
    List<String> requestDeviceServiceList(String location);
    String searchOperation(String deviceId, String deviceService);
    List<Device> searchDeviceList();
    void deviceUpdate(DeviceStatusData deviceStatusData);
    String deviceSubscription(String uri);
    String deviceSubscriptionRelease(String uri);
}
