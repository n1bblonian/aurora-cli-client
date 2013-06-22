package ch.k42.auroracliclient.net;

public class IDeviceDiscoveryFactory {
	public static IDeviceDiscovery getInstance(){
		return new DeviceDiscovery();
	}
}
