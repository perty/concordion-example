package marketing.mailshots;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(ConcordionRunner.class)
public class PartialMatchesFixture {

    private List<String> userNames = new ArrayList<>();

    public void setUpUser(String userName) {
        userNames.add(userName);
    }

    public List<String> getSearchResultsFor(String search) {
        return userNames
                .stream()
                .filter(s -> s.contains(search))
                .sorted()
                .collect(Collectors.toUnmodifiableList());
    }
}
