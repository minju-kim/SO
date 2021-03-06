package com.pineone.icbms.so.virtualobject;

import com.pineone.icbms.so.util.UtilApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pineone.icbms.so.device.DeviceApplication;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Import({DeviceApplication.class, UtilApplication.class})
public class VirtualObjectApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(VirtualObjectApplication.class, args);
    }
}
