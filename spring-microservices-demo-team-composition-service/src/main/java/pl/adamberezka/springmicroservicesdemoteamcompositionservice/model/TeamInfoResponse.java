package pl.adamberezka.springmicroservicesdemoteamcompositionservice.model;

import java.util.List;

public class TeamInfoResponse {

    private Team team;
    private List<User> userList;

    public TeamInfoResponse() {
    }

    public TeamInfoResponse(Team team, List<User> userList) {
        this.team = team;
        this.userList = userList;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
