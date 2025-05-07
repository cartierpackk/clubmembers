import java.util.ArrayList;
public class ClubMembers
{
    private ArrayList<MemberInfo> memberList;
    
    public ClubMembers(ArrayList<MemberInfo> memberList) {
        this.memberList = memberList;
    }

    /** Adds new club members to memberList, as described in part (a).
    * Precondition: names is a non-empty array.
    */
    public void addMembers(String[] names, int gradYear)
    {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }
    /** Removes members who have graduated and returns a list of members who have graduated
    * and are in good standing, as described in part (b).
    */
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        ArrayList<MemberInfo> remove = new ArrayList<>();
        for (int i = 0; i < memberList.size(); i++) {
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    remove.add(member);
                }
                memberList.remove(i);
                i--;
            }
        }
        return remove;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
