import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keyy extends Applet implements KeyListener{

	//A represent a group of musical note
	//P will replace the semicolon
	AudioClip AS,AE,AD,AR,AF,AJ,AU,AK,AI,AL,AO,AP;
	
	@Override
	public void init() {
		AS = this.getAudioClip(getDocumentBase(), "AS.wav");
		AE = this.getAudioClip(getDocumentBase(), "AE.wav");
		AD = this.getAudioClip(getDocumentBase(), "AD.wav");
		AR = this.getAudioClip(getDocumentBase(), "AR.wav");
		AF = this.getAudioClip(getDocumentBase(), "AF.wav");
		AJ = this.getAudioClip(getDocumentBase(), "AJ.wav");
		AU = this.getAudioClip(getDocumentBase(), "AU.wav");
		AK = this.getAudioClip(getDocumentBase(), "AK.wav");
		AI = this.getAudioClip(getDocumentBase(), "AI.wav");
		AL = this.getAudioClip(getDocumentBase(), "AL.wav");
		AO = this.getAudioClip(getDocumentBase(), "AO.wav");
		AP = this.getAudioClip(getDocumentBase(), "AP.wav");
		
		addKeyListener(this); //to detect the press of a key
	}
	
	@Override
	public void paint(Graphics g) {
		//display message as to which key to press to play a sound
		//drawRect(int xTopLeft, int yTopLeft, int width, int height);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		char X = (char) e.getKeyCode();
		if(X == 'A')
		AS.play(); //play AS.wav when S is pressed
		
		if(X == 'E')
		AE.play();
		
		if(X == 'D')
		AD.play();
		
		if(X == 'R')
		AR.play();
		
		if(X == 'F')
		AF.play();
		
		if(X == 'J')
		AJ.play();
		
		if(X == 'U')
		AU.play();
		
		if(X == 'K')
		AK.play();
		
		if(X == 'I')
		AI.play();
		
		if(X == 'L')
		AL.play();
		
		if(X == 'O')
		AO.play();
		
		if(X == 'P')
		AP.play();
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
