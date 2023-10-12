package br.com.douggo.adapter.tvPort.adapters;

import br.com.douggo.adapter.tvPort.intefaces.HDMI;
import br.com.douggo.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private final VGA monitor;

    public HDMIToVGAAdapter(VGA monitor) {
        System.out.println("Connecting adapter to the VGA Monitor");
        this.monitor = monitor;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting image from HDMI to VGA...");
        this.monitor.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, VGA can't process sound");
    }
}
