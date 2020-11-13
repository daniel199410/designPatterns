package structural.bridge.src.example1.remoteControl;

import structural.bridge.src.example1.entertainmentDevice.EntertainmentDevice;

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
