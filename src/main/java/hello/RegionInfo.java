package hello;

public class RegionInfo {

    private String content;
    private String namesOfAttackRegions;
    private String idsForAdjacentRegions;
    private String majorNationTurn;

    public RegionInfo() {
    }

    public RegionInfo(String content) {
        this.content = content;
    }

    public RegionInfo(String content, String namesOfAttackRegions, String idsForAdjacentRegions, String majorNationTurn) {
        this.content = content;
        this.namesOfAttackRegions = namesOfAttackRegions;
        this.idsForAdjacentRegions = idsForAdjacentRegions;
        this.majorNationTurn = majorNationTurn;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setNamesOfAttackRegions(String namesOfAttackRegions) {
        this.namesOfAttackRegions = namesOfAttackRegions;
    }

    public String getNamesOfAttackRegions() {
        return namesOfAttackRegions;
    }

    public String getIdsForAdjacentRegions() {
        return idsForAdjacentRegions;
    }

    public void setIdsForAdjacentRegions(String idsForAdjacentRegions) {
        this.idsForAdjacentRegions = idsForAdjacentRegions;
    }

    public String getMajorNationTurn() {
        return majorNationTurn;
    }

    public void setMajorNationTurn(String majorNationTurn) {
        this.majorNationTurn = majorNationTurn;
    }
}
