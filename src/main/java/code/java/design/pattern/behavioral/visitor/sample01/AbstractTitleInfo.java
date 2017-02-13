package code.java.design.pattern.behavioral.visitor.sample01;

public abstract class AbstractTitleInfo {
	private String titleName;

	public final void setTitleName(String titleNameIn) {
		this.titleName = titleNameIn;
	}

	public final String getTitleName() {
		return this.titleName;
	}

	public abstract void accept(TitleBlurbVisitor titleBlurbVisitor);
}