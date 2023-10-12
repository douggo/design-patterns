package br.com.douggo.adapter.tvPort;

import br.com.douggo.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.douggo.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.douggo.adapter.tvPort.devices.Computer;
import br.com.douggo.adapter.tvPort.devices.OldMonitor;
import br.com.douggo.adapter.tvPort.devices.TV;
import br.com.douggo.adapter.tvPort.intefaces.HDMI;

public class Client {

	public static void main(String[] args) {
		System.out.println("------ TV ----------");
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ VGA Monitor With HDMI Adapter ----------");
		OldMonitor oldMonitor = new OldMonitor();
		HDMI adapter = new HDMIToVGAAdapter(oldMonitor);
		pc.connectPort(adapter);
		pc.sendImageAndSound("The Simpsons", "The Simpsons OST");

		System.out.println("------ VGA Monitor Class Adapter ----------");
		HDMI hdmiToOldMonitorAdapter = new HDMIToOldMonitorAdapter();
		pc.connectPort(hdmiToOldMonitorAdapter);
		pc.sendImageAndSound("Last Call To Heaven Clip", "Music's sound");
	}
}
