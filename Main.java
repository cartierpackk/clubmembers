import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        MemberInfo[] list = {
            new MemberInfo("SMITH, JANE", 2019, false),
            new MemberInfo("FOX, STEVE", 2018, true),
            new MemberInfo("XIN, MICHAEL", 2017, false),
            new MemberInfo("GARCIA, MARIA", 2020, true)
        };
        ArrayList<MemberInfo> roster = new ArrayList<>();

        for (MemberInfo b : list) {
           roster.add(b);
        }

        ClubMembers a = new ClubMembers(roster);
        System.out.println(a.removeMembers(2018));
        System.out.println(roster);
    }
}
