package structural.bridge.src.remoteControl;

import structural.bridge.src.entertainmentDevice.EntertainmentDevice;

public class RemoteButtonPause extends RemoteButton {

	public RemoteButtonPause(EntertainmentDevice entertainmentDevice) {
		super(entertainmentDevice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String buttonNinePressed() {
		return "TV paused";
	}

}
