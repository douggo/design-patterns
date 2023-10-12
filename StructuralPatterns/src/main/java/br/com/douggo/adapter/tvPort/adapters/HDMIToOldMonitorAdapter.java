package br.com.douggo.adapter.tvPort.adapters;

import br.com.douggo.adapter.tvPort.devices.OldMonitor;
import br.com.douggo.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    @Override
    public void setImage(String image) {
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, VGA doesn't process sound...");
    }
}
