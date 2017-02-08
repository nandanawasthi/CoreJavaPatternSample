package code.core.java.pattern.behavioral.visitor.sample01;

public class GameInfo extends AbstractTitleInfo {
	public GameInfo(String titleName) {
		this.setTitleName(titleName);
	}

	public void accept(TitleBlurbVisitor titleBlurbVisitor) {
		titleBlurbVisitor.visit(this);
	}
}