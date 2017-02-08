package code.core.java.pattern.behavioral.visitor.sample01;

class TestTitleVisitor {
	
	public static void main(String[] args) {
		AbstractTitleInfo dvdName = new DvdInfo("Blade Runner", "Harrison Ford", '1');
		AbstractTitleInfo bookName = new BookInfo("Do Androids Dream of Electric Sheep?", "Phillip K. Dick");
		AbstractTitleInfo gameName = new GameInfo("Sheep Raider");

		TitleBlurbVisitor titleLongBlurbVisitor = new TitleLongBlurbVisitor();

		System.out.println("Long Blurbs:");
		dvdName.accept(titleLongBlurbVisitor);
		System.out.println("Testing bladeRunner   " + titleLongBlurbVisitor.getTitleBlurb());
		bookName.accept(titleLongBlurbVisitor);
		System.out.println("Testing electricSheep " + titleLongBlurbVisitor.getTitleBlurb());
		gameName.accept(titleLongBlurbVisitor);
		System.out.println("Testing sheepRaider   " + titleLongBlurbVisitor.getTitleBlurb());

		TitleBlurbVisitor titleShortBlurbVisitor = new TitleShortBlurbVisitor();

		System.out.println("Short Blurbs:");
		dvdName.accept(titleShortBlurbVisitor);
		System.out.println("Testing bladeRunner   " + titleShortBlurbVisitor.getTitleBlurb());
		bookName.accept(titleShortBlurbVisitor);
		System.out.println("Testing electricSheep " + titleShortBlurbVisitor.getTitleBlurb());
		gameName.accept(titleShortBlurbVisitor);
		System.out.println("Testing sheepRaider   " + titleShortBlurbVisitor.getTitleBlurb());
	}
}