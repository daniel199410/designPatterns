package structural.bridge.src.example1.remoteControl;

import structural.bridge.src.example1.entertainmentDevice.EntertainmentDevice;

public class RemoteButtonMute extends RemoteButton {

	public RemoteButtonMute(EntertainmentDevice entertainmentDevice) {
		super(entertainmentDevice);
	}

	@Override
	public String buttonNinePressed() {
		return "Device was muted";
	}

}