package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.advance;

public class StereoAddVolCommand implements Command {
  private Stereo setreo;

  public StereoAddVolCommand(Stereo setreo) {
    this.setreo = setreo;
  }

  @Override public void execute() {
    // TODO Auto-generated method stub
    int vol = setreo.GetVol();
    if (vol < 11) {
      setreo.SetVol(++vol);
    }
  }

  @Override public void undo() {
    // TODO Auto-generated method stub
    int vol = setreo.GetVol();
    if (vol > 0) {
      setreo.SetVol(--vol);
    }
  }
}
