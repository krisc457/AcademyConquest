package hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-04-03.
 */
public class MajorNation {

    private int nationId;
    private List<String> regionsOwned;

    private List<String> regionsOwnedByUsa() {
        List<String> regionsOwnedByUsa = new ArrayList<>();
        regionsOwnedByUsa.add("g8");
        regionsOwnedByUsa.add("g9");
        regionsOwnedByUsa.add("g10");
        regionsOwnedByUsa.add("g11");

        return regionsOwnedByUsa;
    }

    private List<String> regionsOwnedByBritain() {
        List<String> regionsOwnedBritain = new ArrayList<>();
        regionsOwnedBritain.add("g38");
        regionsOwnedBritain.add("g39");
        regionsOwnedBritain.add("g40");

        return regionsOwnedBritain;
    }

    private List<String> regionsOwnedByFrance() {
        List<String> regionsOwnedFrance = new ArrayList<>();
        regionsOwnedFrance.add("g50");
        regionsOwnedFrance.add("g51");
        regionsOwnedFrance.add("g54");

        return regionsOwnedFrance;
    }

    private List<String> regionsOwnedByGermany() {
        List<String> regionsOwnedGermany = new ArrayList<>();
        regionsOwnedGermany.add("g45");
        regionsOwnedGermany.add("g46");
        regionsOwnedGermany.add("g60");

        return regionsOwnedGermany;
    }

    private List<String> regionsOwnedByRussia() {
        List<String> regionsOwnedRussia = new ArrayList<>();
        regionsOwnedRussia.add("g43");
        regionsOwnedRussia.add("g44");
        regionsOwnedRussia.add("g99");
        regionsOwnedRussia.add("g112");
        regionsOwnedRussia.add("g100");
        regionsOwnedRussia.add("g101");

        return regionsOwnedRussia;
    }

    private List<String> regionsOwnedByJapan() {
        List<String> regionsOwnedJapan = new ArrayList<>();
        regionsOwnedJapan.add("g103");
        regionsOwnedJapan.add("g104");
        regionsOwnedJapan.add("g105");
        regionsOwnedJapan.add("g106");

        return regionsOwnedJapan;
    }

    public List<String> getRegionsOwnedByUsa() {
        return regionsOwnedByUsa();
    }

    public void setRegionsOwnedByUsa(String region) {
        regionsOwnedByUsa().add(region);
    }

    public List<String> getRegionsOwnedByBritain() {
        return regionsOwnedByBritain();
    }

    public List<String> getRegionsOwnedByFrance() {
        return regionsOwnedByFrance();
    }

    public List<String> getRegionsOwnedByGermany() {
        return regionsOwnedByGermany();
    }

    public List<String> getRegionsOwnedByRussia() {
        return regionsOwnedByRussia();
    }

    public List<String> getRegionsOwnedByJapan() {
        return regionsOwnedByJapan();
    }
}
