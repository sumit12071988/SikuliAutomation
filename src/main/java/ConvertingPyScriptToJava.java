
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class ConvertingPyScriptToJava {

	public static void main(String[] args) throws Exception {
		
		
// ******************************************************************************************************		
// ************************************ PY SCRIPT AUTOGENERATED FROM IDE ********************************
// ******************************************************************************************************
//		type("r", Key.WIN)
//		wait(0.5)
//		type("calc"+Key.ENTER)
//		wait("Calculator.PNG")
//		click(Pattern("Calculator.PNG").targetOffset(-66,97))
//		click(Pattern("Calculator.PNG").targetOffset(190,93))
//		click(Pattern("Calculator.PNG").targetOffset(-65,-13))
//		click(Pattern("Calculator.PNG").targetOffset(194,150))
//		wait("resultVerifier.PNG")
//		click(Pattern("1601562383702.png").targetOffset(56,0))
//		type("r", Key.WIN)
//		wait(0.5)
//		type("1601601573699.png","notepad"+Key.ENTER)
//		wait("1601601496495.png")
//		type("Hi There, This is a demo script to test Sikuli's capability with Thick Client application")
//		click("Format.png")
//		click(Pattern("WordWrap.png").similar(0.50).targetOffset(-13,-12))
//		click(Pattern("1601602029214.png").targetOffset(37,0))
//		click(Pattern("1601602366665.png").targetOffset(0,1))
		
// ******************************************************************************************************		
// ************************************ PY SCRIPT CONVERSION TO JAVA ************************************
// ******************************************************************************************************
		
		// Step1: Save all the images in to SikuliImage Library	& map those images as objects of Pattern class.	
		Pattern calc = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\Calculator.PNG");
		Pattern result = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\resultVerifier.PNG");
		Pattern close = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601562383702.PNG");
		Pattern runWindowIdentifier = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601601573699.png");
		Pattern notepadIdentifier = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601601496495.png");
		Pattern formatBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\Format.png");
		Pattern wordWrapBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\WordWrap.png");
		Pattern closeBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601602029214.png");
		Pattern dontSaveBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601602366665.png");
		
		// Step2: Create an object of screen
		Screen s = new Screen();
		
		// Step3: Using Screen classes object, call all the methods which were called by python scripts
		//		Note: Instead of giving screenshot name, we'll be specifying the object of Pattern class as shown below
		s.type("r", Key.WIN);
		s.wait(2.0);
		s.type("calc"+Key.ENTER);
		s.wait(4.0);
		s.wait(calc);
		s.click(calc.targetOffset(-66,97));
		s.click(calc.targetOffset(190,93));
		s.click(calc.targetOffset(-65,-13));
		s.click(calc.targetOffset(194,150));
		s.wait(result);
		s.click(close.targetOffset(56,0));
		s.type("r", Key.WIN);
		s.wait(0.5);
		s.type(runWindowIdentifier,"notepad"+Key.ENTER);
		s.wait(notepadIdentifier);
		s.type("Greetings Dr. Thiaga !! Thanks for your time so sikuli can showcase its capability to automate Thick Client Applications. Hope you like it :)");
		s.click(formatBtn);
		s.click(wordWrapBtn.similar(0.50).targetOffset(-13,-12));
		s.click(closeBtn.targetOffset(37,0));
		s.click(dontSaveBtn.targetOffset(0,1));
		
		

// ******************************************************************************************************
// ******************************************************************************************************
	

	}

}
