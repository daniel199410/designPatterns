package structural.bridge.src.example1.entertainmentDevice;
public abstract class EntertainmentDevice {
	private int deviceState;
	private int maxSetting;
	private int volumeLevel = 0;
	private DeviceName deviceName;
	
	public abstract String buttonFivePressed();
	public abstract String buttonSixPressed();
	
	public int deviceFeedBack() {
		if(deviceState > maxSetting || deviceState < 0) {
			deviceState = 0;			
		}
		return deviceState;
	}
	
	public String buttonSevenPressed() {
		volumeLevel++;
		return String.format("Volume: {}", volumeLevel);
	}
	
	public String buttonEightPressed() {
		volumeLevel--;
		return String.format("Volume: {}", volumeLevel);
	}
	
	public int getDeviceState() {
		return deviceState;
	}
	
	public void setDeviceState(int deviceState) {
		this.deviceState = deviceState;
	}
	
	public int getMaxSetting() {
		return maxSetting;
	}
	
	public void setMaxSetting(int maxSetting) {
		this.maxSetting = maxSetting;
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	
	public DeviceName getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(DeviceName deviceName) {
		this.deviceName = deviceName;
	}
}
