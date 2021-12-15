package starter.search;

import net.serenitybdd.screenplay.playwright.Target;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchInput");

}
