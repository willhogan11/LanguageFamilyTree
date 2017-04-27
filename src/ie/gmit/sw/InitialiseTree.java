package ie.gmit.sw;

public class InitialiseTree {

	public void init(Node root){

		root.setLanguage(new Language("Proto Indo European"));
		
		Node germanic = new Node(new Language("Germanic"));
		Node northGermanic = new Node(new Language("North Germanic"));
		Node westGermanic = new Node(new Language("West Germanic"));
		
		germanic.addChild(northGermanic);
		germanic.addChild(westGermanic);
		
		root.addChild(germanic);
		
		Node oldNorse = new Node(new Language("Old Norse"));
		oldNorse.addChild(new Node(new Language("Norwegian")));
		oldNorse.addChild(new Node(new Language("Icelandic")));
		
		Node swedish = new Node(new Language("Swedish"));
		
		northGermanic.addChild(oldNorse);
		northGermanic.addChild(swedish);
		
		Node angloFrisian = new Node(new Language("Anglo Frisian"));
		Node oldDutch = new Node(new Language("Old Dutch"));
		Node oldHighGerman = new Node(new Language("Old High German"));
		
		westGermanic.addChild(angloFrisian);
		westGermanic.addChild(oldDutch);
		westGermanic.addChild(oldHighGerman);
		
		Node oldEnglish = new Node(new Language("Old English"));
		Node oldFrisian = new Node(new Language("Old Frisian"));
		
		angloFrisian.addChild(oldEnglish);
		angloFrisian.addChild(oldFrisian);
		
		Node middleDutch = new Node(new Language("Middle Dutch"));
		oldDutch.addChild(middleDutch);
		
		Node middleHighGerman = new Node(new Language("Middle High German"));
		oldHighGerman.addChild(middleHighGerman);
		
		Node middleEnglish = new Node(new Language("Middle English"));
		oldEnglish.addChild(middleEnglish);
		
		Node frisian = new Node(new Language("Frisian"));
		oldFrisian.addChild(frisian);
		
		middleEnglish.addChild(new Node(new Language("Modern English")));
		
		middleDutch.addChild(new Node(new Language("Flemish")));
		middleDutch.addChild(new Node(new Language("Dutch")));
		middleDutch.addChild(new Node(new Language("Afrikaans")));
		
		middleHighGerman.addChild(new Node(new Language("German")));
		middleHighGerman.addChild(new Node(new Language("Yiddish")));
		
		Node baltoSlavic = new Node(new Language("Balto Slavic"));
		root.addChild(baltoSlavic);
		
		Node polish = new Node(new Language("Polish"));
		Node russian = new Node(new Language("Russian"));
		Node serboCroatian = new Node(new Language("Serbo Croatian"));
		
		baltoSlavic.addChild(polish);
		baltoSlavic.addChild(russian);
		baltoSlavic.addChild(serboCroatian);
		
		Node italic = new Node(new Language("Italic"));
		root.addChild(italic);
		
		Node latin = new Node(new Language("Latin"));
		italic.addChild(latin);
		
		Node french = new Node(new Language("French"));
		Node spanish = new Node(new Language("Spanish"));
		Node portuguese = new Node(new Language("Portuguese"));
		Node italian = new Node(new Language("Italian"));
		Node romanian = new Node(new Language("Romanian"));
		Node catalan = new Node(new Language("Catalan"));
		
		latin.addChild(french);
		latin.addChild(spanish);
		latin.addChild(portuguese);
		latin.addChild(italian);
		latin.addChild(romanian);
		latin.addChild(catalan);
		
		printStats(latin);
	}
	
	
	public void printStats(Node node) {
		
		Node[] children = node.children();
		
		System.out.println("**Node information**");
		System.out.println("Is Root? " + node.isRoot());
		System.out.println("Parent : " + node.getParent().getLanguage().getLanguage());
		System.out.println("Has Children ? " + node.hasChildren());
		System.out.println("This node has " + node.countChildren() + " children"); 
		
		for (int i = 0; i < children.length; i++) {
			System.out.print("==> " + children[i].getLanguage().getLanguage());
			System.out.println();
		}
		System.out.println();
	}
}