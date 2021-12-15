package starter.search;

import net.serenitybdd.screenplay.playwright.Target;

public class WikipediaArticle {
    public static final Target HEADING = Target.the("article heading").locatedBy("#firstHeading");
}