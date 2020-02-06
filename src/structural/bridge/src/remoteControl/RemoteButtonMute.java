package structural.bridge.src.remoteControl;

import structural.bridge.src.entertainmentDevice.EntertainmentDevice;

public class RemoteButtonMute extends RemoteButton {

	public RemoteButtonMute(EntertainmentDevice entertainmentDevice) {
		super(entertainmentDevice);
	}

	@Override
	public String buttonNinePressed() {
		return "Device was muted";
	}

}