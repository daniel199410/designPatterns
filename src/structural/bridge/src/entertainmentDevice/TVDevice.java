package structural.bridge.src.entertainmentDevice;

public class TVDevice extends EntertainmentDevice{
	
	public TVDevice(int newDeviceState, int newMaxSetting) {
		this.setDeviceState(newDeviceState);
		this.setMaxSetting(newMaxSetting);
		this.setDeviceName(DeviceName.TV);
	}

	@Override
	public String buttonFivePressed() {
		this.setDeviceState(this.getDeviceState() - 1);;
		return "Channel Down";
	}

	@Override
	public String buttonSixPressed() {
		this.setDeviceState(this.getDeviceState() + 1);
		return "Channel up";
	}

}
