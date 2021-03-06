package com.pineone.icbms.so.device.store.memory;

import com.pineone.icbms.so.device.entity.DeviceResult;
import com.pineone.icbms.so.device.store.DeviceResultStore;

import java.util.HashMap;
import java.util.Map;

public class DeviceResultMemory implements DeviceResultStore {

    //
    static private Map<String,DeviceResult> deviceResultRepository = new HashMap<>();
    private static DeviceResultMemory instance;

    private DeviceResultMemory() {
    }

    public static DeviceResultMemory getInstance(){
        if(instance == null) {
            instance = new DeviceResultMemory();
        }
        return instance;
    }



    @Override
    public void create(DeviceResult deviceResult) {
        //
        deviceResultRepository.put(deviceResult.getCommandId(),deviceResult);
    }

    @Override
    public DeviceResult retrieve(String id) {
        //
        DeviceResult deviceResult = deviceResultRepository.get(id);
        return deviceResult;
    }

    @Override
    public void update(DeviceResult deviceResult) {
        //
        deviceResultRepository.put(deviceResult.getCommandId(),deviceResult);
    }

    @Override
    public void delete(String id) {
        deviceResultRepository.remove(id);

    }
}
