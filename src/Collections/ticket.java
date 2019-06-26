package Collections;

/**
 * @author zhangke
 * @version 1.0
 * @className ticket
 * @description TODO
 * @date 2019/5/27 11:48 AM
 **/
public class ticket {

    //投票人
    private String voter;
    //选举人
    private String candidate;

    public ticket(String voter, String candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoterl(String voter) {
        this.voter = voter;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }



}