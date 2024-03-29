package iwwwdnw.spielzug.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import iwwwdnw.spielzug.port.*;


public class SpielerImpl implements Spieler {

	private int id;
	private int alter;
	private int[] points;
	private Color farbe;
	private String name;
	private List<StartFeld> startfelder = new ArrayList<StartFeld>();
	private WissensStreiter[] wissensstreiter;
	
	
	public SpielerImpl(int id, int alter, Color farbe, String name) {
		this.id = id;
		this.alter = alter;
		this.points = new int[] { 0, 0, 0, 0 };
		this.farbe = farbe;
		this.name = name;
		
		wissensstreiter = new WissensStreiter[5];
		
		for(int i = 0; i < wissensstreiter.length; i++) {
			
			wissensstreiter[i] = new WissensStreiterImpl();
			wissensstreiter[i].setSpieler(this);
			
		}
		
		
		
	}

	public int[] getPoints() {
		return points;
	}

	public WissensStreiter getNextFreeWissensStreiter() {
		for (int i = 0; i < 5; i++) {
			if (this.wissensstreiter[i].istAufHeimatFeld()) {
				return this.wissensstreiter[i];
			}
		}
		return null;
	}

	public List<StartFeld> getStartfelder() {
		return startfelder;
	}

	public void setStartfelder(List<StartFeld> startfelder) {
		this.startfelder = startfelder;
	}

	
	public void setStartfeld(StartFeld startfeld)
	{
		this.startfelder.add(startfeld);
	}
	
	
	@Override
	public WissensStreiter[] getWissensstreiter() {
		return wissensstreiter;
	}

	@Override
	public void setWissensstreiter(WissensStreiter[] wissensstreiter) {

	}

	public int getAlter() {
		return alter;
	}

	public Color getFarbe() {
		return farbe;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int[] getWissensstandsanzeige() {
		return points;
	}

	public boolean givePoint(int index) {
		if (this.points[index] >= 5) {
			return false;
		}

		this.points[index]++;
		return true;
	}

	public boolean takePoint(int index) {
		if (this.points[index] <= 0) {
			return false;
		}
		this.points[index]--;
		return true;
	}

	@Override
	public boolean hatWissensStreiterAufSpielbrett() {
		for (int i = 0; i < wissensstreiter.length; i++) {
			if (!wissensstreiter[i].istAufHeimatFeld()) {
				return true;
			}
		}
		return false;
	}




}


	

