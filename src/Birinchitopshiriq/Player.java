package Birinchitopshiriq;

public class Player implements Information{
    private String nameOfPlayer;
    private String sportType;
    private Integer numberPosition;
    private String TeamNmae;

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public Integer getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(Integer numberPosition) {
        this.numberPosition = numberPosition;
    }

    public String getTeamNmae() {
        return TeamNmae;
    }

    public void setTeamNmae(String teamNmae) {
        TeamNmae = teamNmae;
    }

    @Override
    public void getInformation() {

    }

    @Override
    public void getTeamName() {

    }
}
