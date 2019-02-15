package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import text.editor.m1.Anameth.project.ccn.Moteur;
import text.editor.m1.Anameth.project.ccn.MoteurImp;

 public class MoteurTest {
	 
	 private Moteur moteur;
	 
	 @Before

	public void setup() throws Exception{
		 
		 moteur = new MoteurImp();
		 
	}
	 
	 
	 //@DisplayName("first test") this works only in Junit 5
	 @Test
	 public void test1(){
		 moteur.saisir("ABC");
		 assertEquals("this is the ABC test :- ","ABC", moteur.getConteun());
		 
	 }
	 
	 @Test
	 public void test2(){
		 moteur.selectionner(1, 0);
		 assertEquals("this is the empty test 2 :- ","", moteur.getConteun());
		 assertEquals("this is the selection test 2 :- ",1, moteur.getDebut());
		 assertEquals("this is the longueur test 2 :- ", 0, moteur.getLongueur());
	 }
	 
	 @Test
	 public void test3(){
		 moteur.saisir("ABC");
		 moteur.saisir("DEF");
		 assertEquals("this is the ABCDEF test :- ","ABCDEF", moteur.getConteun());
	 }
	 
	 @Test
	 public void test4(){
		 moteur.saisir("ABC");
		 moteur.selectionner(0, 0);
		 moteur.saisir("DEF"); 
	 	assertEquals("this is the DEFABC test 4 :- ","DEFABC", moteur.getConteun());

	 }
	 
	 @Test
	 public void test5(){
		 moteur.saisir("ABC");
		 moteur.selectionner(0, 1);
		 moteur.saisir("DEF");
		 assertEquals("this is the DEFBC test 5 :- ","DEFBC", moteur.getConteun());
	 }
	 
	 /*
	  * this is to test for copy
	  */
	 @Test
	 public void testCopy(){
		 moteur.saisir("ABCD");
		 moteur.selectionner(0, 2);
		 moteur.copier();
		 assertEquals("this is the copy AB copy :-","AB", moteur.getClipboardContains());
		 assertEquals("this is to show what is left in my structBuffer :-", "ABCD", moteur.getConteun());
	 }
	 
	 
	 /*
	  * this is to test for the cut part
	  */
	 
	 @Test
	 public void testCut(){
		 moteur.saisir("ABCDEF");
		 moteur.selectionner(0, 3);
		 moteur.couper();
		 assertEquals("This is the cut test ABC","ABC",moteur.getClipboardContains());
		 assertEquals("this is to show what is left in my structBuffer :-", "DEF", moteur.getConteun());
	 }
	 
	 
	 /*
	  * this is the test for paste
	  */
	 @Test
	 public void testPaste(){ 
		 moteur.saisir("ABCDEFG");
		 moteur.selectionner(0, 5);
		 moteur.couper();
		 assertEquals("This is the cut test ABCDE", "ABCDE",moteur.getClipboardContains());
		 assertEquals("this is to show what is left in my structBuffer :-", "FG", moteur.getConteun());
		 moteur.selectionner(2, 0);
		 moteur.coller();
		 assertEquals("this is to show the position of the paste :-","FGABCDE", moteur.getConteun());
	 }
}